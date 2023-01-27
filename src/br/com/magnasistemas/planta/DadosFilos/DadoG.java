package br.com.magnasistemas.planta.DadosFilos;

import br.com.magnasistemas.planta.CicloDeVida;
import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.DadosFilos.DadoB.DadoBBuilder;

public class DadoG extends Planta implements CicloDeVida {
	public DadoG(DadoGBuilder builder) {

	}

	public static class DadoGBuilder {

		public DadoG build() {
			return new DadoG(this);
		}

	}

	@Override
	public String nascendo() {
		return this.nascendo = "Encontradas em maior quantidade em locais de clima frio ou temperado. Porem, algumas especies podem se desenvolver em regioes tropicais e subtropicais tambem.";
	}

	@Override
	public String crescimento() {
		return this.crescimento = "No interior dos microstrobilos, ocorrem divisoes meioticas nos microsporangios,originando os microsporos haploides (n). Esses microsporos originam os gametofitos masculinos (n),"
				+ "\n" + "chamados de graos de polen, que sao dispersados e liberados no ar.";
	}

	@Override
	public String fotossintese() {
		return this.fotossintese = "Possuem estruturas reprodutivas (estrobilos) formadas a partir da diferenciacao e modificacao de estruturas foliares que nao realizam fotossintese. ";
	}

	@Override
	public String reproducao() {
		return this.reproducao = "Ocorre de forma assexuada ou sexuada.A assexuada envolve uma pequena formacao de raiz, colocada para crescimento, "
				+ "\n"
				+ "gerando um novo organismo, geneticamente identico ao primeiro.A reprodcao sexuada envolve a fecundacao a partir da dispersao dos microsporos "
				+ "\n" + "pelo vento e encontro com as estruturas reprodutivas femininas.";
	}
	@Override
	public String falecendo() {
		return falecendo =" ";
	}

	@Override
	public String toString() {
		return "\n" + "\n" + "SOBRE AS GIMNOSPERMAS: " + "\n" + "\n" + "HABITAT: " + this.nascendo() + "\n"
				+ "DESENVOLVIMENTO: " + this.crescimento() + "\n" + "FOTOSSINTESE: " + this.fotossintese() + "\n"
				+ "REPRODUCAO: " + this.reproducao() + "\n";
	}


}
