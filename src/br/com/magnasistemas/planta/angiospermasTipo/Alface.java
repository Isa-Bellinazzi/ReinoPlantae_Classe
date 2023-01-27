package br.com.magnasistemas.planta.angiospermasTipo;

import br.com.magnasistemas.planta.angiospermas.Asteraceae;
import br.com.magnasistemas.planta.enumerators.*;

public class Alface extends Asteraceae {
	protected final Frutos tiposFrutos = Frutos.HERBACEA;
	protected final Folhagem tiposFolhagem = Folhagem.LISAS;
	protected final Raiz tiposRaiz = Raiz.RAMIFICADA;
	protected final Vasos tiposVasos = Vasos.VASCULAR;
	protected final Sementes tiposSementes = Sementes.SEM_SEMENTES;

	String nome = "ALFACE";

	public Alface(AlfaceBuilder builder) {

	}

	public static class AlfaceBuilder {

		public Alface build() {
			return new Alface(this);
		}

	}

	@Override
	public String toString() {
		return "\n" +"\n" + "PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     "
				+ this.tiposFilo + "\n" + "VASOS:    " + this.tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses
				+ "\n" + "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   "
				+ this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes;
	}

}
