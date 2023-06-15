public class App {
    public static void main(String[] args) {
        Motor[] motores=new Motor[3];
        motores[0] = new Electrico(370);
        motores[1] = new Gasolina(450);
        Diesel vin = new Diesel(600);
        motores[2]= vin;

        Vehiculo motico = new Motocicleta(motores[1], 2, "MV Augusta 800", 800);
        Automovil van = new Camion(vin, 4, "clase V", 5, 250);

        System.out.println("los datos de la moto son: " + motico);
        System.out.println("los datos de la Van son " + van);

        System.out.println("probando mover la moto");
        motico.arrancar();
        for (int i = 0; i < 10; i++) {
            motico.acelerar(36);
        }
        for (int i = 0; i < 10; i++) {
            motico.frenar(40);
        }
        motico.detener();

        Bicicleta cicla = new Bicicleta("Fibra de carbono", 20, "S-works Turbo Levo");

        cicla.arrancar();
        for (int i = 0; i < 10; i++) {
            cicla.acelerar(10-i);
        }
        for (int i = 0; i < 10; i++) {
            cicla.frenar(5);
        }
        cicla.detener();

        cicla.lijar();
        cicla.pintar("Aguamarina");
        cicla.encerar();

        van.lijar();
        van.pintar("Negro fluorescente");
        van.encerar();

        
    }
}
