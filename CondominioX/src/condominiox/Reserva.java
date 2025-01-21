package condominiox;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private int id;
    private int idUsuario;
    private String nomeUsuario;
    private int idAreaComum;
    private String nomeAreaComum;
    private String bloco;
    private java.sql.Date dataReserva; 
    private Connection conn;

    
    // Construtor padrão
    public Reserva() {
    }

    // Construtor com parâmetros
    public Reserva(int id, int idUsuario, String nomeUsuario, int idAreaComum, String nomeAreaComum, String bloco, java.sql.Date dataReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.idAreaComum = idAreaComum;
        this.nomeAreaComum = nomeAreaComum;
        this.bloco = bloco;
        this.dataReserva = dataReserva;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdAreaComum() {
        return idAreaComum;
    }

    public void setIdAreaComum(int idAreaComum) {
        this.idAreaComum = idAreaComum;
    }

    public String getNomeAreaComum() {
        return nomeAreaComum;
    }

    public void setNomeAreaComum(String nomeAreaComum) {
        this.nomeAreaComum = nomeAreaComum;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public java.sql.Date getDataReserva() { // Retorna java.sql.Date similar ao codigo do monitor aula 
        return dataReserva;
    }

    public void setDataReserva(java.sql.Date dataReserva) { // Aceita java.sql.Date
        this.dataReserva = dataReserva;
    }

    // Método para buscar todas as reservas
    public static List<Reserva> buscarTodasReservas(Connection conn) throws SQLException {
        List<Reserva> reservas = new ArrayList<>();
        String query = "SELECT r.id, r.id_usuario, u.nomeUsuario, r.id_area_comum, a.nomeAreaComum, a.bloco, r.data_reserva " +
                       "FROM Reserva r " +
                       "JOIN Usuario u ON r.id_usuario = u.id " +
                       "JOIN AreaComum a ON r.id_area_comum = a.id " +
                       "ORDER BY r.data_reserva";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("id"));
                reserva.setIdUsuario(rs.getInt("id_usuario"));
                reserva.setNomeUsuario(rs.getString("nomeUsuario"));
                reserva.setIdAreaComum(rs.getInt("id_area_comum"));
                reserva.setNomeAreaComum(rs.getString("nomeAreaComum"));
                reserva.setBloco(rs.getString("bloco"));
                reserva.setDataReserva(rs.getDate("data_reserva"));
                reservas.add(reserva);
            }
        }
        return reservas;
    }
}