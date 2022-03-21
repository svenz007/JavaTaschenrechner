import java.sql.SQLOutput;

public class Calculator
{
    //Attribute
    private double zahl1;
    private double zahl2;

    //Kunstruktor
    public Calculator(double zahl1, double zahl2)
    {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }

    //Methoden
    public double getZahl1()
    {
        return zahl1;
    }

    public void setZahl1(double zahl1)
    {
        this.zahl1 = zahl1;
    }

    public double getZahl2()
    {
        return zahl2;
    }

    public void setZahl2(double zahl2)
    {
        this.zahl2 = zahl2;
    }

    //Methode Summe
    public void summe()
    {
        System.out.println("Ergebnis: " + (getZahl1() + getZahl2()));
    }
    public void minus()
    {
        System.out.println("Ergebnis: " + (getZahl1() - getZahl2()));
    }

    public void multiplikation()
    {
        System.out.println("Ergebnis: " + (getZahl1() * getZahl2()));
    }

    public void division()
    {
        System.out.println("Ergebnis: "+ (getZahl1() / getZahl2()));
    }
}
