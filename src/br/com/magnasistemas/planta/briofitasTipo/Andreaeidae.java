package br.com.magnasistemas.planta.briofitasTipo;

import br.com.magnasistemas.planta.briofitas.Musgos;
import br.com.magnasistemas.planta.briofitasTipo.Agrestis.AgrestisBuilder;
import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Ordem;
import br.com.magnasistemas.planta.enumerators.Sementes;

public class Andreaeidae extends Musgos {
	protected final Frutos tiposFrutos = Frutos.SEM_FRUTOS;
	protected final Extras tiposExtras = Extras.MAIS_DE_UMA_CAMADA_DE_CELULAS;

	String nome = "ANDREAEIDAE";

	public Andreaeidae(AndreaeidaeBuilder builder) {

	}

	public static class AndreaeidaeBuilder {

		public Andreaeidae build() {
			return new Andreaeidae(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposExtras + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     "
				+ this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes
				+ "\n" + "TALOS:    " + this.tiposTalos;
	}
}
