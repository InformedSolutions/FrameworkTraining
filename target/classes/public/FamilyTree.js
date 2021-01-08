console.log('Starting the bookshop');

$(document).ready(
    function () {
        console.log('jQuery setting up after document ready');
        //Set up some show list of books behaviour
        $("#showBooks").click(
            function () {
                console.log('running click on showBooks');
                event.preventDefault();
                $.get("http://localhost:9696/bookshop/list",
                      function(books) {
                        console.log(books);
                        $.each(books, function(i, book) {
                        console.log(i, ', '. book);
                        let html = "<li>";
                        html += book.title + " by " + book.author;
                        html += ", " + book.isbn + ", " + book.category;
                        html += "</li>";
                        $('#booklist').append(html);
                        });
                      });
            });