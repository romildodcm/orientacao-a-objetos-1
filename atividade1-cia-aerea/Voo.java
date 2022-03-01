public class Voo {
    private String voo; // G31174
    private String matriculaAeronave; // PS-AEB
    private int qtdePassageiros; // 160
    private int passageirosABordo = 0;
    private Passageiro[] vetPax;

    // construtor

    public Voo() {
        // eu preciso fazer isso?
        // Posso começar com 1 e ir incrementando?
        this.vetPax = new Passageiro[120];
    }

    public String getVoo() {
        return this.voo;
    }

    public void setVoo(String n) {
        this.voo = n;
    }

    public String getMatriculaAeronave() {
        return this.matriculaAeronave;
    }

    public void setMatriculaAeronave(String n) {
        this.matriculaAeronave = n;
    }

    public int getQtdePassageiros() {
        return this.qtdePassageiros;
    }

    public void setQtdePassageiros(int n) {
        this.qtdePassageiros = n;
    }

    public Passageiro getPassageiro(int position) {
        return this.vetPax[position];
    }

    public boolean setPassageiro(Passageiro p) {
        boolean valor = false;

        if (this.passageirosABordo < this.qtdePassageiros) {
            // System.out.println("antes bloco do if pax");
            this.vetPax[passageirosABordo] = p;
            this.passageirosABordo++;
            // System.out.println("depois bloco if pax");
            valor = true;
        }
        // System.out.println("depois do if pax");

        return valor;
    }

    public int getPassageirosABordo() {
        return passageirosABordo;
    }

    public int assentosLivres() {
        return qtdePassageiros - passageirosABordo;
    }
}
