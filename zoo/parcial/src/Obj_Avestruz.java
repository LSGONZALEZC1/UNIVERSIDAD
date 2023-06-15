public class Obj_Avestruz extends Cla_Aves implements In_Corredor {

    public Obj_Avestruz(String nombre, String genero, String especie, String procedencia, double peso,double envergadura) {
        super(nombre, genero, especie, procedencia, peso, envergadura);
        this.toString();
    }

    public String Corredor() {
       return " Es un animal que corre a grandes velcidaddes.";
    }

    public String toString() {
        return super.toString()+Corredor();
    }
    
}
