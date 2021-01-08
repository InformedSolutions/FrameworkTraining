$(document).ready(
    function () {
        loadClientDropdown();
        loadProviderDropdown();

        $("#addProviderForm").submit(function () {
            console.log('addProvider via jQuery');
            event.preventDefault();
            let obj = $(this).serializeJSON();
            let providerData = JSON.stringify(obj);
            console.log(providerData);

            // POST via AJAX
            $.ajax({
                type: "POST",
                url: "http://localhost:8080/booking/provider",
                data: providerData,
                success: function (result) {
                    console.log(result);
                    alert("Provider added");
                },
                failure: function (errorMessage) {
                    alert(errorMessage);
                },
                contentType: "application/json; charset=utf-8",
                dataType: "json"
            });

        });

            $("#clientregistryform").submit(function () {
                    console.log('enter');
                    event.preventDefault();
                    let obj = $(this).serializeJSON();
                    let clientRegistryData = JSON.stringify(obj);
                    console.log(clientRegistryData);

                    //invoke the post function using ajax
                    $.ajax(
                        {
                            type: "POST",
                            url: "http://localhost:8080/booking/client",
                            data: clientRegistryData,
                            success: function (result) {
                                console.log(result);
                                alert("New client registered")
                            },
                            failure: function (errorMessage) {
                                alert(errorMessage)
                            },
                            contentType: "application/json; charset=utf-8",
                            dataType: "json"
                        });
                });

         $("#addAppointmentForm").submit(function () {
                     console.log('addAppointment via jQuery');
                     event.preventDefault();
                     let obj = $(this).serializeJSON();
                     let appointmentData = JSON.stringify(obj);
                     console.log(appointmentData);

                     // POST via AJAX
                     $.ajax({
                         type: "POST",
                         url: "http://localhost:8080/booking/appointment",
                         data: appointmentData,
                         success: function (result) {
                             console.log(result);
                             alert("Appointment added");
                         },
                         failure: function (errorMessage) {
                             alert(errorMessage);
                         },
                         contentType: "application/json; charset=utf-8",
                         dataType: "json"
                     });

                 });

        $("#listAllAppointments").click(function () {
            console.log('listAllAppointments via jQuery');
            event.preventDefault();

            // GET via AJAX
            $.get("http://localhost:8080/booking/appointmentList",
                function (appointments) {
                    $('#appTable').empty();
                    console.log(appointments);
                    let htmlTableHead = "<thead>";
                    htmlTableHead += "<th> Client <th>";
                    htmlTableHead += "<th> Provider <th>";
                    htmlTableHead += "<th> Start Time<th>";
                    htmlTableHead += "<th> End Time<th>";
                    htmlTableHead += "<th> Cost<th>";
                    htmlTableHead += "<th> Description<th>";
                    htmlTableHead += "<th> Client Missed Appointment?<th>";
                    htmlTableHead += "</thead>";
                    $('#appTable').append(htmlTableHead);
                    $('#appTable').append("<tbody>");
                    $.each(appointments, function (i, appointment) {
                        let html = "<tr>";
                        html += "<th>" + appointment.client + " <th>";
                        html += "<th>" + appointment.provider + " <th>";
                        html += "<th>" + appointment.startDateTime + " <th>";
                        html += "<th>" + appointment.endDateTime + " <th>";
                        html += "<th>" + appointment.cost + " <th>";

                        if (appointment.description != null) {
                            html += "<th>" + appointment.description + " <th>";
                        } else {
                            html += "<th>  <th>";
                        }

                        html += "<th>" + appointment.hasClientMissedAppointments + " <th>";
                        html += "</tr>";
                        $('#appTable').append(html);
                    });

                    $('#appTable').append("</tbody>");

                });

        });

        $("#listClientAppointments").click(function () {
            console.log('listClientAppointments via jQuery');
            event.preventDefault();

            // GET via AJAX
            $.get("http://localhost:8080/booking/appointmentList/client/" + $('#clientDropDown').val(),
            function(appointments){ createTable(appointments) }
            );

        });

        $("#listProviderAppointments").click(function () {
                    console.log('listProviderAppointments via jQuery');
                    event.preventDefault();
                    var appointments

                    // GET via AJAX
                    $.get("http://localhost:8080/booking/appointmentList/provider/" + $('#providerDropDown').val(),
                                function(appointments){ createTable(appointments) }
                                );
                });

        $("#listAllAppointments").click(function () {
                    console.log('listAllAppointments via jQuery');
                    event.preventDefault();
                    var appointments

                    // GET via AJAX
                    $.get("http://localhost:8080/booking/appointmentList", createTable(appointments));
                });

    });



function createTable(appointments) {
    $('#appTable').empty();

    let htmlTableHead = "<thead>";
    htmlTableHead += "<th> Client <th>";
    htmlTableHead += "<th> Provider <th>";
    htmlTableHead += "<th> Start Time<th>";
    htmlTableHead += "<th> End Time<th>";
    htmlTableHead += "<th> Cost<th>";
    htmlTableHead += "<th> Description<th>";
    htmlTableHead += "<th> Client Missed Appointment?<th>";
    htmlTableHead += "</thead>";
    $('#appTable').append(htmlTableHead);
    $('#appTable').append("<tbody>");
    $.each(appointments, function (i, appointment) {
        let html = "<tr>";
        html += "<th>" + appointment.client + " <th>";
        html += "<th>" + appointment.provider + " <th>";
        html += "<th>" + appointment.startDateTime + " <th>";
        html += "<th>" + appointment.endDateTime + " <th>";
        html += "<th>" + appointment.cost + " <th>";

        if (appointment.description != null) {
            html += "<th>" + appointment.description + " <th>";
        } else {
            html += "<th>  <th>";
        }

        html += "<th>" + appointment.hasClientMissedAppointments + " <th>";
        html += "</tr>";
        $('#appTable').append(html);
    });

    $('#appTable').append("</tbody>");

}

function loadClientDropdown() {

    $.get("http://localhost:8080/booking/clientList", function(clients){
      $('.clientDropDown').append('<option selected value="0">Select a client</option>');
      $.each(clients, function (i, client) {
            let html = "<option ";
            html += 'value="' + client.id + '">';
            html += client.name;
            html += "</option>";
            $('.clientDropDown').append(html);
        });
    });
}

function loadProviderDropdown() {

    $.get("http://localhost:8080/booking/providerList", function(providers){
      $('.providerDropDown').append('<option selected value="0">Select a provider</option>');
      $.each(providers, function (i, provider) {
            let html = "<option ";
            html += 'value="' + provider.id + '">';
            html += provider.name;
            html += "</option>";
            $('.providerDropDown').append(html);
        });
    });
}
