
package posttest1oliv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class POSTTEST1OLIV {
static ArrayList ReadyStock = new ArrayList();
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
   static void ShowAllStocks (){
       if(ReadyStock.isEmpty()){
           System.out.println("NO STOCK");
       }else 
           for(int i = 0; i < ReadyStock.size(); i++){
               System.out.println(String.format("[%d} %s",i, ReadyStock.get(i)));
               
           }
        }
    static void AddStocks()throws IOException {
        System.out.println("Input stocks:");
        String newstocks = input.readLine();
        ReadyStock.add(newstocks);  
    }
    
    static void EditStocks()throws IOException {
        ShowAllStocks();
        System.out.print("Choose number to edit");
        int indexStocks = Integer.valueOf(input.readLine());        
        
        System.out.println("Input New Name :");
        String NewName = input.readLine();
        
        ReadyStock.set(indexStocks, NewName);
    }
    
    
    static void RemoveStocks() throws IOException{
        ShowAllStocks();
        System.out.print("choose number to remove :");
        int indexStocks = Integer.valueOf(input.readLine());  
        
        ReadyStock.remove(indexStocks);
    }
            
    public static void main(String[] args) {
       do{
        MENU();
       }while  (Runnings);
       }
    }
    

