import java.util.Arrays;

public abstract class Moeda {
    public final String NOME;
    public final String SIMBOLO;
    public final int VALOR;

    Moeda(String nome, String simbolo, int valor, int[] valoresPossiveis) throws MoedaInexistenteException
    {
        if( ! Arrays.stream(valoresPossiveis).anyMatch(i -> i == valor))
        {
            throw new MoedaInexistenteException();
        }

        NOME = nome;
        SIMBOLO = simbolo;
        VALOR = valor;
    }

    abstract double valorEmReais();
}