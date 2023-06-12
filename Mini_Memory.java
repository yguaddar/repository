
// Guaddar Youssef 11079679
//

public class Mini_Memory {
    protected short storage [];


public Mini_Memory (){              // Default konstruktor
    this.storage= new short[8] ;
    for ( int i = 0; i < 8; i ++ ) {
    this.storage[i]=0;
    }
}
public Mini_Memory (short [] s){  // init konstruktor
       this.storage= new short[8] ;
       set(s);
}
public Mini_Memory (Mini_Memory m){  // copy konstruktor
      this.storage = new short[8];
      short [] Hilfarray = new short[8];              
      for ( int i = 0; i < 8; i ++ ) {
          Hilfarray[i]=m.getBit(i);
      }
      set (Hilfarray);
  }
public int isByteLength(short[] s){
 int wert;
  if (s.length > 8 ){
      wert= (-1);
  }
  else if (s.length < storage.length ){
      wert= 1;
  }
  else {
      wert=0;
  }
  return wert;
}
 public void set(short[] s){
 int i;
     if (isBitAll(s)==false){
      for (  i = 0; i < 8; i ++ ) {
          storage[i]=0;
          }
     }
     else if ((isBitAll(s))== true && (isByteLength(s))== (-1) ){
     System.out.println("Overflow ist aufgetreten");
      for (  i = 0; i < 8; i ++ ) {
          storage [i] = s[i];
          }
     }
     else if ((isBitAll(s))== true && (isByteLength(s))== 1 ){
     for (  i = 0; i < s.length; i ++ ) {
          storage[i]=s[i];
          }
     for (  i = s.length; i < 8; i ++ ) {
         storage[i]=0;
     }
     }
     else if ((isBitAll(s))==true && (isByteLength(s))==0 ){
      for (  i = 0; i < 8; i ++ ) {
          storage[i]=s[i];
          }
     }
 }
 public boolean isBitAll(short [] s){
        boolean bitall = false;
                for ( int i = 0; i < s.length; i ++ ) {
                if (s[i]!= 0 && s[i]!= 1 ){
                 bitall=false;
                 break;
                 }
        else bitall=true;
        }
  return bitall;
 }
 public short[] incrByte(){
      short []  j;
         j= storage ;
        for (int i=0 ; i<8 ;i++){
          if ( j[i]==1 ){
             j[i]=0;
          }
          else {
             j[i]=1;
            break;
      }
        }
        return  j;
     }

 short getBit(int index){
       short select = storage [index];
       return select;
 }
  public void setBit(int index){
     storage[index]=1;
 }
 public void output(){
    for ( int i = 7; i >= 0; i -- ) {
           System.out.println("An der Stelle "+i+" der Array steht ein :"+storage[i]);
           }

 }
 public short[] invertByte(){
 int i;
      int size = 8;
         for ( i = 0; i < size; i ++ ) {
         if (storage[i]==0){
           storage[i]=1;
           }
           else storage[i]=0;
         }
    return storage;
  }
 int BytetoDec(){
   int dec =((1*storage[0])+(2*storage[1])+(4*storage[2])+(8*storage[3])+(16*storage[4])+(32*storage[5])+(64*storage[6])+(128*storage[7]));
   return dec;
 }
 public String isByteExtrem(){
 String ruek=""; short summe = 0;
  for ( int i = 0; i < 8; i ++ ) {
       summe += storage[i];
  }
                if (summe == 0){
             ruek="Reset";
                    }
                else if (summe== 8){
             ruek="Full";
                    }
                else {ruek="";}
                System.out.println(ruek);

return ruek;
}
}
