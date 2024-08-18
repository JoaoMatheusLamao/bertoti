package interfaces;

public class DescontoVIP implements DescontoStrategy{
    @Override
    public float aplicarDesconto(float valor) {
        return (float) (valor - (valor * 0.5));
    }
}
