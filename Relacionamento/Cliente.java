public class Cliente {

    private String nome;
    private String idade;
    private Endereco endereço;

    public Cliente() {
    }

    public Cliente(String nome, String idade, Endereco endereço) {
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", idade=" + idade + ", endereço=" + endereço + "]";
    }

}
