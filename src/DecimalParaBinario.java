public class DecimalParaBinario {

    public static String decimalParaBinario(int num) {
        // caso base
        if (num >= 0) {
            if (num == 0) {
                return "0";
            }
            if (num == 1) {
                return "1";
            } else {
                // guarda o resto da divisao por 2 e transforma em uma String
                String resto = Integer.toString(num % 2);
                return decimalParaBinario(num / 2) + resto;
            }
        }
        // Caso num < 0
        return "O numero deve ser maior ou igual a zero";
    }

    public static void main(String[] args) {

        DecimalParaBinario x = new DecimalParaBinario();

        // Alguns exemplos
        System.out.println(x.decimalParaBinario(5));
        System.out.println(x.decimalParaBinario(8));
        System.out.println(x.decimalParaBinario(9));
        System.out.println(x.decimalParaBinario(15));
    }

}

