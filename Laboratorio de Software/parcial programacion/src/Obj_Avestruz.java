public class Obj_Avestruz extends Cla_Aves implements In_Corredor {

    

    public Obj_Avestruz(String nom, String gen, String espe, String proceden, double peso, double envergadura_alas) {
        super(nom, gen, espe, proceden, peso, envergadura_alas);
    }

    public String Corredor() {
       return " animal que corre a gran velocidad.";
    }

    public String toString() {
        return super.toString()+Corredor();
    }
    
}
