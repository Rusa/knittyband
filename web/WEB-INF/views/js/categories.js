$(document).ready(function () {

    $(".category").on("click", function () {
        var id = $(this).attr('attr-id');
        getProductsByCategory(id);
        console.log(id);
    })
});



function getProductsByCategory(id) {
    $.ajax({
        type: "GET",
        dataType: "json",
        contentType: 'application/json',
        url: "http://localhost:8089/product/getByCategory?id="+id,
        success: function (response) {
            console.log(response);

            $("#productsByCategory").html($("#productsTemplate").render({products:response}));
            // $("#productsByCategory").html("");
            // $.each(response, function(index, value){
                // $("#productsByCategory").append(renderProductHTML(value));
            // });
        },
        error: function (error) {
            console.log(error);
        }
    });
}

function renderProductHTML(product) {
    return "<div>"+product.name+"</div>"+
        "<div>"+product.name+"</div>";
}
