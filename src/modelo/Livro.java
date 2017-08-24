package modelo;

import java.time.LocalDate;

/**
 *
 * @author Rafael
 */
public class Livro {

    private String titulo;
    private String isbn;
    private Autor[] autores = new Autor[6];
    private Capitulo[] capitulos = new Capitulo[100];

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int adicionarCapitulo(Capitulo cap) {
        
        return 1;
    }
    
    public int removerCapitulo(Capitulo cap){
        return 1;
    }
    
    public int adicionarAutor(Autor aut) {  
        
        setAutores(aut);        
        return 1;
    }
   
    public int removerAutor(Autor aut) {
        return 1;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

}