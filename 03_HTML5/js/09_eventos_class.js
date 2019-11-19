
function GestorEventosES5(inputId,btnId,divId){
    this.input=document.getElementById(inputId);
    this.boton=document.getElementById(btnId);
    this.divInfo=document.getElementById(divId);

    GestorEventosES5.prototype.funCallbkAlPulsar = function(evento){
        this.input.value = "Tipo evento: "+evento.type;
        this.boton.value="Puedes repetir";
        this.divInfo.innerHTML += "evento.currentTarget.id= "+this.boton.id;
        this.divInfo.className="div-marco";
        this.boton.removeEventListener("click", this.funCallBackAlPulsar);
    }

    GestorEventosES5.prototype.funCallBackAlPulsar_Dos = (evento) => {
        this.input.style="background-color:lightblue;";
    }

}

class GestorEventosES6{
    constructor(inputId,btnId,divId){
        this.input=document.getElementById(inputId);
        this.boton=document.getElementById(btnId);
        this.divInfo=document.getElementById(divId);
        this.funCallbkAlPulsarBind = this.funCallbkAlPulsar.bind(this);
        this.boton.addEventListener("click", this.funCallbkAlPulsarBind);
        this.boton.addEventListener("click", this.funCallBackAlPulsar_Dos);
    }

    funCallbkAlPulsar(evento){
        this.input.value = "Tipo evento: "+evento.type;
        this.boton.value="Puedes repetir";
        this.divInfo.innerHTML += "evento.currentTarget.id= "+this.boton.id;
        this.divInfo.className="div-marco";
        this.boton.removeEventListener("click", this.funCallbkAlPulsarBind);
    }

    funCallBackAlPulsar_Dos = (evento) => {
        this.input.style="background-color:lightblue;";
    }
}