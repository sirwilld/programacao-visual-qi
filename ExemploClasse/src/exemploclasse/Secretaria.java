package exemploclasse;

public class Secretaria extends Funcionario{
    private int nroReunioes;

    public Secretaria(int nroReunioes) {
        this.nroReunioes = nroReunioes;
    }
    
    @Override
    public double calcSal() {
        return super.getValor() * 220;
    }

    @Override
    public String toString() {
        return "Dados da Secretaria: " + super.toString() + "\n"
                + "Saláio: " + this.calcSal() + "\n"
                + "Reuniões agendadas no mês: " + this.nroReunioes;
    }
}
