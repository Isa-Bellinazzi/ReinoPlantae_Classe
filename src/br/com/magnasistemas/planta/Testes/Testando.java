package br.com.magnasistemas.planta.Testes;

import br.com.magnasistemas.planta.DadosFilos.DadoA;
import br.com.magnasistemas.planta.angiospermas.Monocotiledoneas;
import br.com.magnasistemas.planta.angiospermasTipo.Alface;
import br.com.magnasistemas.planta.angiospermasTipo.Ameixas;
import br.com.magnasistemas.planta.angiospermasTipo.Aveia;
import br.com.magnasistemas.planta.angiospermasTipo.Bananeira;
import br.com.magnasistemas.planta.angiospermasTipo.Damasqueiro;
import br.com.magnasistemas.planta.angiospermasTipo.Feijao;
import br.com.magnasistemas.planta.angiospermasTipo.Girassol;
import br.com.magnasistemas.planta.angiospermasTipo.Soja;
import br.com.magnasistemas.planta.briofitasTipo.Agrestis;
import br.com.magnasistemas.planta.briofitasTipo.Andreaeidae;
import br.com.magnasistemas.planta.briofitasTipo.Fusiformis;
import br.com.magnasistemas.planta.briofitasTipo.Marchantia;
import br.com.magnasistemas.planta.briofitasTipo.Riccia;
import br.com.magnasistemas.planta.briofitasTipo.Sphagnidae;
import br.com.magnasistemas.planta.gimnospermasTipo.Araucarias;
import br.com.magnasistemas.planta.gimnospermasTipo.Cicadaceas;
import br.com.magnasistemas.planta.gimnospermasTipo.GinkgoBiloba;
import br.com.magnasistemas.planta.gimnospermasTipo.Gnetum;
import br.com.magnasistemas.planta.gimnospermasTipo.MaHuang;
import br.com.magnasistemas.planta.gimnospermasTipo.Pinheiros;
import br.com.magnasistemas.planta.gimnospermasTipo.StangeriaEriopus;
import br.com.magnasistemas.planta.gimnospermasTipo.WelwitschiaMirabilis;
import br.com.magnasistemas.planta.gimnospermasTipo.Zamiaceaes;
import br.com.magnasistemas.planta.pteridofitasTipo.Azorica;
import br.com.magnasistemas.planta.pteridofitasTipo.Cavalinha;
import br.com.magnasistemas.planta.pteridofitasTipo.Clavatum;
import br.com.magnasistemas.planta.pteridofitasTipo.Moellendorffii;
import br.com.magnasistemas.planta.pteridofitasTipo.Samambaia;

public class Testando {
	public static void main(String[] args) {

		/*Bananeira bananeira = new Bananeira.BananeiraBuilder().build();
		Monocotiledoneas aveia = new Aveia.AveiaBuilder().build();
		Alface alface = new Alface.AlfaceBuilder().build();
		Girassol girassol = new Girassol.GirassolBuilder().build();
		Feijao feijao = new Feijao.FeijaoBuilder().build();
		Soja soja = new Soja.SojaBuilder().build();
		Ameixas ameixas = new Ameixas.AmeixasBuilder().build();
		Damasqueiro damasco = new Damasqueiro.DamasqueiroBuilder().build();
		Riccia riccia = new Riccia.RicciaBuilder().build();
		Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
		Agrestis agrestis = new Agrestis.AgrestisBuilder().build();
		Fusiformis fusiformis = new Fusiformis.FusiformisBuilder().build();
		Andreaeidae andreaeidae = new Andreaeidae.AndreaeidaeBuilder().build();
		Sphagnidae sphagnidae = new Sphagnidae.SphagnidaeBuilder().build();
		Clavatum clavatum = new Clavatum.ClavatumBuilder().build();
		Azorica azorica = new Azorica.AzoricaBuilder().build();
		Moellendorffii moellendorffii = new Moellendorffii.MoellendorffiiBuilder().build();
		Cavalinha cavalinha = new Cavalinha.CavalinhaBuilder().build();
		Samambaia samambaia = new Samambaia.SamambaiaBuilder().build();
		Araucarias araucarias = new Araucarias.AraucariasBuilder().build();
		Pinheiros pinheiros = new Pinheiros.PinheirosBuilder().build();
		Cicadaceas cicadaceas = new Cicadaceas.CicadaceasBuilder().build();
		Zamiaceaes zamiaceaes = new Zamiaceaes.ZamiaceaesBuilder().build();
		StangeriaEriopus eriopus = new StangeriaEriopus.StangeriaEriopusBuilder().build();
		MaHuang mahuang = new MaHuang.MaHuangBuilder().build();
		WelwitschiaMirabilis mirabilis = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
		Gnetum gnetum = new Gnetum.GnetumBuilder().build();
		GinkgoBiloba biloba = new GinkgoBiloba.GinkgoBilobaBuilder().build();
		DadoA teste = new DadoA.DadoABuilder().build();
		System.out.println("========MONOCOTILEDÔNEAS===========");
		System.out.println();
		System.out.println(aveia);
		System.out.println();
		System.out.println("========ASTERACEAE===========");
		System.out.println(alface);
		System.out.println();
		System.out.println(girassol);
		System.out.println();
		System.out.println("========LEGUMINOSAS===========");
		System.out.println(feijao);
		System.out.println();
		System.out.println(soja);
		System.out.println();
		System.out.println("========ROSACEAS===========");
		System.out.println(ameixas);
		System.out.println();
		System.out.println(damasco);
		System.out.println();
		System.out.println("========HEPATICAS===========");
		System.out.println(riccia);
		System.out.println();
		System.out.println(marchantia);
		System.out.println();
		System.out.println("========ANTOCEROS===========");
		System.out.println(agrestis);
		System.out.println();
		System.out.println(fusiformis);
		System.out.println();
		System.out.println("========MUSGOS===========");
		System.out.println(andreaeidae);
		System.out.println();
		System.out.println(sphagnidae);
		System.out.println();
		System.out.println("========LICOPODIOS===========");
		System.out.println(clavatum);
		System.out.println();
		System.out.println("========ISOETES===========");
		System.out.println(azorica);
		System.out.println();
		System.out.println("========SELAGINELLAS===========");
		System.out.println(moellendorffii);
		System.out.println();
		System.out.println("========MONILOPHYTAS===========");
		System.out.println(cavalinha);
		System.out.println();
		System.out.println(samambaia);
		System.out.println();
		System.out.println("========CONÍFEROS===========");
		System.out.println(araucarias);
		System.out.println();
		System.out.println(pinheiros);
		System.out.println();
		System.out.println("========CICADÓFITAS===========");
		System.out.println(cicadaceas);
		System.out.println();
		System.out.println(zamiaceaes);
		System.out.println();
		System.out.println(eriopus);
		System.out.println();
		System.out.println("========EPHEDRALES===========");
		System.out.println(mahuang);
		System.out.println();
		System.out.println("========WELWISCHIALES===========");
		System.out.println(mirabilis);
		System.out.println();
		System.out.println("========GNETALES================");
		System.out.println(gnetum);
		System.out.println();
		System.out.println("========GINKGOPHYTA================");
		System.out.println(biloba);
		System.out.println();
		System.out.println(teste);
		System.out.println(teste.equals(biloba));


		System.out.println(aveia.nascendo());
		System.out.println(aveia.crescimento());
		System.out.println(aveia.fotossintese());
		System.out.println(aveia.reproducao());
		System.out.println(aveia.falecendo());

		System.out.println(alface.nascendo());
		System.out.println(alface.crescimento());
		System.out.println(alface.fotossintese());
		System.out.println(alface.reproducao());
		System.out.println(alface.falecendo());
		
		System.out.println(girassol.nascendo());
		System.out.println(girassol.crescimento());
		System.out.println(girassol.fotossintese());
		System.out.println(girassol.reproducao());
		System.out.println(girassol.falecendo());
		
		System.out.println(feijao.nascendo());
		System.out.println(feijao.crescimento());
		System.out.println(feijao.fotossintese());
		System.out.println(feijao.reproducao());
		System.out.println(feijao.falecendo());
		
		System.out.println(soja.nascendo());
		System.out.println(soja.crescimento());
		System.out.println(soja.fotossintese());
		System.out.println(soja.reproducao());
		System.out.println(soja.falecendo());
		
		System.out.println(ameixas.nascendo());
		System.out.println(ameixas.crescimento());
		System.out.println(ameixas.fotossintese());
		System.out.println(ameixas.reproducao());
		System.out.println(ameixas.falecendo());
		
		System.out.println(damasco.nascendo());
		System.out.println(damasco.crescimento());
		System.out.println(damasco.fotossintese());
		System.out.println(damasco.reproducao());
		System.out.println(damasco.falecendo());
		
		System.out.println(riccia.nascendo());
		System.out.println(riccia.crescimento());
		System.out.println(riccia.fotossintese());
		System.out.println(riccia.reproducao());
		System.out.println(riccia.falecendo());
		
		System.out.println(marchantia.nascendo());
		System.out.println(marchantia.crescimento());
		System.out.println(marchantia.fotossintese());
		System.out.println(marchantia.reproducao());
		System.out.println(marchantia.falecendo());
		
		System.out.println(agrestis.nascendo());
		System.out.println(agrestis.crescimento());
		System.out.println(agrestis.fotossintese());
		System.out.println(agrestis.reproducao());
		System.out.println(agrestis.falecendo());
		
		System.out.println(fusiformis.nascendo());
		System.out.println(fusiformis.crescimento());
		System.out.println(fusiformis.fotossintese());
		System.out.println(fusiformis.reproducao());
		System.out.println(fusiformis.falecendo());
		
		System.out.println(andreaeidae.nascendo());
		System.out.println(andreaeidae.crescimento());
		System.out.println(andreaeidae.fotossintese());
		System.out.println(andreaeidae.reproducao());
		System.out.println(andreaeidae.falecendo());
		
		System.out.println(sphagnidae.nascendo());
		System.out.println(sphagnidae.crescimento());
		System.out.println(sphagnidae.fotossintese());
		System.out.println(sphagnidae.reproducao());
		System.out.println(sphagnidae.falecendo());
		
		System.out.println(clavatum.nascendo());
		System.out.println(clavatum.crescimento());
		System.out.println(clavatum.fotossintese());
		System.out.println(clavatum.reproducao());
		System.out.println(clavatum.falecendo());*/
	
	Samambaia samambaia = new Samambaia.SamambaiaBuilder().build();
	System.out.println(samambaia.nascendo());
	System.out.println(samambaia.crescimento());
	System.out.println(samambaia.fotossintese());
	System.out.println(samambaia.reproducao());
	System.out.println(samambaia.falecendo());
	
	}
	public void readCSVFile() {
		// TODO Auto-generated method stub
		
	}

}
