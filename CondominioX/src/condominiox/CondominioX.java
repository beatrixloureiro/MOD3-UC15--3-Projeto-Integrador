package condominiox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CondominioX {
    
    private Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3306/CONDOMINIOX";
    private static final String USER = "root";
    private static final String PASSWORD = "Senha1234";
    
    public boolean conectar() {    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            conn.setAutoCommit(true); // Habilita o commit automático
            System.out.println("Banco conectado com sucesso");
            return true;
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não está disponível para acesso ou não existe");
            return false;
        } catch (SQLException ex) {
            System.out.println("Erro na conexão com o banco de dados: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    // Método para retornar a conexão
    public Connection getConnection() {
        if (conn == null || !isConnectionValid()) {
            if (!conectar()) {
                System.out.println("Falha ao conectar ao banco de dados.");
                return null; // Retorna null se a conexão falhar
            }
        }
        return conn;
    }

    // Método para verificar se a conexão está válida
    private boolean isConnectionValid() {
        try {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            return false; // Se houver uma exceção, considera que a conexão não é válida
        }
    }
}