public class Patineta implements Impacto {
    int potencia;
    int kilometros;
    
    @Override
    public String toString() {
        return "Patineta";
    }
    public Patineta(int potencia, int kilometros) {
        this.potencia = potencia;
        this.kilometros = kilometros;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getKilometros() {
        return kilometros;
    }
    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    @Override
    public float calcular_impacto() {
        float coeficiente = (float)0.0;
        if (this.potencia>300) {
            coeficiente = (float) 1.5;
        } else {
            coeficiente = (float) 1.0;
        }
        float el_impacto = (float) (coeficiente * (kilometros*0.67));
        return el_impacto;
    }
    
}
