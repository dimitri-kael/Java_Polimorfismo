import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> listaDeLivros = new ArrayList<>();

        listaDeLivros.add(new Livro("O Peregrino", "Jeremaiah", 50.99));
        listaDeLivros.add(new Livro("Originais", "Mikaelson", 43.99));
        listaDeLivros.add(new Livro("Contos dos Greens", "Jeremaiah", 50.99));
        listaDeLivros.add(new Ebook("Como fazer bolo", "João Layer", 20.55, 2.5));
        listaDeLivros.add(new Ebook("O mistério de Greenville", "Clarissa Donlin", 23.50, 5.0));

        for(Livro livro : listaDeLivros){
            livro.exibirDetalhes();
            System.out.println();
        }

    }
}
