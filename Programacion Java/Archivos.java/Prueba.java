import java.io.*;
import java.util.*;

public class Prueba{

    public static void main(String[] args) {
        FileWriter escritor;
        ArrayList <Perro> perritus=new ArrayList<Perro>();
        
        /*try {
            escritor=new FileWriter("Archivo.txt");
            escritor.write("ahora quiero tratar de escribir en un archivo abierto");
            System.out.println("escribio satisfactoriamente sobre el archivo");
            escritor.close();
            
        } catch (IOException e) {
            System.err.println("algo fallo en el archivo: "+e.getMessage());
        }*/

        Perro perrito=new Perro();
        perrito.setNombre("fifi");
        perrito.setRaza("cane corzo");
        perrito.setColor("cafe");
        perrito.setEdad(8);
        System.out.println(perrito);

        perritus.add(perrito);

        Perro perrito2=new Perro();
        perrito2.setNombre("lili");
        perrito2.setRaza("bulldog");
        perrito2.setColor("cafe con blanco");
        perrito2.setEdad(4);
        System.out.println(perrito);

        perritus.add(perrito2);

        Perro perrito3=new Perro();
        perrito3.setNombre("toby");
        perrito3.setRaza("labrador");
        perrito3.setColor("blanco");
        perrito3.setEdad(6);
        System.out.println(perrito);

        perritus.add(perrito3);

        try{
            escritor=new FileWriter("perritos.txt");
            for (Perro perro: perritus){
                escritor.write(perro.toString());
                escritor.write("\n");
            }

            System.out.println("perrito guardado exitosamente");
            escritor.close();
        } catch (IOException e) {
            System.err.println("algo fallo en el archivo: "+e.getMessage());
        }

        
    }
}