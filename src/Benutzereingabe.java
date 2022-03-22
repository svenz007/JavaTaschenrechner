import java.io.*;

public class Benutzereingabe {

private Calculator rechner;
    public Benutzereingabe() {
    }

    public void Path(String path , double berechnung) {
        File file1 = new File(path);
        FileWriter writer;
        //Checks if file1 exists
        if (file1.exists() && !file1.isDirectory()) {

            System.out.println(file1 + " Exists");
        } else {
            try {
                writer = new FileWriter(file1, true);


            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(file1 + " Eine Datei wurde erzeugt");

        }
        try {

            String result = String.valueOf("\n"+berechnung);

            fileOutputStreamByteSequence(path, result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String funktprt(String text){
        if(text.equals(1)){

        }
        return "p";
    }

    public static void fileOutputStreamByteSequence(String file, String data3) throws IOException {
        byte[] bytes = data3.getBytes();
        try (OutputStream out = new FileOutputStream(file, true)) {
            out.write(bytes);


        }
    }
}
