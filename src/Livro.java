public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println(String.format("""
                Título: %s
                Autor: %s
                Preço: %.2f""", titulo, autor, preco));
    }
}
