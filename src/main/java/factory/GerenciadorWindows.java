package factory;

import builder.Tema;

public class GerenciadorWindows extends GerenciadorDeTemas {
    private static GerenciadorWindows instance;

    private GerenciadorWindows() {}

    public static GerenciadorWindows getInstance() {
        if (instance == null) {
            instance = new GerenciadorWindows();
        }
        return instance;
    }

    @Override
    public Botao criarBotao() {
        if (temaAtivo == null) {
            throw new IllegalStateException("Nenhum tema ativo definido");
        }
        return new BotaoWindows(temaAtivo.getCorDeFundo(), temaAtivo.getCorDaFonte());
    }
}