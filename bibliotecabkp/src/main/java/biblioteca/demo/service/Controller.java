package biblioteca.demo.service;

public class Controller {
    DBController dbController = new DBController();

    public String cadastrarPessoa(String nomePessoa) {
        return "Cadastrar Pessoa:" + nomePessoa;
    }

    public String cadastrarLivro(String nome, String autor) {
        return "Cadastrar Livro: " + nome + " Autor: " + autor;
    }

    public String listarLivros() {
        return "Listar Livros...";
    }

    public String emprestarLivros() {
        return "Emprestar Livro...";
    }

    public String registrarDevolucao() {
        return "Registrar Devolução...";
    }
}
