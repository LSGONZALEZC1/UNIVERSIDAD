/*
Laura Sofia Gonzalez Castaño 
30000091406
*/


public class Animal{
    
    //private y protected(algunos pueden acceder) son similares
    protected String nombre;
    protected String color;
    protected String fecha_adopcion;

    public Animal() {
        this.nombre = "";
        this.color = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFecha_adopcion() {
        return fecha_adopcion;
    }

    public void setFecha_adopcion(String fecha_adopcion) {
        this.fecha_adopcion = fecha_adopcion;
    }
    
}