import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {
    private static final String URL = "jdbc:mysql://localhost:3306/cadastro";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "202713";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Criar conexão com o banco de dados
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexão bem-sucedida!");

            // Aqui você pode interagir com o banco de dados, como executar consultas SQL
            // Exemplo: PreparedStatement statement = connection.prepareStatement("SELECT * FROM sua_tabela");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar-se ao banco de dados: " + e.getMessage());
        } finally {
            // Fechar a conexão com o banco de dados
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
}

