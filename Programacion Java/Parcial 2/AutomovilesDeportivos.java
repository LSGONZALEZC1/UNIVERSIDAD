public class AutomovilesDeportivos extends Vehiculos{

    public AutomovilesDeportivos(String motor, int numero_ruedas,  int numero_pasajeros, String modelo, int numero_puertas) {
        super(motor,numero_ruedas, numero_pasajeros, modelo, numero_puertas);
        this.motor=motor;
        this.modelo=modelo;
        if (numero_ruedas<=4){
            this.numero_ruedas=numero_ruedas;
        } 
        if (numero_pasajeros<=2){
            this.numero_pasajeros=numero_pasajeros;
        }
        if (numero_puertas<=3){
            this.numero_puertas=numero_puertas;
        }
    }
    
}
