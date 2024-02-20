/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attjava01;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Attjava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          float nota = 0, soma = 0, media = 0, recpar = 0, recu = 0;
        int i;

        Scanner sx = new Scanner(System.in);
        System.out.println("Digite suas 3 notas: ");

        for (i = 0; i < 3; i++) {
            nota = sx.nextFloat();
            soma += nota;
        }
        media = (soma / 3);
        if (media >= 7){
            System.out.println("PARABENS APROVADO!\nGANHOU UMA ESTRELA *");
        }
        else{
            System.out.println("REPROVADO :(\nTera que fazer recuperação.\n ");
            System.out.println("Informe sua  nota de recuperação: ");
            recpar = sx.nextFloat();
            
           recu = (media + recpar)/2;
           if (recu >= 5){
               System.out.println("aluno aprovado pela recuperação.");
           }
           else {
               System.out.println("VOLTE 1 ANO ;)");
           }
            
        }
            
    }
    
}
