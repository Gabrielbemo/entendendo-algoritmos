public class RecursiveFunction {
    public static void main(String[] args) {
        int input = 5;
        System.out.println("Fatorial de " + input + " : " + recursiveFactorial(input));
    }
    public static int recursiveFactorial(int input) {
        if (input == 0 || input == 1 || input < 0) {
            return 1;
        }
        return input * recursiveFactorial(input - 1);
    }
}
