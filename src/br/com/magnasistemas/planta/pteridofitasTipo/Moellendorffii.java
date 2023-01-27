package br.com.magnasistemas.planta.pteridofitasTipo;
import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Raiz;
import br.com.magnasistemas.planta.pteridofitas.Selaginella;

public class Moellendorffii extends Selaginella {
	protected final Caule tiposCaule = Caule.RAMOSO;
	protected final Raiz tiposRaiz = Raiz.SUPERFICIAIS;

	String nome = "MOELLENDORFFI";

	public Moellendorffii(MoellendorffiiBuilder builder) {

	}

	public static class MoellendorffiiBuilder {

		public Moellendorffii build() {
			return new Moellendorffii(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposExtras + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem
				+ "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    "
				+ this.tiposCaule+ "\n" + "SEMENTES: " + this.tiposSementes;
	}

}

