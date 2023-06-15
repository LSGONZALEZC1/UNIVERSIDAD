public class App {

    public static void main(String[] args){

        System.out.println("\nCatalogo de Animales del ZOO\n");

        Obj_Avestruz a1=new Obj_Avestruz();
        a1.setNom("Avestrus");
        a1.setGen("Struthio");
        a1.setEspe("camelus");
        a1.setPeso(120);
        a1.setProceden("Tanzania");
        a1.setEnvergadura_alas(2.0);

        System.out.println("\nNombre: "+a1.getNom()+"\nGenero: "+a1.getGen()+"\nEspecie: "+a1.getEspe()+"\nPeso: "+a1.getPeso()+"\nProcedencia: "+a1.getProceden()+"\nEnvergadura: "+a1.getEnvergadura_alas());

        Obj_Puma p1=new Obj_Puma(null, null, null, null, 0, 0);
        p1.setNom("Puma");
        p1.setGen("Puma");
        p1.setEspe("concolos");
        p1.setPeso(80);
        p1.setProceden("perú");
        p1.setTiempo_de_encubacion(90);

        System.out.println("\nNombre: "+p1.getNom()+"\nGenero: "+p1.getGen()+"\nEspecie: "+p1.getEspe()+"\nPeso: "+p1.getPeso()+"\nProcedencia: "+p1.getProceden()+"\nPeriodo de incubacion:: "+p1.getTiempo_de_encubacion());

        Obj_Halcon h1=new Obj_Halcon(null, null, null, null, 0, 0);
        h1.setNom("halcon moteado");
        h1.setGen("falco");
        h1.setEspe("punctatus");
        h1.setPeso(0.25);
        h1.setProceden("isla Mauricio");
        h1.setEnvergadura_alas(0.52);

        System.out.println("\nNombre: "+h1.getNom()+"\nGenero: "+h1.getGen()+"\nEspecie: "+h1.getEspe()+"\nPeso: "+h1.getPeso()+"\nProcedencia: "+h1.getProceden()+"\nEnvergadura: "+h1.getEnvergadura_alas());

        Obj_Titi t1=new Obj_Titi(null, null, null, null, 0, 0);
        t1.setNom("titi del chaco");
        t1.setGen("callicebus");
        t1.setEspe("pallecens");
        t1.setPeso(0.400);
        t1.setProceden("paraguay");
        t1.setTiempo_de_encubacion(183);

        System.out.println("\nNombre: "+t1.getNom()+"\nGenero: "+t1.getGen()+"\nEspecie: "+t1.getEspe()+"\nPeso: "+t1.getPeso()+"\nProcedencia: "+t1.getProceden()+"\nEnvergadura: "+t1.getTiempo_de_encubacion());

        Obj_Condor c1=new Obj_Condor(null, null, null, null, 0, 0);
        c1.setNom("condor");
        c1.setGen("vultur");
        c1.setEspe("gryphus");
        c1.setPeso(14);
        c1.setProceden("chile");
        c1.setEnvergadura_alas(2.83);

        System.out.println("\nNombre: "+h1.getNom()+"\nGenero: "+h1.getGen()+"\nEspecie: "+h1.getEspe()+"\nPeso: "+h1.getPeso()+"\nProcedencia: "+h1.getProceden()+"\nEnvergadura: "+h1.getEnvergadura_alas());


    }
    
}