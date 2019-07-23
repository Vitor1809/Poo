package dao;

import java.util.List;

import Entity.ONG;
import Entity.Passaro;

public interface IDaoPassaro {

	public void criarPassaro(Passaro passaro);

	public List<Passaro> buscarPassaro(Passaro passaro);

	public void removerPassaro();

	public List<ONG> buscaOng(ONG ong);

}
