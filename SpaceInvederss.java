/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvederss;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author zizzari.gabriele
 */
public class SpaceInvederss extends JFrame {

    public SpaceInvederss() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Intro intro = new Intro();
        this.add(intro);
        // impacchetto il tutto e rendi visibile
        this.pack();
        this.setVisible(true);
        // avvia l'introduzione
        intro.run();    
    }
    
    

    public static void main(String[] args) {
        Space spazio = new Space();
        

    }

    @Override
    public void paint(Graphics g) {
        // scrivi nel canvas la scritta in blu 
        g.setColor(Color.blue);
        // Seleziona i Font della scritta (Bold) e la dimensione dei caratteri (40)
        g.setFont(new Font("Bold", Font.PLAIN, 40));
        // Scrivi partendo dalla posizione x=100 e y=100
        g.drawString("Space Invaders", 100, 100);
        g.setFont(new Font("Bold", Font.PLAIN, 10));
        g.drawString("\t by Perri Christian", 110, 110);
    }

    private void add(Intro intro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
