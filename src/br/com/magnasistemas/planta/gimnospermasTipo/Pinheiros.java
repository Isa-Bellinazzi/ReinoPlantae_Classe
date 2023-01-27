package br.com.magnasistemas.planta.gimnospermasTipo;
import br.com.magnasistemas.planta.enumerators.Estruturas;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.enumerators.Sementes;
import br.com.magnasistemas.planta.gimnospermas.Coniferas;

public class Pinheiros extends Coniferas {
	protected final Sementes tiposSementes = Sementes.COMESTIVEIS;
	protected final Estruturas tiposEstruturas = Estruturas.ARVORES;
	protected final Folhagem tiposFolhagem = Folhagem.HETERMORFICA;
 
	String nome = "PINHEIROS";

	public Pinheiros(PinheirosBuilder builder) {

	}

	public static class PinheirosBuilder {

		public Pinheiros build() {
			return new Pinheiros(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposEstruturas + "\n" + "FILO:     " + this.tiposFilo
				+ "\n" + "VASOS:    " + this.tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    "
				+ this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem
				+ "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes;
	}

}


