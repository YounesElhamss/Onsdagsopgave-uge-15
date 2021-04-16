import java.util.Scanner;

public class UI {
    public void hentKarakter() {
        Elever elever = new Elever();
        int[] karakterer = new int[7];
        Scanner input = new Scanner(System.in);

        boolean erTilføjet = true;

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
            elever.elevListe.add(new Elever(navn, karakterer));
        }

        for (int i = 0; i < elever.elevListe.size(); i++) {
            System.out.println(elever.elevListe.get(i).getName());

            //Foreach loop
            int j = 1;
            for (int karakter : elever.elevListe.get(i).getKarakter()) {
                System.out.print(+(j) + ". Karakter: " + karakter + "\n");
                j++;
            }
            System.out.println("Karakter gennemsnit er: " + elever.elevListe.get(i).karakterGennemsnit());
        }
    }
}