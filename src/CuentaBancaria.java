import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String parametroUm = terminal.next();

        System.out.println("Digite seu nome");
        String parametroDois = terminal.next();

        System.out.println("Digite seu saldo");
        double parametroTreis = terminal.nextDouble();

        CuentaTerminal cuentaTerminal = new CuentaTerminal(
                RandomGenerator.getDefault().nextInt(0, 5000),
                parametroUm,
                parametroDois,
                parametroTreis
        );
    }


}
