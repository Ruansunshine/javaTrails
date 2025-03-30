public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("ruan", "Gerente", 1500);
        Funcionario dev = new Desenvolvedor("joao", "Desenvolvedor", 20000);

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Cargo: " + gerente.getCargo());
        System.out.println("Salario: " + gerente.getSalario());
        System.out.println("bonificação: " + gerente.calcularBonus());
        System.out.println("Salario mais bonificação: " + (gerente.calcularBonus() + gerente.getSalario()));

        System.out.println("");

        System.out.println("Nome: " + dev.getNome());
        System.out.println("Cargo: " + dev.getCargo());
        System.out.println("Salario: " + dev.getSalario());
        System.out.println("bonificação: " + dev.calcularBonus());
        System.out.println("Salario mais bonificação: " + (dev.calcularBonus() + dev.getSalario()));


    }
}