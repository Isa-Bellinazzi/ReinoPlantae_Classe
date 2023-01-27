package br.com.magnasistemas.planta.briofitasTipo;
import br.com.magnasistemas.planta.briofitas.Hepaticas;
import br.com.magnasistemas.planta.enumerators.*;


public class Marchantia extends Hepaticas {
	protected final Extras tiposExtras = Extras.AQUATICAS;



	String nome = "MARCHANTIA";

	public Marchantia(MarchantiaBuilder builder) {

	}

	public static class MarchantiaBuilder {

		public Marchantia build() {
			return new Marchantia(this);
		}

	}

	@Override
	public String toString() {
		return "\n" +"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposExtras + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     "
				+ this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes
				+ "\n" + "TALOS:    " + this.tiposTalos;
	}
}
