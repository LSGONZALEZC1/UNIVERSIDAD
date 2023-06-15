import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        for(int i=0; i<numeros.length; i++){
            System.out.println("Escriba numero en la posicion "+i);
            numeros[i]=entrada.nexInt();
            entrada.nexLine();
        }
        
        
        entrada.close();
    }
}