package posttest4;

public class Siswa {
    private String nama;
    private int nisn;
    private int kelas;

    public Siswa(String nama, int nisn, int kelas) {
        this.nama = nama;
        this.nisn = nisn;
        this.kelas = kelas;
    }

    public int getKelas() {
        return kelas;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNisn() {
        return nisn;
    }

    public void setNisn(int nisn) {
        this.nisn = nisn;
    }
}
