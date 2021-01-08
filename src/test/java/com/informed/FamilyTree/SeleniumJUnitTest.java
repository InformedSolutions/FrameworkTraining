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
    public void checkParentList() {
        config.getDriver().findElement(By.id("showPerson")).click();
        WebElement ulelement = config.getDriver().findElement(By.id("AllPersonlist"));
        List<WebElement> elements = ulelement.findElements(By.name("li"));
        assertEquals(5, elements.size());
        for (WebElement el : elements) {
            String s = el.getText();
            System.out.println(s);
        }
        String s1 = elements.get(0).getText();
        assertEquals();

    }





}
