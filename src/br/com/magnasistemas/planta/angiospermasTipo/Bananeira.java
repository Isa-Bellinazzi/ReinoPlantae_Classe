package br.com.magnasistemas.planta.angiospermasTipo;

import br.com.magnasistemas.planta.angiospermas.Monocotiledoneas;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Sementes;
import br.com.magnasistemas.planta.CicloDeVida;

public class Bananeira extends Monocotiledoneas {
	protected final Frutos tiposFrutos = Frutos.PARTENOCARPICO;
	protected final Sementes tiposSementes = Sementes.SEM_SEMENTES;

	String nome = "BANANEIRA";

	public Bananeira(BananeiraBuilder builder) {

	}

	public static class BananeiraBuilder {

		public Bananeira build() {
			return new Bananeira(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     "
				+ this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule+ "\n" + "SEMENTES: " + this.tiposSementes ;
	}
}
