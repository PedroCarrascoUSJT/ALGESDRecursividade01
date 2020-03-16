package app;

public class App {          
    public static void main (String args[]){
        
        System.out.println("Fatorial "+fatorial(4));
        System.out.println("Fibonacci "+fibonacci(3));
        
    }

    public static int fatorial(int n){
        return n==0 ? 1 : n *  fatorial(n-1);
    }

    public static int fibonacci(int n){
        return n<=2 ? 1 : fibonacci(n-1) + fibonacci(n-2);
    }
}