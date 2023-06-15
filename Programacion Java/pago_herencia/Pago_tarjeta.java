public class Pago_tarjeta extends Pago{

    public Pago_tarjeta(String cliente, int monto, String fecha, String numero_tarjeta, int cvv, int cuotas) {
        super(cliente, monto, fecha);
        this.numero_tarjeta = numero_tarjeta;
        this.cvv = cvv;
        this.cuotas = cuotas;
    }
    private String numero_tarjeta;
    private int cvv;
    private int cuotas;
    
    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }
    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public int getCuotas() {
        return cuotas;
    }
    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
 
    
    
}
