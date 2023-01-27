package br.com.magnasistemas.planta.briofitasTipo;

import br.com.magnasistemas.planta.briofitas.Hepaticas;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Sementes;

public class Riccia extends Hepaticas{
	protected final Extras tiposExtras = Extras.AQUATICAS;

	String nome = "RICCIA";

	public Riccia(RicciaBuilder builder) {

	}

	public static class RicciaBuilder {

		public Riccia build() {
			return new Riccia(null);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     "
				+ this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes+ "\n" + "TALOS:    " + this.tiposTalos;
	}
}
