import java.io.*;
  class Artikelapp{
    public Static void main(String,args[]){
      Artikel a1=new Artikel();// mit standartd konst
      Artikel a2=new Artikel(1,"Apfel",0,99);// mit init
      Artikel a3=new Artikel(a2);mit copy-kon
      Artikel a4=new Artikel(99); weiter konstruk
     a1.setArtnr(2);   //b
     a1.setArtbetz("buch");
     a1.setpreis(4,99);
     a4.setArtbez("DVD");
     a4.setpreis(9,99);
     a1.berechne Mwst(19);
     System.out.println(a1.berechne Mwst(19));
     System.out.println(a2.berechne Mwst(7));
     System.out.println(a3.berechne Mwst(40));
     System.out.println(a4.berechne Mwst(23));
     a1.rabatt(1,19);
     a2.rabatt(2,7);
     a3.rabatt(3,7);
     a4.rabatt(4,40);
     System.out.println(a1.getPreis());
     System.out.println(a2.getPreis());
     System.out.println(a3.getPreis());
     System.out.println(a4.getpreis());
    }


  }



}