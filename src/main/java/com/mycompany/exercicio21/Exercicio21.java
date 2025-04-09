package com.mycompany.exercicio21;

import javax.swing.JOptionPane;

public class Exercicio21 {

    public static void main(String[] args) {

        for (int i = 32; i <= 58; i++) {
            if (i % 2 == 0) {
                JOptionPane.showMessageDialog(null, "É par: " + i);
            }

        }
    }
}
