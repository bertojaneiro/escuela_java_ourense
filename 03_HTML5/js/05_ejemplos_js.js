console.log("Message ok");
console.error("mensage de error");
var varDinamica = "Ahora soy un texto";
document.write("<h1>JavaScript</h1>");
document.write("<p>varDinamica= "+varDinamica+"</p>");
document.write("No mas codigo spagetti. Es un anti-patron de diseño");
varDinamica = 999;
//mediante DOM, generamos un p y lo rellenamos
var parrafo = document.createElement("p");
var textoParrafo = document.createTextNode("varDinamica: "+varDinamica);
parrafo.appendChild(textoParrafo);
var body = document.getElementsByTagName("body")[0];
body.appendChild(parrafo);
var arrayParrafos = document.getElementsByTagName("p");
for (p of arrayParrafos) {
    p.setAttribute("style", "background-color: lightgrey");
    //cogemos los <p> del DOM que se actualizo del HTML
}
alert(body.innerHTML);