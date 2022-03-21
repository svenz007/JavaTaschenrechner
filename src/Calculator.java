import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    //Attribute
    private double zahl1;
    private double zahl2;


    //Kunstruktor
    public Calculator() {

    }

    public double OperatorAuswahl(String operation) {
        double endResult = 0;
        switch (operation) {

            case "1":
                getZahl1();
                getZahl2();
                endResult =  summe(zahl1, zahl2);

                break;
            case "2":
                getZahl1();
                getZahl2();
                endResult = minus(zahl1, zahl2);
                break;
            case "3":
                getZahl1();
                getZahl2();
                endResult = multiplikation(zahl1, zahl2);
                break;
            case "4":
                getZahl1();
                getZahl2();
                endResult = division(zahl1, zahl2);
                break;

            default:
                System.out.println("fail");
        }return endResult;
    }


    //Methoden

    public double getZahl1() {

        try {
            System.out.println("Geben Sie die erste Zahl ein:");
            Scanner scan = new Scanner(System.in);
            zahl1 = scan.nextDouble();
            setZahl1(zahl1);

        }catch(Exception e) {
            System.out.println("invalid syntax");
        }return zahl1;
    }


    public void setZahl1(double zahl1) {
        this.zahl1 = zahl1;
    }

    public double getZahl2() {
        try {
            System.out.println("Geben Sie die zweite Zahl ein:");
            Scanner scan = new Scanner(System.in);
            zahl2 = scan.nextDouble();
            setZahl2(zahl2);

        }catch(Exception e) {
            System.out.println("invalid syntax");
        }return zahl2;
    }

    public void setZahl2(double zahl2) {
        this.zahl2 = zahl2;
    }

    //Methode Summe
    public double summe(double zahl1,double zahl2){
    double result;
    result = zahl1 + zahl2;
    return result;
}



    public double minus(double zahl1,double zahl2)
    {
        double result;
        result = zahl1 - zahl2;
        return result;
    }

    public double multiplikation(double zahl1,double zahl2)
    {
        double result;
        result = zahl1 * zahl2;
        return result;
    }

    public double division(double zahl1,double zahl2)
    {
        double result;
        result = zahl1 / zahl2;
        return result;
    }
}
