package br.com.magnasistemas.planta.pteridofitasTipo;

import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Raiz;
import br.com.magnasistemas.planta.pteridofitas.Monilophyta;

public class Samambaia extends Monilophyta{
		protected final Caule tiposCaule = Caule.RAMOSO;
		protected final Raiz tiposRaiz = Raiz.ADVENTICIAS_E_ENDOGENAS;
		protected final Extras tiposExtras = Extras.RASTEJANTES;
 
		String nome = "SAMAMBAIA";

		public Samambaia(SamambaiaBuilder builder) {

		}

		public static class SamambaiaBuilder {

			public Samambaia build() {
				return new Samambaia(this);
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




