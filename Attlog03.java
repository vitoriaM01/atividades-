/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attlog3;

import java.util.Scanner;

/**
 *
 * @author vitoria
 */
public class Attlog3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro intervalo de tempo: ");

        System.out.print("Horas: ");
        int horas1 = scanner.nextInt();
        System.out.print("minutos: ");
        int minutos1 = scanner.nextInt();
        System.out.print("segundos: ");
        int segundos1 = scanner.nextInt();

        System.out.println("Digite o segundo intervalo de tempo: ");

        System.out.print("Horas: ");
        int horas2 = scanner.nextInt();
        System.out.print("minutos: ");
        int minutos2 = scanner.nextInt();
        System.out.print("segundos: ");
        int segundos2 = scanner.nextInt();

        int somaH = horas1 + horas2;
        int somaM = minutos1 + minutos2;
        int somaS = segundos1 + segundos2;

        int horasd = Math.abs(horas1 - horas2);
        int minutosd = Math.abs(minutos1 - minutos2);
        int segundosd = Math.abs(segundos1 - segundos2);

        if (somaS >= 60) {
            somaM += somaS / 60;
            somaS %= 60;
        }
        if (somaM >= 60) {
            somaH += somaM / 60;
            somaM %= 60;
        }

        System.out.println("Soma dos intervalos de tempo: ");

        System.out.println("Horas: " + somaH);
        System.out.println("Minutos: " + somaM);
        System.out.println("segundos: " + somaS);

        System.out.println("Diferença dos intervalos de tempo: " + horasd + ":" + minutosd + ":" + segundosd);

        System.out.println("Horas: " + horasd);
        System.out.println("Minutos: " + minutosd);
        System.out.println("segundos: " + segundosd);
    }
}
