package inheritance;

public class Hewan {
    protected String nama;  
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void infoHewan() {
        System.out.println("Hewan: " + nama + " | Umur: " + umur + " tahun");
    }
}
