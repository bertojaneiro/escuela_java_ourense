/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
   $("#btn_peticion_ajax_jq").click(function(){
      $.ajax({
          "url":"./datosjson",
          "type":"GET",
          "success": function(respuestaJson){
              $("#div_datos_json").html(JSON.stringify(respuestaJson));
          },
          "error": function(jqXHR, textStatus, errorThrown){
              console.error("No se ha podido obtener la info");
              console.warn(jqXHR);
              console.warn(textStatus);
              console.warn(errorThrown);
                if (jqXHR.status === 404) {
                    alert("url no localizada");
                }
          }
      }); 
   });
    
    $("#btn_peticion_ajax_json").click(function(){
        let nombre = document.getElementById("nombre").value;
        let email = document.getElementById("email").value;
        if (nombre!=="" && nombre.length>1 && email!=="") {
            let expresionNombre = new RegExp("^[A-Z][a-z]+ ?[A-Za-z]*$");
            let expresionEmail = /^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$/;
            if (!expresionNombre.test(nombre)) {
                alert("Primera letra mayuscula, minimo una minuscula. Apellido opcional (solo uno)");
            }else
            if (!expresionEmail.test(email)) {
                alert("escribe bien el email coño");
            }else{
                let datosusuario={
                "nombre": nombre,
                "email": email
                };
                $.post("./datosjson", datosusuario, function(resp){
                    $("#div_datos_json").html(JSON.stringify(resp));
                });
            }
        }else{
            alert("los datos no son validos");
        }
        
    });
});

