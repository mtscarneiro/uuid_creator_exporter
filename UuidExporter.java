package uuidExporter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class UuidExporter {

    public static void main(String[] args) throws IOException {
        var input = new Scanner(System.in);
        var writer = new FileWriter("tokens.txt");
        
        System.out.println("How many tokens do you want?");
        int quantityOfTokens = input.nextInt();

        var tokens = getAllTokens(quantityOfTokens);

        writer.append(tokens.toString().replace(",", "\n"));

        input.close();
        writer.close();
    }

    private static List<String> getAllTokens(int quantityOfTokens) {
        var listOfTokens = new ArrayList<String>();

        for(int i = 1; i <= quantityOfTokens; i++) {
            var tokens = UUID.randomUUID();
            listOfTokens.add(tokens.toString());
        }

        System.out.println(quantityOfTokens + " tokens were created.");

        return listOfTokens;
    }
}