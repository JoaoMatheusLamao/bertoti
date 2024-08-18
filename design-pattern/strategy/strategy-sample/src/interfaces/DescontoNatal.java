package interfaces;

public class DescontoNatal implements DescontoStrategy{
    @Override
    public float aplicarDesconto(float valor) {
        return (float) (valor - (valor * 0.2));
    }
}
