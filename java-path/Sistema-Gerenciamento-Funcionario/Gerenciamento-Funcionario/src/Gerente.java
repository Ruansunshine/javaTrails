public class Gerente  extends Funcionario{

    public Gerente(String nome, String cargo, int salario) {
        super(nome, cargo, salario);
    }
    @Override
    public double calcularBonus(){
        return getSalario() * 0.10;
    }
}
