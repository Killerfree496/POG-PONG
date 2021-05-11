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

    //Konstruktor
    public Menu(){
        super("POG PONG-IM MENU");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createMenuPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createMenuPanel() {
        JPanel panel = new JPanel(new GridLayout(0, 1));

        JButton start = new JButton("Start POG PONG");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameFrame frame = new GameFrame();
            }

            private void dispose() {
                setVisible(false);
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
        panel.add(close);
        panel.add(SOON);
        return panel;
    }
}