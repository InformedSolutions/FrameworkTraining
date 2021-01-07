$(document).ready(
    function () {

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
            success: function(result) {
            console.log(result);
            alert("Provider added");
            },
            failure: function(errorMessage) {
                        alert(errorMessage);
            },
            contentType:"application/json; charset=utf-8",
            dataType: "json"
            });

        });

           $("#listAllAppointments").click(function () {
                    console.log('listAllAppointments via jQuery');
                    event.preventDefault();

                    // GET via AJAX
                    $.get("http://localhost:8080/booking/appointmentList",
                                    function(appointments) {
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
                                               $.each(appointments, function(i, appointment) {
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

     $("#clientregistryform").submit(function() {
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
                          success: function(result) {
                              console.log(result);
                              alert("New client registered")
                              },
                          failure: function(errorMessage){
                              alert(errorMessage)
                              },
                          contentType: "application/json; charset=utf-8",
                          dataType: "json"
                      });
                  });
    });
