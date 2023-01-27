package br.com.magnasistemas.planta.CSV;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Ordem;

public class Entrada {

	public static void main(String args[]) throws FileNotFoundException {
		List<RegistroDeEntrada> registros = new ArrayList<RegistroDeEntrada>();
		List<Object> pesquisa = new ArrayList<>();
		TratadorDeCSV tratadorDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\PlantasConsulta.csv";
		Filo tiposFilo;
		Ordem tiposOrdem;
		Classes tiposClasses;
		Integer cont = 0;
		try (BufferedReader br = new BufferedReader(//lê o texto de um fluxo de entrada de caracteres, armazenando caracteres em buffer para fornecer uma leitura eficiente
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {//lê bytes de um lado, converte em caracteres do outroe permitindo ler aquivo qualquer e devolver em bytes
			String linhas = br.readLine();
			while (br.ready() && linhas != null) {//Enquanto houver linhas e linha for diferente de null
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(new RegistroDeEntrada(tiposFilo, tiposOrdem, tiposClasses));// adcionandando os dados no array 
				pesquisa.add(tiposFilo);
				pesquisa.add(tiposClasses);
				pesquisa.add(tiposOrdem);
			}

			for (RegistroDeEntrada registroDeEntrada : registros) {

				tratadorDados.trataCSVAngiospermas(registroDeEntrada);
				tratadorDados.trataCSVBriofitas(registroDeEntrada);
				tratadorDados.trataCSVGimnospermas(registroDeEntrada);
				tratadorDados.trataCSVPteridofitas(registroDeEntrada);

			}

			br.readLine();

			System.out.println("\n======================FORAM INSERIDOS OS SEGUINTES DADOS PARA CONSULTA==================================\n");
			for (Object object : pesquisa) {
				if (cont == 0) {
					System.out.print("FILO:");
				} else if (cont == 1) {
					System.out.print("CLASSE:");
				} else if (cont == 2) {
					System.out.print("ORDEM:");
				}
				System.out.println(object);
				cont++;
				if (cont == 3) {
					System.out.println("==================\n");
					cont = 0;
				}

			}
		} catch (

		IOException e) {
			System.out.println("SEGUINTE ERRO ENCONTRADO: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("ALGUM VALOR INSERIDO É INVÁLIDO: " + e.getMessage() + "\n");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ALGUM CAMPO NÃO FOI PREENCHIDO!" + e.getMessage());
		}
		if (registros.size() > 0) {
			Saida arquivosaindo = new Saida();// Criando um objeto do tipo Saída.
			arquivosaindo.escreveArquivo(tratadorDados.pegaRegistroAngiospermas(),
					tratadorDados.pegaRegistroBriofitas(), tratadorDados.pegaRegistroGimnospermas(),
					tratadorDados.pegaRegistroPteridofitas(), registros);// Usando meus gets para pegar os resultados da consulta.
			Saida testCSV = new Saida();
			testCSV.readCSVFile();
		} else {
			System.out.println(
					"===================================== ATENÇÃO ALGO DEU ERRADO !=========================================\n\n"
							+ "PARA REALIZAR SUA CONSULTA É NECESSÁRIO INSERIR DADOS VÁLIDOS, ELA NÃO PODE ESTAR VAZIA\n"
							+ "OU COM UM DADO QUE NÃO EXISTA NA CONSULTA!!! \n\n"
							+ "=============================== CONSULTE A TAXONOMIA DO REINO PLANTAE ==================================\n\n"
							+ "FILOS DISPONÍVEIS: ANGIOSPERNAS,BRIOFITAS,GIMNOSPERMAS, PTERIDOFITAS\n\n"
							+ "CLASSES PERTECENTES A ANGIOSPERMAS: LYCOPODIOPHYTA,MONILOPHYTA(SEM ORDEM)\n"
							+ "ORDEM EXISTENTES EM ANGIOSPERMAS: ROSACEAS,ASTERACEA,LEGUMINOSAS,SEM_ORDEM\n\n"
							+ "CLASSES PERTECENTES A BRIOFITA: MARCHANTIOPHYTA,BRYOPHYTA,ANTHOCEROPHYTA,LYCOPODIOPHYTA,MONILOPHYTA\n"
							+ "ORDEM EXISTENTES EM BRIOFITAS: HEPATICAS,MUSGOS,ANTOCEROS\n\n"
							+ "ORDEM EXISTENTES EM GIMNOSPERMAS: CYCADACEAE,ZAMAIACEAE,STANGERIACEAE,WELWITSCHIALES,EPHEDRALES,GNETALES\n"
							+ "CLASSES PERTECENTES A GIMNOSPERMAS: MONOCOTILEDONEAS,EUDICOTILEDONEAS\n\n"
							+ "CLASSES PERTECENTES A PTERIDOFITAS: CONIFERAS(SEM ORDEM),CICADOFITAS,GNETOPHYTA,GINKGOPHYTA(SEM ORDEM)\n"
							+ "ORDEM EXISTENTES EM PTERIDOFITAS: LICOPIDIOS,ISOETES,SELAGINELLAS,SEM_ORDEM\n\n"
							+ "========== CONSULTE DE ACORDO COM AS INFORMAÇÕES ACIMA E VEJA SE SUA COMBINAÇÃO É VALIDA !===============");
		}
	}

}
