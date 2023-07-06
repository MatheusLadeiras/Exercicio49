public class OperaçãoBinaria extends OperaçãoMatematica{
    public int operando1;
    public int operando2;

    public OperaçãoBinaria(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int Soma() {
        return operando1+operando2;
    };

    public int Subtração() {
        return operando1-operando2;
    };

    public int Multiplicação() {
        return operando1*operando2;
    };

    public int divisão() {
        try {
            return operando1 / operando2;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return 0;
    };

    @Override
    public float calcular() {
        return 0;
    }
}
