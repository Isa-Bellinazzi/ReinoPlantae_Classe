package br.com.magnasistemas.planta.gimnospermas;

import br.com.magnasistemas.planta.CicloDeVida;
import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.enumerators.*;

public abstract class Gimnospermas extends Planta implements CicloDeVida {
	protected Raiz tiposRaiz;
	protected Folhagem tiposFolhagem = Folhagem.HETERMORFICA;
	protected Filo tiposFilo = Filo.GIMNOSPERMAS;
	protected Caule tiposCaule = Caule.LENHOSO;
	protected Sementes tipoSementes = Sementes.NUAS;
	protected final Frutos tiposFrutos = Frutos.SEM_FRUTOS_POSSUE_ESTROBILOS;
	protected final Vasos tiposVasos = Vasos.VASCULAR;

	@Override
	public String nascendo() {
		return this.nascendo = "Procurando locais de clima frio ou temperado, mas também podem ser regioes tropicais e subtropicais.\n"
				+ "Lugar adequado encontrado!\n" + "Nascendo...\n";
	}

	@Override
	public String crescimento() {
		return this.crescimento = "No meu interior ocorrem divisoes meioticas\n"
				+ "Originando os microsporos haploides (n), que gerem os gametofitos masculinos (n)...\n"
				+ "Meu crescimento foi concluído!\n";
	}

	@Override
	public String fotossintese() {
		return this.fotossintese = "Realizando diferenciação e modificação de estruturas foliares...\n"
				+ "Montando minhas estruturas reprodutivas (estrobilos)...\n" + "Não realizo fotossíntese!\n ";
	}

	@Override
	public String reproducao() {
		return this.reproducao = "Me reproduzo de forma assexuada ou sexuada.\n"
				+ "Envolvendo uma pequena formação de raiz, gerando novo organismo idêntico/Envolvendo a fecundação a parti da dispersão de microsporos...\n"
				+ "Reprodução realizada com sucesso!\n";
	}

	@Override
	public String falecendo() {
		return this.falecendo = "Já atingi meu tempo de vida ou adoeci, minhas estruturas enfraquecem\n"
				+ "Começando a apodrecer por dentro e minha estrutura começando a cair...\n"
				+ "Assim apodreço e me torno nutrientes para o solo...\n";
	}

}
