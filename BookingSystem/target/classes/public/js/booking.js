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