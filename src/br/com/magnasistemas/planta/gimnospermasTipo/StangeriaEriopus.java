package br.com.magnasistemas.planta.gimnospermasTipo;

import br.com.magnasistemas.planta.gimnospermas.Stangeriaceae;

public class StangeriaEriopus extends Stangeriaceae{
	String nome = "ERIOPUS";

	public StangeriaEriopus(StangeriaEriopusBuilder builder) {

	}

	public static class StangeriaEriopusBuilder {

		public StangeriaEriopus build() {
			return new StangeriaEriopus(this);
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