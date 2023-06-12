/* Aufgabe 2: Erstellen eines Menüs */
import java.io.*;
public class Ü1A2{
  static int menu()throws IOException{
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   int wahl;
   do {
    System.out.println("1.Oeffnen");
    System.out.println("2.Schliessen");
    System.out.println("3.Drucken");
    System.out.println("4.Neu");
    System.out.println("5.Beenden");
    wahl = Integer.parseInt(in.readLine()); /*einlesen*/
   }while (wahl < 0 || wahl > 5);
   return wahl;
  }
  public static void main(String[] args)throws IOException{
   boolean weiter =true;
   do {
   int auswahl = menu();

   switch (auswahl){
     case 1 :
     System.out.println("1.oeffnen");
     break;
     case 2 :
     System.out.println("2.Schliessen");
     break;
     case 3 :
     System.out.println("3.drucken");
     break;
     case 4 :
     System.out.println("4.neu");
     break;
     case 5 :
     System.out.println("5.beenden");
     System.out.println("ende");
     weiter = false;
     break;
   }
  } while(weiter);
}

}
