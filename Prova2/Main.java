package br.com.Prova2;
import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Achado achado = new Achado("Titulo", "Descrição ", "Tipo", "Teste");
    achado.completaDados("Foto ", "Local ", "Data e H");
    boolean busca = achado.buscar(achado.getTitulo());
    if (busca == true) {
      JOptionPane.showMessageDialog(null, "Encontrado!");
    } else {
      JOptionPane.showMessageDialog(null, "Não foi possível encontrar");
    }
    JOptionPane.showMessageDialog(null, achado.ver());
  }
}