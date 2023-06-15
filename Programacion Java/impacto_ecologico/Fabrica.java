public class Fabrica implements Impacto{
    int superficie;
    int calderas;
    int chimeneas;
    public Fabrica(int superficie, int calderas, int chimeneas) {
        this.superficie = superficie;
        this.calderas = calderas;
        this.chimeneas = chimeneas;
    }
    public int getSuperficie() {
        return superficie;
    }
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    public int getCalderas() {
        return calderas;
    }
    public void setCalderas(int calderas) {
        this.calderas = calderas;
    }
    public int getChimeneas() {
        return chimeneas;
    }
    public void setChimeneas(int chimeneas) {
        this.chimeneas = chimeneas;
    }
    @Override
    public float calcular_impacto() {
        float el_impacto = (float) (0.8*(800*this.calderas+600*this.chimeneas)+0.2*this.superficie);
        return el_impacto;
    }
    @Override
    public String toString() {
        return "Fabrica";
    }
    
    
}