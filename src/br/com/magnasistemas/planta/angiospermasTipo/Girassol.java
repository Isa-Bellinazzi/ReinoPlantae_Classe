package br.com.magnasistemas.planta.angiospermasTipo;

import br.com.magnasistemas.planta.angiospermas.Asteraceae;
import br.com.magnasistemas.planta.enumerators.*;


public class Girassol extends Asteraceae {
	protected final Flores tiposFlores = Flores.HELIOTROPISMO;
	protected final Folhagem tiposFolhagem = Folhagem.OVAIS_OPOSTAS;
	protected final Raiz tiposRaiz = Raiz.PIVOTANTE;

	String nome = "GIRASSOL";
	
	public Girassol(GirassolBuilder builder) {
		
	}

	public static class GirassolBuilder{ 
		
		public Girassol build() {
			return new Girassol(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   "+ this.nome+"\n"+"TIPO:     " + this.tiposFlores+"\n"+ "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n"+ 
		  "RAIZ:     "+ this.tiposRaiz + "\n"+"FOLHAS:   " +this.tiposFolhagem + "\n"+"CAULE:    " +this.tiposCaule+ "\n" + "SEMENTES: " + this.tiposSementes  ;
	}


}
