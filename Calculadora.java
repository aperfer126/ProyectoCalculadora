public class Calculadora {
    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    
    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public double division(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return (double) num1 / num2;
    }
}