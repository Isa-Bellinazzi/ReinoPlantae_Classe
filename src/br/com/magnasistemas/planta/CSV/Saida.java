package br.com.magnasistemas.planta.CSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.magnasistemas.planta.DadosFilos.DadoA;
import br.com.magnasistemas.planta.DadosFilos.DadoB;
import br.com.magnasistemas.planta.DadosFilos.DadoG;
import br.com.magnasistemas.planta.DadosFilos.DadoP;
import br.com.magnasistemas.planta.angiospermas.Angiospermas;
import br.com.magnasistemas.planta.briofitas.Briofitas;
import br.com.magnasistemas.planta.gimnospermas.Gimnospermas;
import br.com.magnasistemas.planta.pteridofitas.Pteridofitas;

public class Saida {

	public void escreveArquivo(List<Angiospermas> angiospermasDados, List<Briofitas> briofitasDados,
			List<Gimnospermas> gimnospermasDados, List<Pteridofitas> pteridofitasDados,
			List<RegistroDeEntrada> registros) {
		try (PrintWriter writer = new PrintWriter(new File("ListaDeRegistroPlantas.csv"))) {//Imprime representações formatadas de objetos em um fluxo de saída de texto.
			StringBuilder sb = new StringBuilder();//pode ser usada quando você deseja modificar uma cadeia de caracteres sem criar um novo objeto
			sb.append("REGISTROS DE PLANTAS BASEADOS NA SUA CONSULTA\n\n");
			if (angiospermasDados.size() > 0) {
				DadoA dadoA = new DadoA.DadoABuilder().build();
				sb.append("PLANTAS DO FILO ANGIOSPERMAS");//adiciona um novo valor dentro de uma chave existente dentro do objeto FormData ou adiciona a chave caso ainda não exista.
				sb.append(angiospermasDados);
				sb.append(dadoA);
				sb.append('\n');
			}
			if (briofitasDados.size() > 0) {
				DadoB dadoB = new DadoB.DadoBBuilder().build();
				sb.append("\nPLANTAS DO FILO BRIOFITAS");
				sb.append(briofitasDados);
				sb.append(dadoB);
				sb.append('\n');
			}
			if (gimnospermasDados.size() > 0) {
				DadoG dadoG = new DadoG.DadoGBuilder().build();
				sb.append("PLANTAS DO FILO GMINOSPERMAS");
				sb.append(gimnospermasDados);
				sb.append(dadoG);
				sb.append('\n');
			}
			if (pteridofitasDados.size() > 0) {
				DadoP dadoP = new DadoP.DadoPBuilder().build();
				sb.append("PLANTAS DO FILO PTERIDOFITAS");
				sb.append(pteridofitasDados);
				sb.append(dadoP);
				sb.append('\n');
			}
			writer.write(sb.toString());//É uma classe abstrata que escreve stream de caracteres.
			writer.close();

		} catch (FileNotFoundException e) {
			System.out.println("================================== ATENÇÃO !!!! =================================\n"
					+ "O ARQUIVO ESTÁ EM USO NÃO É POSSÍVEL MODIFICA-LO OU EXPORTA-LO. FECHE E TENTE NOVAMENTE: " + "\n");
			e.printStackTrace(); 
		}
	}

	public void readCSVFile() throws FileNotFoundException {
		List<List<String>> todosOsRegistros = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("ListaDeRegistroPlantas.csv"));) {
				while (scanner.hasNextLine()) {
					todosOsRegistros.add(pegaRegistroDaLinha(scanner.nextLine()));
				}
			}
			System.out.println("===================RESULTADO DA SUA CONSULTA !==============\n");
			for (List<String> list : todosOsRegistros) {
				System.out.println(list);
			}
		}
	

	private List<String> pegaRegistroDaLinha(String line) {
		List<String> valores = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(line)) {
			rowScanner.useDelimiter(",");
				while (rowScanner.hasNext()) {
					valores.add(rowScanner.next());
				}
			}
			return valores;
		}
	}

