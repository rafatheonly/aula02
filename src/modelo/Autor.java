package modelo;

import java.time.LocalDate;

/**
 *
 * @author Rafael
 */
public class Autor {

    private String nome;
    private LocalDate dataNascimento;

    public Autor(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + "data: " + getDataNascimento();
    }
}
