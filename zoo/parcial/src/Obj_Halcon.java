public class Obj_Halcon extends Cla_Aves implements In_Cazador,In_Volador {

    public Obj_Halcon(String nombre, String genero, String especie, String procedencia, double peso, double envergadura) {
        super(nombre, genero, especie, procedencia, peso, envergadura);
        this.toString();
    }

    public String Cazar() {
        return "Es un excelente cazador";
    }

    public String Volar() {
        return " que alcanza alturas de mas 80 metros de altura."; 
    }
    
    public String toString() {
        return super.toString()+Cazar()+Volar();
    }

}
