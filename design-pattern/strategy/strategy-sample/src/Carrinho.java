import interfaces.DescontoStrategy;

public class Carrinho {
    private float precoFinal;
    private DescontoStrategy desconto;

    public Carrinho() {}

    public Carrinho(float precoFinal, DescontoStrategy desconto) {
        this.precoFinal = precoFinal;
        this.desconto = desconto;
    }

    public float getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(float precoFinal) {
        this.precoFinal = precoFinal;
    }

    public DescontoStrategy getDesconto() {
        return desconto;
    }

    public void setDesconto(DescontoStrategy desconto) {
        this.desconto = desconto;
    }

    public float calculaDesconto() {
        return this.desconto.aplicarDesconto(this.precoFinal);
    }
}
