public class Perro{
    private String raza;
    private String color;
    private String nombre;
    private int edad;
    
   

    public Perro(){

    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", color=" + color + ", nombre=" + nombre + ", edad=" + edad + "]";
    }

}