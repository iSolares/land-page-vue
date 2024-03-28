import java.util.Date;
public class Reserva{

        private String nome_cliente;
        private Date data_hora;
        private String email;
        private String telefone;

        public Reserva(){}
        public Reserva(String nome_cliente, Date data_hora, String email, String telefone){
            this.nome_cliente = nome_cliente;
            this.data_hora = data_hora;
            this.email = email;
            this.telefone = telefone;
        }


        public String getNome_cliente() {
            return nome_cliente;
        }
        public void setNome_cliente(String nome_cliente) {
            this.nome_cliente = nome_cliente;
        }


        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }


        public String getTelefone() {
            return telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }


        public Date getData_hora() {
            return data_hora;
        }
        public void setData_hora(Date data_hora) {
            this.data_hora = data_hora;
        }



        
}