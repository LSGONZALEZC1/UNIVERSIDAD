public abstract class Cla_Animal{
  
    private String nom;
    private String gen;
    private String espe;
    private String proceden;
    private double peso;
    
    public Cla_Animal(String nom, String gen, String espe, String proceden, double peso) {
        this.nom = nom;
        this.gen = gen;
        this.espe = espe;
        this.proceden = proceden;
        this.peso = peso;
    }


    public String getNom() {
        return nom;
    }





    public void setNom(String nom) {
        this.nom = nom;
    }





    public String getGen() {
        return gen;
    }





    public void setGen(String gen) {
        this.gen = gen;
    }





    public String getEspe() {
        return espe;
    }





    public void setEspe(String espe) {
        this.espe = espe;
    }





    public String getProceden() {
        return proceden;
    }





    public void setProceden(String proceden) {
        this.proceden = proceden;
    }





    public double getPeso() {
        return peso;
    }





    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString(){
        return "El nombre del animal es "+nom+" de genero "+gen+" especie "+espe+" pesa "+peso+" kilos y procede de "+proceden+".\n";
      }
}   