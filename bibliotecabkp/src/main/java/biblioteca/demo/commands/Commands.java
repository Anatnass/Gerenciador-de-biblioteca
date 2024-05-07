package biblioteca.demo.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import biblioteca.demo.service.Controller;

@ShellComponent
public class Commands {
    Controller controller = new Controller();

    @ShellMethod(key = "1", value = "Cadastrar Pessoa")
    public String cadastrarPessoa(
            @ShellOption(help = "Nome da pessoa") String nomePessoa) {

        return controller.cadastrarPessoa(nomePessoa);
    }

    @ShellMethod(key = "2", value = "Cadastrar Livro")
    public String cadastrarLivro(
            @ShellOption(help = "Nome do Livro") String nome,
            @ShellOption(help = "Autor do Livro") String autor) {

        return controller.cadastrarLivro(nome, autor);
    }

    @ShellMethod(key = "3", value = "Listar Livro")
    public String listarLivros() {
        return controller.listarLivros();
    }

    @ShellMethod(key = "4", value = "Emprestar Livro")
    public String emprestarLivros() {
        return controller.emprestarLivros();
    }

    @ShellMethod(key = "5", value = "Registrar Devolução")
    public String registrarDevolucao() {
        return controller.registrarDevolucao();
    }
}
