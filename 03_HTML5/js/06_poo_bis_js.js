var divBis = document.getElementById("contenido_bis");
divBis.style="background-color:lightgrey";

var mostrarTodosParam = function (primerParam) {
    divBis.innerHTML += "<p> primer parametro "+primerParam+"</br>";
    for (argumento of arguments){
        divBis.innerHTML+="Argumento: "+argumento+"</br>";
    }
    if(typeof(primerParam)=="undefined") divBis.innerHTML += "Primer param no esta definida";
    if (primerParam=="1") {
        divBis.innerHTML+="Pues es parecido \"1\"";
    }else{
        divBis.innerHTML+="no es parecido \"1\"";
    }
    if (primerParam==="1") {
        divBis.innerHTML+="Pues es identico \"1\"";
    }else{
        divBis.innerHTML+="no es identico \"1\"";
    }
}

mostrarTodosParam("Un parametro", 50, true, bebida);
mostrarTodosParam();
mostrarTodosParam(1);
mostrarTodosParam("1");

var intentoConversion = parseFloat("veinte");
divBis.innerHTML += "</br>Convirtiendo. Resultado = "+(intentoConversion);
divBis.innerHTML += "</br>tipo de dato es = "+typeof(intentoConversion);
if (isNaN(intentoConversion)) divBis.innerHTML += "</br>No es un numero";

divBis.innerHTML +="</br>infinito = "+ 1/0;
//precision double parece
divBis.innerHTML +="</br>Maximo = "+ 1.234567890123456789;


