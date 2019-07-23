package dao;

import java.util.List;

import Entity.Canil;
import Entity.Cao;

import Entity.ONG;

public interface IDaoCachorro {
	public void criarCachorro(Cao cao);

	public List<Cao> buscarCanil(Canil canil);

	public void removerCachorro();

	public List<ONG> buscaOng(ONG ong);

}
