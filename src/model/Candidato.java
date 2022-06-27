package model;

public class Candidato {
  private int id;
  private String nome;
  private boolean ensinoMedioPublico;
  private boolean ensinoSuperiorCompleto;
  private int anosRegistroEntidadeClasse;
  private int anosExperencia;
  private int pontosProva;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean isEnsinoMedioPublico() {
    return this.ensinoMedioPublico;
  }

  public boolean getEnsinoMedioPublico() {
    return this.ensinoMedioPublico;
  }

  public void setEnsinoMedioPublico(boolean ensinoMedioPublico) {
    this.ensinoMedioPublico = ensinoMedioPublico;
  }

  public boolean isEnsinoSuperiorCompleto() {
    return this.ensinoSuperiorCompleto;
  }

  public boolean getEnsinoSuperiorCompleto() {
    return this.ensinoSuperiorCompleto;
  }

  public void setEnsinoSuperiorCompleto(boolean ensinoSuperiorCompleto) {
    this.ensinoSuperiorCompleto = ensinoSuperiorCompleto;
  }

  public int getAnosRegistroEntidadeClasse() {
    return this.anosRegistroEntidadeClasse;
  }

  public void setAnosRegistroEntidadeClasse(int anosRegistroEntidadeClasse) {
    this.anosRegistroEntidadeClasse = anosRegistroEntidadeClasse;
  }

  public int getAnosExperencia() {
    return this.anosExperencia;
  }

  public void setAnosExperencia(int anosExperencia) {
    this.anosExperencia = anosExperencia;
  }

  public int getPontosProva() {
    return this.pontosProva;
  }

  public void setPontosProva(int pontosProva) {
    this.pontosProva = pontosProva;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", nome='" + getNome() + "'" +
        ", ensinoMedioPublico='" + isEnsinoMedioPublico() + "'" +
        ", ensinoSuperiorCompleto='" + isEnsinoSuperiorCompleto() + "'" +
        ", anosRegistroEntidadeClasse='" + getAnosRegistroEntidadeClasse() + "'" +
        ", anosExperencia='" + getAnosExperencia() + "'" +
        ", pontosProva='" + getPontosProva() + "'" +
        "}";
  }
}
