//jQuery se abrebia como $(...)
jQuery(document).ready(function(){
    jQuery("section").append("<div><p>Leyenda de lo que sea</p></div>");
    $("tr").append("<td>Info</td>");
    $(".articulo").append("<p>UN PARRAFO EN CADA CLASS ARTICULO</p>");
    $("td:nth-child(5)").attr("style","background-color:red; color: white;");
    $("td:nth-child(5)").click(()=>{
        alert("un click desde jQ");
    });
    $(".articulo").slideUp();
    $("#otro_menu").click(function(){
        $(this).slideUp();
        $(".articulo").slideDown();

    });
});