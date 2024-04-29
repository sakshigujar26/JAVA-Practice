class Calci {
    public static double Add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double Sub(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double Multiplication(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double Division(double num1, double num2) {
        try {
            if (num2 != 0) {
                double result = num1 / num2;
                return result;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return -1;
        }
    }

    public static double modulo(double num1, double num2) {
        try {
            if (num2 != 0) {
                double result = num1 % num2;
                return result;
            } else {
                throw new ArithmeticException("Modulo by zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return -1;
        }
    }

  
    public static void main(String args[]) {
        try {
            System.out.println(Add(2, 4));
            System.out.println(Sub(8, 4));
            System.out.println(Multiplication(4, 5));
            System.out.println(Division(8, 0d));
            System.out.println(modulo(8, 4));
            // Other method calls here
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


 
