package br.com.magnasistemas.planta.gimnospermasTipo;

import br.com.magnasistemas.planta.enumerators.Raiz;
import br.com.magnasistemas.planta.gimnospermas.Ginkgophyta;

public class GinkgoBiloba extends Ginkgophyta {
 protected final Raiz tiposRaiz = Raiz.AXIAL;
	String nome = "GINKO BILOBA";

	public GinkgoBiloba(GinkgoBilobaBuilder builder) {

	}

	public static class GinkgoBilobaBuilder {

		public GinkgoBiloba build() {
			return new GinkgoBiloba(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposExtras + "\n" + "FILO:     " + this.tiposFilo
				+ "\n" + "VASOS:    " + this.tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    "
				+ this.tiposOrdem + "\n" + "RAIZ:     " + this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem
				+ "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tipoSementes;
	}

}

	
	

