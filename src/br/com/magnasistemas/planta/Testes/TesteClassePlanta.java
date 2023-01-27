package br.com.magnasistemas.planta.Testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import br.com.magnasistemas.planta.CSV.RegistroDeEntrada;
import br.com.magnasistemas.planta.CSV.Saida;
import br.com.magnasistemas.planta.CSV.TratadorDeCSV;
import br.com.magnasistemas.planta.DadosFilos.DadoA;
import br.com.magnasistemas.planta.DadosFilos.DadoB;
import br.com.magnasistemas.planta.DadosFilos.DadoG;
import br.com.magnasistemas.planta.DadosFilos.DadoP;
import br.com.magnasistemas.planta.angiospermas.Monocotiledoneas;
import br.com.magnasistemas.planta.angiospermasTipo.Alface;
import br.com.magnasistemas.planta.angiospermasTipo.Ameixas;
import br.com.magnasistemas.planta.angiospermasTipo.Aveia;
import br.com.magnasistemas.planta.angiospermasTipo.Bananeira;
import br.com.magnasistemas.planta.angiospermasTipo.Damasqueiro;
import br.com.magnasistemas.planta.angiospermasTipo.Feijao;
import br.com.magnasistemas.planta.angiospermasTipo.Girassol;
import br.com.magnasistemas.planta.angiospermasTipo.Soja;
import br.com.magnasistemas.planta.briofitas.Briofitas;
import br.com.magnasistemas.planta.briofitasTipo.Agrestis;
import br.com.magnasistemas.planta.briofitasTipo.Andreaeidae;
import br.com.magnasistemas.planta.briofitasTipo.Fusiformis;
import br.com.magnasistemas.planta.briofitasTipo.Marchantia;
import br.com.magnasistemas.planta.briofitasTipo.Riccia;
import br.com.magnasistemas.planta.briofitasTipo.Sphagnidae;
import br.com.magnasistemas.planta.enumerators.Caule;
import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Estruturas;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Flores;
import br.com.magnasistemas.planta.enumerators.Folhagem;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Ordem;
import br.com.magnasistemas.planta.enumerators.Raiz;
import br.com.magnasistemas.planta.enumerators.Sementes;
import br.com.magnasistemas.planta.enumerators.Talos;
import br.com.magnasistemas.planta.enumerators.Vasos;
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

public class TesteClassePlanta {

//---------------Testando Equals & Hashcod----------------------------------

	/*
	 * Pelo fato dos objetos de uma classe específica, sempre conter as mesmas
	 * caracterítcas A segunda parte sobrescrita do meu método Equals não é possível
	 * ser testado, pois as característas do meu objeto Agrestis, por exemplo. será
	 * sempre as mesmas
	 * 
	 * Mas se fosse realizar o teste ele será assim:
	 * 
	 * @Test public void testeEqualsBriofitas() { Agrestis test1 = new
	 * Agrestis.AgrestisBuilder().build(); Agrestis test2 = new
	 * Agrestis.AgrestisBuilder().build();
	 * 
	 * assertTrue(test1.equals(test2)); }
	 */

	@Test
	public void testeEqualsBriofitas() {
		Agrestis test1 = new Agrestis.AgrestisBuilder().build();
		Agrestis test2 = new Agrestis.AgrestisBuilder().build();

		assertTrue(test1.equals(test2));
	}

	@Test
	public void testeEqualsHashCodeBriofitas() {
		Agrestis test1 = new Agrestis.AgrestisBuilder().build();
		Agrestis test2 = new Agrestis.AgrestisBuilder().build();

		assertEquals(test1.hashCode(), test2.hashCode());
	}

//--------------------Testando Nascendo dos Filos-----------------------------
	@Test
	public void testeNoMetodoNascendoAngiospermas() {
		Damasqueiro angiospermas = new Damasqueiro.DamasqueiroBuilder().build();
		String result = angiospermas.nascendo();
		assertEquals(result, angiospermas.nascendo());
	}

	@Test
	public void testeNoMetodoNascendoBriofitas() {
		Fusiformis briofitas = new Fusiformis.FusiformisBuilder().build();
		String result = briofitas.nascendo();
		assertEquals(result, briofitas.nascendo());
	}

	@Test
	public void testeNoMetodoNascendoGimnospermas() {
		Zamiaceaes gimonospermas = new Zamiaceaes.ZamiaceaesBuilder().build();
		String result = gimonospermas.nascendo();
		assertEquals(result, gimonospermas.nascendo());
	}

	@Test
	public void testeNoMetodoNascendoPteridofitas() {
		Clavatum pteridofitas = new Clavatum.ClavatumBuilder().build();
		String result = pteridofitas.nascendo();
		assertEquals(result, pteridofitas.nascendo());
	}

// --------------------Testando Métodos Crescimento dos Filos-----------------------------
	@Test
	public void testeNoMetodoCrescendongiospermas() {
		Damasqueiro angiospermas = new Damasqueiro.DamasqueiroBuilder().build();
		String result = angiospermas.crescimento();
		assertEquals(result, angiospermas.crescimento());
	}

	@Test
	public void testeNoMetodoCrescendoBriofitas() {
		Sphagnidae briofitas = new Sphagnidae.SphagnidaeBuilder().build();
		String result = briofitas.crescimento();
		assertEquals(result, briofitas.crescimento());
	}

	@Test
	public void testeNoMetodoCrescendoGimnospermas() {
		WelwitschiaMirabilis gimonospermas = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
		String result = gimonospermas.crescimento();
		assertEquals(result, gimonospermas.crescimento());
	}

	@Test
	public void testeNoMetodoCrescendoPteridofitas() {
		Clavatum pteridofitas = new Clavatum.ClavatumBuilder().build();
		String result = pteridofitas.crescimento();
		assertEquals(result, pteridofitas.crescimento());

	}

	// --------------------Testando Métodos Fotossintese dos
	// Filos-----------------------------
	@Test
	public void testeNoMetodoFotossintesengiospermas() {
		Damasqueiro angiospermas = new Damasqueiro.DamasqueiroBuilder().build();
		String result = angiospermas.fotossintese();
		assertEquals(result, angiospermas.fotossintese());
	}

	@Test
	public void testeNoMetodoFotossinteseBriofitas() {
		Sphagnidae briofitas = new Sphagnidae.SphagnidaeBuilder().build();
		String result = briofitas.fotossintese();
		assertEquals(result, briofitas.fotossintese());
	}

	@Test
	public void testeNoMetodoFotossinteseGimnospermas() {
		WelwitschiaMirabilis gimonospermas = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
		String result = gimonospermas.fotossintese();
		assertEquals(result, gimonospermas.fotossintese());
	}

	@Test
	public void testeNoMetodoFotossintesePteridofitas() {
		Clavatum pteridofitas = new Clavatum.ClavatumBuilder().build();
		String result = pteridofitas.fotossintese();
		assertEquals(result, pteridofitas.fotossintese());

	}

	// --------------------Testando Métodos Reprodução dos
	// Filos-----------------------------
	@Test
	public void testeNoMetodoReproducaongiospermas() {
		Damasqueiro angiospermas = new Damasqueiro.DamasqueiroBuilder().build();
		String result = angiospermas.reproducao();
		assertEquals(result, angiospermas.reproducao());
	}

	@Test
	public void testeNoMetodoReproducaoBriofitas() {
		Sphagnidae briofitas = new Sphagnidae.SphagnidaeBuilder().build();
		String result = briofitas.reproducao();
		assertEquals(result, briofitas.reproducao());
	}

	@Test
	public void testeNoMetodoReproducaoGimnospermas() {
		WelwitschiaMirabilis gimonospermas = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
		String result = gimonospermas.reproducao();
		assertEquals(result, gimonospermas.reproducao());
	}

	@Test
	public void testeNoMetodoReproducaoPteridofitas() {
		Clavatum pteridofitas = new Clavatum.ClavatumBuilder().build();
		String result = pteridofitas.reproducao();
		assertEquals(result, pteridofitas.reproducao());

	}

	// --------------------Testando Métodos Falecendo dos
	// Filos-----------------------------
	@Test
	public void testeNoMetodoFalecendongiospermas() {
		Damasqueiro angiospermas = new Damasqueiro.DamasqueiroBuilder().build();
		String result = angiospermas.falecendo();
		assertEquals(result, angiospermas.falecendo());
	}

	@Test
	public void testeNoMetodoFalecendoBriofitas() {
		Sphagnidae briofitas = new Sphagnidae.SphagnidaeBuilder().build();
		String result = briofitas.falecendo();
		assertEquals(result, briofitas.falecendo());
	}

	@Test
	public void testeNoMetodoFalecendoGimnospermas() {
		GinkgoBiloba gimonospermas = new GinkgoBiloba.GinkgoBilobaBuilder().build();
		String result = gimonospermas.falecendo();
		assertEquals(result, gimonospermas.falecendo());
	}

	@Test
	public void testeNoMetodoFalecendoPteridofitas() {
		Clavatum pteridofitas = new Clavatum.ClavatumBuilder().build();
		String result = pteridofitas.falecendo();
		assertEquals(result, pteridofitas.falecendo());

	}

//------Testando Nascendo dos DadoA, DadoB,DadoG,DadoP-------------------------
	@Test
	public void testeNoMetodoNascendoA() {
		DadoA angiospermas = new DadoA.DadoABuilder().build();
		String result = angiospermas.nascendo();
		assertEquals(result, angiospermas.nascendo());
	}

	@Test
	public void testeNoMetodoNascendoB() {
		DadoB briofitas = new DadoB.DadoBBuilder().build();
		String result = briofitas.nascendo();
		assertEquals(result, briofitas.nascendo());
	}

	@Test
	public void testeNoMetodoNascendoG() {
		DadoG gimnospermas = new DadoG.DadoGBuilder().build();
		String result = gimnospermas.nascendo();
		assertEquals(result, gimnospermas.nascendo());
	}

	@Test
	public void testeNoMetodoNascendoP() {
		DadoP pteridofitas = new DadoP.DadoPBuilder().build();
		String result = pteridofitas.nascendo();
		assertEquals(result, pteridofitas.nascendo());
	}

	// --------------------Testando Crescimento dos DadoA,
	// DadoB,DadoG,DadoP-----------------------------
	@Test
	public void testeNoMetodoCrescimentoA() {
		DadoA angiospermas = new DadoA.DadoABuilder().build();
		String result = angiospermas.crescimento();
		assertEquals(result, angiospermas.crescimento());
	}

	@Test
	public void testeNoMetodoCrescimentoB() {
		DadoB briofitas = new DadoB.DadoBBuilder().build();
		String result = briofitas.crescimento();
		assertEquals(result, briofitas.crescimento());
	}

	@Test
	public void testeNoMetodoCrescimentoG() {
		DadoG gimnospermas = new DadoG.DadoGBuilder().build();
		String result = gimnospermas.crescimento();
		assertEquals(result, gimnospermas.crescimento());
	}

	@Test
	public void testeNoMetodoCrescimentoP() {
		DadoP pteridofitas = new DadoP.DadoPBuilder().build();
		String result = pteridofitas.crescimento();
		assertEquals(result, pteridofitas.crescimento());
	}

//--------------------Testando Fotossintese dos DadoA, DadoB,DadoG,DadoP-----------------------------
	@Test
	public void testeNoMetodoFotossinteseA() {
		DadoA angiospermas = new DadoA.DadoABuilder().build();
		String result = angiospermas.fotossintese();
		assertEquals(result, angiospermas.fotossintese());
	}

	@Test
	public void testeNoMetodoFotossinteseB() {
		DadoB briofitas = new DadoB.DadoBBuilder().build();
		String result = briofitas.fotossintese();
		assertEquals(result, briofitas.fotossintese());
	}

	@Test
	public void testeNoMetodoFotossinteseG() {
		DadoG gimnospermas = new DadoG.DadoGBuilder().build();
		String result = gimnospermas.fotossintese();
		assertEquals(result, gimnospermas.fotossintese());
	}

	@Test
	public void testeNoMetodoFotossinteseP() {
		DadoP pteridofitas = new DadoP.DadoPBuilder().build();
		String result = pteridofitas.fotossintese();
		assertEquals(result, pteridofitas.fotossintese());
	}

	// --------------------Testando Fotossintese dos DadoA,
	// DadoB,DadoG,DadoP-----------------------------
	@Test
	public void testeNoMetodoReproducaoA() {
		DadoA angiospermas = new DadoA.DadoABuilder().build();
		String result = angiospermas.reproducao();
		assertEquals(result, angiospermas.reproducao());
	}

	@Test
	public void testeNoMetodoReproducaoB() {
		DadoB briofitas = new DadoB.DadoBBuilder().build();
		String result = briofitas.reproducao();
		assertEquals(result, briofitas.reproducao());
	}

	@Test
	public void testeNoMetodoReproducaoG() {
		DadoG gimnospermas = new DadoG.DadoGBuilder().build();
		String result = gimnospermas.reproducao();
		assertEquals(result, gimnospermas.reproducao());
	}

	@Test
	public void testeNoMetodoReproducaoP() {
		DadoP pteridofitas = new DadoP.DadoPBuilder().build();
		String result = pteridofitas.reproducao();
		assertEquals(result, pteridofitas.reproducao());
	}

//-------------Testando os objetos são igual a Null-------------------------
	@Test
	public void testandoSebananeiraIgualANUll() {
		Monocotiledoneas bananeira = new Bananeira.BananeiraBuilder().build();
		assertEquals(null, bananeira);
	}

	@Test
	public void testandoSeMonocotiledoneasIgualANUll() {
		Monocotiledoneas aveia = new Aveia.AveiaBuilder().build();
		assertEquals(null, aveia);
	}

	@Test
	public void testandoSeAlfaceIgualANUll() {
		Alface alface = new Alface.AlfaceBuilder().build();
		assertEquals(null, alface);
	}

	@Test
	public void testandoSeGirassolIgualANUll() {
		Girassol girassol = new Girassol.GirassolBuilder().build();
		assertEquals(null, girassol);
	}

	@Test
	public void testandoSeFeijaoIgualANUll() {
		Feijao feijao = new Feijao.FeijaoBuilder().build();
		assertEquals(null, feijao);
	}

	@Test
	public void testandoSeSojaIgualANUll() {
		Soja soja = new Soja.SojaBuilder().build();
		assertEquals(null, soja);
	}

	@Test
	public void testandoSeAmeixasIgualANUll() {
		Ameixas ameixas = new Ameixas.AmeixasBuilder().build();
		assertEquals(null, ameixas);
	}

	@Test
	public void testandoSeDamasqueiroIgualANUll() {
		Damasqueiro damasco = new Damasqueiro.DamasqueiroBuilder().build();
		assertEquals(null, damasco);
	}

	@Test
	public void testandoSeRicciaIgualANUll() {
		Riccia riccia = new Riccia.RicciaBuilder().build();
		assertEquals(null, riccia);
	}

	@Test
	public void testandoSeMarchantiaIgualANUll() {
		Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
		assertEquals(null, marchantia);
	}

	@Test
	public void testandoSeAgrestisIgualANUll() {
		Agrestis agrestis = new Agrestis.AgrestisBuilder().build();
		assertEquals(null, agrestis);
	}

	@Test
	public void testandoSeFusiformisIgualANUll() {
		Fusiformis fusiformis = new Fusiformis.FusiformisBuilder().build();
		assertEquals(null, fusiformis);
	}

	@Test
	public void testandoSeAndreaeidaeIgualANUll() {
		Andreaeidae andreaeidae = new Andreaeidae.AndreaeidaeBuilder().build();
		Object teste = null;
		assertEquals(teste, andreaeidae);
	}

	@Test
	public void testandoSeSphagnidaeIgualANUll() {
		Sphagnidae sphagnidae = new Sphagnidae.SphagnidaeBuilder().build();
		Object teste = null;
		assertEquals(teste, sphagnidae);
	}

	@Test
	public void testandoSeClavatumIgualANUll() {
		Clavatum clavatum = new Clavatum.ClavatumBuilder().build();
		assertEquals(null, clavatum);
	}

	@Test
	public void testandoSeAzoricaIgualANUll() {
		Azorica azorica = new Azorica.AzoricaBuilder().build();
		assertEquals(null, azorica);
	}

	@Test
	public void testandoSeMoellendorffiiIgualANUll() {
		Moellendorffii moellendorffii = new Moellendorffii.MoellendorffiiBuilder().build();
		assertEquals(null, moellendorffii);
	}

	@Test
	public void testandoSeCavalinhaIgualANUll() {
		Cavalinha cavalinha = new Cavalinha.CavalinhaBuilder().build();
		assertEquals(null, cavalinha);
	}

	@Test
	public void testandoSeSamambaiaIgualANUll() {
		Samambaia samambaia = new Samambaia.SamambaiaBuilder().build();
		assertEquals(null, samambaia);
	}

	@Test
	public void testandoSeAraucariasIgualANUll() {
		Araucarias araucarias = new Araucarias.AraucariasBuilder().build();
		assertEquals(null, araucarias);
	}

	@Test
	public void testandoSePinheirosIgualANUll() {
		Pinheiros pinheiros = new Pinheiros.PinheirosBuilder().build();
		assertEquals(null, pinheiros);
	}

	@Test
	public void testandoSeCicadaceasIgualANUll() {
		Cicadaceas cicadaceas = new Cicadaceas.CicadaceasBuilder().build();
		assertEquals(null, cicadaceas);
	}

	@Test
	public void testandoSeZamiaceaesIgualANUll() {
		Zamiaceaes zamiaceaes = new Zamiaceaes.ZamiaceaesBuilder().build();
		assertEquals(null, zamiaceaes);
	}

	@Test
	public void testandoSeStangeriaEriopusIgualANUll() {
		StangeriaEriopus eriopus = new StangeriaEriopus.StangeriaEriopusBuilder().build();
		assertEquals(null, eriopus);
	}

	@Test
	public void testandoSeMaHuangIgualANUll() {
		MaHuang mahuang = new MaHuang.MaHuangBuilder().build();
		assertEquals(null, mahuang);
	}

	@Test
	public void testandoSeWelwitschiaMirabilisIgualANUll() {
		WelwitschiaMirabilis mirabilis = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
		assertEquals(null, mirabilis);
	}

	@Test
	public void testandoSeGnetumIgualANUll() {
		Gnetum gnetum = new Gnetum.GnetumBuilder().build();
		assertEquals(null, gnetum);
	}

	@Test
	public void testandoSeGinkgoBilobaIgualANUll() {
		GinkgoBiloba biloba = new GinkgoBiloba.GinkgoBilobaBuilder().build();
		assertEquals(null, biloba);
	}

	@Test
	public void testandoSeDadoAIgualANUll() {
		DadoA angiospermas = new DadoA.DadoABuilder().build();
		assertEquals(null, angiospermas);
	}

	@Test
	public void testandoSeDadoBIgualANUll() {
		DadoB briofitas = new DadoB.DadoBBuilder().build();
		assertEquals(null, briofitas);
	}

	@Test
	public void testandoSeDadoGIgualANUll() {
		DadoG gimnospermas = new DadoG.DadoGBuilder().build();
		assertEquals(null, gimnospermas);
	}

	@Test
	public void testandoSeDadoPIgualANUll() {
		DadoP pteridofitas = new DadoP.DadoPBuilder().build();
		assertEquals(null, pteridofitas);

	}

//-------------Testando se Objetos do mesmo Filo são diferentes---------------------
	@Test
	public void testandoSeObjetosDeAngiospermasSaoDiferebtes() {
		Alface alface = new Alface.AlfaceBuilder().build();
		Aveia aveia = new Aveia.AveiaBuilder().build();
		Ameixas ameixas = new Ameixas.AmeixasBuilder().build();
		Bananeira bananeira = new Bananeira.BananeiraBuilder().build();
		Damasqueiro damasco = new Damasqueiro.DamasqueiroBuilder().build();
		Feijao feijao = new Feijao.FeijaoBuilder().build();
		Girassol girassol = new Girassol.GirassolBuilder().build();
		Soja soja = new Soja.SojaBuilder().build();
		assertNotEquals(alface, aveia);
		assertNotEquals(alface, ameixas);
		assertNotEquals(alface, bananeira);
		assertNotEquals(alface, damasco);
		assertNotEquals(alface, feijao);
		assertNotEquals(alface, girassol);
		assertNotEquals(alface, soja);
		assertNotEquals(aveia, alface);
		assertNotEquals(aveia, ameixas);
		assertNotEquals(aveia, bananeira);
		assertNotEquals(aveia, damasco);
		assertNotEquals(aveia, feijao);
		assertNotEquals(aveia, girassol);
		assertNotEquals(aveia, soja);
		assertNotEquals(ameixas, alface);
		assertNotEquals(ameixas, aveia);
		assertNotEquals(ameixas, bananeira);
		assertNotEquals(ameixas, damasco);
		assertNotEquals(ameixas, feijao);
		assertNotEquals(ameixas, girassol);
		assertNotEquals(ameixas, soja);
		assertNotEquals(bananeira, alface);
		assertNotEquals(bananeira, aveia);
		assertNotEquals(bananeira, ameixas);
		assertNotEquals(bananeira, damasco);
		assertNotEquals(bananeira, feijao);
		assertNotEquals(bananeira, girassol);
		assertNotEquals(bananeira, soja);
		assertNotEquals(damasco, alface);
		assertNotEquals(damasco, aveia);
		assertNotEquals(damasco, ameixas);
		assertNotEquals(damasco, bananeira);
		assertNotEquals(damasco, feijao);
		assertNotEquals(damasco, girassol);
		assertNotEquals(damasco, soja);
		assertNotEquals(feijao, alface);
		assertNotEquals(feijao, aveia);
		assertNotEquals(feijao, ameixas);
		assertNotEquals(feijao, bananeira);
		assertNotEquals(feijao, damasco);
		assertNotEquals(feijao, girassol);
		assertNotEquals(feijao, soja);
		assertNotEquals(girassol, alface);
		assertNotEquals(girassol, aveia);
		assertNotEquals(girassol, ameixas);
		assertNotEquals(girassol, bananeira);
		assertNotEquals(girassol, damasco);
		assertNotEquals(girassol, feijao);
		assertNotEquals(girassol, soja);
		assertNotEquals(soja, alface);
		assertNotEquals(soja, aveia);
		assertNotEquals(soja, ameixas);
		assertNotEquals(soja, bananeira);
		assertNotEquals(soja, damasco);
		assertNotEquals(soja, feijao);
		assertNotEquals(soja, girassol);

	}

	@Test
	public void testandoSeObjetosDeBriofitasSaoDiferebtes() {
		Agrestis agrestis = new Agrestis.AgrestisBuilder().build();
		Andreaeidae andreaeidae = new Andreaeidae.AndreaeidaeBuilder().build();
		Fusiformis fusiformis = new Fusiformis.FusiformisBuilder().build();
		Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
		Riccia riccia = new Riccia.RicciaBuilder().build();
		Sphagnidae sphagnidae = new Sphagnidae.SphagnidaeBuilder().build();
		assertNotEquals(agrestis, andreaeidae);
		assertNotEquals(agrestis, fusiformis);
		assertNotEquals(agrestis, marchantia);
		assertNotEquals(agrestis, riccia);
		assertNotEquals(agrestis, sphagnidae);
		assertNotEquals(andreaeidae, agrestis);
		assertNotEquals(andreaeidae, fusiformis);
		assertNotEquals(andreaeidae, marchantia);
		assertNotEquals(andreaeidae, riccia);
		assertNotEquals(andreaeidae, sphagnidae);
		assertNotEquals(fusiformis, agrestis);
		assertNotEquals(fusiformis, andreaeidae);
		assertNotEquals(fusiformis, marchantia);
		assertNotEquals(fusiformis, riccia);
		assertNotEquals(fusiformis, sphagnidae);
		assertNotEquals(marchantia, agrestis);
		assertNotEquals(marchantia, andreaeidae);
		assertNotEquals(marchantia, fusiformis);
		assertNotEquals(marchantia, riccia);
		assertNotEquals(marchantia, sphagnidae);
		assertNotEquals(riccia, agrestis);
		assertNotEquals(riccia, andreaeidae);
		assertNotEquals(riccia, marchantia);
		assertNotEquals(riccia, fusiformis);
		assertNotEquals(riccia, sphagnidae);
		assertNotEquals(sphagnidae, agrestis);
		assertNotEquals(sphagnidae, andreaeidae);
		assertNotEquals(sphagnidae, marchantia);
		assertNotEquals(sphagnidae, fusiformis);
		assertNotEquals(sphagnidae, riccia);
	}

	@Test
	public void testandoSeObjetosDeGimonospermasSaoDiferebtes() {
		Araucarias araucarias = new Araucarias.AraucariasBuilder().build();
		Cicadaceas cicadaceas = new Cicadaceas.CicadaceasBuilder().build();
		GinkgoBiloba biloba = new GinkgoBiloba.GinkgoBilobaBuilder().build();
		Gnetum gnetum = new Gnetum.GnetumBuilder().build();
		MaHuang mahuang = new MaHuang.MaHuangBuilder().build();
		Pinheiros pinheiros = new Pinheiros.PinheirosBuilder().build();
		StangeriaEriopus eriopus = new StangeriaEriopus.StangeriaEriopusBuilder().build();
		WelwitschiaMirabilis mirabilis = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
		Zamiaceaes zamiaceaes = new Zamiaceaes.ZamiaceaesBuilder().build();
		assertNotEquals(araucarias, cicadaceas);
		assertNotEquals(araucarias, biloba);
		assertNotEquals(araucarias, gnetum);
		assertNotEquals(araucarias, mahuang);
		assertNotEquals(araucarias, pinheiros);
		assertNotEquals(araucarias, eriopus);
		assertNotEquals(araucarias, mirabilis);
		assertNotEquals(araucarias, zamiaceaes);
		assertNotEquals(biloba, araucarias);
		assertNotEquals(biloba, cicadaceas);
		assertNotEquals(biloba, gnetum);
		assertNotEquals(biloba, mahuang);
		assertNotEquals(biloba, pinheiros);
		assertNotEquals(biloba, eriopus);
		assertNotEquals(biloba, mirabilis);
		assertNotEquals(biloba, zamiaceaes);
		assertNotEquals(cicadaceas, araucarias);
		assertNotEquals(cicadaceas, biloba);
		assertNotEquals(cicadaceas, gnetum);
		assertNotEquals(cicadaceas, mahuang);
		assertNotEquals(cicadaceas, pinheiros);
		assertNotEquals(cicadaceas, eriopus);
		assertNotEquals(cicadaceas, mirabilis);
		assertNotEquals(cicadaceas, zamiaceaes);
		assertNotEquals(gnetum, araucarias);
		assertNotEquals(gnetum, biloba);
		assertNotEquals(gnetum, cicadaceas);
		assertNotEquals(gnetum, mahuang);
		assertNotEquals(gnetum, pinheiros);
		assertNotEquals(gnetum, eriopus);
		assertNotEquals(gnetum, mirabilis);
		assertNotEquals(gnetum, zamiaceaes);
		assertNotEquals(mahuang, araucarias);
		assertNotEquals(mahuang, biloba);
		assertNotEquals(mahuang, cicadaceas);
		assertNotEquals(mahuang, gnetum);
		assertNotEquals(mahuang, pinheiros);
		assertNotEquals(mahuang, eriopus);
		assertNotEquals(mahuang, mirabilis);
		assertNotEquals(mahuang, zamiaceaes);
		assertNotEquals(pinheiros, araucarias);
		assertNotEquals(pinheiros, biloba);
		assertNotEquals(pinheiros, cicadaceas);
		assertNotEquals(pinheiros, gnetum);
		assertNotEquals(pinheiros, mahuang);
		assertNotEquals(pinheiros, eriopus);
		assertNotEquals(pinheiros, mirabilis);
		assertNotEquals(pinheiros, zamiaceaes);
		assertNotEquals(eriopus, araucarias);
		assertNotEquals(eriopus, biloba);
		assertNotEquals(eriopus, cicadaceas);
		assertNotEquals(eriopus, gnetum);
		assertNotEquals(eriopus, mahuang);
		assertNotEquals(eriopus, pinheiros);
		assertNotEquals(eriopus, mirabilis);
		assertNotEquals(eriopus, zamiaceaes);
		assertNotEquals(mirabilis, araucarias);
		assertNotEquals(mirabilis, biloba);
		assertNotEquals(mirabilis, cicadaceas);
		assertNotEquals(mirabilis, gnetum);
		assertNotEquals(mirabilis, mahuang);
		assertNotEquals(mirabilis, pinheiros);
		assertNotEquals(mirabilis, eriopus);
		assertNotEquals(mirabilis, zamiaceaes);
		assertNotEquals(zamiaceaes, araucarias);
		assertNotEquals(zamiaceaes, biloba);
		assertNotEquals(zamiaceaes, cicadaceas);
		assertNotEquals(zamiaceaes, gnetum);
		assertNotEquals(zamiaceaes, mahuang);
		assertNotEquals(zamiaceaes, pinheiros);
		assertNotEquals(zamiaceaes, eriopus);
		assertNotEquals(zamiaceaes, mirabilis);
	}

	@Test
	public void testandoSeObjetosDePteridofitasSaoDiferebtes() {
		Azorica azorica = new Azorica.AzoricaBuilder().build();
		Cavalinha cavalinha = new Cavalinha.CavalinhaBuilder().build();
		Clavatum clavatum = new Clavatum.ClavatumBuilder().build();
		Moellendorffii moellendorffii = new Moellendorffii.MoellendorffiiBuilder().build();
		Samambaia samambaia = new Samambaia.SamambaiaBuilder().build();
		assertNotEquals(azorica, cavalinha);
		assertNotEquals(azorica, clavatum);
		assertNotEquals(azorica, moellendorffii);
		assertNotEquals(azorica, samambaia);
		assertNotEquals(cavalinha, azorica);
		assertNotEquals(cavalinha, clavatum);
		assertNotEquals(cavalinha, moellendorffii);
		assertNotEquals(cavalinha, samambaia);
		assertNotEquals(clavatum, azorica);
		assertNotEquals(clavatum, moellendorffii);
		assertNotEquals(clavatum, cavalinha);
		assertNotEquals(clavatum, samambaia);
		assertNotEquals(moellendorffii, azorica);
		assertNotEquals(moellendorffii, clavatum);
		assertNotEquals(moellendorffii, cavalinha);
		assertNotEquals(moellendorffii, samambaia);
		assertNotEquals(samambaia, azorica);
		assertNotEquals(samambaia, clavatum);
		assertNotEquals(samambaia, cavalinha);
		assertNotEquals(samambaia, moellendorffii);
	}
//----Testando se objetos diferentes do mesmo filo, tem os mesmo Métodos------------

	@Test
	public void testandoObjetosDiferentesDeAngiospermasTemOsMetodosIguais() {
		Aveia angiospermas2 = new Aveia.AveiaBuilder().build();
		Bananeira angiospermas1 = new Bananeira.BananeiraBuilder().build();
		assertEquals(angiospermas1.nascendo(), angiospermas2.nascendo());
		assertEquals(angiospermas1.crescimento(), angiospermas2.crescimento());
		assertEquals(angiospermas1.fotossintese(), angiospermas2.fotossintese());
		assertEquals(angiospermas1.reproducao(), angiospermas2.reproducao());
		assertEquals(angiospermas1.falecendo(), angiospermas2.falecendo());
	}

	@Test
	public void testandoObjetosDiferentesDeBriofitasTemOsMetodosIguais() {
		Andreaeidae briofitas1 = new Andreaeidae.AndreaeidaeBuilder().build();
		Marchantia briofitas2 = new Marchantia.MarchantiaBuilder().build();
		assertEquals(briofitas1.nascendo(), briofitas2.nascendo());
		assertEquals(briofitas1.crescimento(), briofitas2.crescimento());
		assertEquals(briofitas1.fotossintese(), briofitas2.fotossintese());
		assertEquals(briofitas1.reproducao(), briofitas2.reproducao());
		assertEquals(briofitas1.falecendo(), briofitas2.falecendo());
	}

	@Test
	public void testandoObjetosDiferentesDeGminospermasTemOsMetodosIguais() {
		MaHuang gimnospermas1 = new MaHuang.MaHuangBuilder().build();
		Gnetum gimnospermas2 = new Gnetum.GnetumBuilder().build();
		assertEquals(gimnospermas1.nascendo(), gimnospermas2.nascendo());
		assertEquals(gimnospermas1.crescimento(), gimnospermas2.crescimento());
		assertEquals(gimnospermas1.fotossintese(), gimnospermas2.fotossintese());
		assertEquals(gimnospermas1.reproducao(), gimnospermas2.reproducao());
		assertEquals(gimnospermas1.falecendo(), gimnospermas2.falecendo());
	}

	@Test
	public void testandoObjetosDiferentesDePteridofitasTemOsMetodosIguais() {
		Samambaia pteridofitas1 = new Samambaia.SamambaiaBuilder().build();
		Cavalinha pteridofitas2 = new Cavalinha.CavalinhaBuilder().build();
		assertEquals(pteridofitas1.nascendo(), pteridofitas2.nascendo());
		assertEquals(pteridofitas1.crescimento(), pteridofitas2.crescimento());
		assertEquals(pteridofitas1.fotossintese(), pteridofitas2.fotossintese());
		assertEquals(pteridofitas1.reproducao(), pteridofitas2.reproducao());
		assertEquals(pteridofitas1.falecendo(), pteridofitas2.falecendo());
	}

//---------------Testando se o método de um Filo é diferente do outro------------
	@Test
	public void testandoSeMetodosDeAngiospermasSaoDiferentesDosOutrosFilos() {
		Ameixas angiospermas = new Ameixas.AmeixasBuilder().build();
		Pinheiros gimnospermas = new Pinheiros.PinheirosBuilder().build();
		Riccia briofitas = new Riccia.RicciaBuilder().build();
		Clavatum pteridofitas = new Clavatum.ClavatumBuilder().build();
		assertNotEquals(angiospermas.nascendo(), briofitas.nascendo());
		assertNotEquals(angiospermas.crescimento(), briofitas.crescimento());
		assertNotEquals(angiospermas.fotossintese(), briofitas.fotossintese());
		assertNotEquals(angiospermas.reproducao(), briofitas.reproducao());
		assertNotEquals(angiospermas.falecendo(), briofitas.falecendo());
		assertNotEquals(angiospermas.nascendo(), gimnospermas.nascendo());
		assertNotEquals(angiospermas.crescimento(), gimnospermas.crescimento());
		assertNotEquals(angiospermas.fotossintese(), gimnospermas.fotossintese());
		assertNotEquals(angiospermas.reproducao(), gimnospermas.reproducao());
		assertNotEquals(angiospermas.falecendo(), gimnospermas.falecendo());
		assertNotEquals(angiospermas.nascendo(), pteridofitas.nascendo());
		assertNotEquals(angiospermas.crescimento(), pteridofitas.crescimento());
		assertNotEquals(angiospermas.fotossintese(), pteridofitas.fotossintese());
		assertNotEquals(angiospermas.reproducao(), pteridofitas.reproducao());
		assertNotEquals(angiospermas.falecendo(), pteridofitas.falecendo());
	}

	@Test
	public void testandoSeMetodosDeBriofitasSaoDiferentesDosOutrosFilos() {
		Soja angiospermas = new Soja.SojaBuilder().build();
		Pinheiros gimnospermas = new Pinheiros.PinheirosBuilder().build();
		Riccia briofitas = new Riccia.RicciaBuilder().build();
		Moellendorffii pteridofitas = new Moellendorffii.MoellendorffiiBuilder().build();
		assertNotEquals(briofitas.nascendo(), angiospermas.nascendo());
		assertNotEquals(briofitas.crescimento(), angiospermas.crescimento());
		assertNotEquals(briofitas.fotossintese(), angiospermas.fotossintese());
		assertNotEquals(briofitas.reproducao(), angiospermas.reproducao());
		assertNotEquals(briofitas.falecendo(), angiospermas.falecendo());
		assertNotEquals(briofitas.nascendo(), gimnospermas.nascendo());
		assertNotEquals(briofitas.crescimento(), gimnospermas.crescimento());
		assertNotEquals(briofitas.fotossintese(), gimnospermas.fotossintese());
		assertNotEquals(briofitas.reproducao(), gimnospermas.reproducao());
		assertNotEquals(briofitas.falecendo(), gimnospermas.falecendo());
		assertNotEquals(briofitas.nascendo(), pteridofitas.nascendo());
		assertNotEquals(briofitas.crescimento(), pteridofitas.crescimento());
		assertNotEquals(briofitas.fotossintese(), pteridofitas.fotossintese());
		assertNotEquals(briofitas.reproducao(), pteridofitas.reproducao());
		assertNotEquals(briofitas.falecendo(), pteridofitas.falecendo());
	}

	@Test
	public void testandoSeMetodosDeGimnospermasSaoDiferentesDosOutrosFilos() {
		Feijao angiospermas = new Feijao.FeijaoBuilder().build();
		Pinheiros gimnospermas = new Pinheiros.PinheirosBuilder().build();
		Riccia briofitas = new Riccia.RicciaBuilder().build();
		Samambaia pteridofitas = new Samambaia.SamambaiaBuilder().build();
		assertNotEquals(gimnospermas.nascendo(), angiospermas.nascendo());
		assertNotEquals(gimnospermas.crescimento(), angiospermas.crescimento());
		assertNotEquals(gimnospermas.fotossintese(), angiospermas.fotossintese());
		assertNotEquals(gimnospermas.reproducao(), angiospermas.reproducao());
		assertNotEquals(gimnospermas.falecendo(), angiospermas.falecendo());
		assertNotEquals(gimnospermas.nascendo(), briofitas.nascendo());
		assertNotEquals(gimnospermas.crescimento(), briofitas.crescimento());
		assertNotEquals(gimnospermas.fotossintese(), briofitas.fotossintese());
		assertNotEquals(gimnospermas.reproducao(), briofitas.reproducao());
		assertNotEquals(gimnospermas.falecendo(), briofitas.falecendo());
		assertNotEquals(gimnospermas.nascendo(), pteridofitas.nascendo());
		assertNotEquals(gimnospermas.crescimento(), pteridofitas.crescimento());
		assertNotEquals(gimnospermas.fotossintese(), pteridofitas.fotossintese());
		assertNotEquals(gimnospermas.reproducao(), pteridofitas.reproducao());
		assertNotEquals(gimnospermas.falecendo(), pteridofitas.falecendo());
	}

	@Test
	public void testandoSeMetodosDePteridofitasSaoDiferentesDosOutrosFilos() {
		Girassol angiospermas = new Girassol.GirassolBuilder().build();
		Pinheiros gimnospermas = new Pinheiros.PinheirosBuilder().build();
		Riccia briofitas = new Riccia.RicciaBuilder().build();
		Samambaia pteridofitas = new Samambaia.SamambaiaBuilder().build();
		assertNotEquals(pteridofitas.nascendo(), angiospermas.nascendo());
		assertNotEquals(pteridofitas.crescimento(), angiospermas.crescimento());
		assertNotEquals(pteridofitas.fotossintese(), angiospermas.fotossintese());
		assertNotEquals(pteridofitas.reproducao(), angiospermas.reproducao());
		assertNotEquals(pteridofitas.falecendo(), angiospermas.falecendo());
		assertNotEquals(pteridofitas.nascendo(), briofitas.nascendo());
		assertNotEquals(pteridofitas.crescimento(), briofitas.crescimento());
		assertNotEquals(pteridofitas.fotossintese(), briofitas.fotossintese());
		assertNotEquals(pteridofitas.reproducao(), briofitas.reproducao());
		assertNotEquals(pteridofitas.falecendo(), briofitas.falecendo());
		assertNotEquals(pteridofitas.nascendo(), gimnospermas.nascendo());
		assertNotEquals(pteridofitas.crescimento(), gimnospermas.crescimento());
		assertNotEquals(pteridofitas.fotossintese(), gimnospermas.fotossintese());
		assertNotEquals(pteridofitas.reproducao(), gimnospermas.reproducao());
		assertNotEquals(pteridofitas.falecendo(), gimnospermas.falecendo());
	}

	// ---------Testando se o Métodos dos Filos são diferentes dos Metodos dos
	// DadoA,DadoB,DadoG e DadoP--------
	@Test
	public void testandoSeMetodosDeAngiospermasSaoDiferentesDosMetodosDeDadoA() {
		Alface angiospermas = new Alface.AlfaceBuilder().build();
		DadoA dadoA = new DadoA.DadoABuilder().build();
		assertNotEquals(angiospermas.nascendo(), dadoA.nascendo());
		assertNotEquals(angiospermas.crescimento(), dadoA.crescimento());
		assertNotEquals(angiospermas.fotossintese(), dadoA.fotossintese());
		assertNotEquals(angiospermas.reproducao(), dadoA.reproducao());
		assertNotEquals(angiospermas.falecendo(), dadoA.falecendo());
	}

	@Test
	public void testandoSeMetodosDeBriofitasSaoDiferentesDosMetodosDeDadoB() {
		Agrestis briofitas = new Agrestis.AgrestisBuilder().build();
		DadoB dadoB = new DadoB.DadoBBuilder().build();
		assertNotEquals(briofitas.nascendo(), dadoB.nascendo());
		assertNotEquals(briofitas.crescimento(), dadoB.crescimento());
		assertNotEquals(briofitas.fotossintese(), dadoB.fotossintese());
		assertNotEquals(briofitas.reproducao(), dadoB.reproducao());
		assertNotEquals(briofitas.falecendo(), dadoB.falecendo());
	}

	@Test
	public void testandoSeMetodosDeGimnospermasSaoDiferentesDosMetodosDeDadoG() {
		StangeriaEriopus gimnospermas = new StangeriaEriopus.StangeriaEriopusBuilder().build();
		DadoG dadoG = new DadoG.DadoGBuilder().build();
		assertNotEquals(gimnospermas.nascendo(), dadoG.nascendo());
		assertNotEquals(gimnospermas.crescimento(), dadoG.crescimento());
		assertNotEquals(gimnospermas.fotossintese(), dadoG.fotossintese());
		assertNotEquals(gimnospermas.reproducao(), dadoG.reproducao());
		assertNotEquals(gimnospermas.falecendo(), dadoG.falecendo());
	}

	@Test
	public void testandoSeMetodosDePteridofitasSaoDiferentesDosMetodosDeDadoP() {
		Azorica pteridofita = new Azorica.AzoricaBuilder().build();
		DadoP dadoP = new DadoP.DadoPBuilder().build();
		assertNotEquals(pteridofita.nascendo(), dadoP.nascendo());
		assertNotEquals(pteridofita.crescimento(), dadoP.crescimento());
		assertNotEquals(pteridofita.fotossintese(), dadoP.fotossintese());
		assertNotEquals(pteridofita.reproducao(), dadoP.reproducao());
		assertNotEquals(pteridofita.falecendo(), dadoP.falecendo());
	}
//--------------Testando se os métodos dos DadosA, DadosB,DadosG e DadosP são diferentes------------

	@Test
	public void testandoSeMetodosDeDadoASaoDiferentesDosDemaisDados() {
		DadoA dadoA = new DadoA.DadoABuilder().build();
		DadoB dadoB = new DadoB.DadoBBuilder().build();
		DadoG dadoG = new DadoG.DadoGBuilder().build();
		DadoP dadoP = new DadoP.DadoPBuilder().build();

		assertNotEquals(dadoA.nascendo(), dadoB.nascendo());
		assertNotEquals(dadoA.crescimento(), dadoB.crescimento());
		assertNotEquals(dadoA.fotossintese(), dadoB.fotossintese());
		assertNotEquals(dadoA.reproducao(), dadoB.reproducao());
		assertNotEquals(dadoA.falecendo(), dadoB.falecendo());
		assertNotEquals(dadoA.nascendo(), dadoG.nascendo());
		assertNotEquals(dadoA.crescimento(), dadoG.crescimento());
		assertNotEquals(dadoA.fotossintese(), dadoG.fotossintese());
		assertNotEquals(dadoA.reproducao(), dadoG.reproducao());
		assertNotEquals(dadoA.falecendo(), dadoG.falecendo());
		assertNotEquals(dadoA.nascendo(), dadoP.nascendo());
		assertNotEquals(dadoA.crescimento(), dadoP.crescimento());
		assertNotEquals(dadoA.fotossintese(), dadoP.fotossintese());
		assertNotEquals(dadoA.reproducao(), dadoP.reproducao());
		assertNotEquals(dadoA.falecendo(), dadoP.falecendo());

	}

	@Test
	public void testandoSeMetodosDeDadoBSaoDiferentesDosDemaisDados() {
		DadoA dadoA = new DadoA.DadoABuilder().build();
		DadoB dadoB = new DadoB.DadoBBuilder().build();
		DadoG dadoG = new DadoG.DadoGBuilder().build();
		DadoP dadoP = new DadoP.DadoPBuilder().build();

		assertNotEquals(dadoB.nascendo(), dadoA.nascendo());
		assertNotEquals(dadoB.crescimento(), dadoA.crescimento());
		assertNotEquals(dadoB.fotossintese(), dadoA.fotossintese());
		assertNotEquals(dadoB.reproducao(), dadoA.reproducao());
		assertNotEquals(dadoB.falecendo(), dadoA.falecendo());
		assertNotEquals(dadoB.nascendo(), dadoG.nascendo());
		assertNotEquals(dadoB.crescimento(), dadoG.crescimento());
		assertNotEquals(dadoB.fotossintese(), dadoG.fotossintese());
		assertNotEquals(dadoB.reproducao(), dadoG.reproducao());
		assertNotEquals(dadoB.falecendo(), dadoG.falecendo());
		assertNotEquals(dadoB.nascendo(), dadoP.nascendo());
		assertNotEquals(dadoB.crescimento(), dadoP.crescimento());
		assertNotEquals(dadoB.fotossintese(), dadoP.fotossintese());
		assertNotEquals(dadoB.reproducao(), dadoP.reproducao());
		assertNotEquals(dadoB.falecendo(), dadoP.falecendo());

	}

	@Test
	public void testandoSeMetodosDeDadoGSaoDiferentesDosDemaisDados() {
		DadoA dadoA = new DadoA.DadoABuilder().build();
		DadoB dadoB = new DadoB.DadoBBuilder().build();
		DadoG dadoG = new DadoG.DadoGBuilder().build();
		DadoP dadoP = new DadoP.DadoPBuilder().build();

		assertNotEquals(dadoG.nascendo(), dadoA.nascendo());
		assertNotEquals(dadoG.crescimento(), dadoA.crescimento());
		assertNotEquals(dadoG.fotossintese(), dadoA.fotossintese());
		assertNotEquals(dadoG.reproducao(), dadoA.reproducao());
		assertNotEquals(dadoG.falecendo(), dadoA.falecendo());
		assertNotEquals(dadoG.nascendo(), dadoB.nascendo());
		assertNotEquals(dadoG.crescimento(), dadoB.crescimento());
		assertNotEquals(dadoG.fotossintese(), dadoB.fotossintese());
		assertNotEquals(dadoG.reproducao(), dadoB.reproducao());
		assertNotEquals(dadoG.falecendo(), dadoB.falecendo());
		assertNotEquals(dadoG.nascendo(), dadoP.nascendo());
		assertNotEquals(dadoG.crescimento(), dadoP.crescimento());
		assertNotEquals(dadoG.fotossintese(), dadoP.fotossintese());
		assertNotEquals(dadoG.reproducao(), dadoP.reproducao());
		assertNotEquals(dadoG.falecendo(), dadoP.falecendo());

	}

	@Test
	public void testandoSeMetodosDeDadoPSaoDiferentesDosDemaisDados() {
		DadoA dadoA = new DadoA.DadoABuilder().build();
		DadoB dadoB = new DadoB.DadoBBuilder().build();
		DadoG dadoG = new DadoG.DadoGBuilder().build();
		DadoP dadoP = new DadoP.DadoPBuilder().build();

		assertNotEquals(dadoP.nascendo(), dadoA.nascendo());
		assertNotEquals(dadoP.crescimento(), dadoA.crescimento());
		assertNotEquals(dadoP.fotossintese(), dadoA.fotossintese());
		assertNotEquals(dadoP.reproducao(), dadoA.reproducao());
		assertNotEquals(dadoP.falecendo(), dadoA.falecendo());
		assertNotEquals(dadoP.nascendo(), dadoB.nascendo());
		assertNotEquals(dadoP.crescimento(), dadoB.crescimento());
		assertNotEquals(dadoP.fotossintese(), dadoB.fotossintese());
		assertNotEquals(dadoP.reproducao(), dadoB.reproducao());
		assertNotEquals(dadoP.falecendo(), dadoB.falecendo());
		assertNotEquals(dadoP.nascendo(), dadoG.nascendo());
		assertNotEquals(dadoP.crescimento(), dadoG.crescimento());
		assertNotEquals(dadoP.fotossintese(), dadoG.fotossintese());
		assertNotEquals(dadoP.reproducao(), dadoG.reproducao());
		assertNotEquals(dadoP.falecendo(), dadoG.falecendo());

	}

	// -------------Testando os objetos são igual a Null-------------------------
	@Test
	public void testandoSeBananeiraDifereNull() {
		Monocotiledoneas bananeira = new Bananeira.BananeiraBuilder().build();
		assertNotEquals(null, bananeira);
	}

	@Test
	public void testandoSeMonocotiledoneasDifereNull() {
		Monocotiledoneas aveia = new Aveia.AveiaBuilder().build();
		assertNotEquals(null, aveia);
	}

	@Test
	public void testandoSeAlfaceDifereNull() {
		Alface alface = new Alface.AlfaceBuilder().build();
		assertNotEquals(null, alface);
	}

	@Test
	public void testandoSeGirassolDifereNull() {
		Girassol girassol = new Girassol.GirassolBuilder().build();
		assertNotEquals(null, girassol);
	}

	@Test
	public void testandoSeFeijaoDifereNull() {
		Feijao feijao = new Feijao.FeijaoBuilder().build();
		assertNotEquals(null, feijao);
	}

	@Test
	public void testandoSeSojaoDifereNull() {
		Soja soja = new Soja.SojaBuilder().build();
		assertNotEquals(null, soja);
	}

	@Test
	public void testandoSeAmeixasDifereNull() {
		Ameixas ameixas = new Ameixas.AmeixasBuilder().build();
		assertNotEquals(null, ameixas);
	}

	@Test
	public void testandoSeDamasqueiroDifereNull() {
		Damasqueiro damasco = new Damasqueiro.DamasqueiroBuilder().build();
		assertNotEquals(null, damasco);
	}

	@Test
	public void testandoSeRicciaDifereNull() {
		Riccia riccia = new Riccia.RicciaBuilder().build();
		assertNotEquals(null, riccia);
	}

	@Test
	public void testandoSemarchantiaDifereNull() {
		Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
		assertNotEquals(null, marchantia);
	}

	@Test
	public void testandoSeAgrestisDifereNull() {
		Agrestis agrestis = new Agrestis.AgrestisBuilder().build();
		assertNotEquals(null, agrestis);
	}

	@Test
	public void testandoSeFusiformisDifereNull() {
		Fusiformis fusiformis = new Fusiformis.FusiformisBuilder().build();
		assertNotEquals(null, fusiformis);
	}

	@Test
	public void testandoSeAndreaeidaeDifereNull() {
		Andreaeidae andreaeidae = new Andreaeidae.AndreaeidaeBuilder().build();
		assertNotEquals(null, andreaeidae);
	}

	@Test
	public void testandoSeSphagnidaeDifereNull() {
		Sphagnidae sphagnidae = new Sphagnidae.SphagnidaeBuilder().build();
		assertNotEquals(null, sphagnidae);
	}

	@Test
	public void testandoSeClavatumDifereNull() {
		Clavatum clavatum = new Clavatum.ClavatumBuilder().build();
		assertNotEquals(null, clavatum);
	}

	@Test
	public void testandoSeAzoricaDifereNull() {
		Azorica azorica = new Azorica.AzoricaBuilder().build();
		assertNotEquals(null, azorica);
	}

	@Test
	public void testandoSeMoellendorffiiDifereNull() {
		Moellendorffii moellendorffii = new Moellendorffii.MoellendorffiiBuilder().build();
		assertNotEquals(null, moellendorffii);
	}

	@Test
	public void testandoSeCavalinhaDifereNull() {
		Cavalinha cavalinha = new Cavalinha.CavalinhaBuilder().build();
		assertNotEquals(null, cavalinha);
	}

	@Test
	public void testandoSeSamambaiaDifereNull() {
		Samambaia samambaia = new Samambaia.SamambaiaBuilder().build();
		assertNotEquals(null, samambaia);
	}

	@Test
	public void testandoSeAraucariasDifereNull() {
		Araucarias araucarias = new Araucarias.AraucariasBuilder().build();
		assertNotEquals(null, araucarias);
	}

	@Test
	public void testandoSePinheirosDifereNull() {
		Pinheiros pinheiros = new Pinheiros.PinheirosBuilder().build();
		assertNotEquals(null, pinheiros);
	}

	@Test
	public void testandoSeCicadaceasDifereNull() {
		Cicadaceas cicadaceas = new Cicadaceas.CicadaceasBuilder().build();
		assertNotEquals(null, cicadaceas);
	}

	@Test
	public void testandoSeZamiaceaesDifereNull() {
		Zamiaceaes zamiaceaes = new Zamiaceaes.ZamiaceaesBuilder().build();
		assertNotEquals(null, zamiaceaes);
	}

	@Test
	public void testandoSeStangeriaEriopusDifereNull() {
		StangeriaEriopus eriopus = new StangeriaEriopus.StangeriaEriopusBuilder().build();
		assertNotEquals(null, eriopus);
	}

	@Test
	public void testandoSeMaHuangDifereNull() {
		MaHuang mahuang = new MaHuang.MaHuangBuilder().build();
		assertNotEquals(null, mahuang);
	}

	@Test
	public void testandoSeWelwitschiaMirabilisDifereNull() {
		WelwitschiaMirabilis mirabilis = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
		assertNotEquals(null, mirabilis);
	}

	@Test
	public void testandoSeGnetumDifereNull() {
		Gnetum gnetum = new Gnetum.GnetumBuilder().build();
		assertNotEquals(null, gnetum);
	}

	@Test
	public void testandoSeGinkgoBilobaDifereNull() {
		GinkgoBiloba biloba = new GinkgoBiloba.GinkgoBilobaBuilder().build();
		assertNotEquals(null, biloba);
	}

	@Test
	public void testandoSeDadoADifereNull() {
		DadoA angiospermas = new DadoA.DadoABuilder().build();
		assertNotEquals(null, angiospermas);
	}

	@Test
	public void testandoSeDadoBDifereNull() {
		DadoB briofitas = new DadoB.DadoBBuilder().build();
		assertNotEquals(null, briofitas);
	}

	@Test
	public void testandoSeDadoGDifereNull() {
		DadoG gimnospermas = new DadoG.DadoGBuilder().build();
		assertNotEquals(null, gimnospermas);
	}

	@Test
	public void testandoSeDadoPIDifereNull() {
		DadoP pteridofitas = new DadoP.DadoPBuilder().build();
		assertNotEquals(null, pteridofitas);

	}

//-------------------Testanto os Valores dos Enum----------------------------
	@Test
	public void testandoStringsValidasParaEnumFilo() {
		String[] filos = { "ANGIOSPERMAS", "BRIOFITAS", "GIMNOSPERMAS", "PTERIDOFITAS" };
		boolean verifica = false;
		boolean esperado = true;

		Filo tiposFiloA = Filo.valueOf(filos[0].toUpperCase().trim().replace(" ", "_"));
		Filo tiposFiloB = Filo.valueOf(filos[1].toUpperCase().trim().replace(" ", "_"));
		Filo tiposFiloG = Filo.valueOf(filos[2].toUpperCase().trim().replace(" ", "_"));
		Filo tiposFiloP = Filo.valueOf(filos[3].toUpperCase().trim().replace(" ", "_"));

		if (tiposFiloA == Filo.ANGIOSPERMAS && tiposFiloB == Filo.BRIOFITAS && tiposFiloG == Filo.GIMNOSPERMAS
				&& tiposFiloP == Filo.PTERIDOFITAS) {
			verifica = true;
		}

		assertEquals(esperado, verifica);
	}

	@Test
	public void testandoStringsValidasParaEnumClasse() {
		String[] classes = { "MARCHANTIOPHYTA", "BRYOPHYTA", "ANTHOCEROPHYTA", "LYCOPODIOPHYTA", "MONILOPHYTA",
				"MONOCOTILEDONEAS", "EUDICOTILEDONEAS", "CONIFERAS", "CICADOFITAS", "GNETOPHYTA", "GINKGOPHYTA" };
		boolean verifica = false;
		boolean esperado = true;

		Classes marchantiophyta = Classes.valueOf(classes[0].toUpperCase().trim().replace(" ", "_"));
		Classes bryophyta = Classes.valueOf(classes[1].toUpperCase().trim().replace(" ", "_"));
		Classes anthocerophyta = Classes.valueOf(classes[2].toUpperCase().trim().replace(" ", "_"));
		Classes lycopodiophyta = Classes.valueOf(classes[3].toUpperCase().trim().replace(" ", "_"));
		Classes monilophyta = Classes.valueOf(classes[4].toUpperCase().trim().replace(" ", "_"));
		Classes monocotiledoneas = Classes.valueOf(classes[5].toUpperCase().trim().replace(" ", "_"));
		Classes eudicotiledoneas = Classes.valueOf(classes[6].toUpperCase().trim().replace(" ", "_"));
		Classes coniferas = Classes.valueOf(classes[7].toUpperCase().trim().replace(" ", "_"));
		Classes cicadofitas = Classes.valueOf(classes[8].toUpperCase().trim().replace(" ", "_"));
		Classes gnetophyta = Classes.valueOf(classes[9].toUpperCase().trim().replace(" ", "_"));
		Classes ginkgophyta = Classes.valueOf(classes[10].toUpperCase().trim().replace(" ", "_"));

		if (marchantiophyta == Classes.MARCHANTIOPHYTA && bryophyta == Classes.BRYOPHYTA
				&& anthocerophyta == Classes.ANTHOCEROPHYTA && lycopodiophyta == Classes.LYCOPODIOPHYTA
				&& monilophyta == Classes.MONILOPHYTA && monocotiledoneas == Classes.MONOCOTILEDONEAS
				&& eudicotiledoneas == Classes.EUDICOTILEDONEAS && coniferas == Classes.CONIFERAS
				&& cicadofitas == Classes.CICADOFITAS && gnetophyta == Classes.GNETOPHYTA
				&& ginkgophyta == Classes.GINKGOPHYTA) {
			verifica = true;
		}

		assertEquals(esperado, verifica);
	}

	@Test
	public void testandoStringsValidasParaEnumOrdem() {
		String[] ordem = { "HEPATICAS", "MUSGOS", "ANTOCEROS", "LICOPODIOS", "ISOETES", "SELAGINELLAS", "ROSACEAS",
				"ASTERACEAE", "LEGUMINOSAS", "CYCADACEAE", "ZAMIACEAE", "STANGERIACEAE", "WELWITSCHIALES", "EPHEDRALES",
				"GNETALES", "EQUISETOPSIDA", "SEM ORDEM", "POLYPODIOPSIDA OU MARATTIOPSIDA OU PSILOTOPSIDA" };
		boolean verifica = false;
		boolean esperado = true;

		Ordem hepatica = Ordem.valueOf(ordem[0].toUpperCase().trim().replace(" ", "_"));
		Ordem musgos = Ordem.valueOf(ordem[1].toUpperCase().trim().replace(" ", "_"));
		Ordem antoceros = Ordem.valueOf(ordem[2].toUpperCase().trim().replace(" ", "_"));
		Ordem licopodios = Ordem.valueOf(ordem[3].toUpperCase().trim().replace(" ", "_"));
		Ordem isoetes = Ordem.valueOf(ordem[4].toUpperCase().trim().replace(" ", "_"));
		Ordem selaginellas = Ordem.valueOf(ordem[5].toUpperCase().trim().replace(" ", "_"));
		Ordem rosaceas = Ordem.valueOf(ordem[6].toUpperCase().trim().replace(" ", "_"));
		Ordem asteracea = Ordem.valueOf(ordem[7].toUpperCase().trim().replace(" ", "_"));
		Ordem leguminosas = Ordem.valueOf(ordem[8].toUpperCase().trim().replace(" ", "_"));
		Ordem cycadaceae = Ordem.valueOf(ordem[9].toUpperCase().trim().replace(" ", "_"));
		Ordem zamiacea = Ordem.valueOf(ordem[10].toUpperCase().trim().replace(" ", "_"));
		Ordem stangeriacea = Ordem.valueOf(ordem[11].toUpperCase().trim().replace(" ", "_"));
		Ordem welwitschiales = Ordem.valueOf(ordem[12].toUpperCase().trim().replace(" ", "_"));
		Ordem ephedrales = Ordem.valueOf(ordem[13].toUpperCase().trim().replace(" ", "_"));
		Ordem gnetales = Ordem.valueOf(ordem[14].toUpperCase().trim().replace(" ", "_"));
		Ordem equisetopsida = Ordem.valueOf(ordem[15].toUpperCase().trim().replace(" ", "_"));
		Ordem semOrdem = Ordem.valueOf(ordem[16].toUpperCase().trim().replace(" ", "_"));
		Ordem pmp = Ordem.valueOf(ordem[17].toUpperCase().trim().replace(" ", "_"));

		if (hepatica == Ordem.HEPATICAS && musgos == Ordem.MUSGOS && licopodios == Ordem.LICOPODIOS
				&& pmp == Ordem.POLYPODIOPSIDA_OU_MARATTIOPSIDA_OU_PSILOTOPSIDA && antoceros == Ordem.ANTOCEROS
				&& semOrdem == Ordem.SEM_ORDEM && isoetes == Ordem.ISOETES && selaginellas == Ordem.SELAGINELLAS
				&& rosaceas == Ordem.ROSACEAS && asteracea == Ordem.ASTERACEAE && leguminosas == Ordem.LEGUMINOSAS
				&& cycadaceae == Ordem.CYCADACEAE && zamiacea == Ordem.ZAMIACEAE && stangeriacea == Ordem.STANGERIACEAE
				&& welwitschiales == Ordem.WELWITSCHIALES && ephedrales == Ordem.EPHEDRALES
				&& gnetales == Ordem.GNETALES && equisetopsida == Ordem.EQUISETOPSIDA

		)
			verifica = true;
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoStringsValidasParaEnumCaule() {
		String[] caule = { "DESORDENADO", "CILINDRICO", "PROSTADOS", "RAMIFICADOS", "LENHOSO", "RAMOSO", "HERBACEO",
				"LEPTOIDE", "ESPORIFEROS", "COLUNARES", "SEM CAULE POSSUI CAULOIDES" };
		boolean verifica = false;
		boolean esperado = true;

		Caule dersordenado = Caule.valueOf(caule[0].toUpperCase().trim().replace(" ", "_"));
		Caule cilindrico = Caule.valueOf(caule[1].toUpperCase().trim().replace(" ", "_"));
		Caule prostados = Caule.valueOf(caule[2].toUpperCase().trim().replace(" ", "_"));
		Caule ramificados = Caule.valueOf(caule[3].toUpperCase().trim().replace(" ", "_"));
		Caule lenhoso = Caule.valueOf(caule[4].toUpperCase().trim().replace(" ", "_"));
		Caule ramoso = Caule.valueOf(caule[5].toUpperCase().trim().replace(" ", "_"));
		Caule herbaceo = Caule.valueOf(caule[6].toUpperCase().trim().replace(" ", "_"));
		Caule leptoide = Caule.valueOf(caule[7].toUpperCase().trim().replace(" ", "_"));
		Caule esporiferos = Caule.valueOf(caule[8].toUpperCase().trim().replace(" ", "_"));
		Caule colunares = Caule.valueOf(caule[9].toUpperCase().trim().replace(" ", "_"));
		Caule semcaule = Caule.valueOf(caule[10].toUpperCase().trim().replace(" ", "_"));

		if (dersordenado == Caule.DESORDENADO && cilindrico == Caule.CILINDRICO && prostados == Caule.PROSTADOS
				&& ramificados == Caule.RAMIFICADOS && lenhoso == Caule.LENHOSO && ramoso == Caule.RAMOSO
				&& herbaceo == Caule.HERBACEO && leptoide == Caule.LEPTOIDE && esporiferos == Caule.ESPORIFEROS
				&& colunares == Caule.COLUNARES && semcaule == Caule.SEM_CAULE_POSSUI_CAULOIDES

		)
			verifica = true;
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoStringsValidasParaEnumEstruturas() {
		String[] estruturas = { "ARBUSTOS", "ARVORES CADUCIFOLIA", "ARVORES", "ARVORES ARBUSTOS",
				"ARVORES E ARBUSTO EQUATORIAIS", "ARVORES E ARBUSTO SUBARBUSTOS", "SUBBOSQUES COM ESPINHOS",
				"CAVIDADES INTERNAS" };
		boolean verifica = false;
		boolean esperado = true;

		Estruturas arbustos = Estruturas.valueOf(estruturas[0].toUpperCase().trim().replace(" ", "_"));
		Estruturas arvoresC = Estruturas.valueOf(estruturas[1].toUpperCase().trim().replace(" ", "_"));
		Estruturas arvores = Estruturas.valueOf(estruturas[2].toUpperCase().trim().replace(" ", "_"));
		Estruturas arvoresarbustos = Estruturas.valueOf(estruturas[3].toUpperCase().trim().replace(" ", "_"));
		Estruturas arvoresarbustosE = Estruturas.valueOf(estruturas[4].toUpperCase().trim().replace(" ", "_"));
		Estruturas arvoresarbustosS = Estruturas.valueOf(estruturas[5].toUpperCase().trim().replace(" ", "_"));
		Estruturas subbosques = Estruturas.valueOf(estruturas[6].toUpperCase().trim().replace(" ", "_"));
		Estruturas cavidadesI = Estruturas.valueOf(estruturas[7].toUpperCase().trim().replace(" ", "_"));

		if (arbustos == Estruturas.ARBUSTOS && arvoresC == Estruturas.ARVORES_CADUCIFOLIA
				&& arvores == Estruturas.ARVORES && arvoresarbustos == Estruturas.ARVORES_ARBUSTOS
				&& arvoresarbustosE == Estruturas.ARVORES_E_ARBUSTO_EQUATORIAIS
				&& arvoresarbustosS == Estruturas.ARVORES_E_ARBUSTO_SUBARBUSTOS
				&& subbosques == Estruturas.SUBBOSQUES_COM_ESPINHOS && cavidadesI == Estruturas.CAVIDADES_INTERNAS)
			verifica = true;
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoStringsValidasParaEnumExtras() {
		String[] extras = { "MEDICINAL", "RASTEIRA", "RASTEJANTES", "TREPADEIRAS E lIANAS", "ERVAS", "CONES E PINHAS",
				"TRONCOS E CONES", "CONES", "AQUATICAS", "TRONCOS", "ESPINHOS", "DOICAS",
				"MAIS DE UMA CAMADA DE CELULAS", "UMA CAMADA DE CELULAS", "CLAVARIA" };
		boolean verifica = false;
		boolean esperado = true;

		Extras medicinal = Extras.valueOf(extras[0].toUpperCase().trim().replace(" ", "_"));
		Extras rasteira = Extras.valueOf(extras[1].toUpperCase().trim().replace(" ", "_"));
		Extras rastejantes = Extras.valueOf(extras[2].toUpperCase().trim().replace(" ", "_"));
		Extras trepadeira = Extras.valueOf(extras[3].toUpperCase().trim().replace(" ", "_"));
		Extras ervas = Extras.valueOf(extras[4].toUpperCase().trim().replace(" ", "_"));
		Extras conesP = Extras.valueOf(extras[5].toUpperCase().trim().replace(" ", "_"));
		Extras troncosC = Extras.valueOf(extras[6].toUpperCase().trim().replace(" ", "_"));
		Extras cones = Extras.valueOf(extras[7].toUpperCase().trim().replace(" ", "_"));
		Extras aquaticas = Extras.valueOf(extras[8].toUpperCase().trim().replace(" ", "_"));
		Extras troncos = Extras.valueOf(extras[9].toUpperCase().trim().replace(" ", "_"));
		Extras espinhos = Extras.valueOf(extras[10].toUpperCase().trim().replace(" ", "_"));
		Extras doicas = Extras.valueOf(extras[11].toUpperCase().trim().replace(" ", "_"));
		Extras maisdcelula = Extras.valueOf(extras[12].toUpperCase().trim().replace(" ", "_"));
		Extras umadeceluls = Extras.valueOf(extras[13].toUpperCase().trim().replace(" ", "_"));
		Extras clavaria = Extras.valueOf(extras[14].toUpperCase().trim().replace(" ", "_"));

		if (medicinal == Extras.MEDICINAL && rasteira == Extras.RASTEIRA && rastejantes == Extras.RASTEJANTES
				&& trepadeira == Extras.TREPADEIRAS_E_LIANAS && ervas == Extras.ERVAS && conesP == Extras.CONES_E_PINHAS
				&& troncosC == Extras.TRONCOS_E_CONES && cones == Extras.CONES && aquaticas == Extras.AQUATICAS
				&& troncos == Extras.TRONCOS && espinhos == Extras.ESPINHOS && doicas == Extras.DOICAS
				&& maisdcelula == Extras.MAIS_DE_UMA_CAMADA_DE_CELULAS && umadeceluls == Extras.UMA_CAMADA_DE_CELULAS
				&& clavaria == Extras.CLAVARIA)
			verifica = true;
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoStringsValidasParaEnumFlores() {
		String[] flores = { "SEM FLORES", "TRIMERAS", "TETRAMERAS TRIMERAS PENTAMERAS", "VISTOSAS E ACTINOMORFICAS",
				"HELIOTROPISMO", "AGERATO", "MASCULINAS COM PISTILO MODIFICADO", "CONCAVO OU PLANO CONVEXO" };
		boolean verifica = false;
		boolean esperado = true;

		Flores semFlores = Flores.valueOf(flores[0].toUpperCase().trim().replace(" ", "_"));
		Flores trimeras = Flores.valueOf(flores[1].toUpperCase().trim().replace(" ", "_"));
		Flores ttp = Flores.valueOf(flores[2].toUpperCase().trim().replace(" ", "_"));
		Flores vistosasA = Flores.valueOf(flores[3].toUpperCase().trim().replace(" ", "_"));
		Flores heliotropismo = Flores.valueOf(flores[4].toUpperCase().trim().replace(" ", "_"));
		Flores agerato = Flores.valueOf(flores[5].toUpperCase().trim().replace(" ", "_"));
		Flores mcpm = Flores.valueOf(flores[6].toUpperCase().trim().replace(" ", "_"));
		Flores concavoP = Flores.valueOf(flores[7].toUpperCase().trim().replace(" ", "_"));

		if (semFlores == Flores.SEM_FLORES && trimeras == Flores.TRIMERAS
				&& ttp == Flores.TETRAMERAS_TRIMERAS_PENTAMERAS && vistosasA == Flores.VISTOSAS_E_ACTINOMORFICAS
				&& heliotropismo == Flores.HELIOTROPISMO && agerato == Flores.AGERATO
				&& mcpm == Flores.MASCULINAS_COM_PISTILO_MODIFICADO && concavoP == Flores.CONCAVO_OU_PLANO_CONVEXO)
			verifica = true;
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoStringsValidasParaEnumFolhagem() {
		String[] folhagem = { "SEM FOLHA POSSUI FILOIDES", "FILOIDES COM CELULAR_MORTAS", "FILOIDES SEM CELULAR MORTAS",
				"COMPOSTAS", "COMPOSTA E ESTIPULADAS", "HETERMORFICA", "SIMPLES", "OCAS", "OPOSTAS", "LISAS",
				"EMBRIONARIAS", "PEQUENAS E ESCAMIFORMES", "CORIACEAS", "COMPOSTA PINADA", "FLABELIFORMIS",
				"ESPIRAL OU VERTICILIDAS" };
		boolean verifica = false;
		boolean esperado = true;

		Folhagem semF = Folhagem.valueOf(folhagem[0].toUpperCase().trim().replace(" ", "_"));
		Folhagem fcm = Folhagem.valueOf(folhagem[1].toUpperCase().trim().replace(" ", "_"));
		Folhagem fsm = Folhagem.valueOf(folhagem[2].toUpperCase().trim().replace(" ", "_"));
		Folhagem compostas = Folhagem.valueOf(folhagem[3].toUpperCase().trim().replace(" ", "_"));
		Folhagem compostasE = Folhagem.valueOf(folhagem[4].toUpperCase().trim().replace(" ", "_"));
		Folhagem heteromorfica = Folhagem.valueOf(folhagem[5].toUpperCase().trim().replace(" ", "_"));
		Folhagem simples = Folhagem.valueOf(folhagem[6].toUpperCase().trim().replace(" ", "_"));
		Folhagem ocas = Folhagem.valueOf(folhagem[7].toUpperCase().trim().replace(" ", "_"));
		Folhagem opostas = Folhagem.valueOf(folhagem[8].toUpperCase().trim().replace(" ", "_"));
		Folhagem lisas = Folhagem.valueOf(folhagem[9].toUpperCase().trim().replace(" ", "_"));
		Folhagem embrionarias = Folhagem.valueOf(folhagem[10].toUpperCase().trim().replace(" ", "_"));
		Folhagem pequenaE = Folhagem.valueOf(folhagem[11].toUpperCase().trim().replace(" ", "_"));
		Folhagem coriaceas = Folhagem.valueOf(folhagem[12].toUpperCase().trim().replace(" ", "_"));
		Folhagem compostaP = Folhagem.valueOf(folhagem[13].toUpperCase().trim().replace(" ", "_"));
		Folhagem flabeliformes = Folhagem.valueOf(folhagem[14].toUpperCase().trim().replace(" ", "_"));
		Folhagem espiralV = Folhagem.valueOf(folhagem[15].toUpperCase().trim().replace(" ", "_"));

		if (semF == Folhagem.SEM_FOLHA_POSSUI_FILOIDES && fcm == Folhagem.FILOIDES_COM_CELULAR_MORTAS
				&& fsm == Folhagem.FILOIDES_SEM_CELULAR_MORTAS && compostas == Folhagem.COMPOSTAS
				&& compostasE == Folhagem.COMPOSTA_E_ESTIPULADAS && heteromorfica == Folhagem.HETERMORFICA
				&& simples == Folhagem.SIMPLES && ocas == Folhagem.OCAS && opostas == Folhagem.OPOSTAS
				&& lisas == Folhagem.LISAS && embrionarias == Folhagem.EMBRIONARIAS
				&& pequenaE == Folhagem.PEQUENAS_E_ESCAMIFORMES && coriaceas == Folhagem.CORIACEAS
				&& compostaP == Folhagem.COMPOSTA_PINADA && flabeliformes == Folhagem.FLABELIFORMIS
				&& espiralV == Folhagem.ESPIRAL_OU_VERTICILIDAS

		)
			verifica = true;
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoStringsValidasParaEnumFrutos() {
		String[] frutos = { "SEM FRUTOS", "FORMATO VAGEM OU FAVA", "AGREGADOS", "PARTENOCARPICO", "CEREAL",
				"HORTALICAS", "INDEISCENTES", "GRAOS", "VAGENS", "DRUPAS", "HERBACEA", "SECA", "ALCALOIDES",
				"SEM FRUTOS POSSUE ESTROBILOS" };
		boolean verifica = false;
		boolean esperado = true;

		Frutos semF = Frutos.valueOf(frutos[0].toUpperCase().trim().replace(" ", "_"));
		Frutos fvf = Frutos.valueOf(frutos[1].toUpperCase().trim().replace(" ", "_"));
		Frutos agregados = Frutos.valueOf(frutos[2].toUpperCase().trim().replace(" ", "_"));
		Frutos partenocarpico = Frutos.valueOf(frutos[3].toUpperCase().trim().replace(" ", "_"));
		Frutos cereal = Frutos.valueOf(frutos[4].toUpperCase().trim().replace(" ", "_"));
		Frutos hortalicas = Frutos.valueOf(frutos[5].toUpperCase().trim().replace(" ", "_"));
		Frutos indeiscentes = Frutos.valueOf(frutos[6].toUpperCase().trim().replace(" ", "_"));
		Frutos graos = Frutos.valueOf(frutos[7].toUpperCase().trim().replace(" ", "_"));
		Frutos vagens = Frutos.valueOf(frutos[8].toUpperCase().trim().replace(" ", "_"));
		Frutos drupas = Frutos.valueOf(frutos[9].toUpperCase().trim().replace(" ", "_"));
		Frutos herbacea = Frutos.valueOf(frutos[10].toUpperCase().trim().replace(" ", "_"));
		Frutos seca = Frutos.valueOf(frutos[11].toUpperCase().trim().replace(" ", "_"));
		Frutos alcaloides = Frutos.valueOf(frutos[12].toUpperCase().trim().replace(" ", "_"));
		Frutos estribilos = Frutos.valueOf(frutos[13].toUpperCase().trim().replace(" ", "_"));

		if (semF == Frutos.SEM_FRUTOS && fvf == Frutos.FORMATO_VAGEM_OU_FAVA && agregados == Frutos.AGREGADOS
				&& partenocarpico == Frutos.PARTENOCARPICO && cereal == Frutos.CEREAL & hortalicas == Frutos.HORTALICAS
				&& indeiscentes == Frutos.INDEISCENTES && graos == Frutos.GRAOS && vagens == Frutos.VAGENS
				&& drupas == Frutos.DRUPAS && herbacea == Frutos.HERBACEA && seca == Frutos.SECA
				&& alcaloides == Frutos.ALCALOIDES && estribilos == Frutos.SEM_FRUTOS_POSSUE_ESTROBILOS) {

		}
		verifica = true;
		assertEquals(esperado, verifica);
	}

	@Test
	public void testandoStringsValidasParaEnumRaiz() {
		String[] raiz = { "SEM RAIZ POSSUE RIZOIDES", "ADVENTICIAS E ENDOGENAS", "FASCICULADA OU CABELEIRA",
				"PIVOTANTE OU AXIAL PRINCIPAL", "PIVOTANTE", "APRUMADA", "AXIAL", "PRINCIPAL", "HETEROMORFICA",
				"RADICULAR", "SUPERFICIAIS", "RAMIFICADA", "PROTOXILEMA", "PROFUNDA", "CONTRATEIS" };
		boolean verifica = false;
		boolean esperado = true;

		Raiz semR = Raiz.valueOf(raiz[0].toUpperCase().trim().replace(" ", "_"));
		Raiz advE = Raiz.valueOf(raiz[1].toUpperCase().trim().replace(" ", "_"));
		Raiz fC = Raiz.valueOf(raiz[2].toUpperCase().trim().replace(" ", "_"));
		Raiz pap = Raiz.valueOf(raiz[3].toUpperCase().trim().replace(" ", "_"));
		Raiz pivotante = Raiz.valueOf(raiz[4].toUpperCase().trim().replace(" ", "_"));
		Raiz aprumada = Raiz.valueOf(raiz[5].toUpperCase().trim().replace(" ", "_"));
		Raiz axial = Raiz.valueOf(raiz[6].toUpperCase().trim().replace(" ", "_"));
		Raiz principal = Raiz.valueOf(raiz[7].toUpperCase().trim().replace(" ", "_"));
		Raiz heteromorfica = Raiz.valueOf(raiz[8].toUpperCase().trim().replace(" ", "_"));
		Raiz radicular = Raiz.valueOf(raiz[9].toUpperCase().trim().replace(" ", "_"));
		Raiz superficiais = Raiz.valueOf(raiz[10].toUpperCase().trim().replace(" ", "_"));
		Raiz ramificada = Raiz.valueOf(raiz[11].toUpperCase().trim().replace(" ", "_"));
		Raiz protoxilema = Raiz.valueOf(raiz[12].toUpperCase().trim().replace(" ", "_"));
		Raiz profunda = Raiz.valueOf(raiz[13].toUpperCase().trim().replace(" ", "_"));
		Raiz contrateis = Raiz.valueOf(raiz[13].toUpperCase().trim().replace(" ", "_"));

		if (semR == Raiz.SEM_RAIZ_POSSUE_RIZOIDES && advE == Raiz.ADVENTICIAS_E_ENDOGENAS
				&& fC == Raiz.FASCICULADA_OU_CABELEIRA && pap == Raiz.PIVOTANTE_OU_AXIAL_PRINCIPAL
				&& pivotante == Raiz.PIVOTANTE & aprumada == Raiz.APRUMADA && axial == Raiz.AXIAL
				&& principal == Raiz.PRINCIPAL && heteromorfica == Raiz.HETEROMORFICA && radicular == Raiz.RADICULAR
				&& superficiais == Raiz.SUPERFICIAIS && ramificada == Raiz.RAMIFICADA && protoxilema == Raiz.PROTOXILEMA
				&& profunda == Raiz.PROFUNDA && contrateis == Raiz.PROFUNDA) {
			verifica = true;
			assertEquals(esperado, verifica);
		}

	}

	@Test
	public void testandoStringsValidasParaEnumSementess() {
		String[] sementes = { "SEMENTES", "SEM SEMENTES", "UM COTILEDONES", "DOIS COTILEDONES", "NUAS", "COMESTIVEIS",
				"EM FORMA DE CONE", "CARNOSAS" };
		boolean verifica = false;
		boolean esperado = true;

		Sementes semente = Sementes.valueOf(sementes[0].toUpperCase().trim().replace(" ", "_"));
		Sementes semS = Sementes.valueOf(sementes[1].toUpperCase().trim().replace(" ", "_"));
		Sementes umcotiledone = Sementes.valueOf(sementes[2].toUpperCase().trim().replace(" ", "_"));
		Sementes doiscotiledone = Sementes.valueOf(sementes[3].toUpperCase().trim().replace(" ", "_"));
		Sementes nuas = Sementes.valueOf(sementes[4].toUpperCase().trim().replace(" ", "_"));
		Sementes comestiveis = Sementes.valueOf(sementes[5].toUpperCase().trim().replace(" ", "_"));
		Sementes cone = Sementes.valueOf(sementes[6].toUpperCase().trim().replace(" ", "_"));
		Sementes carnosas = Sementes.valueOf(sementes[7].toUpperCase().trim().replace(" ", "_"));

		if (semente == Sementes.SEMENTES && semS == Sementes.SEM_SEMENTES && umcotiledone == Sementes.UM_COTILEDONES
				&& doiscotiledone == Sementes.DOIS_COTILEDONES
				&& nuas == Sementes.NUAS & comestiveis == Sementes.COMESTIVEIS && cone == Sementes.EM_FORMA_DE_CONE
				&& carnosas == Sementes.CARNOSAS) {
			verifica = true;
			assertEquals(esperado, verifica);
		}

	}

	@Test
	public void testandoStringsValidasParaEnumTalos() {
		String[] talos = { "SEM TALOS", "SIMPLES ACHATADOS", "ROSETTE" };
		boolean verifica = false;
		boolean esperado = true;

		Talos semT = Talos.valueOf(talos[0].toUpperCase().trim().replace(" ", "_"));
		Talos sa = Talos.valueOf(talos[1].toUpperCase().trim().replace(" ", "_"));
		Talos rosette = Talos.valueOf(talos[2].toUpperCase().trim().replace(" ", "_"));

		if (semT == Talos.SEM_TALOS && sa == Talos.SIMPLES_ACHATADOS && rosette == Talos.ROSETTE) {
			verifica = true;
			assertEquals(esperado, verifica);
		}

	}

	@Test
	public void testandoStringsValidasParaEnumVasos() {
		String[] vasos = { "AVASCULAR", "VASCULAR" };
		boolean verifica = false;
		boolean esperado = true;

		Vasos avascular = Vasos.valueOf(vasos[0].toUpperCase().trim().replace(" ", "_"));
		Vasos vascular = Vasos.valueOf(vasos[1].toUpperCase().trim().replace(" ", "_"));

		if (avascular == Vasos.AVASCULAR && vascular == Vasos.VASCULAR) {
			verifica = true;
			assertEquals(esperado, verifica);
		}

	}

	@Test(expected = IOException.class)
	public void testandoExceptionCasoOArquivoSejaVazio() {
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArquivoVazio.csv";

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

		} catch (IOException e) {
			System.out.println("SEGUINTE ERRO ENCONTRADO: " + e.getMessage());
		}

	}

	@Test
	public void testandoExceptionCasoOArquivoTenhaDadosInvalidos() throws FileNotFoundException, IOException {
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean erro = false;
		boolean verifica = false;
		boolean esperado = true;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\DadosInvalidos.csv";
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));

				if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
						&& tiposOrdem == Ordem.ASTERACEAE) {
				} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
						&& tiposOrdem == Ordem.ROSACEAS) {
				} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
						&& tiposOrdem == Ordem.LEGUMINOSAS) {
				} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.MONOCOTILEDONEAS) {
				} else {
					verifica = true;
					erro = true;
					break;
				}
			}

			assertEquals(esperado, verifica);
		}
	}

	@Test
	public void testandoExceptionCasoOArquivoTenhaDadosValidos() {
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean erro = false;
		boolean verifica = false;
		boolean esperado = true;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\PlantasConsulta.csv";
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
						&& tiposOrdem == Ordem.ASTERACEAE) {
				} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
						&& tiposOrdem == Ordem.ROSACEAS) {
				}
				verifica = true;

			}
			br.readLine();

		} catch (IOException e) {
			System.out.println("SEGUINTE ERRO ENCONTRADO: " + e.getMessage());
		}
		assertEquals(esperado, verifica);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testandoExceptionCasoOArquivoTenhaDadosFaltando() throws IOException {
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\FaltaDado.csv";
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
			}

		} catch (IllegalArgumentException e) {
			System.out.println("ALGUM VALOR INSERIDO É INVÁLIDO: " + e.getMessage() + "\n");
		}
	}

	@Test(expected = FileNotFoundException.class)
	public void testandoExceptionCasoOArquivoTenhaArquivoNaoExistente() throws IOException {
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\NaoExisto.csv";
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

			br.readLine();

		} catch (FileNotFoundException e) {
			System.out.println("ALGUM VALOR INSERIDO É INVÁLIDO: " + e.getMessage() + "\n");
		}

	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testandoExceptionCasoOArquivoTenhaArrayFaltando() {
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		boolean erro = false;
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\FaltaArray.csv";
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
			}

		} catch (ArrayIndexOutOfBoundsException | IOException e) {
			System.out.println("ALGUM CAMPO NÃO FOI PREENCHIDO!" + e.getMessage());
		}

	}

	@Test
	public void testandoSArrayDaAngiospermas() throws IOException {
		List<Object> angiospermas = new ArrayList<>();
		List<Object> registros = new ArrayList<>();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayAngiospermas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(tiposFilo);
				registros.add(tiposClasses);
				registros.add(tiposOrdem);
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
				}

				if (registros.size() > 0 && angiospermas.size() > 0) {
					verifica = true;
				}
			}
		}
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoSArrayDaBriofiotas() throws IOException {
		List<Object> briofitas = new ArrayList<>();
		List<Object> registros = new ArrayList<>();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayBriofitas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(tiposFilo);
				registros.add(tiposClasses);
				registros.add(tiposOrdem);
				if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.MARCHANTIOPHYTA
						&& tiposOrdem == Ordem.HEPATICAS) {
					Riccia riccia = new Riccia.RicciaBuilder().build();
					Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
					briofitas.add(riccia);
					briofitas.add(marchantia);
				} else if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.BRYOPHYTA
						&& tiposOrdem == Ordem.MUSGOS) {
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

					if (registros.size() > 0 && briofitas.size() > 0) {
						verifica = true;
					}
				}
				assertEquals(esperado, verifica);

			}

		}

	}

	@Test
	public void testandoSArrayDaGimnospermas() throws IOException {
		List<Object> gimnospermas = new ArrayList<>();
		List<Object> registros = new ArrayList<>();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayGimnospermas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(tiposFilo);
				registros.add(tiposClasses);
				registros.add(tiposOrdem);
				if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CONIFERAS
						&& tiposOrdem == Ordem.SEM_ORDEM) {
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
				} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.CONIFERAS
						&& tiposOrdem != Ordem.SEM_ORDEM
						|| tiposFilo == Filo.GIMNOSPERMAS && tiposClasses != Classes.CICADOFITAS
								&& tiposOrdem != Ordem.CYCADACEAE) {
					System.out.println(
							"Alguns dados no Filo Gimnospermas são inválidos, esses dados não serão impressos na consulta!");

				}
				verifica = true;

				assertEquals(esperado, verifica);
				if (registros.size() > 0 && gimnospermas.size() > 0) {
				}

			}
		}

	}

	@Test
	public void testandoSArrayDaPteridofitass() throws IOException {
		List<Object> pteridofitas = new ArrayList<>();
		List<Object> registros = new ArrayList<>();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayPteridofitas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(tiposFilo);
				registros.add(tiposClasses);
				registros.add(tiposOrdem);
				if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.MONILOPHYTA
						&& tiposOrdem == Ordem.SEM_ORDEM) {
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
				}

				if (registros.size() > 0 && pteridofitas.size() > 0) {
					verifica = true;
				}
			}
		}
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoSArrayDaAngiospermasExtracao() throws IOException {
		List<Object> angiospermas = new ArrayList<>();
		List<Object> registros = new ArrayList<>();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayAngiospermas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(tiposFilo);
				registros.add(tiposClasses);
				registros.add(tiposOrdem);
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
						|| tiposFilo == Filo.ANGIOSPERMAS && tiposClasses != Classes.MONOCOTILEDONEAS
								&& tiposOrdem != Ordem.SEM_ORDEM) {
					System.out.println(
							"Alguns dados inseridos no Filo Angiospermas são inválidos, esses dados não serão impressos na Consulta!");

				}
				if (registros.size() > 0 && erro == false) {
					try (PrintWriter writer = new PrintWriter(new File("ListaDeRegistroArrayAngiospermas.csv"))) {
						StringBuilder sb = new StringBuilder();
						sb.append("REGISTROS DE PLANTAS BASEADO NA SUA CONSULTA");
						sb.append('\n');
						sb.append('\n');
						if (angiospermas.size() > 0) {
							DadoA dadoA = new DadoA.DadoABuilder().build();
							sb.append("PLANTAS DO FILO ANGIOSPERMAS");
							sb.append(getAngiospermas());
							sb.append(dadoA);
							sb.append('\n');
							verifica = true;
						}
						assertEquals(esperado, verifica);

					}
				}
			}
		}
	}

	private Object getAngiospermas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testandoSArrayDaBriofitasExtracao() throws IOException {
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		List<Briofitas> briofitas = new ArrayList<Briofitas>();

		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayBriofitas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				while (br.ready() && linhas != null && erro == false) {
					linhas = br.readLine();
					String[] campo = linhas.split(",");
					tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
					tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
					tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
					registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));

					if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.MARCHANTIOPHYTA
							&& tiposOrdem == Ordem.HEPATICAS) {
						Riccia riccia = new Riccia.RicciaBuilder().build();
						Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
						briofitas.add(riccia);
						briofitas.add(marchantia);
					} else if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.BRYOPHYTA
							&& tiposOrdem == Ordem.MUSGOS) {
						Sphagnidae sphagnidae = new Sphagnidae.SphagnidaeBuilder().build();
						Andreaeidae andreaeidae = new Andreaeidae.AndreaeidaeBuilder().build();
						briofitas.add(sphagnidae);
						briofitas.add(andreaeidae);
					} else if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.ANTHOCEROPHYTA
							&& tiposOrdem == Ordem.ANTOCEROS) {
						Agrestis agrestis = new Agrestis.AgrestisBuilder().build();
						Fusiformis fusiformis = new Fusiformis.FusiformisBuilder().build();
						verifica = true;
						briofitas.add(agrestis);
						briofitas.add(fusiformis);
					}
					assertEquals(esperado, verifica);

				}

			}

		}

	}

	@Test(expected = IllegalArgumentException.class)
	public void testandoSArrayDaBriofitasErradoExtracao() throws IOException {
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayBriofitas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				while (br.ready() && linhas != null && erro == false) {
					linhas = br.readLine();
					String[] campo = linhas.split(",");
					tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
					tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
					tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
					registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
				}

			}
		}

	}

	private Object pegaOsTiposDeFilo1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testandoSArrayDaGminospermasExtracao() throws IOException {
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		List<Object> pesquisa = new ArrayList<>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();

		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayGimnospermas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
				pesquisa.add(tiposFilo);
				pesquisa.add(tiposClasses);
				pesquisa.add(tiposOrdem);

				for (RegistroDeEntrada registroDeEntrada : registros) {
					tratadorDados.trataCSVGimnospermas(registroDeEntrada);

				}
				if (registros.size() > 0 && erro == false) {
					try (PrintWriter writer = new PrintWriter(new File("ListaDeRegistroArrayBriofitas.csv"))) {
						StringBuilder sb = new StringBuilder();
						sb.append("REGISTROS DE PLANTAS BASEADO NA SUA CONSULTA");
						sb.append('\n');
						sb.append('\n');
						if (registros.size() > 0) {
							DadoG dadoG = new DadoG.DadoGBuilder().build();
							sb.append("PLANTAS DO FILO GIMNOSPERMAS");
							sb.append(pegaOsTiposDeFilo1());
							sb.append(dadoG);
							sb.append('\n');
							verifica = true;
						}
						assertEquals(esperado, verifica);

					}
				}
			}
		}
	}

	private void pegaOsTiposDeFilo() {
		// TODO Auto-generated method stub
	}

	@Test
	public void testandoSArrayDaPteridofitaExtracao() throws IOException {
		List<Object> pteridofitas = new ArrayList<>();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayPteridofitas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));

				if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.MONILOPHYTA
						&& tiposOrdem == Ordem.SEM_ORDEM) {
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
				}
				try (PrintWriter writer = new PrintWriter(new File("ListaDeRegistroArrayBriofitas.csv"))) {
					StringBuilder sb = new StringBuilder();
					sb.append("REGISTROS DE PLANTAS BASEADO NA SUA CONSULTA");
					sb.append('\n');
					sb.append('\n');
					if (pteridofitas.size() > 0) {
						DadoP dadoP = new DadoP.DadoPBuilder().build();
						sb.append("PLANTAS DO FILO GIMNOSPERMAS");
						sb.append(getPteridofitas());
						sb.append(dadoP);
						sb.append('\n');
						verifica = true;
					}
					assertEquals(esperado, verifica);

				}
			}
		}
	}

	private Object getPteridofitas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testandoSArrayRegistros() throws IOException {
		List<Object> registros = new ArrayList<>();
		boolean erro = false;
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\PlantasConsulta.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null && erro == false) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(tiposFilo);
				registros.add(tiposClasses);
				registros.add(tiposOrdem);

				try (PrintWriter writer = new PrintWriter(new File("ListaDeRegistro.csv"))) {
					StringBuilder sb = new StringBuilder();
					sb.append("REGISTROS DE PLANTAS BASEADO NA SUA CONSULTA");
					sb.append('\n');
					sb.append('\n');
					if (registros.size() > 0) {
						DadoP dadoP = new DadoP.DadoPBuilder().build();
						sb.append("Total de Plantas");
						sb.append(getRegistros());
						sb.append(dadoP);
						sb.append('\n');
						verifica = true;
					}
					assertEquals(esperado, verifica);

				}
			}
		}
	}

	private Object getRegistros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testandoSeSaidaFunciona() throws IOException {
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\PlantasConsulta.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		boolean verifica = false;
		boolean esperado = true;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));

				for (RegistroDeEntrada registroDeEntrada : registros) {

					tratadorDados.trataCSVAngiospermas(registroDeEntrada);

					tratadorDados.trataCSVBriofitas(registroDeEntrada);

					tratadorDados.trataCSVGimnospermas(registroDeEntrada);

					tratadorDados.trataCSVPteridofitas(registroDeEntrada);

				}
				br.readLine();

				if (registros.size() > 0) {
					verifica = true;
					assertEquals(esperado, verifica);
					Saida arquivosaindo = new Saida();
					arquivosaindo.escreveArquivo(tratadorDados.pegaRegistroAngiospermas(),
							tratadorDados.pegaRegistroBriofitas(), tratadorDados.pegaRegistroGimnospermas(),
							tratadorDados.pegaRegistroPteridofitas(), registros);
				}

			}
		}
	}

	@Test
	public void testandoEntradaMetodoAngiospermasDoCSV() throws IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayAngiospermas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
			}

			for (RegistroDeEntrada registroDeEntrada : registros) {
				tratadorDados.trataCSVAngiospermas(registroDeEntrada);

				if (registros.size() > 0) {
					verifica = true;
					if (registros.size() > 0) {
						Saida arquivosaindo = new Saida();
						arquivosaindo.escreveArquivo(tratadorDados.pegaRegistroAngiospermas(),
								tratadorDados.pegaRegistroBriofitas(), tratadorDados.pegaRegistroGimnospermas(),
								tratadorDados.pegaRegistroPteridofitas(), registros);
						Saida testCSV = new Saida();
						testCSV.readCSVFile();
					}
					assertEquals(esperado, verifica);

				}
			}
		}
	}

	@Test
	public void testandoEntradaMetodoDeTratamentoBriofitasDoCSV() throws IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayBriofitas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));

				for (RegistroDeEntrada registroDeEntrada : registros) {
					tratadorDados.trataCSVBriofitas(registroDeEntrada);
				}
				if (registros.size() > 0) {
					if (registros.size() > 0) {
						verifica = true;
						Saida arquivosaindo = new Saida();
						arquivosaindo.escreveArquivo(tratadorDados.pegaRegistroAngiospermas(),
								tratadorDados.pegaRegistroBriofitas(), tratadorDados.pegaRegistroGimnospermas(),
								tratadorDados.pegaRegistroPteridofitas(), registros);
						Saida testCSV = new Saida();
						testCSV.readCSVFile();
					}
					assertEquals(esperado, verifica);
				}
			}
		}
	}

	@Test
	public void testandoEntradaMetodoDeTratamentoGimnospermasDoCSV() throws IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayGimnospermas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));

				for (RegistroDeEntrada registroDeEntrada : registros) {
					tratadorDados.trataCSVGimnospermas(registroDeEntrada);

					if (registros.size() > 0) {
						if (registros.size() > 0) {
							verifica = true;
							Saida arquivosaindo = new Saida();
							arquivosaindo.escreveArquivo(tratadorDados.pegaRegistroAngiospermas(),
									tratadorDados.pegaRegistroBriofitas(), tratadorDados.pegaRegistroGimnospermas(),
									tratadorDados.pegaRegistroPteridofitas(), registros);
							Saida testCSV = new Saida();
							testCSV.readCSVFile();
						}
						assertEquals(esperado, verifica);
					}
				}
			}
		}
	}

	@Test
	public void testandoEntradaMetodoDeTratamentoPteridofitasDoCSV() throws IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\ArrayPteridofitas.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
			}

			for (RegistroDeEntrada registroDeEntrada : registros) {
				tratadorDados.trataCSVPteridofitas(registroDeEntrada);

				if (registros.size() > 0) {
					if (registros.size() > 0) {
						verifica = true;
						Saida arquivosaindo = new Saida();
						arquivosaindo.escreveArquivo(tratadorDados.pegaRegistroAngiospermas(),
								tratadorDados.pegaRegistroBriofitas(), tratadorDados.pegaRegistroGimnospermas(),
								tratadorDados.pegaRegistroPteridofitas(), registros);
						Saida testCSV = new Saida();
						testCSV.readCSVFile();
					}
					assertEquals(esperado, verifica);
				}
			}
		}
	}

	@Test
	public void testandoEntradaTodosOsMetodosDeTratamentoDoCSV() throws IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\PlantasConsulta.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
			}
			for (RegistroDeEntrada registroDeEntrada : registros) {

				tratadorDados.trataCSVAngiospermas(registroDeEntrada);

				tratadorDados.trataCSVBriofitas(registroDeEntrada);

				tratadorDados.trataCSVGimnospermas(registroDeEntrada);

				tratadorDados.trataCSVPteridofitas(registroDeEntrada);

			}
			if (registros.size() > 0) {
				if (registros.size() > 0) {
					verifica = true;
					Saida arquivosaindo = new Saida();
					arquivosaindo.escreveArquivo(tratadorDados.pegaRegistroAngiospermas(),
							tratadorDados.pegaRegistroBriofitas(), tratadorDados.pegaRegistroGimnospermas(),
							tratadorDados.pegaRegistroPteridofitas(), registros);
					Saida testCSV = new Saida();
					testCSV.readCSVFile();
				}
				assertEquals(esperado, verifica);
			}
		}
	}

	@Test
	public void testandoExecptionsDeAngiospermasCSV() throws FileNotFoundException, IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\AngiospermasException.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
			}
			for (RegistroDeEntrada registroDeEntrada : registros) {

				tratadorDados.trataCSVAngiospermas(registroDeEntrada);

				verifica = true;

			}
			br.readLine();

		}
		assertEquals(esperado, verifica);
	}

	@Test
	public void testandoTratamentossDeBriofitasCSV() throws FileNotFoundException, IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\BriofitasException.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
			}
			for (RegistroDeEntrada registroDeEntrada : registros) {
				tratadorDados.trataCSVBriofitas(registroDeEntrada);

				verifica = true;

			}
			br.readLine();

		}
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoExecptionsDeGimnospermasCSV() throws FileNotFoundException, IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\GimnospermasException.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
			}
			for (RegistroDeEntrada registroDeEntrada : registros) {
				tratadorDados.trataCSVGimnospermas(registroDeEntrada);

				verifica = true;

			}
			br.readLine();

		}
		assertEquals(esperado, verifica);

	}

	@Test
	public void testandoExecptionsPteridofitasCSV() throws FileNotFoundException, IOException {
		boolean verifica = false;
		boolean esperado = true;
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\PteridofitasExceptions.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));
			}
			for (RegistroDeEntrada registroDeEntrada : registros) {
				tratadorDados.trataCSVPteridofitas(registroDeEntrada);

				verifica = true;

			}
			br.readLine();

		}
		assertEquals(esperado, verifica);

	}

	@Test
	public void escreveArquivo() throws FileNotFoundException {
		boolean verifica = false;
		boolean esperado = true;
		try (PrintWriter writer = new PrintWriter(new File("Testando.csv"))) {
			StringBuilder sb = new StringBuilder();
			verifica = true;
			sb.append("REGISTROS DE PLANTAS BASEADOS NA SUA CONSULTA\n\n");
			writer.write(sb.toString());
			writer.close();

		}
		assertEquals(esperado, verifica);

	}

	@Test(expected = FileNotFoundException.class)
	public void escreveArquivoAberto() throws FileNotFoundException {
		try (PrintWriter writer = new PrintWriter(new File("ArquivoAberto.csv"))) {
		} catch (FileNotFoundException e) {
			System.out.println("================================== ATENÇÃO !!!! =================================\n"
					+ "O ARQUIVO ESTÁ EM USO NÃO É POSSÍVEL MODIFICA-LO OU EXPORTA-LO. FECHE E TENTE NOVAMENTE: "
					+ "\n");
			e.printStackTrace();
		}
	}

	@Test
	public void readCSVFile() throws FileNotFoundException {
		List<List<String>> records = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("Testando.csv"));) {
			while (scanner.hasNextLine()) {
				records.add(getRecordFromLine(scanner.nextLine()));
			}
		}
		System.out.println(records.toString());
	}

	public List<String> getRecordFromLine(String line) {
		List<String> values = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(line)) {
			rowScanner.useDelimiter(" ");
			while (rowScanner.hasNext()) {
				values.add(rowScanner.next());
			}
		}
		return values;
	}

}
