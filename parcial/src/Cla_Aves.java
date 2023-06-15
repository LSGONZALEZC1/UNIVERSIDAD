public class Cla_Aves extends Cla_Animal{

  private double envergadura_alas;
  
  public Cla_Aves(String nombre, String genero,  String especie,  String procedencia, double peso, double envergadura){
    super(nombre,genero,especie,procedencia,peso);
    this.setEnvergadura_alas(envergadura);
  }
  
public double getEnvergadura_alas() {
	return envergadura_alas;
}
public void setEnvergadura_alas(double envergadura_alas) {
	this.envergadura_alas = envergadura_alas;
}
  
}