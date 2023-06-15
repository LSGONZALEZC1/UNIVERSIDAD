import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patineta> elementos = new ArrayList<>();
        System.out.println("tamaño inicial del arreglo: " + elementos.size());
        System.out.println("tamaño del arreglo despues de agregar una fabrica: " + elementos.size());
        elementos.add(new Monopatin(265, 800));
        System.out.println("tamaño del arreglo después de cargar una patineta: " + elementos.size());
        for (int i = 0; i < 4; i++) {
            elementos.add(new Patineta(100*i, 600));
        }
        System.out.println("tamaño del arreglo después de cargar cuatro patinetas: " + elementos.size());
        elementos.remove(3);
        System.out.println("tamaño del arreglo después de eliminar un elemento: " + elementos.size());


    }
    
}
