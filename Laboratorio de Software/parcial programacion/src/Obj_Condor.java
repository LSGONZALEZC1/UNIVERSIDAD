public class Obj_Condor extends Cla_Aves implements In_Volador{


    

    public Obj_Condor(String nom, String gen, String espe, String proceden, double peso, double envergadura_alas) {
        super(nom, gen, espe, proceden, peso, envergadura_alas);
    }

    public String Volar() {
        return " Al volar permanecen por largos tiempos sin mover sus alas.";
    }

    public String toString() {
        return super.toString()+Volar();
    }
}