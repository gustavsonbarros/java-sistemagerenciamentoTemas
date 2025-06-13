package factory;

import builder.Tema;

public class BotaoMacOS implements Botao {
    private final String corDeFundo;
    private final String corDaFonte;

    public BotaoMacOS(String corDeFundo, String corDaFonte) {
        this.corDeFundo = corDeFundo;
        this.corDaFonte = corDaFonte;
    }
    @Override
    public void renderizar() {
        System.out.printf("Renderizando Botao estilo MacOS | Fundo: %s, Fonte: %s%n", corDeFundo, corDaFonte);
    }
}