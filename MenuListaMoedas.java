public class MenuListaMoedas {
    public static void exibir()
    {
        int posicao = 1;

        System.out.println();
        System.out.println("Lista das Moedas Dentro do Cofrinho");
        System.out.println("Total de " + Principal.COFRINHO.moedas().size() + " moeda(s) no cofrinho.");

        for(Moeda moeda : Principal.COFRINHO.moedas())
        {
            System.out.println("[" + posicao++ +"] " + moeda.SIMBOLO + moeda.VALOR);
        }
    }
}