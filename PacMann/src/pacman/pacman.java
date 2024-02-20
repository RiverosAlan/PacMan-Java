/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;
import java.awt.EventQueue;
import javax.swing.JFrame;
/**
 *
 * @author hp
 */
public class pacman extends JFrame {
    public pacman() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new tablero());
        setTitle("PACMAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                pacman ex = new pacman();
                ex.setVisible(true);
            }
        });
    }
    
    
}
