package condominiox;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {

    private int id;
    private String nomeUsuario;
    private String senha;
    private String tipoUsuario;

    // Variável estática para armazenar o usuário logado
    private static Usuario usuarioLogado;

    // Construtor padrão
    public Usuario() {
    }

    // Construtor com parâmetros
    public Usuario(int id, String nomeUsuario, String senha, String tipoUsuario) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    // Método para buscar um usuário pelo nome
    public static Usuario buscarUsuarioPorNome(Connection conn, String nomeUsuario) throws SQLException {
        String sql = "SELECT * FROM Usuario WHERE nomeUsuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeUsuario);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNomeUsuario(rs.getString("nomeUsuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipoUsuario(rs.getString("tipoUsuario"));
                return usuario;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }

    // Métodos para manipular o usuário logado
    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuario) {
        usuarioLogado = usuario;
    }
}