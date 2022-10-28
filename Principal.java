import java.util.Scanner;

public class Principal {
    public static final Scanner ENTRADA = new Scanner(System.in);
    public static final Cofrinho COFRINHO = new Cofrinho();

    public static void main(String... args)
    {
        System.out.println("*** COFRINHO ***");
        menu();
    }

    private static void menu()
    {
        int opcao;

        do {
            System.out.println();
            System.out.println("MENU");
            System.out.println("[1] Adicionar Moeda.");
            System.out.println("[2] Remover Moeda.");
            System.out.println("[3] Listar Todas as Moedas.");
            System.out.println("[4] Calcular Total");
            System.out.println("[5] Sair do Programa");
            System.out.println();
            System.out.print("Escolha uma Opção: ");

            opcao = ENTRADA.nextInt();

            switch (opcao) {
                case 1:
                    MenuAdicionarMoeda.exibir();
                    break;

                case 2:
                    MenuRemoverMoeda.exibir();
                    break;

                case 3:
                    MenuListaMoedas.exibir();
                    break;

                case 4:
                    MenuCalcularTotal.exibir();
                    break;

                case 5:
                    break;

                default:
            }
        }
        while(opcao != 5);
    }
}