package br.com.magnasistemas.planta.pteridofitas;

import br.com.magnasistemas.planta.CicloDeVida;
import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Flores;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Raiz;
import br.com.magnasistemas.planta.enumerators.Sementes;
import br.com.magnasistemas.planta.enumerators.Vasos;

public abstract class Pteridofitas extends Planta implements CicloDeVida {

	protected Folhagem tipoFolhas;
	protected Caule tipoCaule;
	protected final Filo tiposFilo = Filo.PTERIDOFITAS;
	protected final Raiz tiposRaiz = Raiz.RADICULAR;
	protected final Sementes tiposSementes = Sementes.SEM_SEMENTES;
	protected final Frutos tiposFrutos = Frutos.SEM_FRUTOS;
	protected final Flores tipoFlores = Flores.SEM_FLORES;
	protected final Vasos tiposVasos = Vasos.VASCULAR;

	@Override
	public String nascendo() {
		return this.nascendo = "Procurando em lugares escuros e umidos.Facilmente me encontro na Mata Atlantica e na Floresta Amazonica.\n"
				+ "Lugar adequado encontrado! " + "Nascendo!\n";

	}

	@Override
	public String crescimento() {
		return this.crescimento = "Desenvolvendo meus rizomas, que formam brotos em pontos espacados, sendo os estoloes ou estolhos.\n"
				+ "Assim minhas folhas e raízes crescem...\n"+ "Crescendo!\n";
	}

	@Override
	public String fotossintese() {
		return this.fotossintese = "Minhas folhas são  ricas em cloroplastos, sendo responsáveis por compostos organicos, especialmente acucares.\n"
				+ "Absorvendo nutrientes através das minhas folhas...\n"+"Realizei minha fotossíntese!\n";
	}

	@Override
	public String reproducao() {
		return this.reproducao = "Minha reprodução pode ser assexuada e sexuada.\n"
				+ "Desenvolvendo rizomas e brotando pontos vegetativos / Soltando anterozoides flagelados...\n"
				+ "Minha reprodução foi realizada!\n";
	}

	@Override
	public String falecendo() {
		return this.falecendo = "Já atingi meu tempo de vida, minhas estruturas enfraquecem,\n"
				+"Minha folhas e raízes secam...\n"
				+"Apodreço e me torno nutrientes para o solo\n";
	}
	
}