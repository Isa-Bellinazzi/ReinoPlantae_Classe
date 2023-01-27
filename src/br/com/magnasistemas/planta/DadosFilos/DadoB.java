package br.com.magnasistemas.planta.DadosFilos;

import br.com.magnasistemas.planta.CicloDeVida;
import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.DadosFilos.DadoA.DadoABuilder;

public class DadoB extends Planta implements CicloDeVida {
	public DadoB(DadoBBuilder builder) {

	}

	public static class DadoBBuilder {

		public DadoB build() {
			return new DadoB(this);
		}

	}

	@Override
	public String nascendo() {
		return this.nascendo = "Localizados em ambientes umidos, proximos a locais de agua-doce e com sombras";
	}

	@Override
	public String crescimento() {
		return this.crescimento = "Durante a vida da planta, ela passa por uma fase de vida diploide (2n) e uma fase haploide (n).";
	}

	@Override
	public String fotossintese() {
		return this.fotossintese = "Totalmente dependende de agua para o transporte de nutrientes.";
	}

	@Override
	public String reproducao() {
		return this.reproducao = "Podem ser de forma assexuada dependendo da especie(fragmentacao, em que atraves de partes que se separam de um individuo e se formam novos seres sem variacao genetica."
				+ "\n"
				+ "Outras especies podem se reproduzir atraves de estruturas especializadas chamadas conceptaculos. Sao carregados pela agua e, ao se fixarem em outro local formam novos individuos."
				+ "\n"
				+ "Na sexuada ocorre pela uniao do gameta masculino com o gameta feminino utilizando a agua como meio para se transportar.";
	}

	@Override
	public String falecendo() {
		return falecendo= "!";
	}

	@Override
	public String toString() {
		return "\n" + "\n" + "SOBRE AS BRIOFITAS: " + "\n" + "\n" + "HABITAT: " + this.nascendo() + "\n"
				+ "DESENVOLVIMENTO: " + this.crescimento() + "\n" + "FOTOSSINTESE: " + this.fotossintese() + "\n"
				+ "REPRODUCAO: " + this.reproducao() + "\n";

	}
}