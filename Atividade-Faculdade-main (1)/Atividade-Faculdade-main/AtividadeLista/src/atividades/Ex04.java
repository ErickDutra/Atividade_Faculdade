package atividades;
import java.util.ArrayList;
import java.util.Scanner;
//formula da circuferencia C = 2PIr
public class Ex04 {
     static final double PI = 3.141592 ;
     public static void main(String[] args){
          
          System.out.println("Digite o raio e receba a circuferencia");
           Scanner sc = new Scanner(System.in);
           double[] listaR = new double[6];
           double[] recebeC = new double[6];
           for(int i = 0 ; i < listaR.length;i++){
                System.out.println("Digite o R do ciculo "+(i+1));
                listaR[i] = sc.nextDouble();
              
                recebeC[i] = calculoCircuferencia(listaR[i]);
                System.out.println("A circuferencia do circulo "+i+" é igual á "+recebeC[i]);
                
                
                        
           }
           System.out.println("Todas as circuferencias: ");
           System.out.println(recebeC[0]+" , "+recebeC[1]+" , "+recebeC[2]+" , "+recebeC[3]+" , "+recebeC[4]+" , "+recebeC[5]);
                      
           
      }
     public static double calculoCircuferencia(double listaR){
          
          double circ = 2*PI*listaR;
           
         return circ;
     }
     
}
