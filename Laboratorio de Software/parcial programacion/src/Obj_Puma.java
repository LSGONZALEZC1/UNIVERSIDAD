public class Obj_Puma extends Cla_Mamifero implements In_Corredor, In_Cazador {


    

    public Obj_Puma(String nom, String gen, String espe, String proceden, double peso, int tiempo_de_encubacion) {
        super(nom, gen, espe, proceden, peso, tiempo_de_encubacion);
    }

    public String Cazar() {
        return "Asecha a sus presas para matarlas y ";
    }

    public String Corredor() {
        return "corre muy rapido.";
    }
    
    public String toString() {
        return super.toString()+Cazar()+Corredor();
    }
}