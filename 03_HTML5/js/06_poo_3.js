//Notacion JSON js object notation
//todo lo q se puede almacenar en xml se puede convertir a json y viceversa
//todo se puede alnmacenar como json


var unObjeto = {};

var otroObjeto = {
    "prop_1": "propiedad uno",
    "prop_2": "propiedad dos",
    "prop_3": "propiedad tres",
    prop_4: "propiedad cuatro",
    toString: function(){
        return "propiedades: "+this.prop_1+"; "+this.prop_2+"; "+this.prop_3+"; "+this.prop_4+"; "+this.prop_5+";"
    },
    toString2: function () {
        var cadena="";
        for (const key in otroObjeto) {
            if (otroObjeto.hasOwnProperty(key)) {
                if (typeof(otroObjeto[key])!="function"&& typeof(otroObjeto[key])!="undefined") {
                    const element = otroObjeto[key];
                    cadena += element+"; ";
                }
            }
        }
        return cadena;
    },
    toStringAll: function(){
        var strProp = "Lista propiedades: ";
        var largo = Object.keys(this).length;
        for (let i = 0; i < largo; i++) {
            if (Object.keys(this)[i].indexOf("prop_")>=0) {
                strProp+=" "+Object.values(this)[i];
            }
        }
        return strProp;
    }
}

otroObjeto.prop_5="Propiedad cinco";
otroObjeto.prop_9="Propiedad nueve";
var divTris = document.getElementById("contenido_tris");
divTris.innerHTML += otroObjeto.toString();
divTris.innerHTML += otroObjeto.toString2();
divTris.innerHTML += otroObjeto.toStringAll();