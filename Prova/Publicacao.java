package br.com.Prova;

import java.util.ArrayList;

public class Publicacao {
     String dataPublic;  
     String textoPubli;
     String linkMidia;
     ArrayList<Publicacao> Publicacaos;
    ArrayList<Publicacao> publicacoes = new ArrayList<> ();
    public Publicacao(String dataPublic, String textoPubli, String linkMidia, ArrayList<Publicacao> publicacaos,
            ArrayList<Publicacao> publicacoes) {
        this.dataPublic = dataPublic;
        this.textoPubli = textoPubli;
        this.linkMidia = linkMidia;
        Publicacaos = publicacaos;
        this.publicacoes = publicacoes;
    }
    public String getDataPublic() {
        return dataPublic;
    }
    public void setDataPublic(String dataPublic) {
        this.dataPublic = dataPublic;
    }
    public String getTextoPubli() {
        return textoPubli;
    }
    public void setTextoPubli(String textoPubli) {
        this.textoPubli = textoPubli;
    }
    public String getLinkMidia() {
        return linkMidia;
    }
    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }
    public ArrayList<Publicacao> getPublicacaos() {
        return Publicacaos;
    }
    public void setPublicacaos(ArrayList<Publicacao> publicacaos) {
        Publicacaos = publicacaos;
    }
    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }
    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
    
}   
