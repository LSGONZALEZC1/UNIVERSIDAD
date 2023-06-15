public class Main {
    public static void main(String[] args) {
        Pago_efectivo efectivo = new Pago_efectivo("juan Perez",10000,"03-01-2021");
        
        Pago_tarjeta tarjeta = new Pago_tarjeta("Adriana martinez", 50000, "14-03-2022", "8302-4566-9874", 024, 6);
        
        pago_transferencia transfer = new pago_transferencia("Alejandra Fernandez", 60000, "23-12-2021", "Nequi 3002889475");

        System.out.println("pago en efectivo: " + efectivo);
        System.out.println("pago con tarjeta " + tarjeta);
        System.out.println("Pago por transferencia " + transfer);

    }
}
