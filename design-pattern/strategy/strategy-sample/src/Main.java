import interfaces.DescontoNatal;
import interfaces.DescontoQueimaEstoque;
import interfaces.DescontoVIP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Carrinho carrinho = new Carrinho();
        carrinho.setPrecoFinal(100);

        carrinho.setDesconto(new DescontoVIP());
        System.out.println("VIP: " + carrinho.calculaDesconto());

        carrinho.setDesconto(new DescontoNatal());
        System.out.println("NATAL: " + carrinho.calculaDesconto());

        carrinho.setDesconto(new DescontoQueimaEstoque());
        System.out.println("QUEIMA ESTOQUE: " + carrinho.calculaDesconto());
    }
}