/*
Laura Sofia Gonzalez Castaño 
30000091406
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

      try (Scanner teclado = new Scanner(System.in)) {

        int eleccion;

          System.out.println("Escoged que animal quereís registrar\n");
          System.out.println("1. Loro");
          System.out.println("2. Perro");
          System.out.println("3. Gato\n");

          eleccion = teclado.nextInt();
          teclado.nextLine();
          
          switch (eleccion){
            
            case 1:{
                registrar_loro();
                break;
            }

            case 2:{
                registrar_perro();
                break;
            }

            case 3:{
                registrar_gato();
                break;
            }

            default:{
                System.out.println("Habeís escogido una opción inválida, ahora morirá un panda!");
            }

          }

        teclado.close();

      }

    }

    public static void registrar_loro(){

      Scanner teclado =new Scanner(System.in);
      Loro l1=new Loro();

      System.out.println("\nEscribe el nombre de tu loro");
      String nombre= teclado.nextLine();
      System.out.println("\nEscribe el color de tu loro");
      String color = teclado.nextLine();
      System.out.println("\nEscribe la fecha de adopcion de tu loro");
      String fecha_adopcion = teclado.nextLine();

      l1.setNombre(nombre);
      l1.setColor(color);
      l1.setFecha_adopcion(fecha_adopcion);

      System.out.println("\n*Registraste un nuevo loro Exitosamente* \n"+ l1);
      teclado.close();

    }

    public static void registrar_perro(){

      Scanner teclado =new Scanner(System.in);
      Perro p1=new Perro();

      System.out.println("\nEscribe el nombre de tu perro");
      String nombre= teclado.nextLine();
      System.out.println("\nEscribe la raza de tu perro");
      String raza= teclado.nextLine();
      System.out.println("\nEscribe el color de el perro");
      String color = teclado.nextLine();
      System.out.println("\nEscribe la fecha de la ultima vacuna de tu perro");
      String fecha_ultima_vacunacion= teclado.nextLine();
      System.out.println("\nEscribe la fecha de adopcion de tu perro");
      String fecha_adopcion = teclado.nextLine();

      p1.setNombre(nombre);
      p1.setRaza(raza);
      p1.setColor(color);
      p1.setFecha_adopcion(fecha_adopcion);
      p1.setFecha_ultima_vacuna(fecha_ultima_vacunacion);

      System.out.println("\n*Registraste un nuevo perro Exitosamente* \n"+ p1);
      teclado.close();

    } 

    public static void registrar_gato(){

      Scanner teclado =new Scanner(System.in);
      Gato g1=new Gato();

      System.out.println("\nEscribe el nombre de tu gato");
      String nombre= teclado.nextLine();
      System.out.println("\nEscribe la raza de tu gato");
      String raza= teclado.nextLine();
      System.out.println("\nEscribe el color de el gato");
      String color = teclado.nextLine();
      System.out.println("\nEscribe la fecha de la ultima vacuna de tu gato");
      String fecha_ultima_vacunacion= teclado.nextLine();
      System.out.println("\nEscribe la fecha de adopcion de tu gato");
      String fecha_adopcion = teclado.nextLine();

      g1.setNombre(nombre);
      g1.setRaza(raza);
      g1.setColor(color);
      g1.setFecha_adopcion(fecha_adopcion);
      g1.setFecha_ultima_vacuna(fecha_ultima_vacunacion);

      System.out.println("\n*Registraste un nuevo gato Exitosamente*\n"+ g1);
      teclado.close();

    } 
    
}