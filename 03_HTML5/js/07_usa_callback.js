//nomenclatura tipica de funcion en variable
let suma=function(x,y){return x+y;}

//nomenclatura tipica de funcion
function multiplica(x,y){return x*y;}

//objeto funcion
let divide= new Function("x","y","return x/y");

//funcion flecha
let resta=(x,y)=>{
    return x-y;
}

let punto=function(x,y) {
    //template strings ES6
    return `(${x},${y})`;
}