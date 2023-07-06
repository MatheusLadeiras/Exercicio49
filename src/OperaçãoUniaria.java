public class OperaçãoUniaria extends OperaçãoMatematica{
    public float operando;

    public float RaizQuadrada() {
        return operando*operando;
    };

    @Override
    public float calcular() {
        return 0;
    }
}
