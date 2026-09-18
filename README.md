# Sistem Rental Kendaraan — Tugas PBO

## 📌 Identitas
- **Nama** : Rivalio Chendra
- **NIM**  : 2509116039
- **Mata Kuliah** : Pemrograman Berorientasi Objek
- **Kelas** : A

---

## 📖 Deskripsi Studi Kasus

Program ini adalah program Sistem Rental Kendaraan berbasis Command Line Interface (CLI) yang dibuat menggunakan bahasa pemrograman Java.

Program ini mensimulasikan proses bisnis rental kendaraan sederhana, di mana admin dapat:
- Mengelola data kendaraan (tambah, lihat, ubah harga, hapus)
- Menyewakan kendaraan kepada penyewa
- Mengembalikan kendaraan yang sudah selesai disewa


---

## 🗂️ Struktur Project

```text
RentalKendaraan/
├── src/
│   ├── com.mycompany.rentalkendaraan/
│   │   └── RentalKendaraan.java (main program)
│   │
│   └── model/
│       ├── Kendaraan.java (superclass)
│       ├── Mobil.java     (subclass)
│       └── Motor.java     (subclass)
```


---

## 🧩 Hierarki Class
```text
                    ┌──────────────────────────┐
                    │ Kendaraan (Superclass)   │
                    ├──────────────────────────┤
                    │ - namaKendaraan          │
                    │ - platNomor              │
                    │ - hargaSewaPerHari       │
                    │ - status                 │
                    │ - namaPenyewa            │
                    └────────────┬─────────────┘
                                 │
                    ┌────────────┴─────────────┐
                    │                          │
                 extends                    extends
                    │                          │
          ┌─────────┴─────────┐      ┌─────────┴────────┐
          │ Mobil (Subclass)  │      │ Motor (Subclass) │
          ├───────────────────┤      ├──────────────────┤
          │ - jumlahKursi     │      │ - kapasitasCC    │
          └───────────────────┘      └──────────────────┘
```

**Penjelasan hubungan IS-A:**
- `Mobil` **IS-A** `Kendaraan` (Mobil adalah sebuah Kendaraan)
- `Motor` **IS-A** `Kendaraan` (Motor adalah sebuah Kendaraan)

Kedua subclass ini mewarisi seluruh atribut umum (`namaKendaraan`, `platNomor`, `hargaSewaPerHari`, `status`, `namaPenyewa`) dan method (`tampilkanInfo()`, `sewa()`, `kembalikan()`) dari superclass `Kendaraan`, tanpa perlu menulis ulang kode yang sama.

---

## 🔑 Penerapan Inheritance dalam Kode

### 1. Superclass `Kendaraan`
```java
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
    // ... method umum: tampilkanInfo(), sewa(), kembalikan(), dst.
}
```
Atribut menggunakan modifier `protected` supaya bisa diakses langsung oleh subclass (`Mobil` dan `Motor`), tapi tetap tertutup dari kelas luar yang tidak berelasi.

### 2. Subclass `Mobil` dan `Motor`
```java
public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String namaKendaraan, String platNomor, double hargaSewaPerHari, int jumlahKursi) {
        super(namaKendaraan, platNomor, hargaSewaPerHari); // memanggil constructor superclass
        this.jumlahKursi = jumlahKursi;
    }

    public void tampilkanInfoMobil() {
        super.tampilkanInfo(); // memanggil method milik superclass
        System.out.printf("| Kursi: %d\n", jumlahKursi);
    }
}
```
- Kata kunci **`extends`** digunakan untuk mewariskan seluruh atribut dan method dari `Kendaraan` ke `Mobil`/`Motor`.
- Kata kunci **`super(...)`** dipanggil di baris pertama constructor untuk menginisialisasi bagian data yang dimiliki superclass.
- Kata kunci **`super.tampilkanInfo()`** digunakan untuk memanggil method umum milik superclass, lalu subclass menambahkan informasi spesifiknya sendiri (jumlah kursi / kapasitas CC).

---

## ⚙️ Fitur Program

| No | Fitur | Keterangan |
|----|-------|------------|
| 1 | Tambah Kendaraan | Menambahkan data Mobil atau Motor baru |
| 2 | Lihat Semua Kendaraan | Menampilkan seluruh data kendaraan beserta status |
| 3 | Update Harga Sewa | Mengubah harga sewa per hari sebuah kendaraan |
| 4 | Hapus Kendaraan | Menghapus data kendaraan dari daftar |
| 5 | Sewa Kendaraan | Menyewakan kendaraan ke penyewa tertentu |
| 6 | Kembalikan Kendaraan | Mengembalikan status kendaraan menjadi tersedia |

---

## 🖼️ Tangkapan Layar Program


---
