package br.com.magnasistemas.planta.gimnospermasTipo;

import br.com.magnasistemas.planta.gimnospermas.Welwitschiales;

public class WelwitschiaMirabilis extends Welwitschiales {

	String nome = "WELWITSCHIA MIRABILIS(POLVO DO DESERTO)";

	public WelwitschiaMirabilis(WelwitschiaMirabilisBuilder builder) {

	}

	public static class WelwitschiaMirabilisBuilder {

		public WelwitschiaMirabilis build() {
			return new WelwitschiaMirabilis(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     " + this.tiposFilo
				+ "\n" + "VASOS:    " + this.tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    "
				+ this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem
				+ "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes + "\n" + "FLORES:   "
				+ this.tiposFlores;
	}

}
