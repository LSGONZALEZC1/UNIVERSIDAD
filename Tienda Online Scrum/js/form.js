  /*N9OMBRE PRODUCTO */
function confnombre(data){

    x=document.getElementById("nombre").value;
    document.getElementById("confnombre").innerHTML =
    "El nombre: "+ x+" se a guardado ";
}

  /*CODIGO PRODUCTO */
function condcodige(data){

    x=document.getElementById("nomest").value;
    document.getElementById("condcodige").innerHTML =
     "codige:" + x+ " se ha guardado";
}

  /*PRECIO */
function confprecio(data) {
/*P---recio--- */
  
    x = document.getElementById("pres").value;
    document.getElementById("confprecio").innerHTML =
      "El precio del producto # " +": "+ x +" a sido añadido ";
    
  }

  /*NUMERO DE ARTICULOS */
  function mostrarNumeroArticulos(data) {

    x = document.getElementById("ingresoNumeroArticulos").value;
    document.getElementById("mostrarNumeroArticulos").innerHTML =
      "Cantidad de artículos disponibles: " + x;
  }
  
  /*DESCRIPCION */
  function confdescripcion() {

    x = document.getElementById("descripcion").value;
    document.getElementById("confdescripcion").innerHTML =
      "La descriopcion: "+" "+ x+" se a guardado ";
  }

  /*CATEGORIA */
  document.getElementById('submit').onclick=function(){

    var x=document.getElementById("categorias");
    var text=x.options[x.selectedIndex].text;

    document.getElementById("confcategoria").innerHTML = 'La categoria: '+ text + ' se a guardado';
  }

  /*IMAGEN */
  {

    if(document.querySelector("#foto")){
        var foto = document.querySelector("#foto");
        foto.onchange = function(e) {
            var uploadFoto = document.querySelector("#foto").value;
            var fileimg = document.querySelector("#foto").files;
            var nav = window.URL || window.webkitURL;
            var contactAlert = document.querySelector('#form_alert');
            if(uploadFoto !=''){
                var type = fileimg[0].type;
                var name = fileimg[0].name;
                if(type != 'image/jpeg' && type != 'image/jpg' && type != 'image/png'){
                    contactAlert.innerHTML = '<p class="errorArchivo">El archivo no es válido.</p>';
                    if(document.querySelector('#img')){
                        document.querySelector('#img').remove();
                    }
                    document.querySelector('.delPhoto').classList.add("notBlock");
                    foto.value="";
                    return false;
                }else{  
                        contactAlert.innerHTML='';
                        if(document.querySelector('#img')){
                            document.querySelector('#img').remove();
                        }
                        document.querySelector('.delPhoto').classList.remove("notBlock");
                        var objeto_url = nav.createObjectURL(this.files[0]);
                        document.querySelector('.prevPhoto div').innerHTML = "<img id='img' src="+objeto_url+">";
                    }
            }else{
                alert("No selecciono foto");
                if(document.querySelector('#img')){
                    document.querySelector('#img').remove();
                }
            }
        }
    }
    
    if(document.querySelector(".delPhoto")){
        var delPhoto = document.querySelector(".delPhoto");
        delPhoto.onclick = function(e) {
            removePhoto();
        }
    }
    
    function removePhoto(){
        document.querySelector('#foto').value ="";
        document.querySelector('.delPhoto').classList.add("notBlock");
        document.querySelector('#img').remove();
    }
    
    }

