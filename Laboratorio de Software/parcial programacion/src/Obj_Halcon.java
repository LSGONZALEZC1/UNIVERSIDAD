public class Obj_Halcon extends Cla_Aves implements In_Cazador,In_Volador {


    

    public Obj_Halcon(String nom, String gen, String espe, String proceden, double peso, double envergadura_alas) {
        super(nom, gen, espe, proceden, peso, envergadura_alas);
    }

    public String Cazar() {
        return "Es un excelente cazador";
    }

    public String Volar() {
        return " alcanza alturas muy altas."; 
    }
    
    public String toString() {
        return super.toString()+Cazar()+Volar();
    }

}