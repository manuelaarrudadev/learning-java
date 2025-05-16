package FileWriter.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOverwrite {

    public static void main(String[] args) {

        String title = "Arquivo criado a partir do FileWriter com BufferedWriter na função de Ovewrite\n";

        String path = "Documentos\\textos\\Example_FileWriter";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            
            bw.write(title);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
