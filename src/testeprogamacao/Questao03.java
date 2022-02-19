package testeprogamacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questao03
	{
		public static void main(String[] args)
			{

				ArrayList<String> lista = new ArrayList();
				char caracteresChar[] =
					{};
				String palavra, palavra2;
				int verificaIgualdade = 0;
				int contAnagrama = 0;
				int teste2 = 1;
				int paresAnagrama = 0;

				Scanner entrada = new Scanner(System.in);
				System.out.println("Digite uma palavra: ");
				String inputString = entrada.next();
				entrada.close();

				// Faz o anagrama.
				for (int i = 0; i < inputString.length(); i++)
					{
						for (int j = i + 1; j <= inputString.length(); j++)
							{
								// i e j sao posicoes na string, onde i é a posicao inicial e j é ate aonde será
								// pecorrido na string.
								String ab = inputString.substring(i, j);
								lista.add(ab);
							}
					}
				// System.out.println(lista); Print apenas para verificacao de anagramas.

				for (int contadorRepeticao = 0; contadorRepeticao < lista.size() - 1; contadorRepeticao++)
					{
						palavra = "" + lista.get(contadorRepeticao);

						char[] a = palavra.toCharArray();
						Arrays.sort(a);

						for (int teste = contadorRepeticao + 1; teste < lista.size(); teste++)
							{
								palavra2 = "" + lista.get(teste);

								char[] b = palavra2.toCharArray();
								Arrays.sort(b);

								if (Arrays.equals(a, b))
									{

										paresAnagrama++;

									} else
									{

									}

							}

					}
				System.out.println("Sua palavra contém " + paresAnagrama + " pares de anagramas!");
			}
	}