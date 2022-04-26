package posttest4;

public class Buku {
    private String jenisBuku;
    private int kodeBuku;

    public Buku(String jenisBuku, int kodeBuku) {
        this.jenisBuku = jenisBuku;
        this.kodeBuku = kodeBuku;
    }
    
    public Buku() {
        this.jenisBuku = "";
        this.kodeBuku = 0;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public int getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(int kodeBuku) {
        this.kodeBuku = kodeBuku;
    }
}