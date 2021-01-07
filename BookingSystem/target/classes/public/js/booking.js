<<<<<<< HEAD
console.log('Starting the appointment booking system:');

$(document).ready(
    function () {
      console.log('jQuery setting up after document ready');

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
=======
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
                                           $('#appList').empty();
                                           console.log(appointments);
                                               $.each(appointments, function(i, appointment) {
                                                   let html = "<li>";
                                                   html += appointment.client + " with " + appointment.provider;
                                                   html += " " + appointment.startDateTime + " until " + appointment.endDateTime;
                                                   html += " Cost:" + appointment.cost + " " + appointment.description;
                                                   html += "</li>";
                                                   $('#appList').append(html);
                                                   });

                                               });

                });

    });
>>>>>>> origin/AppointmentsBookingSystem
