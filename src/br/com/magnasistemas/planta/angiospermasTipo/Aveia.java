package br.com.magnasistemas.planta.angiospermasTipo;

import br.com.magnasistemas.planta.angiospermas.Monocotiledoneas;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Sementes;

public class Aveia extends Monocotiledoneas {
	protected final Frutos tiposFrutos = Frutos.CEREAL;

	String nome = "AVEIA";

	public Aveia(AveiaBuilder builder) {

	}

	public static class AveiaBuilder {

 
		public Aveia build() {
			return new Aveia(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + this.tiposVasos + "\n" +"CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem
				+ "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    "
				+ this.tiposCaule+ "\n" + "SEMENTES: " + this.tiposSementes;
	}
}
