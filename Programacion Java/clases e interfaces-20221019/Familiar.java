public class Familiar extends Automovil {

    public Familiar(Motor motor, int pasajeros, String modelo, int puertas) {
        super(motor, 4, 0, modelo, 0);
        this.setPasajeros(pasajeros);
        this.setPuertas(puertas);
    }

    @Override
    public void setPuertas(int puertas) {
       if (3<= puertas && puertas <= 5) {
        super.setPuertas(puertas);
       } else {
        System.err.println("número inadecuado de puertas");
        super.setPuertas(3);
       }
        
    }

    @Override
    public void setPasajeros(int pasajeros) {
        if (2<= pasajeros && pasajeros <= 5) {
            super.setPasajeros(pasajeros);
        } else {
            System.err.println("numero inadecuado de pasajeros");
            super.setPasajeros(2);
        }

        
        
    }

    @Override
    public String toString() {
        return "Familiar ["+ super.toString() +"]";
    }
    
    
}
