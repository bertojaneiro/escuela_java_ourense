function operarArrays(arrX, arrY, opera){
    //comprobamos q tienen el mismo tamaño
    if (arrX.length == arrY.length) {
        //declaramos un array
        var arrayResult = new Array(arrX.length);//ambito de funcion no de bloque en la declaración
        for (let index = 0; index < arrayResult.length; index++) {
            arrayResult[index]=opera(arrX[index], arrY[index]);
        }
    }
    return arrayResult;
}

//ejemplos array
//var arrayResult = []; 
//otra manera con notacion json, 
//no se indica el tamaño por q en js array -> hashMap<Object>
