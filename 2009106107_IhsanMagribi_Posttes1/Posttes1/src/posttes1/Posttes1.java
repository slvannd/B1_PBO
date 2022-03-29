//Program BY Ihsan Magribi 2009106107
package posttes1;
import java.util.Scanner;
import java.util.ArrayList;
public class Posttes1 {
    ArrayList<SuratKTM> dataktm;
    Posttes1()
    {
        dataktm = new ArrayList<>();
    }
    void isidataktm(int nik, String nm, String ttl, String jk, int rt, int rw, String kec, String kep)
    {
        dataktm.add(new SuratKTM (nik,nm,ttl,jk,rt,rw,kec,kep));
    }
    void hapusdataktm(int nik)
    {
        dataktm.removeIf(item -> item.nik == (nik));
    }
    void ubahdataktm(int NIK,int nik, String nm, String ttl, String jk, int rt, int rw, String kec, String kep)
    {
        int cek = -1;
        for(int i=0; i < dataktm.size(); i++){
            if(dataktm.get(i).nik == NIK){
                cek = i;
                System.out.println(cek);
                dataktm.set(cek,new SuratKTM(nik,nm,ttl,jk,rt,rw,kec,kep));
            }
        }
    }
    void showdataktm()
    {
        for(SuratKTM biodata:dataktm)
        {
            System.out.println("");
        }
    }
    public static void main(String[] args) {
       
    }
    
}
