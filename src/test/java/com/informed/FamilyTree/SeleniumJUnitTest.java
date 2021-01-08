package com.informed.FamilyTree;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumJUnitTest {
    private static SeleniumConfig config;

    @BeforeAll
    public static void setUp() {
        config = new SeleniumConfig();
        config.getDriver().get("http://localhost:8080/index.html");
    }

    @AfterAll
    public static void tearDown() { config.close(); }

    @Test
    public void checkPageTitle() {
        String actualTitle = config.getDriver().getTitle();
        assertEquals("Family Tree", actualTitle);
    }

    @Test
    public void checkHeading() {
        String actualHeading = config.getDriver().findElement(By.tagName("h1")).getText();
        assertEquals("Family Tree Service", actualHeading);
    }

    @Test
    public void checkPeopleList() {
        config.getDriver().findElement(By.id("showPerson")).click();
        WebElement ulelement = config.getDriver().findElement(By.id("AllPersonList"));
        List<WebElement> elements = ulelement.findElements(By.tagName("li"));
        assertEquals(5, elements.size());
        for (WebElement el : elements) {
            String s = el.getText();
            System.out.println(s);
        }
        String s1 = elements.get(0).getText();
        String expected = "Bill Walsh ID is 1. Bill Walsh was born on 1967-10-10. Bill Walsh Birth Place is Glasgow and the Postcode is PA3 2ST. Bill Walsh has children. Bill Walsh has been married before. Bill Walsh died on 2019-08-20. Bill Walsh Death Place is Manchester and the Postcode is WA14 4PE.";
        assertEquals(expected, s1 );
        String s2 = elements.get(1).getText();
        String expected2 = "Alice Walsh ID is 2. Alice Walsh was born on 1970-06-04. Alice Walsh Birth Place is London and the Postcode is LU2 LPY. Alice Walsh has children. Alice Walsh has been married before. Alice Walsh died on 2010-02-10. Alice Walsh Death Place is Manchester and the Postcode is WA14 4PE.";
        assertEquals(expected2, s2);

    }





}
