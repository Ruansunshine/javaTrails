public class Carro extends Veiculo{
    public int quantidadePortas;
    public Carro(String modelo,String marca, int ano, int quantidadePortas){
        super(modelo,marca,ano);
        this.quantidadePortas = quantidadePortas;
    }
//    public int getQuantidadePortas(){
//        return quantidadePortas;
//    }
   @Override
    public void exibirDetalhes(){
       System.out.println("Marca: " + getMarca());
       System.out.println( "Modelo: "  + getModelo());
       System.out.println( "Ano: "  + getAno());
       System.out.println( "Quantidade de porta: " + quantidadePortas);
       System.out.println( " " );
}
    @Override
    public String toString() {
        return("\n Modelo: " + getModelo() + "\n Marca: " + getMarca() + "\n Ano: " + getAno() + "\n Quantidades de Portas: " + quantidadePortas );

    }
}
