/*
Laura Sofia Gonzalez Castaño 
30000091406
*/

public class Gato extends Mamifero{

    public Gato() {
    }

    @Override
   public String toString(){
        return "\nGato de nombre "+super.getNombre()+", raza "+super.getRaza()+", color " +super.getColor()+", su ultima vacunacion fue el "+super.getFecha_ultima_vacuna()+" y fue adoptado el "+super.getFecha_adopcion();
   }

}