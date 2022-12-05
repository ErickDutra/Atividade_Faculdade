
package atividades;
//Nota Conceito
//>= 9 A
//>= 8 e < 9 B
//>= 7 e < 8 C
//>= 6 e < 7 D
//< 6 E
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){
    
         Scanner sc = new Scanner(System.in);
         String nome ;
         int media = 0;
         int totSoma = 0;
         
         int[] vetor = new int[6];
         System.out.println("Digite o nome do Aluno");
         nome = sc.next();
         for(int i = 1;i < vetor.length; i++ ){
            System.out.println("Digite a nota da prova: "+i);
            vetor[i]= sc.nextInt();
            totSoma += vetor[i]; 
            if(vetor[i] >= 9){
                 System.out.println("Nota A");
            }else if(vetor[i] >= 8 && vetor[i] < 9){
                 System.out.println("Nota B");
            }else if(vetor[i] >= 7 && vetor[i] < 8){
                 System.out.println("Nota C");          
            }else if(vetor[i] >= 6 && vetor[i] <7){
                 System.out.println("Nota D");
            }else if(vetor[i] < 6){
                 System.out.println("Nota E");
            }
         }
          media = totSoma / 5;
          System.out.println(totSoma);
          System.out.println("A media do aluno é de: "+media);
    
    
    }    
}
