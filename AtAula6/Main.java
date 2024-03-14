import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Escolha a fábrica (1-Nike, 2-Adidas, 3-Puma, 4-Umbro, 5-Kappa):");
        int opcaoFabrica = scanner.nextInt();

        FabricaDeCamisas fabrica = null;
        switch (opcaoFabrica) {
            case 1:
                fabrica = new FabricaNike();
                break;
            case 2:
                fabrica = new FabricaAdidas();
                break;
            case 3:
                fabrica = new FabricaPuma();
                break;
            case 4:
                fabrica = new FabricaUmbro();
                break;
            case 5:
                fabrica = new FabricaKappa();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Escolha o time (1-Brasil, 2-Flamengo, 3-Botafogo, 4-Fluminense, 5-Vasco):");
        int opcaoTime = scanner.nextInt();

        CamisaEsportiva camisa = null;
        switch (opcaoTime) {
            case 1:
                camisa = fabrica.criarCamisa();
                break;
            case 2:
                camisa = fabrica.criarCamisa();
                break;
            case 3:
                camisa = fabrica.criarCamisa();
                break;
            case 4:
                camisa = fabrica.criarCamisa();
                break;
            case 5:
                camisa = fabrica.criarCamisa();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Fábrica: " + fabrica.getClass().getSimpleName());
        System.out.print("Camisa: ");
        camisa.exibirTime();
    }
}
