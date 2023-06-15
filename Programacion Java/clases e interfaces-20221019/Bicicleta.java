public class Bicicleta implements Movil,coloreable{
    private String material;
    private int peso;
    private String modelo;
    private int speed=0;

    
    public Bicicleta(String material, int peso, String modelo) {
        this.material = material;
        this.peso = peso;
        this.modelo = modelo;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public void acelerar(int vel) {
       if (vel <= 10 && this.speed <=80){
        this.speed +=  vel;
       }
        System.out.println("vas en bicicleta a " + this.speed + "km/h");
    }
    @Override
    public void arrancar() {
        System.out.println("arrancaste tu bicicleta");
        
    }
    @Override
    public void detener() {
       System.out.println("Detuviste tu bicicleta");
        
    }
    @Override
    public void frenar(int vel) {
        if (this.speed-vel > 0){
            this.speed -= vel;
        }
        System.out.println("vas en bicicleta a " + this.speed + " km/h");
        
    }
    @Override
    public void lijar() {
        System.out.println("bicicleta lijada");
        
    }
    @Override
    public void pintar(String color) {
        System.out.println("ahora tu bicicleta es " + color);
        
    }
    @Override
    public void encerar() {
        System.out.println("bicicleta encerada");
        
    }
    
    
    
}
