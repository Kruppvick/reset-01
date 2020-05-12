public class App {

    public static void main(String[] args) {

        Livro marleyEeu = new Livro("Marley e Eu", "Johm Grogan ", Categoria.ROMANCE, Status.DISPONIVEL);
        Livro queridoJohn = new Livro("Querido John", "Nichilas Sparks", Categoria.ROMANCE, Status.EM_USO);
        Livro aUltimaMusica = new Livro("A última música", "Nicholas Sparks", Categoria.ROMANCE, Status.EMPRESTADO);
        Livro sherlockHolmes = new Livro("As aventuras de Sherlock Holmes", "Arthur Conan Doyle", Categoria.SUSPENSE, Status.EMPRESTADO);
        Livro oContodaAia = new Livro("O conto da Aia", "Seila quem", Categoria.TERROR, Status.DISPONIVEL);

        System.out.println(marleyEeu.toString());
    }
}
