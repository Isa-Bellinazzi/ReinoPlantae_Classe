package br.com.magnasistemas.planta.enumerators;

public enum Filo {
	ANGIOSPERMAS("ANGIOSPERMAS"),
	BRIOFITAS("BRIÓFITAS"),
	GIMNOSPERMAS("GIMNOSPERMAS"),
	PTERIDOFITAS("PTERIDÓFITAS");
	
	
	private String tiposFilo;

	Filo(String tiposFilo) {
		this.tiposFilo = tiposFilo;
	}

}

