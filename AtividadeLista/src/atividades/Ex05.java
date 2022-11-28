package atividades;
//Crie um algoritmo para ler do usuário uma matriz quadrada de inteiros. Após a leitura, o
//programa deverá mostrar a linha e a coluna com o maior número entre todos lidos.
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
         
       System.out.println("Digite o tamanho da Matriz Quadrada: ");
       int num = sc.nextInt();
       int[][] matQuad = new int[num][num];
       
       int maior = 0;
       int linha = 0;
       int coluna = 0;
       
       for(int i = 0;i < matQuad.length;i++){
           for(int j = 0; j < matQuad.length;j++){
                System.out.println("Informe o valor da ["+i+"]["+j+"] :");
                matQuad[i][j] = sc.nextInt();
             }
            
       }
       for(int i = 0;i<matQuad.length;i++){
          for(int j = 0;j<matQuad.length;j++){
               System.out.println("mat["+i+"]["+j+"] = "+matQuad[i][j]);
              
               
                if(matQuad[i][j] > maior){
                  maior = matQuad[i][j];
                  linha = i;
                  coluna = j;
                  
               }
            }
       }
       System.out.println("o maior vlaoe esta armazenado na ["+linha+"]["+coluna+"] = "+maior);
       
       
     
          
    }    
}
