package teacher.lista_ligada;
public class ProgramaCliente {
    public static void main(String []args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
        clientes.adicionar(new Cliente("123", "João"));

        
    }   
}