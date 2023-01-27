package br.com.magnasistemas.planta.briofitasTipo;

import br.com.magnasistemas.planta.briofitas.Musgos;
import br.com.magnasistemas.planta.briofitasTipo.Andreaeidae.AndreaeidaeBuilder;
import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Ordem;
import br.com.magnasistemas.planta.enumerators.Sementes;

public class Sphagnidae extends Musgos {
	protected final Extras tiposExtras = Extras.UMA_CAMADA_DE_CELULAS;
	protected final Folhagem tiposFolhagem = Folhagem.FILOIDES_SEM_CELULAR_MORTAS;

	String nome = "SPHAGNIDAE";

	public Sphagnidae(SphagnidaeBuilder builder) {

	}

	public static class SphagnidaeBuilder {

		public Sphagnidae build() {
			return new Sphagnidae(this);
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
