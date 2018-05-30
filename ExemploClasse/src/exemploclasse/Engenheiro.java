package exemploclasse;

public class Engenheiro extends Funcionario {

    @Override
    public double calcSal() {
        return super.getValor() * 180;
    }

    @Override
    public String toString() {
        return "Dados Engenheiro: " + super.toString() + "\n"
                + "Salario: " + this.calcSal();
    }
    
    
    
    
}
