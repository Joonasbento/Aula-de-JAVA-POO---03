public class Livro03 {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroDePaginas;
    private float valordeCompra;

    public String getTitulo() {
        return titulo;
    }

    public Livro03(String titulo, String autor, String isbn, int numeroDePaginas, float valordeCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.valordeCompra = valordeCompra;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public float getValordeCompra() {
        return valordeCompra;
    }

    public void setValordeCompra(float valordeCompra) {
        this.valordeCompra = valordeCompra;
    }

}
