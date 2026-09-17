package model;

public class Motor extends Kendaraan {
    private int kapasitasCC;

    public Motor(String namaKendaraan, String platNomor, double hargaSewaPerHari, int kapasitasCC) {
        super(namaKendaraan, platNomor, hargaSewaPerHari); 
        this.kapasitasCC = kapasitasCC;
    }

    public int getKapasitasCC() { return kapasitasCC; }

    public void tampilkanInfoMotor() {
        super.tampilkanInfo();
        System.out.printf("| Kapasitas: %dcc\n", kapasitasCC);
    }
}