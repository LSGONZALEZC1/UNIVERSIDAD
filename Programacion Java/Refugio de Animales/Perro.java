/*
Laura Sofia Gonzalez Castaño 
30000091406
*/

public class Perro extends Mamifero {

    private boolean castrado;

    public Perro() {
        this.castrado = false;
    }//constructor vacio

    public Perro(String nombre, String raza, String color){
        
        this.nombre= nombre;
        this.raza = raza;
        this.color = color;
    }

    public void castrar() {
        if (this.castrado == false) {
            this.castrado = true;
        }
    }

    public boolean isCastrado() {
        return castrado;
    }

    //para booleanos no se usa get sino is

    @Override
    public String toString(){
        return "\nPerro de nombre "+super.getNombre()+", raza "+super.getRaza()+", color " +super.getColor()+", su ultima vacunacion fue el "+super.getFecha_ultima_vacuna()+" y fue adoptado el "+super.getFecha_adopcion();
    }
    
}