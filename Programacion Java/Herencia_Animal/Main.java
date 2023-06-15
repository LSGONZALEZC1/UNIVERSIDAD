class Main /*extends Animal*/{
  
    public static void main(String[] args) {
      Loro l1=new Loro();
      l1.setNombre ("Blue");
      l1.setColor ("Dorado");
      
      System.out.println("El loro registrado se llama "+l1.getNombre()+" y es de color "+l1.getColor());


      Perro p1=new Perro();
      p1.setNombre ("tobi");
      p1.setRaza ("n");
      p1.setColor ("cafe");
      p1.setFecha_ultima_vacuna("10-08-22");
      p1.castrar();
      
      System.out.println("El perro registrado se llama "+p1.getNombre()+", es de raza "+p1.getRaza()+", es de color "+p1.getColor()+", su ultima vacuna fue "+p1.getFecha_ultima_vacuna()+" y "+p1.isCastrado());


      Perro p2=new Perro();
      p2.setNombre ("Blue");
      p2.setRaza ("Blue");
      p2.setColor ("Dorado");
      p2.setFecha_ultima_vacuna("10-08-22");
      p2.castrar();
      
      System.out.println("El perro registrado se llama "+p2.getNombre()+", es de raza "+p2.getRaza()+", es de color "+p2.getColor()+", su ultima vacuna fue "+p2.getFecha_ultima_vacuna()+" y "+p2.isCastrado());
    }
    
  }