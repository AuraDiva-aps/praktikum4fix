package encapsulation;

public class Karyawan {
    private String nama;
    private String jabatan;
    private double gaji;

    public Karyawan(String nama, String jabatan, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        setGaji(gaji); // pakai setter biar tervalidasi
    }

    
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getJabatan() { 
        return jabatan; 
    }
    public void setJabatan(String jabatan) { 
        this.jabatan = jabatan; 
    }

    public double getGaji() { 
        return gaji; 
    }
    public void setGaji(double gaji) {
        if (gaji < 0) {
            throw new IllegalArgumentException("Gaji tidak boleh negatif!");
        }
        this.gaji = gaji;
    }

    
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: Rp " + gaji);
    }
}
