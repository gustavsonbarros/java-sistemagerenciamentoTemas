package factory;

import builder.Tema;

public class BotaoWindows implements Botao {
    private final String corDeFundo;
    private final String corDaFonte;

    public BotaoWindows(String corDeFundo, String corDaFonte) {
        this.corDeFundo = corDeFundo;
        this.corDaFonte = corDaFonte;
    }

    @Override
    public void renderizar() {
        System.out.printf("Renderizando Botao estilo Windows | Fundo: %s, Fonte: %s%n",
                corDeFundo, corDaFonte);
    }
}