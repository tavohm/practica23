package practica23;

/**
 *
 * @author ghernandez
 */
public class Libro {
    // atributos
    private String Autor;
    private String Titulo;
    private String ISBN;
    private int Paginas;
    
    /**
     * Constructor vacío.
     */
    public Libro(){}

    public Libro(String Autor, String Titulo, String ISBN, int Paginas) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Paginas = Paginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "Autor=" + Autor + ", Titulo=" + Titulo + ", ISBN=" + ISBN + ", Paginas=" + Paginas + '}';
    }
    
    
}
