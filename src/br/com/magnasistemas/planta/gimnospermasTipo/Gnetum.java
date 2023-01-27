package br.com.magnasistemas.planta.gimnospermasTipo;

import br.com.magnasistemas.planta.enumerators.*;
import br.com.magnasistemas.planta.gimnospermas.Gnetales;

public class Gnetum extends Gnetales {
	protected final Raiz tiposRaiz = Raiz.APRUMADA;
	protected final Extras tiposExtras = Extras.DOICAS;

	String nome = "GNETUM";

	public Gnetum(GnetumBuilder builder) {

	}

	public static class GnetumBuilder {

		public Gnetum build() {
			return new Gnetum(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposExtras + "\n" + "FILO:     " + this.tiposFilo
				+ "\n" + "VASOS:    " + this.tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    "
				+ this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem
				+ "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tipoSementes;
	}

}
