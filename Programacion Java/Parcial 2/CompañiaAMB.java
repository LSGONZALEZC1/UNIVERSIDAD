public class CompañiaAMB {

    protected String motor;
    protected int numero_ruedas;
    protected int numero_pasajeros;
    protected String modelo;

    public CompañiaAMB(){
        this.numero_ruedas=0;
        this.numero_pasajeros=0;
    }

    public CompañiaAMB(int numero_ruedas, int numero_pasajeros){
        this.numero_ruedas=numero_ruedas;
        this.numero_pasajeros=numero_pasajeros;
    }


    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumero_ruedas() {
        return numero_ruedas;
    }

    public void setNumero_ruedas(int numero_ruedas) {
        this.numero_ruedas = numero_ruedas;
    }

    public int getNumero_pasajeros() {
        return numero_pasajeros;
    }

    public void setNumero_pasajeros(int numero_pasajeros) {
        this.numero_pasajeros = numero_pasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return "Vehiculo [ruedas: "+this.numero_ruedas+", pasajeros "+this.numero_pasajeros+"]";
    }
    
}
