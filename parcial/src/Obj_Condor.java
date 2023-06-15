public class Obj_Condor extends Cla_Aves implements In_Volador{

    public Obj_Condor(String nombre, String genero, String especie, String procedencia, double peso, double envergadura) {
        super(nombre, genero, especie, procedencia, peso, envergadura);
        this.toString();
    }

    public String Volar() {
        return "Al momento de volar puede recorrer mas de 160KM sin aletear sus alas.";
    }

    public String toString() {
        return super.toString()+Volar();
    }
}
