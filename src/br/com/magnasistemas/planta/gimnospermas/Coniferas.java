package br.com.magnasistemas.planta.gimnospermas;

import br.com.magnasistemas.planta.enumerators.*;

public abstract class Coniferas extends  Gimnospermas {
	protected  Folhagem tiposFolhagem = Folhagem.FORMATO_DE_AGULHA;
	protected final Classes tiposClasses = Classes.CONIFERAS;
	protected final Ordem tiposOrdem = Ordem.SEM_ORDEM;
	protected final Extras tiposExtras = Extras.TRONCOS_E_CONES;
	protected final Flores tiposFlores = Flores.SEM_FLORES;
	protected final Frutos tiposFrutos = Frutos.SEM_FRUTOS_POSSUE_ESTROBILOS;
	protected final Raiz tiposRaiz = Raiz.PROFUNDA;
	protected final Caule tiposCaule = Caule.CILINDRICO;
}
	
	
