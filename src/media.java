import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double nota1, nota2, media;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a 1ª nota: ");
    nota1 = entrada.nextFloat();
    System.out.print("Digite a 2ª nota: ");
    nota2 = entrada.nextFloat();
    media = (nota1 + nota2) / 2;
    if (media < 6) {
      System.out.print("Você foi reprovado, sua nota foi: " + media);
      
    }
    
    
    
      
     
      
      
    
  }
}