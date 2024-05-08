import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int numero = leia.nextInt();

    if (numero > 0){
      System.out.print("O numero é positivo");
    }
    else if (numero < 0){
      System.out.print("O numero é negativo");
    }
    else {
      System.out.print("O numero é zero");
    }
  }
}