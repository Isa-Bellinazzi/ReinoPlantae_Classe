package br.com.magnasistemas.planta.briofitasTipo;

import java.util.Objects;

import br.com.magnasistemas.planta.briofitas.Antoceros;
import br.com.magnasistemas.planta.briofitasTipo.Riccia.RicciaBuilder;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Sementes;

public class Agrestis extends Antoceros {
	protected final Extras tiposExtras = Extras.AQUATICAS;

	String nome = "AGRESTIS";

	public Agrestis(AgrestisBuilder builder) {

	}

	public static class AgrestisBuilder {

		public Agrestis build() {
			return new Agrestis(this);
		}

	}

	@Override
	public String toString() {
		return "\n" + "\n" + "PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     "
				+ this.tiposFilo + "\n" + "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n"
				+ "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   "
				+ this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes
				+ "\n" + "TALOS:    " + this.tiposTalos;
	}

	@Override
	public int hashCode() {
		final int primo = 5;
		int resultado = 1;

		resultado = primo * resultado + Objects.hash(tiposClasses, tiposOrdem);
		return resultado;
	}

	@Override
	public boolean equals(Object obj) {

		if (this.getClass() != obj.getClass()) {
			return false;
		}
		return true;

		/*
		 * Agrestis a = (Agrestis) obj; return tiposExtras == a.tiposExtras && nome ==
		 * a.nome && tiposFolhagem == a.tiposFolhagem && tiposTalos == a.tiposTalos &&
		 * tiposFilo == a.tiposFilo && tiposClasses == a.tiposClasses && tiposOrdem ==
		 * a.tiposOrdem && tiposEstruras == a.tiposEstruras && tiposFrutos ==
		 * a.tiposFrutos && tiposRaiz == a.tiposRaiz && tiposSementes == a.tiposSementes
		 * && tiposCaule == a.tiposCaule && tiposVasos == a.tiposVasos;
		 */

	}
}
