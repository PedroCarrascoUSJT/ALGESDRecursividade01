package app;

public class App {          
    public static void main (String args[]){
        
        System.out.println("Fatorial "+fatorial(4));
        System.out.println("Fibonacci "+fibonacci(3));
        System.out.println("Potencia "+potencia(3,3));
        System.out.println("Torre de Hanoi: ");
        torreHanoi(3,'A','C','B');
    }

    public static int fatorial(int n){
        return n==0 ? 1 : n *  fatorial(n-1);
    }

    public static int potencia(int n,int e){
        return e==0 ? 1 : n *  potencia(n,e-1);
    }

    public static int fibonacci(int n){
        return n<=2 ? 1 : fibonacci(n-1) + fibonacci(n-2);
    }

    public static void torreHanoi(int qtd, char inicio, char fim, char auxiliar){
        if(qtd==1) 
            System.out.println("\t" + inicio + " para "+ fim);
         else{
            torreHanoi(qtd-1, inicio, auxiliar, fim);
            System.out.println("\t" + inicio + " para " + fim);
            torreHanoi(qtd-1, auxiliar, fim, inicio);
         }
    }
}