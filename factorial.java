class Factorial {
    public void fact(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("The factorial is: " + fact);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Factorial Program");

        Factorial obj = new Factorial();
        obj.fact(9);
    }
}
