/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinev;

/**
 *
 * @author fband
 */
public class Cinev {
    public static void main(String[] args){
        System.out.print("HOla");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegPeli().setVisible(true);
            }
        });
    }
    
}
