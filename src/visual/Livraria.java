package visual;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import modelo.Autor;
import modelo.Capitulo;
import modelo.Livro;

/**
 *
 * @author Rafael
 */
public class Livraria {

    Autor autor;   
    Livro livro;
    Livro[] livros = new Livro[10];

    public void menu() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        boolean continua = true;

        while (continua) {
            Thread.sleep(600);
            System.out.println("\tMENU - PROFESSOR\n "
                    + "1. Cadastrar novo livro\n "
                    + "2. Remover livro do acervo\n "
                    + "3. Listar acervo\n "
                    + "4. Resetar livraria\n "
                    + "5. Modificar Livro do Acervo\n "
                    + "6. Listar capítulos de livro\n "
                    + "9. Sair\n");

            System.out.print("Escolha sua opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    int numero = cadastrarLivro();
                    if (numero == 1) {
                        System.out.println("OK");
                    }
                    break;
                case 2:
                    for (int i = 0; i < livros.length; i++) {
                        System.out.println(livros[i]);
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                case 6:

                    break;
                case 9:
                    System.out.println("Você esta saindo do sistema...");
                    continua = false;
                    break;
                default:
                    System.err.println("Você digitou um número inválido!");
                    break;
            }
        }
    }

    public int cadastrarLivro() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o Título do livro: ");
        String titulo = entrada.nextLine();
        System.out.print("Digite o ISBN: ");
        String isbn = entrada.nextLine();
        livro = new Livro(titulo, isbn);
        cadastrarAutores(livro);
        cadastrarCapitulos(livro);
        for (int i = 0; i < livros.length; i++) {
            livros[i] = livro;
        }
        return 1;
    }

    public void cadastrarAutores(Livro livro) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        String nome;

        System.out.print("Digite o número de autores a cadastrar: ");
        int numero = entrada.nextInt();
        int numeroTotal = numero;

        while (numero > 0) {
            System.out.println("Cadastro de Autor (" + contador + "/" + numeroTotal + ")");
            System.out.print("Digite o nome do autor: ");
            entrada.nextLine();
            nome = entrada.nextLine();
            System.out.print("Digite a data de nascimento do autor: ");
            LocalDate data = stringToDate(entrada.nextLine());
            numero--;
            contador++;
            autor = new Autor(nome);
            autor.setDataNascimento(data);
            int num = livro.adicionarAutor(autor);
            if (num == 1) {
                System.out.println("Ok Autor aceito!");
            } else {
                System.out.println("Algo deu errado!");
            }
        }
    }

    public void cadastrarCapitulos(Livro livro) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        String titulo;
        String texto;

        System.out.print("Digite o número de capítulos a cadastrar: ");
        int numero = entrada.nextInt();
        int numeroTotal = numero;
        while (numero > 0) {
            System.out.println("Cadastro de Capítulos (" + contador + "/" + numeroTotal + ")");
            System.out.print("Digite o titulo do capítulo: ");
            titulo = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Digite o texto do capítulo: ");
            texto = entrada.nextLine();
            numero--;
            contador++;
            int num = livro.adicionarCapitulo(titulo, texto);
            if (num == 1) {
                System.out.println("Ok Capitulo aceito!");
            } else {
                System.out.println("Algo deu errado!");
            }
        }
    }

    public LocalDate stringToDate(String dataString) {
        DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataString, formatacaoData);
        return data;
    }
}
