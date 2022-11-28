package atividades;
//distancia euclidiana ((x1 – x2)² + (y1 – y2)²)distancia entre dois pontos 
//x = [2.8, 3.2, 1.9, 4.2]
//y = [2.9, 4.8, 2.5, 3.5]
public class Ex07 {
    public static void main(String[] args){
        double[] x = new double[4];
        double[] y = new double[4];
        
        x[0] = 2.8;
        x[1] = 3.2;
        x[2] = 1.9;
        x[3] = 4.2;
        
        y[0] = 2.9;
        y[1] = 4.8;
        y[2] = 2.5;
        y[3] = 3.5;
        
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        double distancia ;
        for(int i = 0;i < x.length;i++){
            System.out.println("("+x[i]+" , "+y[i]+")");
        }
        System.out.println();
        for(int i = 0;i < x.length - 1;i++){
            
            x1 = x[i];
            y1 = y[i];
            x2 = x[i + 1];
            y2 = y[i + 1];
            distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
            System.out.println("A distancia entre os pontos "+"("+x1+" , "+y1+") e ("+x2+" , "+y2+") = "+distancia);
            System.out.println();
        }
        
    }    
}
