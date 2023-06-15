public class Camion extends Automovil {
  
    private int capacidad;

    public Camion(Motor motor, int ruedas, String modelo, int puertas, int capacidad) {
        super(motor, 0, 2, modelo, 0);
        this.setRuedas(ruedas);
        this.setPuertas(puertas);
        this.capacidad = capacidad;
    }

    @Override
    public void setPuertas(int puertas) {
        if (0< puertas && puertas <= 3) {
            super.setPuertas(puertas);
        } else {
           System.err.println("número inadecuado de puertas"); 
           super.setPuertas(1);
        }
        
    }

    @Override
    public void setRuedas(int ruedas) {
        if (ruedas%2==0) {
            super.setRuedas(ruedas);
        } else {
            System.err.println("Ay! pusiste ruedas impares");
            super.setRuedas(4);
        }
        
    }

    @Override
    public String toString() {
        return "Camion ["+ super.toString()+ " capacidad=" + capacidad + "]";
    }

    
    
    
}
