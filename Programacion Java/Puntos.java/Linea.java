public class Linea {

    double resultado;
    Punto[] puntos = new Punto[2];

    public Linea(Punto p1, Punto p2){
        this.puntos[0]=p1;
        this.puntos[0]=p2;
    }

    public double calcular_dist(){
        double delta_x=this.puntos[1].getX()-puntos[0].getX();
        double delta_y=this.puntos[1].getY()-puntos[0].getY();
        return Math.sqrt(Math.pow(delta_x, 2)+Math.pow(delta_y, 2));
    }

    public double calcular_pendi(){
        double delta_x=this.puntos[1].getX()-puntos[0].getX();
        double delta_y=this.puntos[1].getY()-puntos[0].getY();

        int delta_y=(int) (this.puntos[1].getY()-this.puntos[0].getY());

        try {
            resultado=(int) (delta_y/delta_x);
        } catch (ArithmeticException ex) {
            System.err.println("divides entre cero!!");
            resultado=-10000010;
        }
        
        return resultado;
    }
    
}
