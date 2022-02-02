public class Fibonacci {

    public int sequenciaFibonacci(int n) {
        // caso base
        if(n == 1 || n == 2) {
            return 1;
        }
        else if(n > 2) {
            // soma os dois numeros anteriores
            return sequenciaFibonacci(n - 2) + sequenciaFibonacci(n - 1);
        }
        return 0;
    }

    public static void main(String[] args) {

        Fibonacci x = new Fibonacci();

        // Alguns exemplos
        System.out.println(x.sequenciaFibonacci(1));
        System.out.println(x.sequenciaFibonacci(2));
        System.out.println(x.sequenciaFibonacci(3));
        System.out.println(x.sequenciaFibonacci(4));
        System.out.println(x.sequenciaFibonacci(5));
        System.out.println(x.sequenciaFibonacci(5));
        System.out.println(x.sequenciaFibonacci(6));
        System.out.println(x.sequenciaFibonacci(7));
        System.out.println(x.sequenciaFibonacci(8));
        System.out.println(x.sequenciaFibonacci(9));

    }
}
