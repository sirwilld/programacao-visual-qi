package exercícioherança;

public abstract class Conta {
    private int nroConta;
    private String cliente;
    private String cpf;
    private String agencia;
    private Double valorEmConta;
    
    public abstract double calcJuros();
    
    public int getNroConta() {
        return nroConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getValorEmConta() {
        return valorEmConta;
    }

    public void setValorEmConta(Double valorEmConta) {
        this.valorEmConta = valorEmConta;
    }

    
}
