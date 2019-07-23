package dao;

import java.util.List;

import Entity.Gato;
import Entity.ONG;


public interface IDaoGato {

	public void criarGato(Gato gato) ;
	public List<Gato> buscarGato(Gato gato);
	public void removerGato();
	public List<ONG> buscaOng(ONG ong);
	
}
