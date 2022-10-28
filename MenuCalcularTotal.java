public class MenuCalcularTotal {
    public static void exibir()
    {
        double total = 0;

        MenuListaMoedas.exibir();

        for(Moeda moeda : Principal.COFRINHO.moedas())
        {
            total += moeda.valorEmReais();
        }

        System.out.println();
        System.out.println("Total no cofre é de R$" + total + " .");
    }
}