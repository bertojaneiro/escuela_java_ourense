"use strict";
var lenguaje = "JS";
console.log("Typescript es "+lenguaje);

let textoExtra: String = " con Tipado fuerte OPCIONAL";

console.log("Typescript es " + lenguaje + textoExtra);

class UnaClase {
	
	constructor(private propiedad:String){
	}
	getPropiedad() : String{
		return this.propiedad;
	}
}
let unObjeto: UnaClase = new UnaClase("Tiene POO");
textoExtra = 2000;

console.log("Y "+ unObjeto.getPropiedad());