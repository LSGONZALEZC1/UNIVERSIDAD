function confnombre(data){
    y=0+1;
    x=document.getElementById("nombre").value;
    document.getElementById("confnombre").innerHTML =
    "El nombre: "+y+" "+ x+" se a guardado ";
      

}

function condcodige(data){
    y=0+1;
    x=document.getElementById("nomest").value;
    document.getElementById("condcodige").innerHTML =
     "codige:" + x+ "se ha guardado";
}

function confprecio(data) {
/*P---recio--- */
    y=0+1;
    x = document.getElementById("pres").value;
    document.getElementById("confprecio").innerHTML =
      "El precio del producto # " + y +": "+ x +" a sido añadido ";
    
  }

  function mostrarNumeroArticulos(data) {
    y=0+1;
    x = document.getElementById("ingresoNumeroArticulos").value;
    document.getElementById("mostrarNumeroArticulos").innerHTML =
      "Cantidad de artículos disponibles: " + x;
  }
  

  function confdescripcion() {
    y=0+1;
    x = document.getElementById("descripcion").value;
    document.getElementById("confdescripcion").innerHTML =
      "La descriopcion: "+y+" "+ x+" se a guardado ";
  }

  function confcategoria(data) {
    y=0+1;

    x = document.getElementById("opcion").value;
    document.getElementById("confcategoria").innerHTML =
      "La categoria: "+y+" "+ x+" se a guardado ";

  }

