import java.util.Scanner;

// classe para efetuar os calculos 
public class Calc { 
  static public void main(String[] args){
  
  try (Scanner scan = new Scanner(System.in)) {
    // inicializa a classe numero.
    Numero resultado = new Numero();
    // inicializa a classe de operaçoes
    Operacoes operacao = new Operacoes();
    // vareavel que vai armazenar a escolha da operação
    int qualOperacao;

    // Variavel de verificação de continuidade ou encerramento do lop que permite repetir as operações.
    int continuarOperacoa = 1;

    while(continuarOperacoa != 0){
      System.out.printf("%nIndique qual opereção você deseja realizar:");
      System.out.printf("%n 1-Somar %n 2-Subtrair %n 3-Divisão %n 4-Multiplicação %n 5-Quadrado de um numero %n 0- Sair da Aplicação:");
      qualOperacao = scan.nextInt();
      if(qualOperacao == 1){
        // chama o metoto para a soma
       resultado.setValor(operacao.somaValor());
      }else if(qualOperacao == 2){
        //chama o metoto para subtração
        resultado.setValor(operacao.subitracaoValor());
      }else if(qualOperacao == 3){
        // chama o metodo para divisão
        resultado.setValor(operacao.divisaoNumero());
      }else if(qualOperacao == 4){
        // chama o metodo para multiplicação
        resultado.setValor(operacao.multiplicarValor());
      }else if(qualOperacao == 5){
        // chama o metodo para o quadrado de um numero 
        resultado.setValor(operacao.quadradoDeUmNumero());
      }else if(qualOperacao == 0){
        // para a aplicação
        continuarOperacoa = 0;
        break;
      }
      System.out.printf("%n O resuldado da operação selecionada é %f",resultado.getValor());
      System.out.printf("%nDigite 0 se deseja para com a operação:");
      continuarOperacoa = scan.nextInt();
      System.out.printf("%n%n%n");
    }
  }
}
}