package br.com.magnasistemas.planta.briofitas;

import br.com.magnasistemas.planta.CicloDeVida;
import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.enumerators.*;

public abstract class Briofitas extends Planta implements CicloDeVida {
	protected Caule tiposCaule = Caule.SEM_CAULE_POSSUI_CAULOIDES;
	protected Talos tiposTalos;
	protected Folhagem tiposFolhagem = Folhagem.SEM_FOLHA_POSSUI_FILOIDES;
	protected final Raiz tiposRaiz = Raiz.SEM_RAIZ_POSSUE_RIZOIDES;
	protected final Vasos tiposVasos = Vasos.AVASCULAR;
	protected final Filo tiposFilo = Filo.BRIOFITAS;
	protected final Sementes tiposSementes = Sementes.SEM_SEMENTES;
	protected final Frutos tiposFrutos = Frutos.SEM_FRUTOS;

	@Override
	public String nascendo() {
		return this.nascendo = "Estou procurando  ambientes umidos, proximo a locais de agua-doce e com sombras\n"
				+ "Lugar adequado encontrado!\n";
	}

	@Override
	public String crescimento() {
		return this.crescimento = "Estou crescendo irei passa por uma fase de vida diploide (2n) e uma fase haploide (n)...\n"
				+ "Meu crescimento foi concluído, mas continuo uma planta pequena!\n";
	}

	@Override
	public String fotossintese() {
		return this.fotossintese = "Sou totalmente dependendente de água, ela quem tranposta meus nutrientes\n"
				+ "Aguardando a água transportar meus nutrientes...\n"
				+ "Absorvi meus nutrientes, minha fotossíntese foi realizada!\n";
	}

	@Override
	public String reproducao() {
		return this.reproducao = "Realizando reprodução assexuada ou sexuada\n"
				+ "Me fragamento em partes e gero outra plantinha sem variação genética/\n"
				+ "ou meus conceptaculos são carregados pela água e se fixam em algum lugar gerando outra plantinha\n"
				+ "Realizando minha reprodução...\n"
				+"Reprodução realizada com sucesso !\n";
	}

	@Override
	public String falecendo() {
		return this.reproducao = "Já atingi meu tempo de vida, minhas estruturas enfraquecem,\n"
				+ "Assim apodreço e me torno nutrientes para o solo...\n";
		
	}

}
