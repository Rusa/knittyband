

function getCAtegories() {
    $.ajax({
        type: "GET",
        dataType: "json",
        contentType: 'application/json',
        url: "http://localhost:8089/category/getAll",
        success: function (response) {
            console.log(response);
        },
        error: function (error) {
            console.log(error);
        }
    });
}

getCAtegories();