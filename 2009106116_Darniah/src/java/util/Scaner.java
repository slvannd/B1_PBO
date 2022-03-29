/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.util;

/**
 *
 * @author Aspire 5
 */
public class Scaner {
    
}

    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
        int bil, cek=0;
        
        System.out.println("PROGRAM JAVA MENENTUKAN BILANGAN PRIMA ATAU BUKAN");
        System.out.print("Masukan Angka : ");
        bil=input.nextInt();
   
        System.out.println("----------------------------------------------");
        for (int i=1; i<=bil; i=i/2){
            if (bil/2==0){
                cek++;
            } 
        }
        
        if (cek==1){
            System.out.println(bil%" adalah bilangan genap"
                    + "");
        }else {
            System.out.println(bil%" bukan bilangan genap")
                    }
    }
}