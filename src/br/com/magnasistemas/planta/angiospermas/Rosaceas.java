package br.com.magnasistemas.planta.angiospermas;
import br.com.magnasistemas.planta.enumerators.*;

public abstract class Rosaceas extends Eudicotiledoneas {
	protected final Ordem tiposOrdem = Ordem.ROSACEAS;
	protected final Extras tiposExtras = Extras.ERVAS;
	protected final Flores tiposFlores = Flores.CONCAVO_OU_PLANO_CONVEXO;
	protected Folhagem tiposFolhagem = Folhagem.COMPOSTAS;
	protected Caule tiposCaule = Caule.CILINDRICO;
	protected Frutos tiposFrutos = Frutos.AGREGADOS;
}