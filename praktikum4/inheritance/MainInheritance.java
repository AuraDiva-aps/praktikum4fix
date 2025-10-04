package inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        // SINGLE Inheritance
        Kucing k = new Kucing("Kitty", 2);
        k.infoHewan();
        k.suara();

        // MULTILEVEL Inheritance
        KucingAnggora ka = new KucingAnggora("Snowy", 3);
        ka.infoHewan();
        ka.suara();
        ka.buluIndah();

        // HIERARCHICAL Inheritance
        Ayam a = new Ayam("Jago", 1);
        a.infoHewan();
        a.suara();

        // MULTIPLE Inheritance (via interface)
        Burung b = new Burung("Merpati", 1);
        b.infoHewan();
        b.suara();
        b.terbang();

        // HYBRID Inheritance
        BurungBeo bb = new BurungBeo("Bejo", 2);
        bb.infoHewan();
        bb.suara();
        bb.terbang();
        bb.suaraKhas();
    }
}
