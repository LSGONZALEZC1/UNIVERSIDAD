import java.io.*;

class Main {
  public static void main(String[] args) {
    String renglon_actual;
    try {
      BufferedReader lector = new BufferedReader(new FileReader("archivito.txt"));
      while ((renglon_actual = lector.readLine()) != null){
        System.out.println(renglon_actual);
      }
      lector.close();
    } catch (FileNotFoundException e) {
      System.out.println("el archivo que est'as buscando vive en otro castilo");
    } catch (IOException e) {
      System.out.println("El archivo no se pudo leer");;
    }
    

  }
}