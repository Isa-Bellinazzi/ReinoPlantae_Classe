package br.com.magnasistemas.planta.enumerators;

public enum Sementes {
	SEMENTES("SEMENTES"),
	SEM_SEMENTES("SEM_SEMENTES"),
	UM_COTILEDONES("UM COTILEDONES"),
	DOIS_COTILEDONES("DOIS COTILEDONES"),
	NUAS("NUAS"),
	COMESTIVEIS("COMESTIVEIS"),
	EM_FORMA_DE_CONE("EM_FORMA_DE_CONE"),
	CARNOSAS("CARNOSAS");

	private String tiposSementes;

	Sementes(String tiposSementes) {
		this.tiposSementes= tiposSementes;
	}


}
