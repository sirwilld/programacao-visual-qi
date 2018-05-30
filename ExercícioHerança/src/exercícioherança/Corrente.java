package exercícioherança;

public class Corrente extends Conta{

    @Override
    public double calcJuros() {
        return super.getValorEmConta() * 0.0427;
    }

    @Override
    public String toString() {
        return "Corrente: " + super.toString() + "\n"
                + "Juros: " + this.calcJuros();
    }
}
