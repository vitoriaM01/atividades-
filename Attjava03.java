/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attjava03;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Attjava03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro intervalo de tempo: ");

        System.out.print("Horas: ");
        int horas1 = scanner.nextInt();
        System.out.print("minutos: ");
        int minutos1 = scanner.nextInt();
        System.out.print("segundos: ");
        int segundos1 = scanner.nextInt();

        System.out.println("\nDigite o segundo intervalo de tempo: ");

        System.out.print("Horas: ");
        int horas2 = scanner.nextInt();
        System.out.print("minutos: ");
        int minutos2 = scanner.nextInt();
        System.out.print("segundos: ");
        int segundos2 = scanner.nextInt();

        int somaH = horas1 + horas2;
        int somaM = minutos1 + minutos2;
        int somaS = segundos1 + segundos2;

        int horasd = (horas2 - horas1);
        int minutosd = (minutos2 - minutos1);
        int segundosd =(segundos2 - segundos1);

        if (somaS <= 60) {
            somaM += somaS / 60;
            somaS %= 60;
        }
        if (somaM >= 60) {
            somaH += somaM / 60;
            somaM %= 60;
        }
        if (segundosd<= -1) {
            segundosd +=60;
            minutosd -= 1;
        }
        if (minutosd <= -1) {
            minutosd +=60;
           horasd -= 1;
        }
        if (horasd <= -1) {
            horasd+=24;
        }
        
        
        System.out.println("\n\nSoma dos intervalos de tempo:" + somaH + ":" + somaM + ":" + somaS);

        System.out.println("Horas: " + somaH);
        System.out.println("Minutos: " + somaM);
        System.out.println("segundos: " + somaS);

        System.out.println("\nDiferença dos intervalos de tempo: " + horasd + ":" + minutosd + ":" + segundosd);

        System.out.println("Horas: " + horasd);
        System.out.println("Minutos: " + minutosd);
        System.out.println("segundos: " + segundosd);
    }
}
  

            
   
    

