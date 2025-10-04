package encapsulation;

public class MainKaryawan {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("Ayu", "Manager", 8000000);

        k1.tampilkanData();

        System.out.println("\nUpdate data karyawan...");
        k1.setNama("Ayu Lestari");
        k1.setJabatan("Senior Manager");
        k1.setGaji(10000000);

        k1.tampilkanData();

        System.out.println("\nCoba set gaji negatif...");
        try {
            k1.setGaji(-5000000); // ini bakal error
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
