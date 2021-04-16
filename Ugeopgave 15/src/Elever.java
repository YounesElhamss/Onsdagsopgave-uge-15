public class Elever {
    private String name;
    private int[] karakter;

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
}
