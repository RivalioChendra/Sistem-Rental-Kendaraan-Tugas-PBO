package model;

public class Kendaraan {
    protected String namaKendaraan;
    protected String platNomor;
    protected double hargaSewaPerHari;
    protected String status;      
    protected String namaPenyewa;

    public Kendaraan(String namaKendaraan, String platNomor, double hargaSewaPerHari) {
        this.namaKendaraan = namaKendaraan;
        this.platNomor = platNomor;
        setHargaSewaPerHari(hargaSewaPerHari); 
        this.status = "Tersedia";
        this.namaPenyewa = "-";
    }

    public void setHargaSewaPerHari(double hargaSewaPerHari) {
        if (hargaSewaPerHari >= 0) {
            this.hargaSewaPerHari = hargaSewaPerHari;
        } else {
            System.out.println(">> ERROR: Harga sewa tidak boleh negatif!");
            this.hargaSewaPerHari = 0;
        }
    }

    // Dipanggil saat kendaraan mulai disewa
    public void sewa(String namaPenyewa) {
        this.status = "Disewa";
        this.namaPenyewa = namaPenyewa;
    }

    // Dipanggil saat kendaraan dikembalikan
    public void kembalikan() {
        this.status = "Tersedia";
        this.namaPenyewa = "-";
    }

    // Getter
    public String getNamaKendaraan() { return namaKendaraan; }
    public String getPlatNomor() { return platNomor; }
    public double getHargaSewaPerHari() { return hargaSewaPerHari; }
    public String getStatus() { return status; }
    public String getNamaPenyewa() { return namaPenyewa; }

    public void tampilkanInfo() {
        System.out.printf("Plat: %-8s | Nama: %-15s | Harga/Hari: Rp%-9.0f | Status: %-8s | Penyewa: %-10s ",
                platNomor, namaKendaraan, hargaSewaPerHari, status, namaPenyewa);
    }
}