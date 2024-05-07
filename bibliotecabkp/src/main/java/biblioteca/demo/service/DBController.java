package biblioteca.demo.service;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBController {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:mem:testdb";

    // Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public String CadastrarLivro(String nomeDoLivro, String autor) {
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO LIVROS (LIVRO_ID, NOME, AUTOR) VALUES (2, '" + nomeDoLivro + "', '" + autor
                    + "')";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            return "Livro cadastrado com sucesso!";
        } catch (SQLException se) {
            se.printStackTrace();
            return "Erro ao cadastrar livro!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao cadastrar livro!";
        }
    }

    public String ListarLivros() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM LIVROS";
            ResultSet rs = stmt.executeQuery(sql);
            String result = "";
            while (rs.next()) {
                result += "ID: " + rs.getInt("LIVRO_ID") + " Nome: " + rs.getString("NOME") + " Autor: "
                        + rs.getString("AUTOR") + "\n";
            }
            rs.close();
            stmt.close();
            conn.close();
            return result;
        } catch (SQLException se) {
            se.printStackTrace();
            return "Erro ao listar livros!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao listar livros!";
        }
    }

    public String CadastrarPessoa(String nomePessoa) {
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO USUARIOS (PESSOA_ID, NOME) VALUES (1, '" + nomePessoa + "')";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            return "Pessoa cadastrada com sucesso!";
        } catch (SQLException se) {
            se.printStackTrace();
            return "Erro ao cadastrar pessoa!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao cadastrar pessoa!";
        }
    }

    public String ListarPessoas() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM PESSOAS";
            ResultSet rs = stmt.executeQuery(sql);
            String result = "";
            while (rs.next()) {
                result += "ID: " + rs.getInt("PESSOA_ID") + " Nome: " + rs.getString("NOME") + "\n";
            }
            rs.close();
            stmt.close();
            conn.close();
            return result;
        } catch (SQLException se) {
            se.printStackTrace();
            return "Erro ao listar pessoas!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao listar pessoas!";
        }
    }

    public String EmprestarLivro() {
        return "Emprestar Livro...";
    }

    public String DevolverLivro() {
        return "Devolver Livro...";
    }
}
