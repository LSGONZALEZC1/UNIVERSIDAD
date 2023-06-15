public class Cla_Mamifero extends Cla_Animal{

  private int tiempo_de_encubacion;
  
  public Cla_Mamifero(String nombre, String genero, String especie,  String procedencia, double peso, int tiempo_de_incubacion){
  super(nombre,genero,especie,procedencia,peso);
    this.setTiempo_de_encubacion(tiempo_de_encubacion);
  }

public int getTiempo_de_encubacion() {
	return tiempo_de_encubacion;
}

public void setTiempo_de_encubacion(int tiempo_de_encubacion) {
	this.tiempo_de_encubacion = tiempo_de_encubacion;
}
  
}