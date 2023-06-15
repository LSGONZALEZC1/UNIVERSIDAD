public class Mamifero extends Animal{

    private String raza;
    private String fecha_ultima_vacuna;

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza=raza;
    }

    public String getFecha_ultima_vacuna(){
        return fecha_ultima_vacuna;
    }

    public void setFecha_ultima_vacuna(String fecha_ultima_vacuna){
        this.fecha_ultima_vacuna = fecha_ultima_vacuna;
    }

}