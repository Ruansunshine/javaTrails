public class Cliente {
 private Veiculo alugar;

 public Cliente() {
     this.alugar = null;
 }
 public void alugarVeiculo(Veiculo veiculo){
     this.alugar = veiculo;
 }
 public double calcularAluguel(int dias){
     double diaria = 50.0;
     return dias * diaria;
 }
 public double calcularAluguel(int dias, String seguro) {
     double diaria = 50.0;
     double valorSeguro = 0.0;

     if ("total".equals(seguro)) {
         valorSeguro = 30.00;
     } else if ("parcial".equals(seguro)) {
         valorSeguro = 15.00;
     }
     return (dias * diaria ) + valorSeguro;

 }



 public void exibirAluguel() {
     if(this.alugar != null){
         System.out.println("Veiculo alugado com sucesso!" + alugar) ;
     }else{
         System.out.println("Veiculo nao alugado!" + alugar);
     }
 }

 }


