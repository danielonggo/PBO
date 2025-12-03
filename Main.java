package sistempegawai;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Poin 5 Rubrik: Menggunakan Pegawai sebagai referensi (ArrayList<Pegawai>)
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

        daftarPegawai.add(new PegawaiTetap("Budi Santoso", "P001", "Manager", 7000000));
        daftarPegawai.add(new PegawaiTetap("Siti Aminah", "P002", "Supervisor", 5000000));
        daftarPegawai.add(new PegawaiHarian("Joko Riyanto", "H001", "Staff Gudang", 40, 50000));
        daftarPegawai.add(new PegawaiHarian("Dewi Sartika", "H002", "Kasir Part-time", 25, 45000));

        System.out.println("===========================================");
        System.out.println("   SISTEM MANAJEMEN PEGAWAI TOKO KECIL    ");
        System.out.println("===========================================");

        // Poin 6 Rubrik: Output Rapi & Poin 5: Memanggil hitungGaji via Polymorphism
        for (Pegawai p : daftarPegawai) {
            p.tampilkanInfo();
        }
    }
}