import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Operacoes {

  // inicializa a classe numero.
  Numero primeiroNumero = new Numero();
  Numero segundoNumero = new Numero();
  Scanner scan = new Scanner(System.in);

  // construtor
  public Operacoes() {
    // coloca para que a calculadora utilize a padrão americano de ponto e virgula;
    scan.useLocale(Locale.US);
  }

  // metordos da classe operação
  // metodo soma
  public float somaValor() {
    System.out.printf("%ndigite o Primerio Numero da Operação:");
    primeiroNumero.setValor(verificaNumero());
    System.out.printf("%ndigite o Segundo Numero da Operação:");
    segundoNumero.setValor(verificaNumero());
    return primeiroNumero.getValor() + segundoNumero.getValor();
  }

  // metudo de subtração do valor
  public float subitracaoValor() {
    System.out.printf("%ndigite o Primerio Numero da Operação:");
    primeiroNumero.setValor(verificaNumero());
    System.out.printf("%ndigite o Segundo Numero da Operação:");
    segundoNumero.setValor(verificaNumero());
    return primeiroNumero.getValor() - segundoNumero.getValor();
  }

  // metodo de multiplicação de valor
  public float multiplicarValor() {
    System.out.printf("%ndigite o Primerio Numero da Operação:");
    primeiroNumero.setValor(verificaNumero());
    System.out.printf("%ndigite o Segundo Numero da Operação:");
    segundoNumero.setValor(verificaNumero());
    return primeiroNumero.getValor() * segundoNumero.getValor();
  }

  // metodo quadrado de um numero
  public float quadradoDeUmNumero() {
    System.out.printf("%ndigite o número que será elevado ao  quadrado:");
    primeiroNumero.setValor(verificaNumero());
    ;
    return primeiroNumero.getValor() * primeiroNumero.getValor();
  }

  // metodo para a divisão de um número
  public float divisaoNumero() {
    System.out.printf("%ndigite o Primerio Numero da Operação:");
    primeiroNumero.setValor(verificaNumero());
    System.out.printf("%ndigite o Segundo Numero da Operação:");
    segundoNumero.setValor(verificaNumero());
    return primeiroNumero.getValor() / segundoNumero.getValor();
  }
// função que faz o tratamento de erro caso o usuário insira algum numero com o formato errado;
  public float verificaNumero() {
      try { 
        return scan.nextFloat();
      } catch (InputMismatchException err) {
          System.out.printf("%n O número que você digitou é invalido! por favor utilize o ' . '(ponto) para separação de casas decimais.");
      }
      return 0;
  }

}
