package PenjualanSepeda;

/**
 *
 * @author yola
 */
class DataSepeda {
        int id;
        String Merk;
        String Warna;
        String Ukuran;
        int Harga;
        
        DataSepeda(int id, String merk, String ukr, String wrn, int hrg)
        {
            this.id = id;
            this.Merk = merk;
            this.Warna = wrn;
            this.Ukuran = ukr;
            this.Harga = hrg;
             
        }
        
        DataSepeda(int id, String nama){
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
        public int getId()
        {
            return id;
        }
        
        
        public String getMerk()
        {
             return Merk;
        }
           
        public String getWrn()
        {
            return Warna;
        }
        
        public String getUkr()
        {
            return Ukuran;
        }
        
        
        public int getHrg()
        {
            return Harga;
        }
        
       
    
}
