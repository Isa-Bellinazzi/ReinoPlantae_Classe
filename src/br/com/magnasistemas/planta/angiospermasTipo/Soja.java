package br.com.magnasistemas.planta.angiospermasTipo;

import br.com.magnasistemas.planta.angiospermas.Leguminosas;
import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Raiz;

public class Soja extends Leguminosas {
	protected final Frutos tiposFrutos = Frutos.VAGENS;
	protected final Folhagem tiposFolhagem = Folhagem.COMPOSTAS;
	protected final Raiz tiposRaiz = Raiz.AXIAL;
	protected final Caule tiposCaule = Caule.RAMOSO;

	String nome = "SOJA";

	public Soja(SojaBuilder builder) {

	}

	public static class SojaBuilder {

		public Soja build() {
			return new Soja(this);
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
