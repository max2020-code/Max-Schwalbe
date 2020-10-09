/** 
 * Hochschule Harz
 * Fachbereich Automatisierung und Informatik
 * Prof. Dr. Bernhard Zimmermann
 * 
 * LV "Programmierung 2" SoSe2020
 *
 * Problem: üben
 *     
 * @author u35612, Max Schwalbe
 * @version 1.0
 * 
 */

public class Übung extends Environment {

  public static void main(String[] args) {
    new Übung().mainProgram(args);
  }
  
  void mainProgram(String[] args) {
    System.out.println("Hello world!");
    System.out.println();

    // Aufgabe 1
    int x;
    
    // Aufgabe 2
    x=0;
    
    // Aufgabe 3
    x=5;
    x=x+10;
    
    // Aufgabe 4
    x=x*2-2;
    
    // Aufgabe 5
    System.out.println(x);
    
    // Aufgabe 6
    char y;
    
    // Aufgabe 7
    
    
    // Aufgabe 8
    
    
    // Aufgabe 9
    double p;
    
    // Aufgabe 10
    p=3.141592;
    
    // Aufgabe 11
    
        
    // Aufgabe 12
    
    
    // Aufgabe 13
  
    
    // Aufgabe 14
    
    
    // Aufgabe 15
    public int Zahl(int c=3)  {
      for(int i=1; i<=c; i++)  {
        System.out.println(i); 
      }// for
    }// Methode Zahl
    
    // Aufgabe 16
    public int Summe(int d=4; int e=5)  {
      int summe=d+e;    
    }// Methode Summe
    
    // Aufgabe 17
    public String Zeichenketten(int f=5, String g)  {
      
    }// Methode Zeichenketten
    
    // Aufgabe 18
    public char Zeichen(int h=3; char j)  {
        
    }// Methode Zeichen
    
    // Aufgabe 19
    public char Alphabet(char k)  {
      
    }// Methode Alphabet
    
    // Aufgabe 20
    
    
    // Komplexaufgabe
    int a;
    int b;
    int summe=0;
    do  {
      System.out.print("Wie viele Zahlen möchten Sie eingeben: ");
      a=stdin.readInt();
    }while(a>10);
    for(int i=1; i<=a; i++)  {
      System.out.print(i+". Zahl: ");
      b=stdin.readInt();
      summe=summe+b;
    }// for
    System.out.println("Die Summe Ihrer Eingaben beträgt: "+summe);
  }  
} // Übung
