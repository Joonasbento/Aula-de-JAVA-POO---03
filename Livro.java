public class Livro {


    String titulo;
    String autor;
    String numeroDePaginas;
    String preço;
    String isbm;
   
    
   
    public Livro(String titulo, String autor, String numeroDePaginas, String preço, String isbm) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.preço = preço;
        this.isbm = isbm;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    public String getPreço() {
        return preço;
    }
    public void setPreço(String preço) {
        this.preço = preço;
    }
    public String getIsbm() {
        return isbm;
    }
    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }
    

    


    
}
