public class Camiones extends Vehiculos {

    protected int capacidad;

    public Camiones(String motor, int numero_ruedas, int numero_pasajeros, String modelo, int numero_puertas, int capacidad) {
        super(motor, numero_ruedas, numero_pasajeros, modelo, numero_puertas, capacidad);
        this.motor=motor;
        this.modelo=modelo;
        if(numero_ruedas>=4){
            this.numero_ruedas=numero_ruedas;
        }
        if(numero_pasajeros<=2){
            this.numero_pasajeros=numero_pasajeros;
        }
        if (capacidad>100){
            this.capacidad=capacidad;
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString(){
        return super.toString()+"Camion [capacidad: "+this.capacidad+"]";
    }
    
}
