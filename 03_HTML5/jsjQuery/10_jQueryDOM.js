//jQuery se abrebia como $(...)
jQuery(document).ready(function(){
    jQuery("section").append("<div><p>Leyenda de lo que sea</p></div>");
    $("tr").append("<td>Info</td>");
    $(".articulo").append("<p>UN PARRAFO EN CADA CLASS ARTICULO</p>");
    $("td:nth-child(5)").attr("style","background-color:red; color: white;");
    $("td:nth-child(5)").click(()=>{
        alert("un click desde jQ");
    });
    $("#otro_menu").html("<h2>Menu de articulos</h2>");
    $("article h4").each(function(){
        let idn= $(this).parent().attr("id");
        $(this).wrap("<a href='#"+idn+"'></a>");
    });
    $("article a").appendTo("#otro_menu");
    
    $("#otro_menu a").attr("style","display: inline-block;");
    $("article > *").slideUp("fast");
    $("article").attr("style","border: none;");
    $("#otro_menu a").click(function(){
        $($(this).attr("href")).children().slideDown();
        $($(this).attr("href")).attr("style","border: black solid;");
        $($(this).attr("href")).siblings().children().slideUp();
        $($(this).attr("href")).siblings().attr("style","border: none;");
    });
});