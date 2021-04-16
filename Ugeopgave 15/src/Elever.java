import java.util.ArrayList;
import java.util.Arrays;

public class Elever {
    private String name;
    private int[] karakter;

    ArrayList<Elever> elevListe = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int[] getKarakter() {
        return karakter;
    }

    public Elever(String name, int[] karakter) {
        this.name = name;
        this.karakter = karakter;
    }
    public Elever() {
    }
    public double karakterGennemsnit() {
        int gennemsnit = 0;
        for (int i = 0; i < karakter.length; i++) {
            gennemsnit += karakter[i];
        }
        return gennemsnit /karakter.length;
    }

    @Override
    public String toString() {
        return "Elever{" +
                "name='" + name + '\'' +
                ", karakter=" + Arrays.toString(karakter) +
                ", elevListe=" + elevListe +
                '}';
    }
}
