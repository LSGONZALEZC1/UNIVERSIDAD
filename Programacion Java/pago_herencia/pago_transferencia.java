public class pago_transferencia extends Pago{
    public pago_transferencia(String cliente, int monto, String fecha, String origen) {
        super(cliente, monto, fecha);
        Origen = origen;
    }
    private String Origen;
    public String getOrigen() {
        return Origen;
    }
    public void setOrigen(String origen) {
        Origen = origen;
    }

  
    
}
