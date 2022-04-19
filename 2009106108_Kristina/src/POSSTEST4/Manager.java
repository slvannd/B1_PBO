package POSSTEST4;

public class Manager extends Karyawan {

    private String golongan;
    private String bagian;
    private int kehadiran;
    private int tunjanganJabatan;
    private int tunjanganKehadiran;
    private int tunjanganGolongan;
    private int gaji;

    public Manager(String nama, String alamat, String golongan, String bagian, int tahunLahir, int tahunMasuk, int kehadiran, int tunjanganJabatan, int tunjanganKehadiran, int tunjanganGolongan, int gaji) {
        super(nama, alamat, tahunLahir, tahunMasuk);
        this.golongan = golongan;
        this.bagian = bagian;
        this.kehadiran = kehadiran;
        this.tunjanganJabatan = tunjanganJabatan;
        this.tunjanganKehadiran = tunjanganKehadiran;
        this.tunjanganGolongan = tunjanganGolongan;
        this.gaji = gaji;
    }

    void display() {

        System.out.println("Golongan Karyawan            : " + this.golongan);
        System.out.println("Bagian Karyawan              : " + this.bagian);
        System.out.println("Kehadiran Karyawan           : " + this.kehadiran);
        System.out.println("Tunjangan Jabatan Karyawan   : " + this.tunjanganJabatan);
        System.out.println("Tunjangan Kehadiran Karyawan : " + this.tunjanganKehadiran);
        System.out.println("Tunjangan Golongan Karyawan  : " + this.tunjanganGolongan);
        System.out.println("Gaji Karyawan                : " + this.gaji);

}   
    
    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public void setTunjanganJabatan(int tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public int getTunjanganKehadiran() {
        return tunjanganKehadiran;
    }

    public void setTunjanganKehadiran(int tunjanganKehadiran) {
        this.tunjanganKehadiran = tunjanganKehadiran;
    }

    public int getTunjanganGolongan() {
        return tunjanganGolongan;
    }

    public void setTunjanganGolongan(int tunjanganGolongan) {
        this.tunjanganGolongan = tunjanganGolongan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}

    