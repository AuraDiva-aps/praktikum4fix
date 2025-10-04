package inheritance;

public class Ayam extends Hewan { //HIERARCHICAL: Ayam dan Kucing sama-sama anak dari Hewan
    public Ayam(String nama, int umur) {
        super(nama, umur);
    }

    public void suara() {
        System.out.println(nama + " berkokok: Kukuruyuk~");
    }
}
