package controller;

import model.Candidato;

public class AcrescimoSuperior implements IAplicacaoAcrescimo {

  @Override
  public int calculaAcrescimo(Candidato c) {
    int acrescimoTotal = 0;

    if (c.getEnsinoSuperiorCompleto()) {
      acrescimoTotal = 10;
    }

    return c.getPontosProva() + acrescimoTotal;
  }

  @Override
  public void proximoAcrescimo(Candidato c) {
    c.setPontosProva(calculaAcrescimo(c));

    AcrescimoRegistroEntidadeClasse arec = new AcrescimoRegistroEntidadeClasse();
    arec.proximoAcrescimo(c);
  }

}
