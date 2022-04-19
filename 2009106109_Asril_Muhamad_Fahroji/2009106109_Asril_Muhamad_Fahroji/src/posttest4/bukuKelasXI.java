package posttest4;

public class bukuKelasXI extends Buku {
    private String judulXI;
    private int jumlahXI;

    public bukuKelasXI(String judulXI, int jumlahXI, String jenisBuku, int kodeBuku) {
        super(jenisBuku, kodeBuku);
        this.judulXI = judulXI;
        this.jumlahXI = jumlahXI;
    }
    
    public String getJudulXI() {
        return judulXI;
    }

    public void setJudulXI(String judulXI) {
        this.judulXI = judulXI;
    }

    public int getJumlahXI() {
        return jumlahXI;
    }

    public void setJumlahXI(int jumlahXI) {
        this.jumlahXI = jumlahXI;
    }
}