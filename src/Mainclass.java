import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Mainclass {
    public static void main(String[] args) {


        System.out.println("Projekt Taschenrechner Teko Teil 1");
        Calculator cal1 = new Calculator();
        String text;
        double resultat = 0;
        boolean eingabe = true;
        while (eingabe) {
            System.out.println("Wählen Sie Ihre gewünschte Rechenfunktion aus: \n Drücken Sie 1 für Addition \n Drücken Sie 2 für Subtraktion \n Drücken Sie 3 für Multiplikation \n Drücken Sie 4 für Division");
            Scanner scan = new Scanner(System.in);
            text = scan.next();

            if (text.matches("^[1-4]|,]*$")) {

                resultat = cal1.OperatorAuswahl(text);
                System.out.println(resultat);
                eingabe = false;
            }
        }


    }
}
