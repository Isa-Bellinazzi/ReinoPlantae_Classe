package br.com.magnasistemas.planta.gimnospermas;

import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Estruturas;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Ordem;
import br.com.magnasistemas.planta.enumerators.Sementes;

public abstract class Ginkgophyta extends Gimnospermas {
	protected final Filo tiposFilo = Filo.GIMNOSPERMAS;
	protected final Classes tiposClasses = Classes.GINKGOPHYTA;
	protected final Ordem tiposOrdem = Ordem.SEM_ORDEM;
	protected final Sementes tiposSementes = Sementes.NUAS;
	protected final Frutos tiposFrutos = Frutos.SEM_FRUTOS;
	protected final Estruturas tiposEstruturas = Estruturas.ARVORES;
	protected final Folhagem tiposFolhagem = Folhagem.FLABELIFORMIS;
	protected final Extras tiposExtras = Extras.DOICAS;

}