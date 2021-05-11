package sample.classes;

import sample.classes.Snake.TicGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{

    public static void main(String[] args){
        new Menu();
    }


    public Menu(){
        super("POG PONG-IM MENU");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createMenuPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(400,200);
        setResizable(true);

    }

    private JPanel createMenuPanel() {
        JPanel panel = new JPanel(new GridLayout(0, 1));
        JOptionPane.showMessageDialog(null, "Herzlich Willkommen! Hab eine schöne Zeit");
        JButton start = new JButton("Start POG PONG");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Das Game startet direkt! Also mach dich Bereit! Steuern mit Pfeiltasten und W S");
                GameFrame frame = new GameFrame();

            }


        });

        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             System.exit(1);
            }
        });

        JButton SOON = new JButton("TicTacToe (SOON)");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicGUI ticTacToe = new TicGUI();

            }
        });

        panel.add(start);
        panel.add(SOON);
        panel.add(close);

        return panel;
    }

}