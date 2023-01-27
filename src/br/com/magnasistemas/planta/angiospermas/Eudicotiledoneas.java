package br.com.magnasistemas.planta.angiospermas;
import br.com.magnasistemas.planta.enumerators.*;

public abstract class Eudicotiledoneas extends Angiospermas{
	protected  Folhagem tiposFolhagem = Folhagem.COMPOSTA_E_ESTIPULADAS;
	protected  Sementes tiposSementes = Sementes.DOIS_COTILEDONES;
	protected final Estruturas tiposEstruturas = Estruturas.ARVORES_ARBUSTOS;
	protected final Classes tiposClasses = Classes.EUDICOTILEDONEAS;
}
