import java.io.*;
class Artikel{
  private int artnr;
  private String artbez;
  private double preis;
  Artikel(){

  }
  Artikel(int artnr,String artbez,double preis){
    this.artnr=nr;
    this.artbez=bez;
    this.preis=preis;
  }
  Artikel(Artikel a){
   artnr=a.artnr;
   artbez=a.artbez;
   preis=a.preis;
  }
  Artikel(){

  }
  Artikel(int artnr){
    this.artnr=artnr;
  }
  public int getArtnr(){
    return artnr;
  }
  public String getArtbez(){
    return artbez;
  }
  public double getPreis(){
    return preis;
  }
  public void int setArtnr(int artnr){
    this.artnr=nr;
  }
  public void String setArtbez(String artbez){
    this.artbez=bez;
  }
  public void double setPreis(daouble preis){
    this.preis=preis;
  }
  double berechneMwst(int prozent){
    double Mwst;
   Mwst=preis*prozent/100;
   return Mwst ;
  }
  void rabatt(int rabattWert,int prozent){
     preis=(berechneMwst(prozent+preis)-rabattwert);
  }
}