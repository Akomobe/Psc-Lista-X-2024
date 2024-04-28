class Objeto {
    String nome;
    String[] caracteristicas;
    String[] acoes;

    Objeto(String nome, String[] caracteristicas, String[] acoes) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
        this.acoes = acoes;
    }

    void exibirCaracteristicas() {
        System.out.println("Características de " + nome + ":");
        for (String caracteristica : caracteristicas) {
            System.out.println("- " + caracteristica);
        }
    }

    void exibirAcoes() {
        System.out.println("Ações de " + nome + ":");
        for (String acao : acoes) {
            System.out.println("- " + acao);
        }
    }
}

public class Objetos {
    public static void main(String[] args) {
        Objeto[] objetos = new Objeto[10];

        objetos[0] = new Objeto("Caneca", new String[]{"Material", "Capacidade", "Cor", "Altura"},
                new String[]{"Segurar", "Beber", "Lavar", "Encher", "Esvaziar"});
        objetos[1] = new Objeto("Relógio de Pulso", new String[]{"Marca", "Tipo de exibição", "Material da pulseira", "Tamanho do mostrador"},
                new String[]{"Verificar a hora", "Ajustar o alarme", "Cronometrar", "Usar"});
        objetos[2] = new Objeto("Livro", new String[]{"Título", "Autor", "Gênero", "Número de páginas"},
                new String[]{"Ler", "Folhear", "Marcar", "Emprestar", "Devolver"});
        objetos[3] = new Objeto("Chave", new String[]{"Tamanho", "Forma", "Material", "Tipo"},
                new String[]{"Girar", "Inserir", "Trancar", "Destrancar", "Guardar"});
        objetos[4] = new Objeto("Guarda-chuva", new String[]{"Cor", "Tamanho", "Material", "Tipo de abertura"},
                new String[]{"Abrir", "Fechar", "Segurar", "Proteger", "Sacudir"});
        objetos[5] = new Objeto("Óculos", new String[]{"Modelo", "Armação", "Tipo de lente", "Cor"},
                new String[]{"Usar", "Limpar", "Ajustar", "Remover", "Guardar"});
        objetos[6] = new Objeto("Laptop", new String[]{"Marca", "Processador", "Capacidade de armazenamento", "Tamanho da tela"},
                new String[]{"Digitar", "Navegar na internet", "Assistir a vídeos", "Carregar", "Fechar"});
        objetos[7] = new Objeto("Chave de Fenda", new String[]{"Tamanho", "Tipo de ponta", "Material do cabo"},
                new String[]{"Apertar parafusos", "Soltar parafusos", "Ajustar", "Guardar"});
        objetos[8] = new Objeto("Bicicleta", new String[]{"Marca", "Tipo", "Cor", "Tamanho das rodas"},
                new String[]{"Pedalar", "Frear", "Empurrar", "Reparar", "Montar"});
        objetos[9] = new Objeto("Copo de Vidro", new String[]{"Transparente", "Capacidade", "Formato", "Espessura"},
                new String[]{"Beber", "Encher", "Esvaziar", "Quebrar", "Limpar"});

        for (Objeto objeto : objetos) {
            objeto.exibirCaracteristicas();
            objeto.exibirAcoes();
            System.out.println();
        }
    }
}
