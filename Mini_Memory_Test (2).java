
// Guaddar Youssef 11079679

import java.io.*;
public class Mini_Memory_Test {
          public static void main(String [] args)throws IOException{
              /************************ Testfall 1 ********************************/
           int a=1;
           System.out.println("welche Testfall wollen Sie durchfuehren ? (1,2,3,4)");
            BufferedReader eing1 = new BufferedReader( new InputStreamReader (System.in));
            a = Integer.parseInt(eing1.readLine());
          switch(a){
          case 1:
           Mini_Memory M1 = new Mini_Memory();
           int index2 = 0;
           System.out.println("Array Status: "+M1.isByteExtrem());
           System.out.println("geben sie de1n index einer stelle wo ein bestimmten bit gesetzt werden muss");
           BufferedReader eing2 = new BufferedReader( new InputStreamReader (System.in));
           index2 = Integer.parseInt(eing2.readLine());
           M1.setBit(index2);
           M1.output();
           System.out.println("Der zugehoerige Dezimalwert ist :" +M1.BytetoDec());
           break;
           /************************ Testfall 2 ********************************/
           case 2:
           short[] s1={1,1,1,0,0,0,0,0,1,1};
           short[] s2={1,1,1,0,0,0};
           short[] s3={1,2,3,0,0,0,0,-1};
           Mini_Memory M21 = new Mini_Memory(s1);
           Mini_Memory M22 = new Mini_Memory(s2);
           Mini_Memory M23 = new Mini_Memory(s3);
           System.out.println("Short array 1  *******************************");
           M21.output();
           System.out.println("Short array 2  *******************************");
           M22.output();
           System.out.println("Short array 3  *******************************");
           M23.output();
           break;
           /************************ Testfall 3 ********************************/
           case 3 :
           short [] s4={1,1,0,0,0,0,1,1};
           Mini_Memory mini = new Mini_Memory(s4);
           Mini_Memory copy_mini = new Mini_Memory (mini);
           System.out.println("vor invertierung");
           copy_mini.output();
           copy_mini.isByteExtrem();
           copy_mini.invertByte();
           System.out.println("nach invertierung");
           copy_mini.output();
           copy_mini.isByteExtrem();
           copy_mini.incrByte();
           System.out.println("nach incrementierung");
           copy_mini.output();
           break;
           default :
           /************************ Testfall 4 ********************************/
           String bez = "LIFO";
           short[] s5 = {1,1,1,0,0,1,0,1};
           Stack_Memory M41 = new Stack_Memory();
           M41.output2();
           System.out.println("2te Objekt");
           Stack_Memory M42 = new Stack_Memory(s5,bez);
           M42.output2();
           break;
          }
       }
}