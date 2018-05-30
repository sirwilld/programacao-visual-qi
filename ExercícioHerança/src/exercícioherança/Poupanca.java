package exercícioherança;

public class Poupanca extends Conta {

    @Override
    public double calcJuros() {
        return super.getValorEmConta() * 0.0427;
    }

    @Override
    public String toString() {
        return "Poupança: " + super.toString() + "\n"
                + "Juros: " + this.calcJuros();
    }
    
    
}
