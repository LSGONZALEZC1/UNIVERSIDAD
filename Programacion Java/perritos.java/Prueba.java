import java.io.*;
import java.util.*;
public class Prueba{
    public static void main(String[] args) {
            FileWriter escritor;
            ArrayList<Perro> perritus = new ArrayList<Perro>();
        Perro perrito=new Perro();
        perrito.setNombre("fifi");
        perrito.setRaza("cane Corso");
        perrito.setColor("Negro");
        perrito.setEdad(8);

       perritus.add(perrito);

       Perro otro=new Perro();
        otro.setNombre("Max");
        otro.setRaza("criollo");
        otro.setColor("miel");
        otro.setEdad(7);
        perritus.add(otro);

        Perro tercero=new Perro();
        tercero.setNombre("Mafalda");
        tercero.setRaza("Tacita de te");
        tercero.setColor("blanco");
        tercero.setEdad(16);
        perritus.add(tercero);

        try{
            escritor= new FileWriter("perritos.txt");
            for (Perro perro : perritus) {
                escritor.write(perro.toString());
                escritor.write(" \n");
            }
            
            System.out.println("perrito guardado exitosamente.");
            escritor.close();
        }catch
        (IOException e) {
            System.err.println("algo falló con el archivo: "+ e.getMessage());
        }
        

    }

}