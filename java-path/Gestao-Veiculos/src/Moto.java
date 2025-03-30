public class Moto extends Veiculo{
  public double cilindradas;
    public Moto(String modelo, String marca, int ano, double cilindradas ) {
        super(modelo, marca, ano);
        this.cilindradas = cilindradas;
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Marca: " + getMarca());
        System.out.println( "Modelo: "  + getModelo());
        System.out.println( "Ano: "  + getAno());
        System.out.println( "Cilidradas: " + cilindradas);
        System.out.println( " " );
    }
     @Override
    public String toString() {
        return("\n Modelo: " + getModelo() + "\n Marca: " + getMarca() + "\n Ano: " + getAno() + "\n Cilindradas: " + cilindradas );

    }
}
