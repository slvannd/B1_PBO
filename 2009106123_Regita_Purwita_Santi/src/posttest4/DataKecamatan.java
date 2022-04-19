package posttest4;

public class DataKecamatan  {
    String provinsi;
    String kabupaten;
    String kecamatan;

    public DataKecamatan(String provinsi, String kabupaten, String kecamatan) {
        this.provinsi = provinsi;
        this.kabupaten = kabupaten;
        this.kecamatan = kecamatan;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    
    
    void message(){
        System.out.println("===================================================");
        System.out.println("           SELAMAT DATANG DALAM PROGRAM            ");
        System.out.println("                  PEMBUATAN KTP                    ");
        System.out.println("===================================================");

    }
    
    
    // Overloading
    void info(){
        System.out.println("\t\t>> Berhasil Diinput <<");
        System.out.println("---------------------------------------------------");
    }
    
    void info(String getProvinsi, String getKabupaten, String getKecamatan){
        System.out.println("---------------------------------------------------");
        System.out.println("Prov. "+ getProvinsi + " Kab. "+ getKabupaten + " Kec. " + getKecamatan);
        
        
    }
 
}
