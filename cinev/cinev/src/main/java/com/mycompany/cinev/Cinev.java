package com.mycompany.cinev;

/**
 *
 * @author fband
 */
public class Cinev {
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInicio().setVisible(true);
            }
        });
    }
    
}
