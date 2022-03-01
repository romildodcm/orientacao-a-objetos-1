public class Companhia {
    private String nome;
    private String telefone;
    private Voo[] vetVoos;
    private int qtdeVoos;

    public Companhia() {
        // eu preciso fazer isso?
        // Posso começar com 1 e ir incrementando?
        this.vetVoos = new Voo[120];
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String n) {
        this.telefone = n;
    }

    public int getQtdeVoos() {
        return this.qtdeVoos;
    }

    public void setQtdeVoos(int qt) {
        this.qtdeVoos = qt;
    }

    public Voo getVoo(int pos) {
        return this.vetVoos[pos];
    }

    public void setVoo(Voo t) {
        this.setQtdeVoos(this.getQtdeVoos() + 1);
        int pos = this.getQtdeVoos() - 1;
        this.vetVoos[pos] = t;
    }

}
