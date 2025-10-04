package inheritance;

public class BurungBeo extends Burung { //HYBRID: BurungBeo → Burung (class + interface)
    public BurungBeo(String nama, int umur) {
        super(nama, umur);
    }

    public void bicara() {
        System.out.println(nama + " bisa menirukan suara manusia.");
    }
}
