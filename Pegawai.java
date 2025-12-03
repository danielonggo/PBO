package sistempegawai;

public abstract class Pegawai {
    private String nama;
    private String idPegawai;
    private String posisi;

    public Pegawai(String nama, String idPegawai, String posisi) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    // Abstract method (Sesuai Rubrik Poin 2)
    public abstract double hitungGaji();

    public void tampilkanInfo() {
        System.out.println("------------------------------");
        System.out.println("Nama        : " + getNama());
        System.out.println("ID Pegawai  : " + getIdPegawai());
        System.out.println("Posisi      : " + getPosisi());
    }
}
