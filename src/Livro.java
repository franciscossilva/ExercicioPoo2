public class Livro {
    private String genero;
    private String titulo;
    private  String ISNB;
    private String autor;
    public Livro(String genero,String titulo,String ISNB,String autor){
        this.genero = genero;
        this.titulo = titulo;
        this.ISNB = ISNB;
        this.autor = autor;
    }
    public  void  RegistroLivro(){
        System.out.println(" O livro foi registrado com os atributos");
        System.out.println("Genero: "+ genero);
        System.out.println("Titulo: "+ titulo);
        System.out.println("ISBN: "+ ISNB);
        System.out.println("Autor: "+ autor);
    }
    public void RegistroLivro(String ISNB){
        this.ISNB = ISNB;
        System.out.println("O livro foi resistrado com o ISNB: "+ ISNB);
        System.out.println("Genero: "+genero);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+ autor);
    }
    public void registroLivro(String ISNB,String titulo,String genero){
        this.ISNB=ISNB;
        this.titulo=titulo;
        this.genero=genero;
        System.out.println("O Livro foi registrado com o ISBN: "+ ISNB+ "0 nome´é: "+titulo+" e o genero é: "+genero);
        System.out.println("Autor: "+autor);
    }
    public void registroLivro (String ISNB,String titulo,String genero) {
        this.ISNB = ISNB;
        this.titulo = titulo;
        this.genero = genero;
        System.out.println("O livro foi registrado com o ISBN" + ISNB + "o nome é: " + titulo + " e o genero: " + genero);
        System.out.println("Autor: " + autor);
    }
    }

