package posttest4;

public class DataKelurahan extends DataKecamatan {
    String desa;
    String rtrw;

    public DataKelurahan(String desa, String rtrw, String provinsi, String kabupaten, String kecamatan) {
        super(provinsi, kabupaten, kecamatan);
        this.desa = desa;
        this.rtrw = rtrw;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getRtrw() {
        return rtrw;
    }

    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
    }

//    public String getProvinsi() {
//        return getProvinsi();
//    }
//
//    public void setProvinsi(String provinsi) {
//        this.setProvinsi(provinsi);
//    }
//
//    public String getKabupaten() {
//        return getKabupaten();
//    }
//
//    public void setKabupaten(String kabupaten) {
//        this.setKabupaten(kabupaten);
//    }
//
//    public String getKecamatan() {
//        return getKecamatan();
//    }
//
//    public void setKecamatan(String kecamatan) {
//        this.setKecamatan(kecamatan);
//    }
    
    
    void InfoDataKelurahan(String getDesa, String getRtrw){
        System.out.println("---------------------------------------------------");
        System.out.println("          Desa "+ getDesa + " Rt/Rw "+ getRtrw      );
        super.info();
        
    }
    
}
