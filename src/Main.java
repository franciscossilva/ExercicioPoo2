public class Main {
    public static void main(String[] args) {
    Livro livro1 = new Livro("Ficçao","Harry potter","26565425","JK");
    livro1.registroLivro();

    Livro livro2 = new Livro("Comedia","A grande Piada","212112","Jose alfredo");
    livro2.registroLivro(livro2.getISNB());

    Livro livro3 = new Livro("Auto ajuda","Biblia","355446","Varios");
    livro3.registroLivro(livro3.getISNB(),livro3.gettitulo());

    Livro livro4 = new Livro("Acao","A guerra","47647","Alberto ribas");
    livro4.registroLivro(livro4.getISNB(),livro4.gettitulo(),livro4.getgenero());
    }}