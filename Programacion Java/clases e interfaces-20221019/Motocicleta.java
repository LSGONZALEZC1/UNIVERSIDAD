public class Motocicleta extends Vehiculo{
    private int cilindrada;

    public Motocicleta(Motor motor,  int pasajeros, String modelo, int cilindrada) {
        super(motor, 2 , 0, modelo);
        setPasajeros(pasajeros);
        this.cilindrada = cilindrada;
    }
    

    
    @Override
    public void setPasajeros(int pasajeros) {
        if (1 <= pasajeros && pasajeros <=2 ) {
            super.setPasajeros(pasajeros);
        } else {
           System.err.println("el número de pasajeros es muy alto o muy bajo"); 
           super.setPasajeros(1);
        }
        
    }



    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta [" + super.toString() + " cilindrada=" + cilindrada + "]";
    }

   

    
}
