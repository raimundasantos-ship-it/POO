
    import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double xA, xB, xC;
        double yA, yB, yC;

        System.out.println("Dados do triângulo X");

        System.out.print("Lado A: ");
        xA = entrada.nextDouble();

        System.out.print("Lado B: ");
        xB = entrada.nextDouble();

        System.out.print("Lado C: ");
        xC = entrada.nextDouble();

        System.out.println("\nDados do triângulo Y");

        System.out.print("Lado A: ");
        yA = entrada.nextDouble();

        System.out.print("Lado B: ");
        yB = entrada.nextDouble();

        System.out.print("Lado C: ");
        yC = entrada.nextDouble();

        // Triângulo X
        double pX = (xA + xB + xC) / 2;

        double areaX = Math.sqrt(
                pX * (pX - xA) * (pX - xB) * (pX - xC)
        );

        // Triângulo Y
        double pY = (yA + yB + yC) / 2;

        double areaY = Math.sqrt(
                pY * (pY - yA) * (pY - yB) * (pY - yC)
        );

        System.out.println("\nÁrea do triângulo X: " + areaX);
        System.out.println("Área do triângulo Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("Triângulo X possui a maior área.");
        }
        else {
            System.out.println("Triângulo Y possui a maior área.");
        }

        entrada.close();
    }
}