/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attlog2;

import javax.swing.JOptionPane;

/**
 *
 * @author vitoria M
 */
public class Attlog2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quant;
        float a = 0, b = 0;

        String c = JOptionPane.showInputDialog("informe a quantidade de livros: ");
        quant = Integer.parseInt(c);

        a = (float) ((0.25 * quant) + 7.5);
        b = (float) ((0.5 * quant) + 2.5);

        if (a > b) {
            JOptionPane.showMessageDialog(null, " o criterio B é a melhor escolha!");
        } else {
            JOptionPane.showMessageDialog(null, " o criterio A é a melhor escolha!");
        }
    }
