/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author MSI Gaming
 */
public class Array {
    int arr[] = new int[10];
    try{
        arr[10] = 25;
}catch(ArrayOutOfBoundsException e){
            System.out.println(e);
}finally{
    
}
    

