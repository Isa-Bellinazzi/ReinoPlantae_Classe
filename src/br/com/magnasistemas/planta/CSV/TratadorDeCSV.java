package br.com.magnasistemas.planta.CSV;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import br.com.magnasistemas.planta.angiospermas.*;
import br.com.magnasistemas.planta.angiospermasTipo.*;
import br.com.magnasistemas.planta.briofitas.*;
import br.com.magnasistemas.planta.briofitasTipo.*;
import br.com.magnasistemas.planta.enumerators.*;
import br.com.magnasistemas.planta.gimnospermas.*;
import br.com.magnasistemas.planta.gimnospermasTipo.*;
import br.com.magnasistemas.planta.pteridofitas.*;
import br.com.magnasistemas.planta.pteridofitasTipo.*;

public class TratadorDeCSV {
	List<Angiospermas> angiospermas = new ArrayList<Angiospermas>();
	List<Briofitas> briofitas = new ArrayList<Briofitas>();
	List<Gimnospermas> gimnospermas = new ArrayList<Gimnospermas>();
	List<Pteridofitas> pteridofitas = new ArrayList<Pteridofitas>();

	Filo tiposFilo;
	Ordem tiposOrdem;
	Classes tiposClasses;

	public void trataCSVAngiospermas(RegistroDeEntrada registro) {
		tiposFilo = registro.pegaOsTiposDeFilo();
		tiposOrdem = registro.pegaOsTiposDeOrdem();
		tiposClasses = registro.pegaOsTiposDeClasses();
		if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
				&& tiposOrdem == Ordem.ASTERACEAE) {
			Alface alface = new Alface.AlfaceBuilder().build();
			Girassol girassol = new Girassol.GirassolBuilder().build();
			angiospermas.add(alface);
			angiospermas.add(girassol);
		} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
				&& tiposOrdem == Ordem.ROSACEAS) {
			Ameixas ameixas = new Ameixas.AmeixasBuilder().build();
			Damasqueiro damasco = new Damasqueiro.DamasqueiroBuilder().build();
			angiospermas.add(ameixas);
			angiospermas.add(damasco);
		} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
				&& tiposOrdem == Ordem.LEGUMINOSAS) {
			Feijao feijao = new Feijao.FeijaoBuilder().build();
			Soja soja = new Soja.SojaBuilder().build(); 
			angiospermas.add(feijao);
			angiospermas.add(soja);
		} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.MONOCOTILEDONEAS
				&& tiposOrdem == Ordem.SEM_ORDEM) {
			Bananeira bananeira = new Bananeira.BananeiraBuilder().build();
			Aveia aveia = new Aveia.AveiaBuilder().build();
			angiospermas.add(bananeira);
			angiospermas.add(aveia);
		} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses != Classes.EUDICOTILEDONEAS
				&& tiposOrdem != Ordem.ASTERACEAE
				|| tiposFilo == Filo.ANGIOSPERMAS && tiposClasses != Classes.EUDICOTILEDONEAS
						&& tiposOrdem != Ordem.ROSACEAS
				|| tiposFilo == Filo.ANGIOSPERMAS && tiposClasses != Classes.EUDICOTILEDONEAS
						&& tiposOrdem != Ordem.LEGUMINOSAS
				|| tiposFilo == Filo.ANGIOSPERMAS && tiposClasses != Classes.MONOCOTILEDONEAS
						&& tiposOrdem != Ordem.SEM_ORDEM) {
			System.out.println("Alguns dados inseridos no Filo Angiospermas são inválidos, esses dados não serão impressos na Consulta!");

		}
	}

	public void trataCSVBriofitas(RegistroDeEntrada registro) {
		tiposFilo = registro.pegaOsTiposDeFilo();
		tiposOrdem = registro.pegaOsTiposDeOrdem();
		tiposClasses = registro.pegaOsTiposDeClasses();
		if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.MARCHANTIOPHYTA && tiposOrdem == Ordem.HEPATICAS) {
			Riccia riccia = new Riccia.RicciaBuilder().build();
			Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
			briofitas.add(riccia);
			briofitas.add(marchantia);
		} else if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.BRYOPHYTA && tiposOrdem == Ordem.MUSGOS) {
			Sphagnidae sphagnidae = new Sphagnidae.SphagnidaeBuilder().build();
			Andreaeidae andreaeidae = new Andreaeidae.AndreaeidaeBuilder().build();
			briofitas.add(sphagnidae);
			briofitas.add(andreaeidae);
		} else if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.ANTHOCEROPHYTA
				&& tiposOrdem == Ordem.ANTOCEROS) {
			Agrestis agrestis = new Agrestis.AgrestisBuilder().build();
			Fusiformis fusiformis = new Fusiformis.FusiformisBuilder().build();
			briofitas.add(agrestis);
			briofitas.add(fusiformis);
		} else if (tiposFilo == Filo.BRIOFITAS && tiposClasses != Classes.MARCHANTIOPHYTA
				&& tiposOrdem != Ordem.HEPATICAS
				|| tiposFilo == Filo.BRIOFITAS && tiposClasses != Classes.BRYOPHYTA && tiposOrdem != Ordem.MUSGOS
				|| tiposFilo == Filo.BRIOFITAS && tiposClasses != Classes.ANTHOCEROPHYTA
						&& tiposOrdem != Ordem.ANTOCEROS) {
			System.out.println("Alguns dados no Filo Briofita são inválidos, esses dados não serão impressos na consulta!");
		}
	}

	public void trataCSVGimnospermas(RegistroDeEntrada registro) {
		tiposFilo = registro.pegaOsTiposDeFilo();
		tiposOrdem = registro.pegaOsTiposDeOrdem();
		tiposClasses = registro.pegaOsTiposDeClasses();
		if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CONIFERAS && tiposOrdem == Ordem.SEM_ORDEM) {
			Araucarias araucarias = new Araucarias.AraucariasBuilder().build();
			Pinheiros pinheiros = new Pinheiros.PinheirosBuilder().build();
			gimnospermas.add(araucarias);
			gimnospermas.add(pinheiros);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CICADOFITAS
				&& tiposOrdem == Ordem.CYCADACEAE) {
			Cicadaceas cicadaceas = new Cicadaceas.CicadaceasBuilder().build();
			gimnospermas.add(cicadaceas);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CICADOFITAS
				&& tiposOrdem == Ordem.ZAMIACEAE) {
			Zamiaceaes zamiaceae = new Zamiaceaes.ZamiaceaesBuilder().build();
			gimnospermas.add(zamiaceae);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CICADOFITAS
				&& tiposOrdem == Ordem.STANGERIACEAE) {
			StangeriaEriopus eriopus = new StangeriaEriopus.StangeriaEriopusBuilder().build();
			gimnospermas.add(eriopus);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.GNETOPHYTA
				&& tiposOrdem == Ordem.WELWITSCHIALES) {
			WelwitschiaMirabilis mirabilis = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
			gimnospermas.add(mirabilis);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.GNETOPHYTA
				&& tiposOrdem == Ordem.GNETALES) {
			Gnetum gnetum = new Gnetum.GnetumBuilder().build();
			gimnospermas.add(gnetum);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.GNETOPHYTA
				&& tiposOrdem == Ordem.EPHEDRALES) {
			MaHuang mahuang = new MaHuang.MaHuangBuilder().build();
			gimnospermas.add(mahuang);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.GINKGOPHYTA
				&& tiposOrdem == Ordem.SEM_ORDEM) {
			GinkgoBiloba biloba = new GinkgoBiloba.GinkgoBilobaBuilder().build();
			gimnospermas.add(biloba);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.CONIFERAS && tiposOrdem != Ordem.SEM_ORDEM
				|| tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.CICADOFITAS
						&& tiposOrdem != Ordem.CYCADACEAE
				|| tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.CICADOFITAS
						&& tiposOrdem != Ordem.ZAMIACEAE
				|| tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.CICADOFITAS
						&& tiposOrdem != Ordem.STANGERIACEAE
				|| tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.GNETOPHYTA
						&& tiposOrdem != Ordem.WELWITSCHIALES
				|| tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.GNETOPHYTA && tiposOrdem != Ordem.GNETALES
				|| tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.GNETOPHYTA
						&& tiposOrdem != Ordem.EPHEDRALES
				|| tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.GINKGOPHYTA
						&& tiposOrdem != Ordem.SEM_ORDEM) {
			System.out.println("Alguns dados no Filo Gimnospermas são inválidos, esses dados não serão impressos na consulta!");

		}
	}

	public void trataCSVPteridofitas(RegistroDeEntrada registro) {
		tiposFilo = registro.pegaOsTiposDeFilo();
		tiposOrdem = registro.pegaOsTiposDeOrdem();
		tiposClasses = registro.pegaOsTiposDeClasses();
		if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.MONILOPHYTA && tiposOrdem == Ordem.SEM_ORDEM) {
			Cavalinha cavalinha = new Cavalinha.CavalinhaBuilder().build();
			Samambaia samambaia = new Samambaia.SamambaiaBuilder().build();
			pteridofitas.add(cavalinha);
			pteridofitas.add(samambaia);
		} else if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.LYCOPODIOPHYTA
				&& tiposOrdem == Ordem.LICOPODIOS) {
			Clavatum clavatum = new Clavatum.ClavatumBuilder().build();
			pteridofitas.add(clavatum);
		} else if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.LYCOPODIOPHYTA
				&& tiposOrdem == Ordem.ISOETES) {
			Azorica azorica = new Azorica.AzoricaBuilder().build();
			pteridofitas.add(azorica);
		} else if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.LYCOPODIOPHYTA
				&& tiposOrdem == Ordem.SELAGINELLAS) {
			Moellendorffii moellendorffii = new Moellendorffii.MoellendorffiiBuilder().build();
			pteridofitas.add(moellendorffii);
		}else if(tiposFilo == Filo.PTERIDOFITAS && tiposClasses != Classes.LYCOPODIOPHYTA
				&& tiposOrdem != Ordem.LICOPODIOS
				|| tiposFilo == Filo.PTERIDOFITAS && tiposClasses != Classes.LYCOPODIOPHYTA
				&& tiposOrdem != Ordem.ISOETES
				||tiposFilo == Filo.PTERIDOFITAS && tiposClasses != Classes.LYCOPODIOPHYTA
				&& tiposOrdem != Ordem.SELAGINELLAS) {
			System.out.println("Alguns dados no Filo Pteridofitas são inválidos, esses dados não serão impressos na consulta!");

		}

	}

	public List<Angiospermas> pegaRegistroAngiospermas() {
		return angiospermas;
	}

	public List<Briofitas> pegaRegistroBriofitas() {
		return briofitas;
	}

	public List<Gimnospermas> pegaRegistroGimnospermas() {
		return gimnospermas;
	}

	public List<Pteridofitas> pegaRegistroPteridofitas() {
		return pteridofitas;
	}

}
