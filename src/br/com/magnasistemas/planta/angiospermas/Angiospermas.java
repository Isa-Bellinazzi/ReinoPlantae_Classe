package br.com.magnasistemas.planta.angiospermas;

import br.com.magnasistemas.planta.CicloDeVida;
import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.enumerators.*;
import br.com.magnasistemas.planta.enumerators.Filo;

public abstract class Angiospermas extends Planta implements CicloDeVida {
	protected Sementes tipoSementes;
	protected Raiz tiposRaiz;
	protected Caule tiposCaule;
	protected Folhagem tiposFolhagem;
	protected Frutos tiposFrutos;
	protected Flores tiposFlores;
	protected final Filo tiposFilo = Filo.ANGIOSPERMAS;
	protected final Vasos tiposVasos = Vasos.VASCULAR;

	@Override
	public String nascendo() {
		return this.nascendo = "Estou procurando habitats adequados para minha existência, podendo ser ambientes aquáticos até áridos...\n"
				+ "Lugar adequado encontrado!\n" + "Nascendo!\n";
	}

	@Override
	public String crescimento() {
		return this.crescimento = "Crescendo e passando por vários estagios ate chegar no meu processo de floração e frutos...\n"
				+ "Estou produzindo Flores e/ou Frutos!\n";
	}

	@Override
	public String fotossintese() {
		return this.fotossintese = "Procurando nutrientes do solo e/ou de materia orgânica degradada...\n"
				+ "Nutrientes necesários encontrados...\n" + "Realizei minha fotossíntese!\n";

	}

	@Override
	public String reproducao() {
		return this.reproducao = "Realizando minha polinizacao, aguardando que algum inseto, ou animal,\n"
				+ "ou até mesmo o vento, carregue meu pólen/semente.\n"
				+ "Meu pólen/semente está sendo carregado para outra planta...\n" + "Minha reprodução foi realizada!\n";

	}

	@Override
	public String falecendo() {
		return this.falecendo = "Já atingi meu tempo de vida, minhas flores murcham, meus frutos apodrecem\n"
				+ "minhas estruturas enfraquecem, e assim apodreço e me torno nutrientes para o solo...\n";

	}

}