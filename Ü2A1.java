import java.io.*;
class Artikel{
   int artnr;
   String artbez;
   double preis;
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

}