package atividades;
//Ótimo A
//Bom B
//Regular C
//Exame Especial D
//Reprovado E
import java.util.ArrayList;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" conceito: \n A\n B\n C\n D\n E");
        System.out.println("Mostre o conceito: ");
        String conc = sc.next();
        
        descricao(conc);
      }
    public static String descricao(String conc){
         
        String desc = conc;
        if(desc.equals("A")){
            System.out.println("Otimo");
        }else if(desc.equals("B")){
            System.out.println("Bom");
        }else if(desc.equals("C")){
            System.out.println("Regular");
        }else if(desc.equals("D")){
            System.out.println("Exame Especial");
        }else if(desc.equals("E")){
            System.out.println("Reprovado");
        }
        return desc;
    }
       
}
