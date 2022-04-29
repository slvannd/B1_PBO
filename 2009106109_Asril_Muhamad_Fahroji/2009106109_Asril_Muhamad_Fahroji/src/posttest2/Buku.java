package posttest2;

public class Buku {
    private String namaBuku;
    private int kodeBuku;
    private int kategoriBuku;
    private String warnaBuku;
    
    public Buku() {
        this.namaBuku = "";
        this.kodeBuku = 0;
        this.kategoriBuku = 0;
        this.warnaBuku = "";
    }

    public Buku(String namaBuku, int kodeBuku, int kategoriBuku, String warnaBuku) {
        this.namaBuku = namaBuku;
        this.kodeBuku = kodeBuku;
        this.kategoriBuku = kategoriBuku;
        this.warnaBuku = warnaBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public int getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(int kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public int getKategoriBuku() {
        return kategoriBuku;
    }

    public void setKategoriBuku(int kategoriBuku) {
        this.kategoriBuku = kategoriBuku;
    }

    public String getWarnaBuku() {
        return warnaBuku;
    }

    public void setWarnaBuku(String warnaBuku) {
        this.warnaBuku = warnaBuku;
    }
}