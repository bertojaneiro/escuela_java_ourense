let array_A=[1,2,3,4,5];
let array_B=[2,3,4,5,6];
let sumaAB = operarArrays(array_A, array_B, suma);
arrayEnTabla(sumaAB);
function arrayEnTabla(array) {
    let tabla="<table border=2><tr>";
    for (let index = 0; index < array.length; index++) {
        const element = array[index];
        tabla += "<td>&nbsp; "+element+"&nbsp;</td>";
    }
    return tabla+"</tr></table>";
}
document.getElementById("contenido").innerHTML+=arrayEnTabla(sumaAB);