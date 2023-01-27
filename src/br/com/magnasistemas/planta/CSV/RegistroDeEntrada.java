package br.com.magnasistemas.planta.CSV;

import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Ordem;

public class RegistroDeEntrada {
	Filo tiposFilo; 
	Ordem tiposOrdem;
	Classes tiposClasses;
	
	public RegistroDeEntrada(Filo tiposFilo,Ordem tiposOrdem,Classes tiposClasses ){
		this.tiposFilo = tiposFilo;
		this.tiposOrdem = tiposOrdem;
		this.tiposClasses = tiposClasses;

	}

	public Filo pegaOsTiposDeFilo() {
		return tiposFilo;
	}

	public Ordem pegaOsTiposDeOrdem() {
		return tiposOrdem;
	}

	public Classes pegaOsTiposDeClasses() {
		return tiposClasses;
	}


}
