console.log('Starting the Family Tree Service');

function dateToYMD(dateString) {
    let date = new Date (dateString);
    var d = date.getDate();
    var m = date.getMonth() + 1; //Month from 0 to 11
    var y = date.getFullYear();
    return '' + y + '-' + (m<=9 ? '0' + m : m) + '-' + (d <= 9 ? '0' + d : d);
}

//console.log(dateToYMD(new Date(2017,10,5))); // Nov 5

$(document).ready(
    function () {
        console.log('jQuery setting up after document ready');

        //Set up some jQuery behaviour for the heading
        $("h1").click(function () {
            console.log('Click on a heading');
            $(this).addClass('heading')
                   .hide('slow')
                   .show('slow');
        });
        //Set up some show list of persons
        $("#showPerson").click(
            function () {
                console.log('running click on showAllPersons');
                event.preventDefault();
                $.get("http://localhost:8080/FamilyTree/persons/list",
                      function(persons) {
                        console.log(persons);
                        $.each(persons, function(i, person) {
                        console.log(i, ', '. person);
                        let children = person.hasChildren;
                        let marriage = person.married;
                        let deathDates = person.deathDate;
                        let deathPlace = person.deathPlace;
                        let html = "<li>";
                        html += person.personName + " ID is " + person.personID+ ".";
                        html += "&nbsp" + person.personName + " was born on " + dateToYMD(person.dob) + ". ";
                        html += person.personName + " Birth Place is " + person.birthPlace.placeAddress + " and the Postcode is " + person.birthPlace.placePostcode + ". ";
                        if (children == true) {
                            html += person.personName + " has children. ";
                        }
                        if (marriage == true) {
                        html += person.personName + " has been married before. ";
                        }
                        if (deathDates != null) {
                            html += person.personName + " died on " + dateToYMD(person.deathDate)+ ". ";
                        }
                        if (deathPlace != null) {
                            html += person.personName + " Death Place is " + person.deathPlace.placeAddress + " and the Postcode is " + person.deathPlace.placePostcode + ". ";
                        }
                        html += "</li>";
                        $('#AllPersonList').append(html);
                        });
                      });
            });

//Set up some show list of marriages
        $("#showMarriage").click(
            function () {
                console.log('running click on AllMarriageList');
                event.preventDefault();
                $.get("http://localhost:8080/FamilyTree/marriage/list",
                      function(marriages) {
                        console.log(marriages);
                        $.each(marriages, function(i, marriage) {
                        console.log(i, ', '. marriage);
                        let html = "<li>";
                        html += "Marriage " + marriage.marriageID + " got married on " + dateToYMD(marriage.marriageDate) + ". The Husband ID is " + marriage.husbandID + " and the Wife ID is " + marriage.wifeID + ". ";
                        html += "</li>";
                        $('#AllMarriageList').append(html);
                        });
                      });
            });
});