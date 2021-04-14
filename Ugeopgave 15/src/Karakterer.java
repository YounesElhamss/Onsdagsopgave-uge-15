import java.util.ArrayList;
import java.util.Scanner;

public class Karakterer {

    public static void main(String[] args) {

        int[] karakterer = new int[7];

        Scanner input = new Scanner(System.in);

        boolean erTilføjet = true;
        while (erTilføjet) {
            System.out.println("Indtast navn: ");
            String name = input.nextLine();

            for (int i = 0; i < karakterer.length; i++) {
                System.out.println("Indtast karakter: ");
                karakterer[i] = input.nextInt();
                
            }
        }

        for (int i = 0; i< karakterer.length; i++) {

        }
    }
}
