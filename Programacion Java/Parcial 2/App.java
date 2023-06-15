public class App {

    public static void main(String[] args){

        System.out.println("\nRegistro Vehiculo\n");

        System.out.println("\nMotocicleta\n");

        Motocicletas m1=new Motocicletas();
        m1.setMotor("aaa");
        m1.setNumero_ruedas(2);
        m1.setNumero_pasajeros(1);
        m1.setModelo("ls");
        m1.setCilindrada(4);

        System.out.println("Motor: "+m1.getMotor()+", numero de ruedas "+m1.getNumero_ruedas()+", numero de pasajeros "+m1.getNumero_pasajeros()+", modelo "+m1.getModelo()+", cilindrada "+m1.getCilindrada()+"\n");
    
    }
    
}
