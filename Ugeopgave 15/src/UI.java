import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public void hentKarakter() {
       // int[] karakterer = new int[7];// Dennne her lavede alt balleden
        Scanner input = new Scanner(System.in);

        boolean erTilføjet = true;
        ArrayList<Elever> elever = new ArrayList<>();
        while (erTilføjet) {
            int[] karakterer = new int[7];
            System.out.println("Indtast navn: ");
            String navn = input.next();

            for (int i = 0; i < karakterer.length; i++) {
                System.out.println("Indtast karakter: ");
                karakterer[i] = input.nextInt();
            }
            elever.add(new Elever(navn, karakterer));

            System.out.println("Vil du tilføje en elev? (ja/nej): ");
            String svar = input.next();
            if (svar.equals("nej")) {
                erTilføjet = false;
            }
        }

        for (int i = 0; i < elever.size(); i++) {
            System.out.println(elever.get(i).getName());

            //Foreach loop
            int j = 1;
            for (int karakter : elever.get(i).getKarakter()) {
                System.out.print(+(j) + ". Karakter: " + karakter + "\n");
                j++;
            }
            System.out.printf("Karakter gennemsnit er :%.1f", elever.get(i).karakterGennemsnit());
        }
    }
}
