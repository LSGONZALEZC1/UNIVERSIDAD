public class Deportivo extends Automovil {

    public Deportivo(Motor motor, String modelo, int puertas) {
        super(motor, 4, 2, modelo, 0);
        this.setPuertas(puertas);
    }


    
    @Override
    public void setPuertas(int puertas) {
        if (0 < puertas && puertas <=3) {
            super.setPuertas(puertas);
        } else {
            System.err.println("el número de puertas debe estar entre 1 y 3");
            super.setPuertas(2);
        }
        
    }



    @Override
    public String toString() {
        return "Deportivo ["+ super.toString() + "]";
    }

    
}
