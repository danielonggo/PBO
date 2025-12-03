package sistempegawai;

public class PegawaiHarian extends Pegawai {
    private int jamKerja;
    private double upahPerJam;

    public PegawaiHarian(String nama, String idPegawai, String posisi, int jamKerja, double upahPerJam) {
        super(nama, idPegawai, posisi); // Sesuai Rubrik Poin 4
        this.jamKerja = jamKerja;
        this.upahPerJam = upahPerJam;
    }

    // Getter Setter tambahan
    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamKerja * upahPerJam;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Status      : Pegawai Harian");
        System.out.println("Jam Kerja   : " + jamKerja + " jam");
        System.out.println("Upah/Jam    : Rp " + (int)upahPerJam);
        System.out.println("Total Gaji  : Rp " + (int)hitungGaji());
    }
}