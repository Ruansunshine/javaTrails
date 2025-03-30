public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, String cargo, int salario){
        super(nome, cargo, salario);
    }
    @Override
    public double calcularBonus(){
        return getSalario() * 0.5;
    }
}
