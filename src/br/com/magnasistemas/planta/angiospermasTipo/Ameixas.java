package br.com.magnasistemas.planta.angiospermasTipo;

import br.com.magnasistemas.planta.angiospermas.Rosaceas;
import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Estruturas;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Raiz;

public class Ameixas extends Rosaceas {
	protected final Frutos tiposFrutos = Frutos.DRUPAS;
	protected final Folhagem tiposFolhagem = Folhagem.CARTACEAS;
	protected final Raiz tiposRaiz = Raiz.AXIAL;
	protected final Caule tiposCaule = Caule.RAMOSO;
	protected final Estruturas tiposEstruturas = Estruturas.ARVORES_CADUCIFOLIA;

	String nome = "Ameixas";

	public Ameixas(AmeixasBuilder builder) {

	}

	public static class AmeixasBuilder {

		public Ameixas build() {
			return new Ameixas(this);
		}

	}

	@Override
	public String toString() {
		return "\n" +"\n" + "PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposEstruturas + "\n" + "FRUTA:    "
				+ tiposFrutos + "\n" + "FILO:     " + this.tiposFilo + "\n" + "VASOS:    " + this.tiposVasos + "\n"
				+ "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     "
				+ this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule
				+ "\n" + "SEMENTES: " + this.tiposSementes;
	}

}
