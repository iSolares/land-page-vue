import java.sql.*;
import java.util.Date;


public class Restaurante{
    
    private static String URL = 
    "jdbc:mysql://localhost:3306/cadastro";
    private static String USERNAME = "root";
    private static String PSWRD = "202713";

    private Connection conn = null;
    private Statement sqlmngr = null;

    public void OpenDataBase(){

        try{
            conn = DriverManager.getConnection(URL, USERNAME, PSWRD);

            System.out.println("Conectado com sucesso em: " + URL);
            sqlmngr = conn.createStatement();
        } catch (Exception Error){
            System.out.println("Erro na conexão: " + Error.getMessage());
        }
    }

    public void CloseDataBase() throws SQLException{
        sqlmngr.close();
        conn.close();
    }

    public int ExecuteQuery(String sql){
        try {
            return sqlmngr.executeUpdate(sql);
        } catch (SQLException Error) {
            System.out.println("Erro na conexão: " + Error.getMessage());
        }
        return -1;
    }

    public void criarTabelaReservas() throws SQLException {
        OpenDataBase();
        String sql = "CREATE TABLE IF NOT EXISTS reservas (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "nome_cliente VARCHAR(255)," +
                     "numero_telefone VARCHAR(20)," +
                     "email VARCHAR(255)," +
                     "data_reserva TIMESTAMP" +
                     ")";
        ExecuteQuery(sql);
        CloseDataBase();
    }

    public void excluirReserva(int idReserva) throws SQLException{
        OpenDataBase();
        String sql = "DELETE FROM reservas WHERE id = ?";
        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
            preparedStatement.setInt(1, idReserva);

            int rowsDeleted = preparedStatement.executeUpdate();

            if(rowsDeleted > 0){
                System.out.println("Reserva com ID " + idReserva + " excluída com sucesso.");
            } else {
                System.out.println("Nenhuma reserva encontrada com esse ID.");
            }
        } catch (SQLException e){
            System.out.println("Erro ao excluir reserva");
        } finally {
            CloseDataBase();
        }
    }

    public void reservaExpirada() throws SQLException{
        OpenDataBase();

        String sql = "SELECT id, data_reserva FROM reservas";

        try(Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(sql)){
            Date dataAtual = new Date();

            while(resultSet.next()){
                int idReserva = resultSet.getInt("id");
                Date dataReserva = resultSet.getTimestamp("data_reserva");

                if(dataReserva.before(dataAtual)){
                    excluirReserva(idReserva);
                }
            }
        } catch(SQLException e){
            System.out.println("Erro ao verificar reservas expiradas");
        } finally {
            CloseDataBase();
        }
    }

    public void fazerReserva(Reserva reserva) throws SQLException{
        OpenDataBase();
        try(Connection conn = DriverManager.getConnection(URL, USERNAME, PSWRD)){
            String sql = "INSERT INTO reservas (nome_cliente, numero_telefone, email, data_reserva) VALUES (?, ?, ?, ?)";
            try(PreparedStatement statement = conn.prepareStatement(sql)){
                statement.setString(1, reserva.getNome_cliente());
                statement.setString(2, reserva.getTelefone());
                statement.setString(3, reserva.getEmail());
                statement.setTimestamp(4, new java.sql.Timestamp(reserva.getData_hora().getTime()));

                int rowsInserted = statement.executeUpdate();
                if(rowsInserted > 0){
                    System.out.println("Reserva realizada com sucesso para " + reserva.getNome_cliente());
                } else {
                    System.out.println("Falha ao fazer reserva");
                }
            }
        } catch (SQLException e){
            System.out.println("Erro ao fazer reserva: " + e.getMessage());
        } finally {
            CloseDataBase();
        }
    }
}