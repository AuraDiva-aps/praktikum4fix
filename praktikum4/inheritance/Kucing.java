package inheritance;

public class Kucing extends Hewan { // <-- SINGLE inheritance: Kucing mewarisi Hewan
    public Kucing(String nama, int umur) {
        super(nama, umur); // memanggil constructor induk
    }

    public void suara() {
        System.out.println(nama + " mengeong: Meow~");
    }
}
