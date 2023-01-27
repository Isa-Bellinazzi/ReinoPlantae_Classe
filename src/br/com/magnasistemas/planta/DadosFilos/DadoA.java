package br.com.magnasistemas.planta.DadosFilos;

import br.com.magnasistemas.planta.CicloDeVida;
import br.com.magnasistemas.planta.angiospermas.Angiospermas;

public class DadoA extends Angiospermas implements CicloDeVida{
	public DadoA(DadoABuilder builder) {

	}

	public static class DadoABuilder {


		public DadoA build() {
			return new DadoA(this);
		} 

	}
	@Override
	public String nascendo() {
		return this.nascendo = "Ocorrem em variados habitats desde ambientes aquaticos ate aridos.";
	}

	@Override
	public String crescimento() {
		return this.crescimento = "Seu crescimento tem varios estagios ate chegar no processo de floracao e frutos";
	}

	@Override
	public String fotossintese() {
		return this.fotossintese = "Absorve nutrientes do solo e/ou de materia organica degradada ";
	}
	
	@Override
	public String reproducao() {
		return this.reproducao = "O corre atraves da polinizacao(Encontro do grao de polen com a parte feminina de uma flor).";
	}
	@Override
	public String falecendo() {
		return this.falecendo = "O corre atraves da polinizacao(Encontro do grao de polen com a parte feminina de uma flor).";
	}
	@Override
	public String toString() {
		return 
				 "\n" + "\n" + "SOBRE AS ANGIOSPERMAS: " + "\n" + "\n" + "HABITAT: " + this.nascendo() + "\n" + "DESENVOLVIMENTO: "
				+ this.crescimento() + "\n" + "FOTOSSINTESE: "+ this.fotossintese() + "\n" + "REPRODUCAO: "+ this.reproducao()+ "\n";
	}

}
