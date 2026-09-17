package model;

public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String namaKendaraan, String platNomor, double hargaSewaPerHari, int jumlahKursi) {
        super(namaKendaraan, platNomor, hargaSewaPerHari); 
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() { return jumlahKursi; }

    public void tampilkanInfoMobil() {
        super.tampilkanInfo(); 
        System.out.printf("| Kursi: %d\n", jumlahKursi);
    }
}