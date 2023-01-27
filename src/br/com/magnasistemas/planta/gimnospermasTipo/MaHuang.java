package br.com.magnasistemas.planta.gimnospermasTipo;

import br.com.magnasistemas.planta.enumerators.Raiz;
import br.com.magnasistemas.planta.enumerators.Sementes;
import br.com.magnasistemas.planta.gimnospermas.Ephedrales;

public class MaHuang extends Ephedrales {
	protected final Sementes tiposSementes = Sementes.EM_FORMA_DE_CONE;
	protected final Raiz tiposRaiz = Raiz.APRUMADA;

	String nome = "MA HUANG";

	public MaHuang(MaHuangBuilder builder) {

	}

	public static class MaHuangBuilder {

		public MaHuang build() {
			return new MaHuang(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     " + this.tiposFilo
				+ "\n" + "VASOS:    " + this.tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    "
				+ this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem
				+ "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes;
	}

}
