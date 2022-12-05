package atividades;
import java.util.Arrays;
public class Ex06 {
     public static void main(String[] args){
            
            int[][] mat = new int[3][3];
           mat[0][0] = 1;
           mat[0][1] = 4;
           mat[0][2] = 7;
           
           mat[1][0] = 2;
           mat[1][1] = 3;
           mat[1][2] = 8;
           
           mat[2][0] = 3;
           mat[2][1] = 6;
           mat[2][2] = 9;
           int[][] matTransposta = new int[3][3];
           
           System.out.println("Matriz Principal: ");
           System.out.println();
          for(int linha = 0;linha < mat.length;linha++){
              for(int coluna = 0;coluna < mat.length;coluna++){
                  System.out.print("["+mat[linha][coluna]+"]");
                
              }
              System.out.println("\n");
           }
          
          for(int linha = 0;linha < mat.length;linha++){
             for(int coluna = 0;coluna < mat.length;coluna++){
                  
                      matTransposta[linha][coluna] = mat[coluna][linha];
                  
          
               }
          }
          System.out.println("Matriz transposta: ");
          System.out.println();
          for(int linha = 0;linha < matTransposta.length;linha++){
              for(int coluna = 0; coluna < matTransposta.length;coluna++){
                    System.out.print("["+matTransposta[linha][coluna]+"]");
               }
              System.out.println("\n");
          }
           
       
  }
}
