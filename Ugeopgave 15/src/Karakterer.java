import java.util.ArrayList;
import java.util.Scanner;

public class Karakterer {

    public static void main(String[] args) {
        int[] karakterer = new int[7];
        Scanner input = new Scanner(System.in);

        boolean erTilføjet = true;
        ArrayList<Elever> elever = new ArrayList<>();
        while (erTilføjet) {
            System.out.println("Indtast navn: ");
            String navn = input.next();

            for (int i = 0; i < karakterer.length; i++) {
                System.out.println("Indtast karakter: ");
                karakterer[i] = input.nextInt();
            }
            System.out.println("Vil du tilføje en elev? (ja/nej): ");
            String svar = input.next();
            if (svar.equals("nej")) {
                erTilføjet = false;
            }
            elever.add(new Elever(navn, karakterer));
        }

        for (int i = 0; i< karakterer.length; i++) {
                System.out.println(elever.get(i).getName());

                //Foreach loop
                int j = 1;
                for (int grade : elever.get(i).getKarakter()) {
                    System.out.print("Grade " + (j) + ". " + grade + "\n");
                    j++;
                }
            }
        }
    }
