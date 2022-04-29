

package POSTTEST4;


public class Emina extends Makeups {
    private String nameproduct;
    private int priceproduct;
    private String storageperiod;
    private int productionyear;

    public Emina(String nameproduct, int priceproduct, String storageperiod, int productionyear, String brand, String name, int stock, int price) {
        super(brand, name, stock, price);
        this.nameproduct = nameproduct;
        this.priceproduct = priceproduct;
        this.storageperiod = storageperiod;
        this.productionyear = productionyear;
        
     
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public int getPriceproduct() {
        return priceproduct;
    }

    public void setPriceproduct(int priceproduct) {
        this.priceproduct = priceproduct;
    }

    public String getStorageperiod() {
        return storageperiod;
    }

    public void setStorageperiod(String storageperiod) {
        this.storageperiod = storageperiod;
    }

    public int getProductionyear() {
        return productionyear;
    }

    public void setProductionyear(int productionyear) {
        this.productionyear = productionyear;
    }
    
    @Override
    void sayseyes(){
        System.out.println("eyes beautiful for beautiful day");
    }
    @Override
    void sayslips(){
        System.out.println("love of your lips");
    }
    @Override
    void saysfaces(){
        System.out.println("glowing face for better day");
    }
    }
        
}
