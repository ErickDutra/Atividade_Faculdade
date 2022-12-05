package atividades;
import java.util.Scanner;
import java.util.ArrayList;
//variaçao do segundo exercicio.
public class Ex03 {
     public static void main(String[] args){
     
         Scanner sc = new Scanner(System.in);
         System.out.println("Conceitos: \n A \n B\n C\n D\n E\n");
         System.out.println("Digite um dos conceitos; ");
         String conc = sc.next();
         
         mostraDescr(conc);
     }
     public static void mostraDescr(String conc){
             
         ArrayList<String> descr = new ArrayList();
         descr.add("Ótimo");
         descr.add("Bom");
         descr.add("Regular");
         descr.add("Exame Especial");
         descr.add("Reprovado");
         switch(conc){
                 case "A":
                     System.out.println(descr.get(0));
                     break;
                 case "B":
                     System.out.println(descr.get(1));
                     break;
                 case "C":
                     System.out.println(descr.get(2));
                     break;
                 case "D":
                     System.out.println(descr.get(3));
                     break;
                 case "E":
                     System.out.println(descr.get(4));
                     break;
                 default:
                     System.out.println("Digite um conceito válido!!!!");
                             
            }    
     }
     
}
