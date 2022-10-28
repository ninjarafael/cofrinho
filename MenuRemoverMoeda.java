public class MenuRemoverMoeda {
    public static void exibir()
    {
        int opcao = 0;

        MenuListaMoedas.exibir();

        System.out.println();
        System.out.print("Digite a posição da moeda que deseja retirar do cofrinho, ou digite 0(zero) para cancelar: ");

        opcao = Principal.ENTRADA.nextInt();

        if(opcao == 0)
        {
            return;
        }

        try {
            Principal.COFRINHO.removerNaPosicao(opcao - 1);
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println();
            System.out.println("A posição digitada não existe.");
        }

        MenuListaMoedas.exibir();
    }
}