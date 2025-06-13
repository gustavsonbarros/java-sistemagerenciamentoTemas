package factory;

import builder.Tema;

public class GerenciadorMacOS extends GerenciadorDeTemas {
    private static GerenciadorMacOS instance;

    private GerenciadorMacOS() {}

    public static GerenciadorMacOS getInstance() {
        if (instance == null) {
            instance = new GerenciadorMacOS();
        }
        return instance;
    }

    @Override
    public Botao criarBotao() {
        if (temaAtivo == null) {
            throw new IllegalStateException("Nenhum tema ativo definido");
        }
        return new BotaoMacOS(temaAtivo.getCorDeFundo(), temaAtivo.getCorDaFonte());
    }
}