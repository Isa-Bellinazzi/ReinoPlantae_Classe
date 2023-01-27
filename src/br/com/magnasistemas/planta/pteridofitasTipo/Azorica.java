package br.com.magnasistemas.planta.pteridofitasTipo;

import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Raiz;
import br.com.magnasistemas.planta.pteridofitas.Isoetes;

public class Azorica extends Isoetes{
	protected final Caule tiposCaule = Caule.RAMOSO;

	String nome = "AZORICA";

	public Azorica(AzoricaBuilder builder) {

	}

	public static class AzoricaBuilder {

		public Azorica build() {
			return new Azorica(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposExtras + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem
				+ "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    "
				+ this.tiposCaule+ "\n" + "SEMENTES: " + this.tiposSementes;
	}

}

