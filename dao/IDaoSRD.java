package dao;

import java.util.List;

import Entity.ONG;
import Entity.SRD;

public interface IDaoSRD {

	public List<SRD> buscarSRD(SRD srd);

	public void criarSRD(SRD srd);

	public List<SRD> buscaTodosSRD();

	public void removerSRD();

	public List<ONG> buscarOng(ONG ong);

}
