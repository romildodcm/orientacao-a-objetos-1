public class Passageiro {
    private String nome; // Fulano
    private String identidade; // 15225825925
    private String assento; // 1A
    private boolean bagagem; // sim ou não

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getIdentidade() {
        return this.identidade;
    }

    public void setIdentidade(String n) {
        this.identidade = n;
    }

    public String getAssento() {
        return this.assento;
    }

    public void setAssento(String n) {
        this.assento = n;
    }

    public boolean getBagagem() {
        return this.bagagem;
    }

    public void setBagagem(boolean n) {
        this.bagagem = n;
    }
}
