package br.com.magnasistemas.planta.pteridofitasTipo;
import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.pteridofitas.Licopodios;

public class Clavatum  extends Licopodios  {
	protected final Folhagem tiposFolhagem = Folhagem.ESPIRAL_OU_VERTICILIDAS;
	protected final Caule tiposCaule = Caule.RAMOSO;

	String nome = "CLAVATUM";

	public Clavatum(ClavatumBuilder builder) {

	}
 
	public static class ClavatumBuilder {

		public Clavatum build() {
			return new Clavatum(this);
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

