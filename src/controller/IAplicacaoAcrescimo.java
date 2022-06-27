package controller;

import model.Candidato;

public interface IAplicacaoAcrescimo {
  public int calculaAcrescimo(Candidato c);

  public void proximoAcrescimo(Candidato c);
}