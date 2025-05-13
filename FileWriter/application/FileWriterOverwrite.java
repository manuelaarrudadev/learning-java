package FileWriter.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOverwrite {

    public static void main(String[] args) {

        String title = "Síntase da utilização do FileWriter e BufferedWriter";

        String path = "Documentos\\textos\\java_FileWriter";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            
            bw.write(title);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
