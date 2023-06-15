import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int detenerse = 1,deterner_programa=1, opc_menu = 0, opc_menu_2 = 0, tamaño_1 = 0,tamaño_2, tiempo_de_encubacion=0
        ,terminar = 0;
        double peso_mamifero=0, peso_ave=0,envergadura=0;
        String nombre_mamifero="",genero_mamifero ="",especie_mamifero="",procedencia_mamifero=""
        ,nombre_ave="",genero_ave ="",especie_ave="",procedencia_ave="";
        
        ArrayList <Cla_Animal> catalogo = new ArrayList<>();{
            
            Obj_Avestruz avestruz = new Obj_Avestruz("Avestruz", "Struthuio", "Camelus", "Tanzania", 120, 2.0);
            catalogo.add(avestruz);

            Obj_Puma puma = new Obj_Puma("Puma","Puma" , "Concolor", "Peru", 80, 90);
            catalogo.add(puma);

            Obj_Halcon halcon = new Obj_Halcon("Halcon Moteado", "Falco", "Pactatus", "Isla Mauricio", 0.25, 0.52);
            catalogo.add(halcon);

            Obj_Titi titi = new Obj_Titi("Titi del Choco", "Callicebus", "Pallences", "Paraguay", 0.400, 183);
            catalogo.add(titi);

            Obj_Condor condor = new Obj_Condor("Condor", "Vulto", "Gryphus", "Chile", 14, 2.83);
            catalogo.add(condor);

        }

        System.out.println("Bienvenido Zootopia Catalogo");
    
        try (Scanner entrada = new Scanner(System.in)) {
        
            while (deterner_programa==1) {

                System.out.println("Porfavor ingresa la opcion que deseas realizar:\n1) Agregar en el catalogo\n2) Ver catalogo\n3) Detener programa");
                opc_menu = entrada.nextInt();    
                    
                switch (opc_menu) {
                    case 1:
                            
                        while (detenerse == 1) {
                                
                            System.out.println("Elegiste agregar un nuevo animal al catalogo, porfavor preciona:\n1) Para agregar mamiferos\n2) Para agregar aves\n3) Para salir");
                            opc_menu_2 = entrada.nextInt();
                                
                            switch (opc_menu_2) {
                
                                case 1:

                                    System.out.println("Elegiste agregar mamiferos, cuantos mamiferos deseas agregar:");
                                    tamaño_1 = entrada.nextInt();
                                    
                                    Cla_Mamifero [] mamiferos = new Cla_Mamifero[tamaño_1];
                                        
                                    for (int i = 0; i < tamaño_1; i++) {
                                           
                                        System.out.println("Ingresa el nombre del animal "+(i+1)+" : ");
                                        nombre_mamifero=entrada.nextLine();entrada.nextLine();
                                           
                                        System.out.println("Ingresa el genero del animal "+(i+1)+" : ");
                                        genero_mamifero = entrada.nextLine();
    
                                        System.out.println("ingresa la especie del animal "+(i+1)+" : ");
                                        especie_mamifero = entrada.nextLine();
    
                                        System.out.println("Ingresa la procedencia del animal "+(i+1)+" : ");
                                        procedencia_mamifero = entrada.nextLine();
    
                                        System.out.println("Ingresa el peso del animal "+(i+1)+" utilizando la (,) en los casos que este tengas valores decimales: ");
                                        peso_mamifero = entrada.nextDouble();
    
                                        System.out.println("Ingresa el tiempo de encubacion del animal "+(i+1)+" en dias: ");
                                        tiempo_de_encubacion=entrada.nextInt();entrada.nextLine();
    
                                        catalogo.add(mamiferos[i]= new Cla_Mamifero(nombre_mamifero, genero_mamifero, especie_mamifero, procedencia_mamifero, peso_mamifero, tiempo_de_encubacion));
                                           
                                    }
    
                                    System.out.println("Deseas agregar otro animal:\n1) Si\n2) No");
                                    terminar=entrada.nextInt();
                                        
                                    if (terminar==1) {
                                            
                                    } else if(terminar==2) {
                                        detenerse=0;
                                        continue;
                                    }else if(terminar<1 || terminar>2){
                                        System.err.println("Ingresaste una opcion incorrecta, porfavor intenta nuevamente");
                                    }

                                        break;
                                    
                                case 2:
    
                                    while (detenerse ==1) {
    
                                        System.out.println("Elegiste agregar mamiferos, cuantos mamiferos deseas agregar:");
                                        tamaño_2 = entrada.nextInt();
                                        
                                        Cla_Aves [] aves = new Cla_Aves[tamaño_2];
    
                                        for (int i = 0; i < tamaño_2; i++) {
                                            
                                            System.out.println("Ingresa el nombre del animal "+(i+1)+" : ");
                                            nombre_ave=entrada.nextLine();entrada.nextLine();
                                                
                                            System.out.println("Ingresa el genero del animal"+(i+1)+" : ");
                                            genero_ave = entrada.nextLine();
    
                                            System.out.println("ingresa la especie del animal "+(i+1)+" : ");
                                            especie_ave = entrada.nextLine();
    
                                            System.out.println("Ingresa la procedencia del animal "+(i+1)+" : ");
                                            procedencia_ave = entrada.nextLine();
    
                                            System.out.println("Ingresa el peso del animal "+(i+1)+" utilizando la (,) en los casos que este tengas valores decimales: ");
                                            peso_ave = entrada.nextDouble();
    
                                            System.out.println("Ingresa la envergadura del animal "+(i+1)+" utilizando (,) en caso de que este tenga valores decimales: ");
                                            envergadura=entrada.nextDouble();entrada.nextLine();
    
                                            catalogo.add(aves[i]= new Cla_Aves(nombre_ave, genero_ave, especie_ave, procedencia_ave, peso_ave, envergadura));
                                                
                                        }
                                        System.out.println("Deseas agregar otro animal:\n1) Si\n2) No");
                                        terminar=entrada.nextInt();
                                            
                                        if (terminar==1) {
                                                
                                        } else if(terminar==2) {
                                            detenerse=0;
                                            continue;
                                        }else if(terminar<1 || terminar>2){
                                            System.err.println("Ingresaste una opcion incorrecta, porfavor intenta nuevamente");
                                        }

                                    }
    
                                        break;
                                    
                                case 3:
                                    detenerse=0;
                                    break;
                                    
                                default:
                                    
                                    System.err.println("Ingresaste una opcion incorrecta, porfavor intentalo nuevamente");
                                    
                                    break;
                            }
                        }
    
                            break;
                        
                    case 2:

                        System.out.println(catalogo.toString());
                        
                        break;
                        
                    case 3:

                        System.out.println("Gracias por usar este programa vuelva pronto.");
                        deterner_programa=0;
                            
                        break;

                    default:

                        System.err.println("\nElegiste una opcion incorrecta, porfavor intentalo nuevamente.\n");
                           
                        break;

                }
            }
        }
        catch (InputMismatchException e) {
            System.err.println("Ingresaste el numero con un signo diferente de la (,). Porfavor reinicia el programa he intentalo nuevamente.4");
        }
    }
}
