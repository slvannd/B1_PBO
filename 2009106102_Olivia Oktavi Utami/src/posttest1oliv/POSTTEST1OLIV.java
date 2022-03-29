package posttest1oliv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class POSTTEST1OLIV {
    static ArrayList ReadyStockeyes = new ArrayList();
    static ArrayList ReadyStocklips = new ArrayList();
    static ArrayList ReadyStockface = new ArrayList();
    static boolean Runnings = true;
    static InputStreamReader streamreader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(streamreader);
    
    static void MENU() throws IOException { // throws IOException untuk mendeklarasikan eksepsi(penolakan) agar tau bahwa mungkin akan terjadi pengecualian.
           // menampilkan Menu utama dalam program 
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
   static void ShowAllStocks(){
           categoryshow();
   }
   static void AddStocks(){
           categoryadd();
   }
   static void EditStocks(){
           categoryedit();
   }
   static void RemoveStocks(){
           categoryremove();
   }
 //-----------------------------------------------------------------------------  
   static void categoryshow (){
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
       
    static void faceshow() {
       if(ReadyStockface.isEmpty()){
           System.out.println("NO STOCK");
       }else 
           for(int i = 0; i < ReadyStockface.size(); i++){
               System.out.println(String.format("[%d} %s",i, ReadyStockface.get(i)));
               
           }
        }
    
    static void lipsshow() {
       if(ReadyStocklips.isEmpty()) {
            System.out.println("NO STOCK");
       }else 
           for(int i = 0; i < ReadyStocklips.size(); i++){
               System.out.println(String.format("[%d} %s",i, ReadyStocklips.get(i)));    
       }
    }
    static void eyesshow() {
       if(ReadyStockeyes.isEmpty()) {
            System.out.println("NO STOCK");
       }else 
           for(int i = 0; i < ReadyStockeyes.size(); i++){
               System.out.println(String.format("[%d} %s",i, ReadyStockeyes.get(i)));    
       }
    }

//------------------------------------------------------------------------------

    static void categoryadd (){
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
        System.out.println("Input stocks:");
        String newstocks = input.readLine();
        ReadyStockface.add(newstocks);  
    }
    
    static void lipsadd ()throws IOException {
        System.out.println("Input stocks:");
        String newstocks = input.readLine();
        ReadyStocklips.add(newstocks);  
    }
    static void eyesadd ()throws IOException {
        System.out.println("Input stocks:");
        String newstocks = input.readLine();
        ReadyStockeyes.add(newstocks);  
    }
  
//-----------------------------------------------------------------------------
    
    static void categoryedit (){
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
        System.out.print("Choose number to edit");
        int indexStocks = Integer.valueOf(input.readLine());        
        
        System.out.println("Input New Name :");
        String NewName = input.readLine();
        
        ReadyStockface.set(indexStocks, NewName);
    }
    static void lipsedit()throws IOException {
        System.out.print("Choose number to edit");
        int indexStocks = Integer.valueOf(input.readLine());        
        
        System.out.println("Input New Name :");
        String NewName = input.readLine();
        
        ReadyStocklips.set(indexStocks, NewName);
    }
    static void eyesedit()throws IOException {
        System.out.print("Choose number to edit");
        int indexStocks = Integer.valueOf(input.readLine());        
        
        System.out.println("Input New Name :");
        String NewName = input.readLine();
        
        ReadyStockeyes.set(indexStocks, NewName);
    }
   //--------------------------------------------------------------------------
    
    static void categoryremove (){
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
        System.out.print("choose number to remove :");
        int indexStocks = Integer.valueOf(input.readLine());  
        
        ReadyStockface.remove(indexStocks);
    }
    
    static void lipsremove() throws IOException{
        System.out.print("choose number to remove :");
        int indexStocks = Integer.valueOf(input.readLine());  
        
        ReadyStocklips.remove(indexStocks);
    }
    static void eyesremove() throws IOException{
        System.out.print("choose number to remove :");
        int indexStocks = Integer.valueOf(input.readLine());  
        
        ReadyStockeyes.remove(indexStocks);
    }
                
   public static void main(String[] args) {
       do{
       MENU();
       }while  (Runnings);
       }
    }/

