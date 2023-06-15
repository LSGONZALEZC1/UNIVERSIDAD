public class Obj_Puma extends Cla_Mamifero implements In_Corredor, In_Cazador {

    public Obj_Puma(String nombre, String genero, String especie, String procedencia, double peso, int tiempo_de_incubacion) {
        super(nombre, genero, especie, procedencia, peso, tiempo_de_incubacion);
        this.toString();
    }

    public String Cazar() {
        return "Asecha a sus presas para matarlas y ";
    }

    public String Corredor() {
        return "corre a mas de 60KM por hora.";
    }
    
    public String toString() {
        return super.toString()+Cazar()+Corredor();
    }
}
