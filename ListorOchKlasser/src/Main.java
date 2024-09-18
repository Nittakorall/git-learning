import java.awt.*;
import java.awt.Rectangle;

//Skapa en klass Rectangle enligt nedan samt skriv ett program som använder din Rectangleklass
//• har fyra instansvariabler: x, y, width och height
//• har tre konstruktörer
//1. en som inte tar emot ngt och som sätter alla instansvariabler till 0
//        2. en som tar emot två värden som sätts in i width och height medan x och y sätts
//till 0
//        3. en som tar emot fyra värden som används för att sätta de fyra instansvariablerna
//• en instansmetod calculateArea som returnerar en double med rektangelns area
//• en instansmetod calculatePerimeter som returnerar en double med rektangelns
//        omkrets
//• en instansmetod setXY som låter dig sätta instansvariablerna x och y
//• två instansmetoder setWidth och setHeight som låter dig sätta motsvarande
//instansvariabler
public class Main {
    public static void main(String[] args) {
        System.out.println("testar intellij");

        Rectangle r1 = new Rectangle();
        System.out.println(r1.getX());

        Rectangle r2 = new Rectangle(4, 6, 3, 5);
        System.out.println(r2.getHeight());

        // Använd setY utan att försöka skriva ut resultatet
        // Kontrollera det nya värdet av y
        System.out.println(r2.getY());
    }
}