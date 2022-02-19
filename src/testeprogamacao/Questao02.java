package testeprogamacao;

import java.util.Scanner;

public class Questao02
	{
		public static void main(String[] args)
			{
				char[] caracteresEspeciais =
					{ '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' }; // declaração de variaveis e lista
				String senha;
				int falta, contadorRelativo;
				int contadorEspeciais = 0;
				int contadorMaiuscula = 0;
				int contadorMinuscula = 0;
				int contadorDigito = 0;
				int contadorCondicoes = 0;
				boolean verificadorMaiuscula, verificadorMinuscula, verificadorDigito;

				Scanner sc = new Scanner(System.in);
				System.out.println("Insira a sua senha:");
				senha = sc.nextLine();

				System.out.println("Verificando...");

				for (int i = 0; i < senha.length(); i++) // verificador de 3 condicoes
					{
						char chr = senha.charAt(i);
						verificadorMaiuscula = Character.isUpperCase(chr);
						verificadorMinuscula = Character.isLowerCase(chr);
						verificadorDigito = Character.isDigit(chr);

						if (verificadorMaiuscula)
							{
								contadorMaiuscula++;
							}
						if (verificadorMinuscula)
							{
								contadorMinuscula++;
							}
						if (verificadorDigito)
							{
								contadorDigito++;
							}

						for (int j = 0; j < caracteresEspeciais.length; j++) // verificador de caractere especial
							{
								if (caracteresEspeciais[j] == chr)
									{
										contadorEspeciais++;
									}
							}
					}

				if (contadorMaiuscula == 0)
					{
						System.out.println("Adicione ao menos uma letra maiúscula");
						contadorCondicoes++;
					}

				if (contadorMinuscula == 0)
					{
						System.out.println("Adicione ao menos uma letra minúscula");
						contadorCondicoes++;
					}

				if (contadorEspeciais == 0)
					{
						System.out.println("Adicione ao menos um caractere especial");
						contadorCondicoes++;
					}

				if (contadorDigito == 0)
					{
						System.out.println("Adicione ao menos um número");
						contadorCondicoes++;
					}

				contadorRelativo = 6 - senha.length();
				if (contadorCondicoes <= contadorRelativo)
					{
						falta = contadorRelativo;
					} else
					{
						falta = contadorCondicoes;
					}

				if (contadorCondicoes == 0 && contadorRelativo <= 0)
					{
						System.out.println("Sua senha é forte!");
					} else
					{
						System.out.println("Para que sua senha seja forte adicione " + falta + " caracteres");
					}

				sc.close();

			}

	}