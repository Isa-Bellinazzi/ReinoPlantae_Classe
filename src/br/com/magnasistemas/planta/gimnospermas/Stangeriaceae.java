package br.com.magnasistemas.planta.gimnospermas;

import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Estruturas;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Ordem;
import br.com.magnasistemas.planta.enumerators.Raiz;

public abstract class Stangeriaceae extends Cicadofitas {
	protected final Folhagem tiposFolhagem = Folhagem.EMBRIONARIAS;
	protected final Raiz tiposRaiz = Raiz.CONTRATEIS;
	protected final Estruturas tiposEstruturas = Estruturas.ARVORES;
	protected final Caule tiposCaule = Caule.SUBTERRANEO;
	protected final Extras tiposExtras = Extras.CONES;
	protected final Ordem tiposOrdem = Ordem.STANGERIACEAE;	
}