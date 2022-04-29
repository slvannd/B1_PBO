
package POSTTEST2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class POSTTEST2OLIV {
    
    
    //eyes arraylist 
    static ArrayList<String> eyesbrand= new ArrayList();
    static ArrayList<String> eyesname= new ArrayList();
    static ArrayList<String> eyesstock= new ArrayList();
    static ArrayList<String> eyesprice = new ArrayList();
    
    //face arraylist 
    static ArrayList<String> facebrand = new ArrayList();
    static ArrayList<String> facename= new ArrayList();
    static ArrayList<String> facesstock = new ArrayList();
    static ArrayList<String> faceprice = new ArrayList();
    
    ////lips arraylist 
    static ArrayList<String> lipsbrand = new ArrayList();
    static ArrayList<String> lipsname= new ArrayList();
    static ArrayList<String> lipsstock = new ArrayList();
    static ArrayList<String> lipsprice = new ArrayList();
    
    
    
    static ArrayList ReadyStocklips = new ArrayList();
    static ArrayList ReadyStockface = new ArrayList();
    static boolean Runnings = true;
    static InputStreamReader streamreader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(streamreader);
    
    static void MENU() throws IOException { // throws IOException untuk mendeklarasikan eksepsi(penolakan) agar tau bahwa mungkin akan terjadi pengecualian.
           // menampilkan Menu utama dalam program 
        
        //menampilakn tampilan utama   
        System.out.println("=============================");
        System.out.println(" welcome to Emina cosmetics ");
        System.out.println("=============================");
        System.out.println("------------select the menu below----------");
        System.out.println("|   [1] Show All Stock Emina cosmetics     |");
        System.out.println("|   [2] Add stock Emina cosmetics          |");
        System.out.println("|   [3] Edit stock Emina cosmetics         |");
        System.out.println("|   [4] Remove stock Emina cosmetics       |");
        System.out.println("|   [5] Exit                               |");
        System.out.println("--------------------------------------------");
        System.out.println(" CHOOSE MENU : ");
        
        int choosemenu = Integer.valueOf(input.readLine());
        switch(choosemenu){
            case 1:
                ShowAllStocks();
                break;
            case 2:
                AddStocks();
                break;
            case 3:
                EditStocks();
                break;
            case 4:
                RemoveStocks();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Not available.");
        } 
   }
   static void ShowAllStocks() throws IOException{
           categoryshow();
   }
   static void AddStocks() throws IOException{
           categoryadd();
   }
   static void EditStocks() throws IOException{
           categoryedit();
   }
   static void RemoveStocks() throws IOException{
           categoryremove();
   }
 //-----------------------------------------------------------------------------  
  //show data
   static void categoryshow () throws IOException{
       System.out.println("===Category Stocks Emina====");
       System.out.println("|         [1] Face         |");      
       System.out.println("|         [2] Lips         |"); 
       System.out.println("|         [3] Eyes         |"); 
       System.out.println("|         [4] Exit         |"); 
       System.out.println("|==========================="); 
       
       int choosemenu = Integer.valueOf(input.readLine());
       switch(choosemenu){
            case 1:
                faceshow();
                break;
            case 2:
                lipsshow();
                 break;
            case 3:
                eyesshow();
                break;
            case 4:
                MENU();
                break;
            default:
                System.out.println("Not available.");
               
       }           
   }
       
    static void eyesshow() {
       
       if(eyesbrand.isEmpty()){
           System.out.println("NO STOCK");
       }else{ 
           int i = 0;
           for(String brand : eyesbrand){
                 
                String name = eyesname.get(i); 
                String stock = eyesstock.get(i);
                String price = eyesprice.get(i);
                
                System.out.println("No |     Brand     |     Name     |   Price   |");
                System.out.println(i+"\t"+brand+"\t\t"+name+"\t\t"+price);
                
           }
        }
    }
    static void faceshow() {
       
       if(facebrand.isEmpty()){
           System.out.println("NO STOCK");
       }else{ 
           int i = 0;
           for(String brand : facebrand){
                 
                String name = facename.get(i); 
                String stock = facesstock.get(i);
                String price = faceprice.get(i);
                
                System.out.println("No |     Brand     |     Name     |   Price   |");
                System.out.println(i+"\t"+brand+"\t\t"+name+"\t\t"+price);
           }
        }
    }
    
    static void lipsshow() {
       if(lipsbrand.isEmpty()){
           System.out.println("NO STOCK");
       }else{ 
           int i = 0;
           for(String brand : lipsbrand){
                 
                String name = lipsname.get(i); 
                String stock = lipsstock.get(i);
                String price = lipsprice.get(i);
                
                System.out.println("No |     Brand     |     Name     |   Price   |");
                System.out.println(i+"\t"+brand+"\t\t"+name+"\t\t"+price);
           }
        }

//------------------------------------------------------------------------------
//add data 
    static void categoryadd () throws IOException{
       System.out.println("===Category Stocks Emina====");
       System.out.println("|         [1] Face         |");      
       System.out.println("|         [2] Lips         |"); 
       System.out.println("|         [3] Eyes         |"); 
       System.out.println("|         [4] Exit         |"); 
       System.out.println("|==========================="); 
       
       int choosemenu = Integer.valueOf(input.readLine());
       switch(choosemenu){
            case 1:
                faceadd();
                break;
            case 2:
                lipsadd();
                 break;
            case 3:
                eyesadd();
                break;
            case 4:
                MENU();
                break;
            default:
                System.out.println("Not available.");
               
       }           
   }

    static void faceadd ()throws IOException {
        
        System.out.println("Input brand");
        String brand = input.readLine();
        facebrand.add(brand);  
        System.out.println("Input name:");
        String name= input.readLine();
        facename.add(name);  
        System.out.println("Input stocks:");
        
        String stocks = input.readLine();
        facesstock.add(stocks);  
        System.out.println("Input price:");
        String price= input.readLine();
        faceprice.add(price);  
        
        Makeups makeUpsOlip = new Makeups(brand, name, 0, 0);
        makeUpsOlip.add();
        
    }
    
    static void lipsadd ()throws IOException {
        System.out.println("Input brand");
        String brand = input.readLine();
        lipsbrand.add(brand);  
        
        System.out.println("Input name:");
        String name= input.readLine();
        lipsname.add(name);  
        
        System.out.println("Input stocks:");
        String stocks = input.readLine();
        lipsstock.add(stocks);  
        
        System.out.println("Input price:");
        String price= input.readLine();
        lipsprice.add(price);
        Makeups makeUpsOlip = new Makeups(brand, name, 0, 0);
        makeUpsOlip.add();
    }
    static void eyesadd ()throws IOException {
        System.out.println("Input brand");
        String brand = input.readLine();
        eyesbrand.add(brand);  
        
        System.out.println("Input name:");
        String name= input.readLine();
        eyesname.add(name);  
        
        System.out.println("Input stocks:");
        String stocks = input.readLine();
        eyesstock.add(stocks);  
        
        System.out.println("Input price:");
        String price= input.readLine();
        eyesprice.add(price);  
        
        Makeups makeUpsOlip = new Makeups(brand, name, 0, 0);
        makeUpsOlip.add();
        
    }
  
//-----------------------------------------------------------------------------
    
    static void categoryedit () throws IOException{
       System.out.println("===Category Stocks Emina====");
       System.out.println("|         [1] Face         |");      
       System.out.println("|         [2] Lips         |"); 
       System.out.println("|         [3] Eyes         |"); 
       System.out.println("|         [4] Exit         |"); 
       System.out.println("|==========================="); 
       
       int choosemenu = Integer.valueOf(input.readLine());
       switch(choosemenu){
            case 1:
                faceedit();
                break;
            case 2:
                lipsedit();
                 break;
            case 3:
                eyesedit();
                break;
            case 4:
                MENU();
                break;
            default:
                System.out.println("Not available.");
               
       }           
   }

    static void faceedit()throws IOException {
        System.out.print("Choose index to edit : ");
        int indexStocks = Integer.valueOf(input.readLine());        
        
        System.out.println("Input brand");
        String brand = input.readLine();
        System.out.println("Input name:");
        String name= input.readLine();
        System.out.println("Input stocks:");
        String stocks = input.readLine();
        System.out.println("Input price:");
        String price= input.readLine();
        
        
        facebrand.set(indexStocks, brand);
        facename.set(indexStocks, name);
        facesstock.set(indexStocks, stocks);
        faceprice.set(indexStocks, price);
        
        Makeups makeUpsOlip = new Makeups(brand, name, 0, 0);
        makeUpsOlip.edit();
    }
    static void lipsedit()throws IOException {
        System.out.print("Choose index to edit : ");
        int indexStocks = Integer.valueOf(input.readLine());        
        
        System.out.println("Input brand");
        String brand = input.readLine();
        System.out.println("Input name:");
        String name= input.readLine();
        System.out.println("Input stocks:");
        String stocks = input.readLine();
        System.out.println("Input price:");
        String price= input.readLine();
        
        
        lipsbrand.set(indexStocks, brand);
        lipsname.set(indexStocks, name);
        lipsstock.set(indexStocks, stocks);
        lipsprice.set(indexStocks, price);
        Makeups makeUpsOlip = new Makeups(brand, name, 0, 0);
        makeUpsOlip.edit();
    }
    static void eyesedit()throws IOException {
        System.out.print("Choose index to edit : ");
        int indexStocks = Integer.valueOf(input.readLine());        
        
        System.out.println("Input brand");
        String brand = input.readLine();
        System.out.println("Input name:");
        String name= input.readLine();
        System.out.println("Input stocks:");
        String stocks = input.readLine();
        System.out.println("Input price:");
        String price= input.readLine();
        
        
        lipsbrand.set(indexStocks, brand);
        lipsname.set(indexStocks, name);
        lipsstock.set(indexStocks, stocks);
        lipsprice.set(indexStocks, price);
        Makeups makeUpsOlip = new Makeups(brand, name, 0, 0);
        makeUpsOlip.edit();
    }
   //--------------------------------------------------------------------------
    
    static void categoryremove () throws IOException{
       System.out.println("===Category Stocks Emina====");
       System.out.println("|         [1] Face         |");      
       System.out.println("|         [2] Lips         |"); 
       System.out.println("|         [3] Eyes         |"); 
       System.out.println("|         [4] Exit         |"); 
       System.out.println("|==========================="); 
       
       int choosemenu = Integer.valueOf(input.readLine());
       switch(choosemenu){
            case 1:
                faceremove();
                break;
            case 2:
                lipsremove();
                 break;
            case 3:
                eyesremove();
                break;
            case 4:
                MENU();
                break;
            default:
                System.out.println("Not available.");
               
       }           
   }
    static void faceremove() throws IOException{
        System.out.print("choose index to remove :");
        int indexStocks = Integer.valueOf(input.readLine());  
        
        facebrand.remove(indexStocks);
        facename.remove(indexStocks);
        facesstock.remove(indexStocks);
        faceprice.remove(indexStocks);
        Makeups makeUpsOlip = new Makeups("brand", "name", 0, 0);
        makeUpsOlip.remove();
    }
    
    static void lipsremove() throws IOException{
        System.out.print("choose index to remove :");
        int indexStocks = Integer.valueOf(input.readLine());  
        
       lipsbrand.remove(indexStocks);
        lipsname.remove(indexStocks);
        lipsstock.remove(indexStocks);
        lipsprice.remove(indexStocks);
        Makeups makeUpsOlip = new Makeups("brand", "name", 0, 0);
        makeUpsOlip.remove();
    }
    static void eyesremove() throws IOException{
        System.out.print("choose number to remove :");
        int indexStocks = Integer.valueOf(input.readLine());  
        
        eyesbrand.remove(indexStocks);
        eyesname.remove(indexStocks);
        eyesstock.remove(indexStocks);
        eyesprice.remove(indexStocks);
        
        Makeups makeUpsOlip = new Makeups("brand", "name", 0, 0);
        makeUpsOlip.remove();
        
    }
                
   public static void main(String[] args) throws IOException {
       do{
       MENU();
       }while  (Runnings);
       }
    }
