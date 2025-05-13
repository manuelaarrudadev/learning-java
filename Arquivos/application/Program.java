package Arquivos.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Manuela Arruda\\Documents\\Checkout\\REGRA SS.txt");
        try (Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch(IOException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}