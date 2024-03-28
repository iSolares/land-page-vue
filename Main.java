import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, SQLException {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de reservas ativado");

        System.out.println("Nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Número do cliente: ");
        String numeroTelefone = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("Data da reserva (dd/MM/yyyy HH:mm) :");
        String dataReserva = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date dataHora = null;

        try{
            dataHora = sdf.parse(dataReserva);
        } catch (ParseException e) {
            System.out.println("Formato inválido");
        }

        Reserva reserva = new Reserva(nomeCliente, dataHora, email, numeroTelefone);

        Restaurante restaurante = new Restaurante();

        restaurante.criarTabelaReservas();

        System.out.println("Excluir qual ID?: ");
        Integer idExcluido = sc.nextInt();

        restaurante.excluirReserva(idExcluido);
        restaurante.fazerReserva(reserva);
        restaurante.reservaExpirada();
        
        sc.close();
    }
}
