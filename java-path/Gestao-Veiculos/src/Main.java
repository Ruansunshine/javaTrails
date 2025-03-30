public class Main {
    public static void main(String[] args) {
        System.out.println(" veiculos a serem alugados ");
        Veiculo carro = new Carro("Etios", "Toyota", 2020, 4);
        Veiculo moto = new Moto("honda", "pop", 2010, 10.5);
        carro.exibirDetalhes();
        moto.exibirDetalhes();
        Cliente cliente = new Cliente();

        System.out.println("Primeiro aluguel ");
        cliente.alugarVeiculo(moto);
        double valor = cliente.calcularAluguel(5);
        System.out.println("VALOR DO ALUGUEL SEM SEGURO: " + valor);
        double valorSeguro = cliente.calcularAluguel(5, "total");
        System.out.println("VALOR DO ALUGUEL COM SEGURO: " + valorSeguro);
        cliente.exibirAluguel();

        System.out.println(" ");

        System.out.println("Segundo aluguel");
        cliente.alugarVeiculo(carro);
        double valorCarro = cliente.calcularAluguel(10);
        System.out.println("VALOR DO ALUGUEL SEM SEGURO DO CARRO: " + valorCarro);
        double valorSeguroCarro = cliente.calcularAluguel(10, "total");
        System.out.println("VALOR DO ALUGUEL COM SEGURO DO CARRO: " + valorSeguroCarro );
        cliente.exibirAluguel();
    }
}