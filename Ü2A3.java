 double berechneMwst(int prozent){
    double Mwst;
   Mwst=preis*prozent/100;
   return Mwst ;
  }
  void rabatt(int rabattWert,int prozent){
     preis=(berechneMwst(prozent+preis)-rabattwert);
  }
