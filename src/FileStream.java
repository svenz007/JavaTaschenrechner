import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStream {

    public FileStream() {

    }

    public void readFile(String fileName)
    {
        try (FileInputStream fis = new FileInputStream(new File(fileName))) {

        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
