import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass
{
    public static void main(String[] args) throws IOException {
        System.out.println("Projekt Taschenrechner Teko Teil 1");
        System.out.println("Wählen Sie Ihre gewünschte Rechenfunktion aus: \n Drücken Sie 1 für Addition \n Drücken Sie 2 für Division \n Drücken Sie 3 für Multiplikation \n Drücken Sie 4 für Division");
        Calculator cal1 = new Calculator(2.0D, 5.0D);
        BufferedReader inbuf = new BufferedReader(new InputStreamReader(System.in));
        int inputfunk = Integer.parseInt(inbuf.readLine());
        switch (inputfunk) {
            case 1:
                cal1.summe();
                break;
            default:
                System.out.println("fail");
        }

        System.out.println(inputfunk);
    }
}
