package br.com.Prova2;

public class Achado implements Publicacao {
  private String titulo;
  private String descricao;
  private String imagem;
  private String tipo;
  private String localAchado;
  private String dataHora;
  private String status;

  public Achado(String titulo, String descricao, String tipo, String status) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.tipo = tipo;
    this.status = status;
  }

  public String getTitulo() {
    return titulo;
  }

  public void completaDados(String imagem, String local_achado, String dataHora) {
    this.imagem = imagem;
    this.localAchado = local_achado;
    this.dataHora = dataHora;
  }

  @Override
  public boolean buscar(String titulo) {
    if (this.titulo.equals(titulo)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String ver() {
    return "Detalhes do Item: \nTitulo: " + this.titulo + "\nDescrição: " + this.descricao + "\nFoto: " + this.imagem
        + "\nTipo: " + this.tipo + "\nLocal Achado: " + this.localAchado + "\nData e Hora: " + this.dataHora
        + "\nStatus do item: " + this.status;
  }

}