# Notas OOI - Aula 1
## Conceitos Introdutórios
O mundo é composto por objetos, objetos possuem propriedades (atributos), funções (operações/métodos) e interagem entre si.

### Classes
Representa o conjunto de um objeto, e está associada a uma classe os seus atributos e métodos. Tipo vendedor.
### Objetos
O vendedor huehue, vendedor 1, vendedor 2, uma instância da classe vendedor.
### Atributos
a variável, fazendo um paralelo com estruturas de programação estruturada, um objeto *vendedor*, tem nome, id, permissões, etc.
### Métodos
- sempre pensar em verbo;
Operações, funções, procedimentos relacionados ao objeto. Exemplo, um vendedor vai ter método para executar uma venda, gerar NF, atualizar estoque, verificar disponibilidade, etc.
---
### Atividade em aula:
- Atributos e métodos para uma classe televisor

Classe: Televisor
Atributos:
    Marca
    Tamanho tela
    Conexões
    Controles
    Resolução
    SO
    Cor
    Memória ROM
    Memória RAM

Métodos:
    Ligar
    Desligar
    navegar menus
    Mudança de canais
    navegar volume
    VPN
    SO API
    Aplicações nativas
    Aplicações externas

Classe: Telefone
Atributos: 
    Tipo;
    Fio;
    Cor;
    Voip ou analógico;
    Modelo;

Métodos:
    Ligar; agenda; verificador de chamada perdidas; etc...


---
### Abstração
Extrar caracteristias (atributos) e comportamentos (métodos) que definem uma categoria de objeto (classe) do mundo real e que seja relevante para nosso sistema.

- Quantas caracteristicas tem uma cdeiras? (atributos)

    Material;
    cor; 
    tipo de assento; 
    tipo de encosto; 
    material do assento; 
    material do encosto;
    tem ajuste de altura ou não;
    tem ou não ajuste de encosto;
    quantidade de pés;
    tem rodinha ou não;
    certificado de ergonomia;
    LED RGB;
    Equipamento de flutuação;
    Cinto;
    Tipo de cinto;

---
### Exercicios slide
- Defina classe carro para sistema de revenda...


## Avaliações
- Uma avaliação teórica (talvez)
- 4 ou 5 atividades avaliativas.

## Introdução ao JAVA é lento*
**mas gasta menos processamento*

- Plataforma
  - Desenvolvimento
    - JDK (ou outras versões como j2ee)
      - Fonte: *.java*
      - Compila: *.class* 
  - Execução
    - JVM (JRE), a maquina virtual, runtime
### Observações

Nome da classe sempre começa com letra maiuscula, neste caso "Exemplo1":

Salvar nome do arquivo com o nome da classe, nesse caso "Exemplo1.java"

```
class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("JAVA eh lento!");
    }
}
```