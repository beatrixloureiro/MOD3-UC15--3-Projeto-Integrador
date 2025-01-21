package condominiox;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TabelaReserva extends JFrame {

    private JTable tblReservaAreaC;
    private DefaultTableModel tableModel;

    // Construtor padrão
    public TabelaReserva() {
        setTitle("Tabela de Reservas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configuração da tabela
        tableModel = new DefaultTableModel(new Object[][]{},
            new String[]{"Id_Reserva", "Morador", "Area Comum", "Bloco", "Data"}) {
            Class[] types = new Class[]{
                String.class, String.class, String.class, String.class, String.class
            };

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
        tblReservaAreaC = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tblReservaAreaC);

        // Adiciona o JScrollPane ao JFrame
        add(scrollPane, BorderLayout.CENTER);
    }

    // Método para preencher a tabela com dados
    public void preencherTabela(List<Reserva> reservas) {
        // Limpa a tabela existente
        tableModel.setRowCount(0);

        // Adiciona as reservas na tabela
        for (Reserva reserva : reservas) {
            tableModel.addRow(new Object[]{
                    String.valueOf(reserva.getId()), // Convertendo para String
                    reserva.getNomeUsuario(),
                    reserva.getNomeAreaComum(),
                    reserva.getBloco(),
                    reserva.getDataReserva().toString() // Convertendo a data para String
            });
        }
    }

    // Método principal 
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            TabelaReserva frame = new TabelaReserva();
            frame.setVisible(true);

            try (Connection conn = new CondominioX().getConnection()) {
                List<Reserva> reservas = Reserva.buscarTodasReservas(conn);
                frame.preencherTabela(reservas);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    }
}