public abstract class Cla_Animal{
  
  private String nombre;
  private String genero;
  private String especie;
  private String procedencia;
  private double peso;

  public Cla_Animal(String nombre, String genero,  String especie,  String procedencia, double peso){
    this.setNombre(nombre);
    this.setGenero(genero);
    this.setEspecie(especie);
    this.setProcedencia(procedencia);
    this.setPeso(peso);
    this.toString();
  }

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}

public String getProcedencia() {
	return procedencia;
}

public void setProcedencia(String procedencia) {
	this.procedencia = procedencia;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

  public String toString(){
    return "El nombre del animal es "+nombre+" es de genero "+genero+" de la especie "+especie+" con un peso de "+peso+" kilos y procede de "+procedencia+".\n";
  }
  
}