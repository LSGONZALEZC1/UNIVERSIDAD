public class Perro extends Mamifero{
    private boolean castrado;
  
    public Perro(){
      this.castrado=false;
    }//constructor vacio
  
  
    public void castrar(){
      if (this.castrado==false){
        this.castrado=true;
      }
    }
  
    public boolean isCastrado(){
      return castrado;
    }
    
  }
  
  //para booleanos no se usa get sino is