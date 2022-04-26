package posttest4;

public class bukuKelasX extends Buku {
    private String judulX;
    private int jumlahX;

    public bukuKelasX(String judulX, int jumlahX, String jenisBuku, int kodeBuku) {
        super(jenisBuku, kodeBuku);
        this.judulX = judulX;
        this.jumlahX = jumlahX;
        
    }

    public String getJudulX() {
        return judulX;
    }

    public void setJudulX(String judulX) {
        this.judulX = judulX;
    }

    public int getJumlahX() {
        return jumlahX;
    }

    public void setJumlahX(int jumlahX) {
        this.jumlahX = jumlahX;
    }
}