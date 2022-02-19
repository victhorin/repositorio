package testeprogamacao;

import java.util.Scanner;

public class Questao01
	{

		public static void main(String[] args)
			{

				try
					{
						boolean rep = true;
						while (rep)
							{

								Scanner sc = new Scanner(System.in);

								int degrau, altura, comprimento;// Declaracao das Variaveis
								char repeticao;// Variavel que servira como resposta do usuario para continuacao

								System.out.println("Infome o numero de degraus:");
								degrau = sc.nextInt();
								boolean flag = false; // Indicador em casos de numero nulo ou negativo
								if (degrau > 0)
									{
										flag = true;
									}
								while (flag == false) // Laço de repetiçao em caso nulo ou negativo
									{
										System.out.println("Informe um valor positivo:");
										degrau = sc.nextInt();
										if (degrau > 0)
											{
												flag = true;
											}
									}
								for (altura = 1; altura <= degrau; altura++)
									{

										for (comprimento = 1; comprimento <= degrau; comprimento++)
											{
												if (comprimento > (degrau - altura))
													{
														System.out.print("*");
													} else
													{
														System.out.print(" ");
													}

											}
										System.out.println();
									}
								// Bloco para verificar a continuacao do progama com o usuario

								System.out.println("Voce deseja continuar?[S/N]");
								Scanner scRep = new Scanner(System.in);
								repeticao = scRep.nextLine().toUpperCase().charAt(0);

								if (repeticao == 'S')
									{
										rep = true;
									} else if (repeticao == 'N')
									{
										rep = false;
									} else
									{
										System.out.println("Foi inserida uma opção inválida\nEncerrando o programa...");
										rep = false;

									}
							}

					} catch (

				Exception e)
					{
						System.out.print("      ##ERROR## \n" + "Insira um valor inteiro");
					}
			}
	}
