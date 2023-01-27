package br.com.magnasistemas.planta.briofitas;

import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Estruturas;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Ordem;
import br.com.magnasistemas.planta.enumerators.Talos;


public abstract class Anthocerophyta extends Briofitas {
	protected final Filo tiposFilo = Filo.BRIOFITAS;
	protected final Classes tiposClasses = Classes.ANTHOCEROPHYTA;
	protected final Ordem tiposOrdem = Ordem.ANTOCEROS;
	protected Talos tipoTalos = Talos.SIMPLES_ACHATADOS;
	protected Estruturas tiposEstruras = Estruturas.CAVIDADES_INTERNAS;
	
}
