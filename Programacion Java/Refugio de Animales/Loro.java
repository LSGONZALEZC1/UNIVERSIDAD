/*
Laura Sofia Gonzalez Castaño 
30000091406
*/

public class Loro extends Animal{

    public Loro() {
    }
    
    @Override
    public String toString(){
        return "\nLoro de nombre "+super.getNombre()+", de color "+super.getColor()+" y fue adoptado el "+super.getFecha_adopcion();
    }

}