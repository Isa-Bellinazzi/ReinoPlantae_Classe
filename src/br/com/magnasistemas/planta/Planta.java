package br.com.magnasistemas.planta;
import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Ordem;

public abstract class Planta {
	protected Classes tiposClasses;
	protected Filo tiposFilo;
	protected Ordem tiposOrdem;
	protected String nascendo;
	protected String crescimento;
	protected String reproducao;
	protected String fotossintese;
	protected String falecendo;
}