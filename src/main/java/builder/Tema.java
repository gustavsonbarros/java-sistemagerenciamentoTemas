package builder;

public class Tema {
    private final String corDeFundo;
    private final String corDaFonte;
    private final String nomeDaFonte;
    private final int tamanhoDaFonte;

    private Tema(TemaBuilder builder) {
        this.corDeFundo = builder.corDeFundo;
        this.corDaFonte = builder.corDaFonte;
        this.nomeDaFonte = builder.nomeDaFonte;
        this.tamanhoDaFonte = builder.tamanhoDaFonte;
    }

    // Getters
    public String getCorDeFundo() { return corDeFundo; }
    public String getCorDaFonte() { return corDaFonte; }
    public String getNomeDaFonte() { return nomeDaFonte; }
    public int getTamanhoDaFonte() { return tamanhoDaFonte; }

    @Override
    public String toString() {
        return "Tema{" +
                "corDeFundo='" + corDeFundo + '\'' +
                ", corDaFonte='" + corDaFonte + '\'' +
                ", nomeDaFonte='" + nomeDaFonte + '\'' +
                ", tamanhoDaFonte=" + tamanhoDaFonte +
                '}';
    }

    // Builder
    public static class TemaBuilder {
        private String corDeFundo;
        private String corDaFonte;
        private String nomeDaFonte;
        private int tamanhoDaFonte;

        public TemaBuilder comCorDeFundo(String cor) {
            this.corDeFundo = cor;
            return this;
        }

        public TemaBuilder comCorDaFonte(String cor) {
            this.corDaFonte = cor;
            return this;
        }

        public TemaBuilder comFonte(String nome, int tamanho) {
            this.nomeDaFonte = nome;
            this.tamanhoDaFonte = tamanho;
            return this;
        }

        public Tema build() {
            return new Tema(this);
        }
    }
}