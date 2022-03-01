import java.io.*;

public class SistemaCompanhia {
    private Companhia cia;
    private BufferedReader reader;

    public static void main(String[] args) throws Exception {
        SistemaCompanhia sc = new SistemaCompanhia();
        sc.cia = new Companhia();

        sc.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--------------------------- MENU INICIAL ---------------------------");
        // Nome cia
        System.out.print("Informe o nome da companhia: ");
        sc.cia.setNome(sc.reader.readLine());

        // Telefone
        System.out.print("Telefone: ");
        sc.cia.setTelefone(sc.reader.readLine());

        // Loop menu
        sc.menu();
    }

    public void menu() throws Exception {
        String opcao = "";
        while (!opcao.equals("5")) {
            System.out.println("------------------------------- MENU -------------------------------");
            System.out.println("\t[1] Cadastrar voo;");
            System.out.println("\t[2] Listar voos;");
            System.out.println("\t[3] Listar passageiros de um voo;");
            System.out.println("\t[4] Exibir assentos livres em um voo;");
            System.out.println("\t[5] Sair.");
            System.out.print("\nDigite a opção desejada: ");
            opcao = this.reader.readLine();

            if (opcao.equals("1")) {
                System.out.println("--------------------------- Cadastrar Voo --------------------------");
                this.cadastrarVoo();
            } else if (opcao.equals("2")) {
                System.out.println("---------------------------- Listar Voos ---------------------------");
                this.listarVoos();
            } else if (opcao.equals("3")) {
                System.out.println("------------------- Listar Passageiros de Um Voo -------------------");
                this.listarPax();
            } else if (opcao.equals("4")) {
                System.out.println("----------------- Exibir assentos livres em um voo -----------------");
                this.assentosLivres();
            } else if (opcao.equals("5")) {
                System.out.println("----------------------------- Saindo... ----------------------------");
            } else {
                System.out.println("************************* Opcao invalida... ************************");
            }
        }
    }

    public void cadastrarVoo() {
        try {
            Voo v = new Voo();

            System.out.print("Voo: ");
            v.setVoo(this.reader.readLine());

            System.out.print("Matrícula da Aeronave: ");
            v.setMatriculaAeronave(this.reader.readLine());

            System.out.print("Quantidade de passageiros: ");
            String quantidadePassageiros = this.reader.readLine();

            v.setQtdePassageiros(Integer.parseInt(quantidadePassageiros));

            System.out.println("-------------------- Cadastrar Passageiros do Voo ------------------");
            for (int i = 0; i < v.assentosLivres(); i++) {
                System.out.printf("Cadastrando passageiro %d/%d:%n", i + 1, v.getQtdePassageiros());
                // nome
                System.out.print("Nome do passageiro: ");
                String nomePax = this.reader.readLine();

                // nome em branco -> para de gravar pax
                if (nomePax.equals("")) {
                    break;
                }

                Passageiro p = new Passageiro();
                p.setNome(nomePax);

                // id
                System.out.print("Identidade do passageiro: ");
                p.setIdentidade(this.reader.readLine());

                // assento
                System.out.print("Assento: ");
                p.setAssento(this.reader.readLine());

                // bagagem
                System.out.println("O passageiro despachou bagagem? (sim/não)");
                String bagagem = this.reader.readLine();
                if (bagagem.equals("sim")) {
                    p.setBagagem(true);
                } else {
                    p.setBagagem(false);
                }

                if (v.setPassageiro(p)) {
                    System.out.println("Passageiro cadastrado com sucesso!");
                } else {
                    System.out.println("Passageiro não cadastrado. Voo cheio.");
                }
                System.out.println("--------------------------------------------------------------------");
            }
            this.cia.setVoo(v);
        } catch (Exception cia) {
            System.out.println("Formato invalido..." + cia.getMessage());
        }
    }

    public void listarVoos() throws Exception {
        if (this.cia.getQtdeVoos() > 0) {
            System.out.println("Voos da companhia:");
            for (int i = 0; i < this.cia.getQtdeVoos(); i++) {
                String linha = "Voo: " + this.cia.getVoo(i).getVoo();

                System.out.print(linha);

                linha = " - Aeronave: " + this.cia.getVoo(i).getMatriculaAeronave();
                System.out.print(linha);

                linha = " - Passageiros a bordo: " + this.cia.getVoo(i).getPassageirosABordo();
                System.out.print(linha + "\n");
            }
        } else {
            System.out.println("A companhia ainda não tem voo cadastrado.");
        }
    }

    public void listarPax() {
        try {
            if (this.cia.getQtdeVoos() > 0) {
                boolean achou = false;
                System.out.print("Informe o voo: ");
                String vooId = this.reader.readLine();

                for (int i = 0; i < this.cia.getQtdeVoos(); i++) {
                    Voo v = this.cia.getVoo(i);

                    if (v.getVoo().equals(vooId)) {
                        System.out.println("Passageiros do voo:");
                        int max = v.getPassageirosABordo();
                        for (int index = 0; index < max; index++) {
                            String linha = "Nome: " + v.getPassageiro(index).getNome();
                            System.out.print(linha);

                            linha = " - Identidade: " + v.getPassageiro(index).getIdentidade();
                            System.out.print(linha);

                            linha = " - Assento: " + v.getPassageiro(index).getAssento();
                            System.out.print(linha);

                            boolean bag = v.getPassageiro(index).getBagagem();
                            if (bag) {
                                linha = " - Bagagem despachada: sim";
                            } else {
                                linha = " - Bagagem despachada: não";
                            }
                            System.out.println(linha);
                        }
                        achou = true;
                        break;
                    }
                }
                if (!achou) {
                    System.out.println("Voo não encontrado.");
                }
            } else {
                System.out.println("A companhia ainda não tem voo cadastrado.");
            }
        } catch (Exception cia) {
            System.out.println("Formato invalido..." + cia.getMessage());
        }
    }

    public void assentosLivres() {
        try {
            if (this.cia.getQtdeVoos() > 0) {
                boolean achou = false;
                System.out.print("Informe o voo: ");
                String vooId = this.reader.readLine();
    
                for (int i = 0; i < this.cia.getQtdeVoos(); i++) {
                    Voo v = this.cia.getVoo(i);
    
                    if (v.getVoo().equals(vooId)) {
                        int livres = v.assentosLivres();
                        String linha = "Assentos livres no voo: " + livres;
                        System.out.println(linha);
    
                        achou = true;
                        break;
                    }
                }
                if (!achou) {
                    System.out.println("Voo não encontrado.");
                }
            }else{
                System.out.println("A companhia ainda não tem voo cadastrado.");
            }
        } catch (Exception cia) {
            System.out.println("Formato invalido..." + cia.getMessage());
        }
    }

}
