package contraseña;
import java.util.Scanner;

public class Main{
  
  public static boolean esSegura(String password){

     
    if(password.length() >8){
      boolean mayuscula=false;
      boolean numero= false;
      boolean espacio = true;
      char c;

      for(int i=0; i<password.length();i++){
        c = password.charAt(i);
      
      
        if(Character.isDigit(c))
          numero=true;
        if (Character.isUpperCase(c))
          mayuscula = true;
        if(Character.isSpaceChar(c))
          espacio= false; 
   
      }

      if(numero && mayuscula && espacio )
        return true;
      else
        return false;
      
    }else{
      return false;
    }
  }

  public static void main(String[]args){
    

    Scanner lector = new Scanner(System.in);

    String password;

    System.out.println("ingrese una contraseña;");
    password=lector.next();

    if(esSegura(password))
      System.out.println("la contraseña es segura");
    else
      System.out.println("la contraseña no es segura");
    
  }
}