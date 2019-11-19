let array_A=[1,2,3,4,5];
let array_B=[2,3,4,5,6];
document.getElementById("contenido").innerHTML+="<h3>Arrays<h3>";
arrayEnTabla(array_A);
arrayEnTabla(array_B);
let sumaAB = operarArrays(array_A, array_B, suma);
let restaAB = operarArrays(array_A, array_B, resta);
let multiplicaAB = operarArrays(array_A, array_B, multiplica);
let divideAB = operarArrays(array_A, array_B, (x,y)=>x/y);
let puntoAB = operarArrays(array_A, array_B, punto);
document.getElementById("contenido").innerHTML+="<h3>suma<h3>";
arrayEnTabla(sumaAB);
document.getElementById("contenido").innerHTML+="<h3>resta<h3>";
arrayEnTabla(restaAB);
document.getElementById("contenido").innerHTML+="<h3>multiplicacion<h3>";
arrayEnTabla(multiplicaAB);
document.getElementById("contenido").innerHTML+="<h3>division<h3>";
arrayEnTabla(divideAB);
document.getElementById("contenido").innerHTML+="<h3>punto<h3>";
arrayEnTabla(puntoAB);


function arrayEnTabla(array) {
    let tabla="<table border=2><tr>";
    for (let index = 0; index < array.length; index++) {
        const element = array[index];
        tabla += "<td>&nbsp; "+element+"&nbsp;</td>";
    }
    document.getElementById("contenido").innerHTML+=tabla+"</tr></table>";
}
