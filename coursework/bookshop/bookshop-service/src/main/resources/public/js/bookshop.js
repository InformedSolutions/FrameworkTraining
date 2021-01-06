console.log("Starting the book shop.")

$(document).ready(
    function () {

        $("h1").click(function () {
            console.log("Clicked on a heading")
            $(this).addClass('heading').hide('slow').show('slow');
            this.style.color = "#" + ((1 << 24) * Math.random() | 0).toString(16);


        });

             $("#duck").click(function(){
               setInterval(function() {
                                     $("form").css("background-color","#" + ((1 << 24) * Math.random() | 0).toString(16));
                                 }, 100);
                                     setInterval(function() {
                                     $("body").css("background-color","#" + ((1 << 24) * Math.random() | 0).toString(16));
                                     }, 400);

                });

        $("#showBooks").click(function(){
        console.log("running click on showBooks")
        event.preventDefault();
        showBooks();

        });

          function showBooks() {
                    $.get("http://localhost:8080/bookshop/list",
                        function(books) {
                            $('#bookList').empty();
                            console.log(books);
                                $.each(books, function(i, book){
                                    console.log(book);
                                    let html = "<li>";
                                    html += book.title + " by " + book.author;
                                    html += " ISBN:" + book.isbn + ", " + book.category;
                                    html += "</li>";
                                    $('#bookList').append(html);
                                });
                        });
               }
        showBooks();

        $("#bookInputForm").submit(function () {
            console.log('enter() via jQuery');
            event.preventDefault();
            let obj = $(this).serializeJSON();
            let bookData = JSON.stringify(obj);
            console.log(bookData);
            // POST via AJAX

            $.ajax({
            type: "POST",
            url: "http://localhost:8080/bookshop",
            data: bookData,
            success: function(result) {
            console.log(result);
            alert("Books Updated");
            },
            failure: function(errorMessage) {
                        alert(errorMessage);
            },
            contentType:"application/json; charset=utf-8",
            dataType: "json"

            });

        });

    });

function mouseOver() {
    const randomColor = Math.floor(Math.random() * 16777215).toString(16);
    document.getElementById("chase").style.color = "#" + randomColor;
    document.getElementById("chase").style.position = "absolute";
    document.getElementById("chase").style.left = (Math.random() * 600) + "px";
    document.getElementById("chase").style.top = (Math.random() * 600) + "px";
}

function showDialogs() {
    console.log('in showDialogs');
    let total = prompt("Please enter total");
    let ok = confirm('Are you sure you want ' + total);
    console.log('ok:', ok);
    if (ok) {
        alert('You entered ' + total);
    }
}

function changeMessage() {
    const theMessage = "Hello to you";
    let element = document.getElementById('message');
    message.innerHTML = theMessage;
    message.style.color = "green";
}

function changeBackMessage() {
    const theMessage = "This is a placeholder message.";
    let element = document.getElementById('message');
    message.innerHTML = theMessage;
    message.style.color = "black";
}

function displayErrorMessage(message) {
    let element = document.getElementById('error');
    element.innerHTML = message;
}

function clearErrorMessage(message) {
    let element = document.getElementById('error');
    element.innerHTML = "";
}



