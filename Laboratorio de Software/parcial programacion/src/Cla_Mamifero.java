public class Cla_Mamifero extends Cla_Animal{

    private int tiempo_de_encubacion;

  public Cla_Mamifero(String nom, String gen, String espe, String proceden, double peso, int tiempo_de_encubacion) {
      super(nom, gen, espe, proceden, peso);
      this.tiempo_de_encubacion = tiempo_de_encubacion;
    }

  public int getTiempo_de_encubacion() {
      return tiempo_de_encubacion;
  }
  
  public void setTiempo_de_encubacion(int tiempo_de_encubacion) {
      this.tiempo_de_encubacion = tiempo_de_encubacion;
  }
    
  }
