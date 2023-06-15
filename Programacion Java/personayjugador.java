package Work;

public class trabajo {

    public static void main(String[] args) {
        
        persona p1 = new persona("", ""); //Creacion de objeto personas
        p1.mostrar1();
        p1.setNombre("Laura");     //Asignacion con Set
        p1.setApellido("Gonzalez");
        p1.mostrar1();                      //Impresión de Usuario

        jugador p2 = new jugador("Pedrito", "Martinez", 23, "Delantero"); //Creacion de jugador con metodo
        System.out.println();
        p2.mostrar(); 
        System.out.println();




    }
}
