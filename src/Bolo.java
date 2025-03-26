public class Bolo {
    // atributos (caracterizados do objeto)
    private String sabor;
    private int camadas;
    private double preco;
    private boolean disponivel;


    // construtor (inicializar o objeto)
    public Bolo(String sabor, int camadas, double preco) {
        this.sabor = sabor;
        this.camadas = camadas;
        this.preco = preco;
        this.disponivel = false;     //bolo inicia como não "disponível"
    }

    // Métodos (ações/comportamentos)
    public void preparar() {
        System.out.println("Preparando bolo de " + sabor + " com " + camadas + " camadas.");
        disponivel = true; //altera o estado do objeto
    }

    public void exibirDetalhes() {
        System.out.println("Sabor:" + sabor);
        System.out.println("Camadas:" + camadas);
        System.out.println("Preço:" + preco);
        System.out.println("Diponível: " + (disponivel ? "Sim" : "Não") + "\n");
    }

    // Getters
    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPreco(double preco) {
        if (preco > 0) { //Validação do preço
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }


    // Método principal para teste
    public static void main(String[] args) {
        // Criando objetos (instâncias)
        Bolo boloFesta = new Bolo("Chocolate",3,120.0);
        Bolo boloSimples = new Bolo("Morango", 1 , 45.0);

        // Testando métodos
        System.out.println("--- Antes do Preparo ---");
        boloFesta.exibirDetalhes();
        boloSimples.exibirDetalhes();

        // Preparando os bolos
        boloFesta.preparar();
        boloSimples.preparar();

        System.out.println("--- Após o Preparo ---");
        boloFesta.exibirDetalhes();
        boloSimples.exibirDetalhes();

        // Testando getters
        System.out.println(boloSimples.getSabor());
        System.out.println(boloSimples.getPreco());

        // Testando setters
        boloFesta.setPreco(150.0);
        boloFesta.setSabor("Baunilha");

        System.out.println("---Após Alterações ---");
        boloFesta.exibirDetalhes();
    }
}
