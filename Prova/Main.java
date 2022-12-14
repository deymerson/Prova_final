package br.com.Prova;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nomeUsuario, dataNascimento, senha;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe o nome do usuário:");
    nomeUsuario = entrada.nextLine();
    System.out.println("Informe sua data de nascimento:");
    dataNascimento = entrada.nextLine();
    System.out.println("Informe sua senha:");
    senha = entrada.nextLine();

    Redesosial redeSocial = new Redesosial (nomeUsuario, dataNascimento, senha);

    System.out.println("Digite um texto para sua primeira publicação:");
    String textoPublicacao = entrada.nextLine();
    System.out.println("Link da mídia:");
    String link = entrada.nextLine();
    Publicacao publicacao = new Publicacao(textoPublicacao, link);

    redeSocial.inserePublicacao(publicacao);

    int opcao = 0;
    do {
      System.out.println("Deseja inserir outra publicação? digite 1 para Sim e 2 para não: ");
      opcao = entrada.nextInt();

      switch (opcao) {
        case 1:
          entrada = new Scanner(System.in);
          System.out.println("Digite um texto para publicação:");
          textoPublicacao = entrada.nextLine();
          System.out.println("Link da mídia:");
          link = entrada.nextLine();
          publicacao = new Publicacao(textoPublicacao, link);
          redeSocial.inserePublicacao(publicacao);
          break;
        case 2:
          opcao = 2;
          break;
        default:
          opcao = 2;
          break;
      }
    } while (opcao != 2);

    redeSocial.imprimePublicacoes();
  }

} 
    

