/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angelac
 */


import java.awt.Color;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.*;
import javax.swing.Icon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Container;

public class mainStart extends JFrame implements ActionListener
{ 
    
    private JButton pressToPlay;
    private JFrame start;
    
    public mainStart() {
       setSize(626, 417);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Lobby");
        setLayout(null);

        Container c = getContentPane();
        c.setBackground(Color.PINK);
        
        pressToPlay = new JButton("Click to start the puzzle.");
        pressToPlay.setBounds(170, 150, 300, 50);
        pressToPlay.addActionListener(this);
        c.add(pressToPlay);
        
        ImageIcon bg = new ImageIcon(getClass().getResource("travel.png"));
        JLabel background = new JLabel("", bg, JLabel.CENTER);
        background.setBounds(0, 0, 626, 417);
        c.add(background);
        
    }     
public static void main(String[] args) {
       
    mainStart game = new mainStart();
      game.setLocationRelativeTo(null);
       game.setVisible(true);
    }

public void actionPerformed(ActionEvent e) {
     if (e.getSource() == pressToPlay) {

            
            puzzleGame board = new puzzleGame();
            this.dispose();

        }
}
}

