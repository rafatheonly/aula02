package modelo;

/**
 *
 * @author Rafael
 */
public class Capitulo {
    private String titulo;
    private String textoDescricao;

    public Capitulo() {
    }

    public Capitulo(String titulo, String textoDescricao) {
        this.titulo = titulo;
        this.textoDescricao = textoDescricao;
    }    
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the textoDescricao
     */
    public String getTextoDescricao() {
        return textoDescricao;
    }

    /**
     * @param textoDescricao the textoDescricao to set
     */
    public void setTextoDescricao(String textoDescricao) {
        this.textoDescricao = textoDescricao;
    }
    
}
