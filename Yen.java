public class Yen extends Moeda {
    public static final String NOME = "Yen";
    public static final String SIMBOLO = "¥";
    public static final int[] VALORES_POSSIVEIS = { 1, 5, 10, 50 };

    Yen(int valor) throws MoedaInexistenteException
    {
        super(NOME, SIMBOLO, valor, VALORES_POSSIVEIS);
    }

    public double valorEmReais()
    {
        return VALOR * 0.00036;
    }
}