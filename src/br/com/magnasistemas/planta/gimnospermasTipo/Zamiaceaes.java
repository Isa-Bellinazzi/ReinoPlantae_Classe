package br.com.magnasistemas.planta.gimnospermasTipo;

import br.com.magnasistemas.planta.gimnospermas.Zamiaceae;

public class Zamiaceaes extends Zamiaceae {
	String nome = "ZAMIACEAS";

	public Zamiaceaes(ZamiaceaesBuilder builder) {

	}

	public static class ZamiaceaesBuilder {

		public Zamiaceaes build() {
			return new Zamiaceaes(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposEstruturas + "\n" + "FILO:     " + this.tiposFilo
				+ "\n" + "VASOS:    " + this.tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    "
				+ this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem
				+ "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes + "\n" + "FRUTOS:   "
				+ this.tiposFrutos;
	}
}