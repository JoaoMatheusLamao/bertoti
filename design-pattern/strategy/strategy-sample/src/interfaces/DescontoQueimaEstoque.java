package interfaces;

public class DescontoQueimaEstoque implements DescontoStrategy{
    @Override
    public float aplicarDesconto(float valor) {
        return (float) (valor - (valor * 0.9));
    }
}
