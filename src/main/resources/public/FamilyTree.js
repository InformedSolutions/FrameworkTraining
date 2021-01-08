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
        //Set up some show list of books behaviour
        $("#showPerson").click(
            function () {
                console.log('running click on showAllPersons');
                event.preventDefault();
                $.get("http://localhost:8080/FamilyTree/list",
                      function(persons) {
                        console.log(persons);
                        $.each(persons, function(i, person) {
                        console.log(i, ', '. person);
                        let html = "<li>";
                        html += person.personName + " ID is " + person.personID+ ".";
                        html += "&nbsp" + person.personName + " was born on " + dateToYMD(person.dob) + ". " + person.personName + " Birth Place ID is " + person.birthPlaceId + ". ";
                        html += person.personName + " has " + person.hasChildren + " children. " + person.personName + " has been married " + person.married + " before " + "." + person.personName + " died on " + dateToYMD(person.deathDate)+ ". ";
                        html += person.personName + " Death Place ID is " + person.deathPlaceId + ".";
                        html += "</li>";
                        $('#AllPersonList').append(html);
                        });
                      });
            });
        });