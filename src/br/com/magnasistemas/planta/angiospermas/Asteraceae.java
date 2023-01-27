package br.com.magnasistemas.planta.angiospermas;
import br.com.magnasistemas.planta.enumerators.*;;

public abstract class Asteraceae extends Eudicotiledoneas {
	protected  Folhagem tiposFolhagem = Folhagem.HETERMORFICA;
	protected final Ordem tiposOrdem = Ordem.ASTERACEAE;
	protected final Extras tiposExtras = Extras.ERVAS;
	protected final Estruturas tiposEstruturas = Estruturas.ARVORES_ARBUSTOS;
	protected final Flores tiposFlores = Flores.CONCAVO_OU_PLANO_CONVEXO;
	protected final Frutos tiposFrutos = Frutos.INDEISCENTES;
	protected final Raiz tiposRaiz = Raiz.PIVOTANTE_OU_AXIAL_PRINCIPAL;
	protected final Caule tiposCaule = Caule.CILINDRICO;
}