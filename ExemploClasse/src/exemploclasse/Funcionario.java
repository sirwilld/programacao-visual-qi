package exemploclasse;

public abstract class Funcionario {
    private int cod;
    private String nome;
    private String cpf;
    private Double valor;
    
    public abstract double calcSal();

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
//        return "Funcionario{" + "cod=" + cod + ", nome=" + nome + ", cpf=" + cpf + '}';
        return "\n"
                + "Funcionario: \n"
                + "Cod: " + this.cod + "\n"
                + "Nome: " + this.nome + "\n"
                + "CPF: " + this.cpf;
    }
    
    
}
