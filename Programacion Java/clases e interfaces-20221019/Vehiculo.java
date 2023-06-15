public abstract class Vehiculo implements Movil{
    protected Motor motor;
    protected int ruedas;
    protected int pasajeros;
    protected String modelo;
    protected int max_speed;
    protected int speed=0;


    

    public Vehiculo(Motor motor, int ruedas, int pasajeros, String modelo) {
        this.motor = motor;
        this.ruedas = ruedas;
        this.pasajeros = pasajeros;
        this.modelo = modelo;
        this.max_speed= (int) (0.8*this.motor.getPotencia());
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return "motor=" + motor + ", ruedas=" + ruedas + ", pasajeros= " + pasajeros + ", modelo= " + modelo + ", velocidad máxima= "+ this.max_speed;
    }
    @Override
    public void acelerar(int vel) {
        if (this.speed+vel<=this.max_speed) {
            this.speed += vel; 
        } else {
            System.err.println("wey! vas a la máxima");
            this.speed= this.max_speed;
        }
       System.out.println("vas a "+ this.speed+ "km/h"); 
    }
    @Override
    public void arrancar() {
        if(this.speed<=0){
            this.speed = 1;
            System.out.println("arrancaste");
        }
        else{
            System.err.println("tu vehículo y había arrancado");
        }
    }
    @Override
    public void detener() {
       this.speed=0;
       System.out.println("tu vehículo se detuvo");
        
    }
    @Override
    public void frenar(int vel) {
        if (this.speed-vel>=1) {
            this.speed -= vel;
        } else {
            System.err.println("No te puedes frenar más");
            this.speed =1;
        }
        System.out.println("vas a " + this.speed +  "Km/h");
        
    }

    
    
}
