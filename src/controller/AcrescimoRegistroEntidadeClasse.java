package controller;

import model.Candidato;

public class AcrescimoRegistroEntidadeClasse implements IAplicacaoAcrescimo {

  @Override
  public int calculaAcrescimo(Candidato c) {
    int acrescimoTotal = 0;

    if (c.getAnosRegistroEntidadeClasse() > 0) {
      acrescimoTotal = c.getAnosRegistroEntidadeClasse() * 1;
    }

    return c.getPontosProva() + acrescimoTotal;
  }

  @Override
  public void proximoAcrescimo(Candidato c) {
    c.setPontosProva(calculaAcrescimo(c));

    AcrescimoExperienciaArea aea = new AcrescimoExperienciaArea();
    aea.proximoAcrescimo(c);
  }

}
