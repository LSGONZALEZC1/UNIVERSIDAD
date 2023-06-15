class Main {
    public static void main(String[] args){
        Punto pa=new Punto(3, 1);
        Punto pb=new Punto(4, 2);
        Linea rayita=new Linea(pa, pb);
        System.out.println("\n|La distancia de esta recta es "+rayita.calcular_dist()); 
        System.out.println("\n|La pendiente de esta recta es "+rayita.calcular_pendi()); 
    }
    
}
