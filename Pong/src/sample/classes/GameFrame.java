package sample.classes;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GameFrame extends JFrame{

        GamePanel panel;

        public GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("POG-Pong");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
                Border bo = new LineBorder(Color.yellow);
                JMenuBar bar = new JMenuBar();
                bar.setBorder(bo);
                JMenu menu = new JMenu("Settings");
                bar.add(menu);
                setJMenuBar(bar);

                JMenuItem item = new JMenuItem("Hintergrund");
                menu.add(item);
                setJMenuBar(bar);
                JMenuItem item2 = new JMenuItem("Exit");
                menu.add(item2);
                setJMenuBar(bar);

                item.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent e) {

                                setBackground(Color.red);

                        }
                });

                item2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent e) {
                                //Programm schließen
                                System.exit(10);

                        }
                });

        }
}
