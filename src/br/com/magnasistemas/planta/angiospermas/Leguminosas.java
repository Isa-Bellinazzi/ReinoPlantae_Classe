package br.com.magnasistemas.planta.angiospermas;
import br.com.magnasistemas.planta.enumerators.*;

public abstract class Leguminosas extends Eudicotiledoneas {
	protected  Folhagem tiposFolhagem = Folhagem.COMPOSTA_E_ESTIPULADAS;
	protected  Estruturas tiposEstruturas = Estruturas.ARVORES_ARBUSTOS;
	protected  Frutos tiposFrutos = Frutos.FORMATO_VAGEM_OU_FAVA;
	protected final Ordem tiposOrdem = Ordem.LEGUMINOSAS;
}

 