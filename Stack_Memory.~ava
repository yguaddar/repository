

// Guaddar Youssef  11079679
//
public class  Stack_Memory extends Mini_Memory {
  private String bezeichnung ;
  public Stack_Memory (){
  super();
  bezeichnung = "   ";
  }
public Stack_Memory (short[] s,String bez){
   super.set(s);
   set(s,bez);
}
public Stack_Memory (Stack_Memory smem){
      set(smem.storage);
}
public void set (short[] s,String bez){
if (isStack(bez) == 1){
      storage = s ;
        reverseByte();
        bezeichnung = bez ;
      }
else if (isStack(bez) == 0){
      storage = s ;
      bezeichnung = bez ;
      }
else if (isStack(bez) == -1){

         bezeichnung = "   ";
         System.out.println("Ungueltiger Wert fuer das Attribut bezeichnung ");
        }
}
public int isStack(String bez){
    String bez2;
    bez2 = bez.toUpperCase();
    bezeichnung = bez2;
    int b;
    if (bezeichnung == "LIFO"){
     b = 1;
    }
    else if (bezeichnung == "FIFO"){
     b = 0;
    }
    else {
      b = (-1);
    }
 return b;
}
public void output2 (){
    System.out.println("----------"+bezeichnung+"----------");
    for ( int i = 0; i < 7; i ++ ) {
           System.out.print(+storage[i]+"-");
           }
       System.out.println(+storage[7]);
}
public void reverseByte(){
        int y = 7;
        short [] revsto = new short[8] ;
        for (int i=0; i < 8; i++) {
        revsto [y] = storage [i];
        y = y-1;
        }
        storage = revsto ;
}
}
