/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attlog1;

import java.util.Scanner;

/**
 *
 * @author vitoria moreira
 */
public class Attlog1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("OBS:maior ou igual a 0!\nDigite um numero inteiro: ");
        int numero;
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número digitado não é valido.\nPor favor, digite novamente.");
        } else {
            int numdigitado;
            numdigitado = String.valueOf(numero).length();
            System.out.println("O numero de digitos do número " + numero + " é " + numdigitado);
        }
    }

}
