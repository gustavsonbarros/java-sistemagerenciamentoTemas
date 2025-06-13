package factory;

import builder.Tema;

public abstract class GerenciadorDeTemas {
    protected Tema temaAtivo;

    public void setTemaAtivo(Tema tema) {
        this.temaAtivo = tema;
    }

    public Tema getTemaAtivo() {
        return temaAtivo;
    }

    public abstract Botao criarBotao();


}
