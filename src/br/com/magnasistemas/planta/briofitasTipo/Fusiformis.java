package br.com.magnasistemas.planta.briofitasTipo;

import br.com.magnasistemas.planta.briofitas.Antoceros;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Sementes;

public class Fusiformis extends Antoceros {
	protected final Extras tiposExtras = Extras.CLAVARIA;

	String nome = "FUSIFORMIS";

	public Fusiformis(FusiformisBuilder builder) {

	}

	public static class FusiformisBuilder {

		public Fusiformis build() {
			return new Fusiformis(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposExtras + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     "
				+ this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes
				+ "\n" + "TALOS:    " + this.tiposTalos;
	}
}
