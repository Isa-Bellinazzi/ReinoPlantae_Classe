package br.com.magnasistemas.planta.pteridofitas;

import br.com.magnasistemas.planta.enumerators.*;

public abstract class Isoetes extends Lycopodiophyta {
	protected Caule tiposCaule = Caule.PROSTADOS;
	protected Folhagem tiposFolhagem = Folhagem.OCAS;
	protected Extras tiposExtras = Extras.AQUATICAS;
	protected final Ordem tiposOrdem = Ordem.ISOETES;
	protected final Raiz tiposRaiz = Raiz.ADVENTICIAS_E_ENDOGENAS;
}

