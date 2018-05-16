package libreria;
public class Libros {
    private long codisbn;
    private String titulo;
    private int numpag;
    private int precio;
    private String  año;
    private String  categoria;
    private String  autor;
    private String  idioma;
    private String editorial;
    
    public Libros(){}

    public Libros(long codisbn, String titulo, int numpag, int precio, String año, String categoria, String autor, String idioma, String editorial) {
        this.codisbn = codisbn;
        this.titulo = titulo;
        this.numpag = numpag;
        this.precio = precio;
        this.año = año;
        this.categoria = categoria;
        this.autor = autor;
        this.idioma = idioma;
        this.editorial = editorial;
    }

    public long getCodisbn() {
        return codisbn;
    }

    public void setCodisbn(long codisbn) {
        this.codisbn = codisbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libros{" + "codisbn=" + codisbn + ", titulo=" + titulo + ", numpag=" + numpag + ", precio=" + precio + ", a\u00f1o=" + año + ", categoria=" + categoria + ", autor=" + autor + ", idioma=" + idioma + ", editorial=" + editorial + '}';
    }
    
    
    
}
