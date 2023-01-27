package br.com.magnasistemas.planta.gimnospermasTipo;
import br.com.magnasistemas.planta.enumerators.Sementes;
import br.com.magnasistemas.planta.gimnospermas.Coniferas;

public class Araucarias extends Coniferas{
	protected final Sementes tiposSementes = Sementes.EM_FORMA_DE_CONE;
	String nome = "ARAUCARIAS";

	public Araucarias(AraucariasBuilder builder) {

	}
 
	public static class AraucariasBuilder {

		public Araucarias build() {
			return new Araucarias(this);
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
