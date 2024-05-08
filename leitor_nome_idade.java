import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Digite seu nome: ");
    String nome = leia.nextLine();

    System.out.println("Digite sua idade: ");
    int idade = leia.nextInt();

    System.out.println("O nome digitado foi: " + nome +  " e a idade digitada foi: " + idade);
  }
}