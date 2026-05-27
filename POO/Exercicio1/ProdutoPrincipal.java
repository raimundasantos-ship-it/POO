package Exercicio1;

    import java.util.Scanner;

public class ProdutoPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Nome do produto: ");
        produto.nome = entrada.nextLine();

        System.out.print("Preço: ");
        produto.preco = entrada.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = entrada.nextInt();

        System.out.println("\nDADOS DO PRODUTO");
        produto.mostrarDados();

        System.out.print("\nQuantidade para adicionar: ");
        int adicionar = entrada.nextInt();

        produto.adicionarEstoque(adicionar);

        System.out.println("\nDADOS ATUALIZADOS");
        produto.mostrarDados();

        System.out.print("\nQuantidade para remover: ");
        int remover = entrada.nextInt();

        produto.removerEstoque(remover);

        System.out.println("\nDADOS FINAIS");
        produto.mostrarDados();

        entrada.close();
    }
}
