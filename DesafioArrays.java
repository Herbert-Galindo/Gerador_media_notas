
import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Digite a Quantidade de Notas:... ");

        int qtdeNotas = entrada.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println(" Informe a Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();   // Para inserir será ( , ) na minha máquina!
        }

        double total = 0;
        for(double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println(" A média das notas informadas é " + media + "!");

        entrada.close();
    }
}
