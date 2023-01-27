package br.com.magnasistemas.planta.gimnospermas;

import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.enumerators.*;

public abstract class Cicadofitas extends Gimnospermas {
	protected  Folhagem tiposFolhagem = Folhagem.CORIACEAS;
	protected final Classes tiposClasses = Classes.CICADOFITAS;
	protected final Sementes tiposSementes = Sementes.NUAS;
	protected final Flores tiposFlores = Flores.SEM_FLORES;
	protected final Raiz tiposRaiz = Raiz.HETEROMORFICA;
} 
