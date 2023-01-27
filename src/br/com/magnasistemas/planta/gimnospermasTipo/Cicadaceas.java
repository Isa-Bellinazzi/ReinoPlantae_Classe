package br.com.magnasistemas.planta.gimnospermasTipo;
import br.com.magnasistemas.planta.gimnospermas.Cycadaceae;

public class Cicadaceas extends Cycadaceae {
	String nome = "CICADACEAS";

	public Cicadaceas(CicadaceasBuilder builder) {

	}

	public static class CicadaceasBuilder {
 
		public Cicadaceas build() {
			return new Cicadaceas(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposEstruturas + "\n" + "FILO:     " + this.tiposFilo
				+ "\n" + "VASOS:    " + this.tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    "
				+ this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem
				+ "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes+ "\n" + "FRUTOS:   " + this.tiposExtras;
	}
}