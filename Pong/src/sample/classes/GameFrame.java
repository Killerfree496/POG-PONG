package sample.classes;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GameFrame extends JFrame {

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
                JMenuItem item3 = new JMenuItem("MUSIC ON");
                menu.add(item3);
                setJMenuBar(bar);
                JMenuItem item4 = new JMenuItem("SOON");
                menu.add(item4);
                setJMenuBar(bar);

                item.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent e) {
                                //background ändern
                                setBackground(Color.gray);

                        }
                });

                item2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent e) {
                                //Programm schließen
                                System.exit(10);

                        }
                });
                item3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                new PlaySound();


                        }
                });


        }
}
