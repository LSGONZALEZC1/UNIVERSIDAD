public class Vehiculos extends CompañiaAMB {

    protected int numero_puertas;

    public Vehiculos(String motor, int numero_puertas, int numero_ruedas, String modelo, int numero_pasajeros){
        //super(numero_ruedas, numero_pasajeros);
        this.numero_puertas=numero_puertas;
    }

    public Vehiculos(String motor, int numero_ruedas, int numero_pasajeros, String modelo, int numero_puertas2,
            int capacidad) {
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }
    
}
