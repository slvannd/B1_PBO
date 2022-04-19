package posttest4;

public class bukuKelasXII extends Buku {
    private String judulXII;
    private int jumlahXII;

    public bukuKelasXII(String judulXII, int jumlahXII, String jenisBuku, int kodeBuku) {
        super(jenisBuku, kodeBuku);
        this.judulXII = judulXII;
        this.jumlahXII = jumlahXII;
    }
    
    public String getJudulXII() {
        return judulXII;
    }

    public void setJudulXII(String judulXII) {
        this.judulXII = judulXII;
    }

    public int getJumlahXII() {
        return jumlahXII;
    }

    public void setJumlahXII(int jumlahXII) {
        this.jumlahXII = jumlahXII;
    }
}