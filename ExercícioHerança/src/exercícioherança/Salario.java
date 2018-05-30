package exercícioherança;

public class Salario extends Conta{
    private boolean portabilidade;
    private String bancoDestino;

    
    public boolean isPortabilidade() {
        return portabilidade;
    }

    public void setPortabilidade(boolean portabilidade) {
        this.portabilidade = portabilidade;
    }

    public String getBancoDestino() {
        return bancoDestino;
    }

    public void setBancoDestino(String bancoDestino) {
        this.bancoDestino = bancoDestino;
    }

    @Override
    public double calcJuros() {
        return super.getValorEmConta() * 0.0427;
    }

    @Override
    public String toString() {
        return "Poupança: " + super.toString() + "\n"
                + "Juros: " + this.calcJuros()
                + "Salario{" + "portabilidade=" + portabilidade + ", bancoDestino=" + bancoDestino + '}';
    }
    
    
    
}
