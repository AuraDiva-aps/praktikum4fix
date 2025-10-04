package inheritance;

public class KucingAnggora extends Kucing {// <-- MULTILEVEL: KucingAnggora -> Kucing -> Hewan
    public KucingAnggora(String nama, int umur) {
        super(nama, umur);
    }

    public void buluIndah() {
        System.out.println(nama + " memiliki bulu panjang dan indah.");
    }
}
