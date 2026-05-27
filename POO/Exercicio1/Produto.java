package Exercicio1;
public class Produto {

    String nome;
    double preco;
    int quantidade;

    double valorTotal() {
        return preco * quantidade;
    }

    void adicionarEstoque(int qtd) {
        quantidade = quantidade + qtd;
    }

    void removerEstoque(int qtd) {

        if (qtd > quantidade) {
            System.out.println("Quantidade insuficiente no estoque.");
        } else {
            quantidade = quantidade - qtd;
        }
    }

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total no estoque: R$ " + valorTotal());
    }
}