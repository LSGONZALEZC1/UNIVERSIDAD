/*
Laura Sofia Gonzalez Castaño 
30000091406
*/

public class App {

    public static void main(String[] args) {
        
        System.out.println("\nRegistro Estudiantes USB Cali\n");

        System.out.println("\nPregrado\n");

        Pregrado p1=new Pregrado();
        p1.setNombre("Gabriel");
        p1.setApellido("Herrera");
        p1.setCodigo("30000091624");
        p1.setPrograma("Sistemas");
        p1.setCreditos_aprobados("20");
        p1.setPromedio_acumulado("4,2");

        System.out.println("El estuante se llama "+p1.getNombre()+" "+p1.getApellido()+", su codigo estudiantil es "+p1.getCodigo()+", esta en el programa "+p1.getPrograma()+", cuenta con "+p1.getCreditos_aprobados()+" creditos aprobados y su promedio acumulado es "+p1.getPromedio_acumulado());


        Pregrado p2=new Pregrado();
        p2.setNombre("Sebastian");
        p2.setApellido("Abril");
        p2.setCodigo("30000093502");
        p2.setPrograma("Sistemas");
        p2.setCreditos_aprobados("20");
        p2.setPromedio_acumulado("4,5");

        System.out.println("El estuante se llama "+p2.getNombre()+" "+p2.getApellido()+", su codigo estudiantil es "+p2.getCodigo()+", esta en el programa "+p2.getPrograma()+", cuenta con "+p2.getCreditos_aprobados()+" creditos aprobados y su promedio acumulado es "+p2.getPromedio_acumulado());



        Pregrado p3=new Pregrado();
        p3.setNombre("Fernanda");
        p3.setApellido("Gonazalez");
        p3.setCodigo("30000086425");
        p3.setPrograma("Sistemas");
        p3.setCreditos_aprobados("20");
        p3.setPromedio_acumulado("3.8");

        System.out.println("El estuante se llama "+p3.getNombre()+" "+p3.getApellido()+", su codigo estudiantil es "+p3.getCodigo()+", esta en el programa "+p3.getPrograma()+", cuenta con "+p3.getCreditos_aprobados()+" creditos aprobados y su promedio acumulado es "+p3.getPromedio_acumulado());


        System.out.println("\n\nEspecializacion\n");

        Especializacion e1=new Especializacion();
        e1.setNombre("Francy");
        e1.setApellido("Gomez");
        e1.setCodigo("30000086492");
        e1.setPrograma("Sistemas");
        e1.setFecha_grado("27 de noviembre del 2021");
        e1.setPregrado_base("Sistemas");

        System.out.println("El estuante se llama "+e1.getNombre()+" "+e1.getApellido()+" , su codigo estudiantil es "+e1.getCodigo()+" , esta en el programa "+e1.getPrograma()+" , se graduo el "+e1.getFecha_grado()+" y su programa de base es "+e1.getPregrado_base());

        Especializacion e2=new Especializacion();
        e2.setNombre("Vanesa");
        e2.setApellido("Martinez");
        e2.setCodigo("30000086597");
        e2.setPrograma("Sistemas");
        e2.setFecha_grado("27 de noviembre del 2021");
        e2.setPregrado_base("Sistemas");

        System.out.println("El estuante se llama "+e2.getNombre()+" "+e2.getApellido()+" , su codigo estudiantil es "+e2.getCodigo()+" , esta en el programa "+e2.getPrograma()+" , se graduo el "+e2.getFecha_grado()+" y su programa de base es "+e2.getPregrado_base());


        System.out.println("\n\nMaestria\n");

        Maestria m1=new Maestria();
        m1.setNombre("Tatiana");
        m1.setApellido("Bustos");
        m1.setCodigo("30000099687");
        m1.setPrograma("Sistemas");
        m1.setFecha_grado("27 de noviembre del 2021");
        m1.setProyecto_investigacion("Sistemas");

        System.out.println("El estuante se llama "+m1.getNombre()+" "+m1.getApellido()+" , su codigo estudiantil es "+m1.getCodigo()+" , esta en el programa "+m1.getPrograma()+" , se graduo el "+m1.getFecha_grado()+" y se encuentra en el proyecto de investigacion "+m1.getProyecto_investigacion());


        System.out.println("\n\nDoctorado\n");

        Doctorado d1=new Doctorado();
        d1.setNombre("Andres");
        d1.setApellido("Lopez");
        d1.setCodigo("30000095834");
        d1.setPrograma("Sistemas");
        d1.setFecha_grado("27 de noviembre del 2021");
        d1.setGrupo_investigacion("Sistemas");

        System.out.println("El estuante se llama "+d1.getNombre()+" "+d1.getApellido()+" , su codigo estudiantil es "+d1.getCodigo()+" , esta en el programa "+d1.getPrograma()+" , se graduo el "+d1.getFecha_grado()+" y se encuentra en el grupo de investigacion "+d1.getGrupo_investigacion());

    }



    /* 
    public static void estudiantes_pregrado(){

        try (Scanner teclado = new Scanner(System.in)) {
            Pregrado p1=new Pregrado();

            System.out.println("\nEstudiantes en Pregrado\n");

            System.out.println("\nNombre: ");  
            String nombre= teclado.nextLine();
        } 

    }

    public static void estudiantes_especializacion(){

        System.out.println("\nEstudiantes en Especializacion\n");

        System.out.println("\nNombre: ");  
        String nombre= teclado.nextLine();     
    }

    public static void estudiantes_maestria(){

        System.out.println("\nEstudiantes en Maestria\n");

        System.out.println("\nNombre: ");  
        String nombre= teclado.nextLine();     
    }

    public static void estudiantes_doctorado(){

        System.out.println("\nEstudiantes en Doctorado\n");

        System.out.println("\nNombre: ");  
        String nombre= teclado.nextLine();     
    }
    */



    
}
