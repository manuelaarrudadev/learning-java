package FileWriter.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAppend {

    public static void main(String[] args) {
        
        String text = "Com o FileWriter append esse texto é adicionado ao arquivo.";

        String path = "Documentos\\textos\\Example_FileWriter";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            bw.write(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
