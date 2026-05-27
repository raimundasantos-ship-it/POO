
    import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        double salario, novoSalario;

        System.out.print("Nome do funcionário: ");
        nome = entrada.nextLine();

        System.out.print("Salário: ");
        salario = entrada.nextDouble();

        if (salario >= 1 && salario <= 1000) {
            novoSalario = salario + (salario * 0.15);
        }
        else if (salario <= 1500) {
            novoSalario = salario + (salario * 0.10);
        }
        else if (salario <= 2000) {
            novoSalario = salario + (salario * 0.05);
        }
        else {
            novoSalario = salario;
        }

        System.out.println("\nFuncionário: " + nome);
        System.out.println("Salário antigo: R$ " + salario);
        System.out.println("Novo salário: R$ " + novoSalario);

        entrada.close();
    }
}