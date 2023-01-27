package br.com.magnasistemas.planta.pteridofitasTipo;

import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Ordem;
import br.com.magnasistemas.planta.enumerators.Raiz;
import br.com.magnasistemas.planta.pteridofitas.Monilophyta;

public class Cavalinha extends Monilophyta {
	protected final Caule tiposCaule = Caule.RAMOSO;
	protected final Raiz tiposRaiz = Raiz.PROTOXILEMA;
	protected final Ordem tiposOrdem = Ordem.EQUISETOPSIDA;

	String nome = "CAVALINHA";

	public Cavalinha(CavalinhaBuilder builder) {

	}

	public static class CavalinhaBuilder {

		public Cavalinha build() {
			return new Cavalinha(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem
				+ "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    "
				+ this.tiposCaule+ "\n" + "SEMENTES: " + this.tiposSementes;
	}

}




