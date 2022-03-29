package posttest1_double_posttest;

public class Siswa {
    private String nama;
    private int nisn;
    private int kelas;
    
    public Siswa(String nama, int nisn, int kelas) {
        this.nama = nama;
        this.nisn = nisn;
        this.kelas = kelas;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getNisn() {
        return nisn;
    }
    
    public int getKelas() {
        return kelas;
    }
}