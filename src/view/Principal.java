package view;

import controller.AcrescimoEnsinoMedio;
import controller.IAplicacaoAcrescimo;
import model.Candidato;

public class Principal {
  public static void main(String[] args) {
    Candidato c = new Candidato();
    c.setId(1);
    c.setNome("Gustavo Felix");
    c.setAnosExperencia(3);
    c.setAnosRegistroEntidadeClasse(2);
    c.setEnsinoMedioPublico(true);
    c.setEnsinoSuperiorCompleto(true);
    c.setPontosProva(50);

    IAplicacaoAcrescimo acres = new AcrescimoEnsinoMedio();
    acres.proximoAcrescimo(c);

    System.out.println(c.getPontosProva());
  }
}
