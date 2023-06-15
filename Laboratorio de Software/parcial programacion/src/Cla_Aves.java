public class Cla_Aves extends Cla_Animal{

    private double envergadura_alas;
    

    
  public Cla_Aves(String nom, String gen, String espe, String proceden, double peso, double envergadura_alas) {
      super(nom, gen, espe, proceden, peso);
      this.envergadura_alas = envergadura_alas;
    }



  public double getEnvergadura_alas() {
      return envergadura_alas;
  }
  public void setEnvergadura_alas(double envergadura_alas) {
      this.envergadura_alas = envergadura_alas;
  }
    
  }
