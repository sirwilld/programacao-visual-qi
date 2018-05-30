package exemploclasse;

public class Gerente extends Funcionario {

    @Override
    public double calcSal() {
        return super.getValor() * 100;
    }

    @Override
    public String toString() {
        return "Dados do gerente: " + super.toString() + "\n"
                + "Salário: " + this.calcSal();
    }
    
    
    
}
