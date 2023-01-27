package br.com.magnasistemas.planta.angiospermasTipo;
import br.com.magnasistemas.planta.angiospermas.Rosaceas;
import br.com.magnasistemas.planta.enumerators.*;


public class Damasqueiro extends Rosaceas {
	protected final Frutos tiposFrutos = Frutos.SECA;
	protected final Folhagem tiposFolhagem = Folhagem.OVAIS_OPOSTAS;
	protected final Raiz tiposRaiz = Raiz.AXIAL;
	protected final Caule tiposCaule = Caule.RAMOSO;
	protected final Estruturas tiposEstruturas = Estruturas.ARVORES;

	String nome = "Damasco"; 
	
	public Damasqueiro(DamasqueiroBuilder builder) {
		
	}

	public static class DamasqueiroBuilder{ 
		
		public Damasqueiro build() {
			return new Damasqueiro(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   "+ this.nome+"\n"+"TIPO:     " + this.tiposEstruturas+"\n"+"FRUTA:    "+ tiposFrutos+"\n"+ "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " +tiposVasos +"\n"+ "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n"+ 
		  "RAIZ:     "+ this.tiposRaiz + "\n"+"FOLHAS:   " +this.tiposFolhagem + "\n"+"CAULE:    " +this.tiposCaule+ "\n" + "SEMENTES: " + this.tiposSementes ;
	}


}
