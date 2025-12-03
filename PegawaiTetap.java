package sistempegawai;

public class PegawaiTetap extends Pegawai {
    private double gajiBulanan;

    public PegawaiTetap(String nama, String idPegawai, String posisi, double gajiBulanan) {
        super(nama, idPegawai, posisi); 
        this.gajiBulanan = gajiBulanan;
    }

    public double getGajiBulanan() {
        return gajiBulanan;
    }

    public void setGajiBulanan(double gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public double hitungGaji() {
        return gajiBulanan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Status      : Pegawai Tetap");
        System.out.println("Gaji Bulanan: Rp " + (int)gajiBulanan);
        System.out.println("Total Gaji  : Rp " + (int)hitungGaji());
    }
}
