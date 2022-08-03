import java.util.Scanner;

public class Operacoes {

  private float resultado;
  // inicializa a classe numero.
  Numero primeiroNumero = new Numero();
  Numero segundoNumero = new Numero();
  Scanner scan = new Scanner(System.in);

   // construtor
  public Operacoes() {
    this.resultado = 0.0f;
  }

  // metordos da classe operação 
  // metodo soma 
  public float somaValor() {
    System.out.printf("%ndigite o Primerio Numero da Operação:");
    primeiroNumero.setValor(scan.nextFloat());
    System.out.printf("%ndigite o Segundo Numero da Operação:");
    segundoNumero.setValor(scan.nextFloat());
    return this.resultado =  primeiroNumero.getValor() + segundoNumero.getValor();
  }
  // metudo de subtração do valor
  public float subitracaoValor() {
    System.out.printf("%ndigite o Primerio Numero da Operação:");
    primeiroNumero.setValor(scan.nextFloat());
    System.out.printf("%ndigite o Segundo Numero da Operação:");
    segundoNumero.setValor(scan.nextFloat());
    return this.resultado =  primeiroNumero.getValor() - segundoNumero.getValor();
  }
  // metodo de multiplicação de valor
  public float multiplicarValor() {
    System.out.printf("%ndigite o Primerio Numero da Operação:");
    primeiroNumero.setValor(scan.nextFloat());
    System.out.printf("%ndigite o Segundo Numero da Operação:");
    segundoNumero.setValor(scan.nextFloat());
    return this.resultado =  primeiroNumero.getValor() * segundoNumero.getValor();
  }
  // metodo quadrado de um numero
  public float quadradoDeUmNumero () {
    System.out.printf("%ndigite o número que será elevado ao  quadrado:");
    primeiroNumero.setValor(scan.nextFloat());
   ;
    return this.resultado =  primeiroNumero.getValor() *primeiroNumero.getValor();
  }
  // metodo para a divisão de um número
  public float divisaoNumero() {
    System.out.printf("%ndigite o Primerio Numero da Operação:");
    primeiroNumero.setValor(scan.nextFloat());
    System.out.printf("%ndigite o Segundo Numero da Operação:");
    segundoNumero.setValor(scan.nextFloat());
    return this.resultado =  primeiroNumero.getValor() / segundoNumero.getValor();
  }
  
}
