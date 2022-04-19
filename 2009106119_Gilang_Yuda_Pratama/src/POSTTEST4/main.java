/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSi-GAMING
 */
public class main {
    public static void main(String[] args) {
        
        posttest4 objek = new posttest4();
        SepatuKickkers s1 = new SepatuKickkers();
        
        
        // run the program
        ArrayList <SepatuKickkers> dt = new ArrayList<>();
        while (true) {
            s1.dataSHow();
            objek.showMenu(dt);
            
        }
    }
}
