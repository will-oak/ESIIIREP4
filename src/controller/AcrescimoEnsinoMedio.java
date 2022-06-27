package controller;

import model.Candidato;

public class AcrescimoEnsinoMedio implements IAplicacaoAcrescimo {

  @Override
  public int calculaAcrescimo(Candidato c) {
    int acrescimoTotal = 0;

    if (c.getEnsinoMedioPublico()) {
      acrescimoTotal = 5;
    }

    return c.getPontosProva() + acrescimoTotal;
  }

  @Override
  public void proximoAcrescimo(Candidato c) {
    c.setPontosProva(calculaAcrescimo(c));

    AcrescimoSuperior as = new AcrescimoSuperior();
    as.proximoAcrescimo(c);
  }

}