package br.com.magnasistemas.planta.DadosFilos;

import br.com.magnasistemas.planta.CicloDeVida;
import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.DadosFilos.DadoG.DadoGBuilder;

public class DadoP extends Planta implements CicloDeVida {
	public DadoP(DadoPBuilder builder) {

	}

	public static class DadoPBuilder {

		public DadoP build() {
			return new DadoP(this);
		}

	}

	@Override
	public String nascendo() {
		return this.nascendo = " Encontradas em lugares escuros e umidos. Sendo assim, facil encontra-las na Mata Atlantica e na Floresta Amazonica. ";
	}

	@Override
	public String crescimento() {
		return this.crescimento = "Com o desenvolvimento dos rizomas, se formam brotos em pontos espacados, sendo os estoloes ou estolhos. A partir desses pontos crescem folhas e raizes.";
	}

	@Override
	public String fotossintese() {
		return this.fotossintese = "As folhas sao laminares com celulas ricas em cloroplastos, processo pelo qual sao elaborados compostos organicos, especialmente acucares.";
	}

	@Override
	public String reproducao() {
		return this.reproducao = "Assexuadamente por brotamento. Nesse caso, durante o desenvolvimento do rizoma vao brotando pontos vegetativos que resulta em folhas e raizes."
				+ "\n"
				+ " O desfragmento do rizoma nos locais entre esses pontos vegetativos isola o nascimento de novas plantas.";
	}

	@Override
	public String falecendo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "\n" + "\n" + "SOBRE AS PTERIDOFITAS: " + "\n" + "\n" + "HABITAT: " + this.nascendo() + "\n"
				+ "DESENVOLVIMENTO: " + this.crescimento() + "\n" + "FOTOSSINTESE: " + this.fotossintese() + "\n"
				+ "REPRODUCAO: " + this.reproducao() + "\n";
	}

}
