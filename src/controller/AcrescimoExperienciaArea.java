package controller;

import model.Candidato;

public class AcrescimoExperienciaArea implements IAplicacaoAcrescimo {

  @Override
  public int calculaAcrescimo(Candidato c) {
    int acrescimoTotal = 0;

    if (c.getAnosExperencia() > 0) {
      acrescimoTotal = c.getAnosExperencia() * 2;

    }

    return c.getPontosProva() + acrescimoTotal;
  }

  @Override
  public void proximoAcrescimo(Candidato c) {
    c.setPontosProva(calculaAcrescimo(c));
  }

}
