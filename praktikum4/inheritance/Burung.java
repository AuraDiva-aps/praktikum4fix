package inheritance;

public class Burung extends Hewan implements Terbang { //MULTIPLE: Burung mewarisi Hewan (class) + Terbang (interface)
    public Burung(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang di langit.");
    }
}
