public class Motocicletas extends CompañiaAMB {

    protected int cilindrada;

    public Motocicletas(String motor, int numero_ruedas, int numero_pasajeros, String modelo, int cilindrada){

       // super(numero_pasajeros,numero_ruedas: 2);

        this.motor=motor;
        if (numero_ruedas<=2){
            this.numero_ruedas=numero_ruedas;
        } 
        if (numero_pasajeros<=2){
            this.numero_pasajeros=numero_pasajeros;
        }
        this.modelo=modelo;
        this.cilindrada=cilindrada;
    }

    public Motocicletas() {
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString(){
        return super.toString()+"Motoo [cilindrada: "+this.cilindrada+"]";
    }

 
}
