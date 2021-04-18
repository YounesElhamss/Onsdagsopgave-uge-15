public class Elever {

  String name;
  int[] karakter;

  public Elever(String name, int[] karakter) {
    this.name = name;
    this.karakter = karakter;
  }
  public String getName() {
    return name;
  }

  public int[] getKarakter() {
    return karakter;
  }

  public Elever() {
    return ;
  }

  public double karakterGennemsnit() {
    double gennemsnit = 0.0;
    for (int i = 0; i < karakter.length; i++) {
      gennemsnit += karakter[i];
    }
    return gennemsnit / karakter.length;
  }
}
