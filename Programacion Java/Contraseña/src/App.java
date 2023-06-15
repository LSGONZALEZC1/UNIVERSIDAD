import java.security.SecureRandom;

class Main
{
  //Metodo para establecer longitud de la contraseña
  public static void main(String[] args){
    int long_password= 12;
    System.out.println(PasswordAleatoria(long_password));
  }
  
  //Metodo para generar contraseña aleatoria 
  public static String PasswordAleatoria(int long_password){
    
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#$%&/*!¡*~^";

    SecureRandom random = new SecureRandom();
    StringBuilder sb = new StringBuilder();//sb=StringBuilder
 
    // StringBuilder: es una clase que permite crear objetos que almacenan cadenas de caracteres que pueden ser modificados in necisidad de crear nuevos objetos, en este caso la creacion de contraseñas aleatorias
 
    for (int i=0; i<long_password; i++){
      int randomIndex = random.nextInt(chars.length());
      sb.append(chars.charAt(randomIndex));
    }

    //Devuelve la cadena de texto (String)
    return sb.toString();
  }

}