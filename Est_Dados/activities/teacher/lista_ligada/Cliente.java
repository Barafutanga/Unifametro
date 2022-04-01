package activities.teacher.lista_ligada;
public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String string, String string2) {
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Cliente [nome=" + nome + "]";
    }

    
}
