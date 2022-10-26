package revisaoLogica;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		/*
		1. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos 
		(aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um 
			algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/
		
		float carro, distribuidor, imposto, vFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Custo do carro: ");
		carro = ler.nextFloat();
		
		imposto = (float) (carro*0.45);
		distribuidor = (float) (carro * 0.28);
		vFinal = carro + imposto + distribuidor;
		
		System.out.printf("Valor final: R$ %.2f", vFinal);
		
		ler.close();
		/*
		2. Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total 
		(total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
		- Se quantidade <= 5 o desconto será de 2%
		- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
		- Se quantidade > 10 o desconto será de 5%
		*/
		//*****************QUESTÃO 2*****************
		String nome;
		float quantidade, preco, total;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Nome do produto: ");
		nome = ler.next();
		
		System.out.printf("Quantidade adquirida: ");
		quantidade = ler.nextFloat();
		
		System.out.printf("preço unitário: ");
		preco = ler.nextFloat();
		
		total = quantidade*preco;
		
		if(quantidade<=5) {
			System.out.printf("Total a pagar = R$ %.2f", total-total*0.02);
		}else if(quantidade>5 && quantidade<=10){
			System.out.printf("Total a pagar = R$ %.2f", total-total*0.03);
		}else if(quantidade> 10) {
			System.out.printf("Total a pagar = R$ %.2f", total-total*0.05);
		}
		
		ler.close();
		
		/*
		3. Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.
		*/
		//*****************QUESTÃO 3*****************
		int i, j, par=0, numero[];
		
		numero = new int[20];
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<20; i++) {
			System.out.printf("Número %d:", i+1);
			numero[i] = ler.nextInt();
		}
		for(j=0; j<20; j++) {
			if(numero[j]%2==0) {
				par = par+1;
			}
		}
		System.out.printf("Quantos número pares? %d", par);
		
		ler.close();
		
		/*
		4. Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado.
		*/
		//*****************QUESTÃO 4*****************
		int numero[], i, soma=0;
		
		numero = new int[5];
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<5; i++) {
			System.out.printf("Número %d:", i+1);
			numero[i] = ler.nextInt();
			if(numero[i]>0) {
				soma = soma + numero[i];
			}else if(numero[i]<0) {
				break;
			}
		}
		
		System.out.printf("Soma = %d", soma);
		
		ler.close();
		/*
		5. Reescreva os códigos aplicando funções
		*/
		//****************QUESTÃO5*****************
		/*
		//Função1
		System.out.println("***Calculadora de custo***");
		custo();
		
		//Função2
		System.out.println("***Calculadora de desconto***");
		desconto();
		
		//Função3
		System.out.println("***Verificar números pares***");
		pares();
		
		//Função4
		System.out.println("***Cauular números >0***");
		calculo();
		*/
	}
	
	public static void custo() {
		float carro, distribuidor, imposto, vFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Custo do carro: ");
		carro = ler.nextFloat();
		
		imposto = (float) (carro*0.45);
		distribuidor = (float) (carro * 0.28);
		vFinal = carro + imposto + distribuidor;
		
		System.out.printf("Valor final: R$ %.2f", vFinal);
		
		ler.close();
	}
	public static void desconto() {
		float quantidade, preco, total;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Quantidade adquirida: ");
		quantidade = ler.nextFloat();
		
		System.out.printf("preço unitário: ");
		preco = ler.nextFloat();
		
		total = quantidade*preco;
		
		if(quantidade<=5) {
			System.out.printf("Total a pagar = R$ %.2f", total-total*0.02);
		}else if(quantidade>5 && quantidade<=10){
			System.out.printf("Total a pagar = R$ %.2f", total-total*0.03);
		}else if(quantidade> 10) {
			System.out.printf("Total a pagar = R$ %.2f", total-total*0.05);
		}
		ler.close();
	}
	public static void pares() {
		int i, j, par=0, numero[];
		numero = new int[20];
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<20; i++) {
			System.out.printf("Número %d:", i+1);
			numero[i] = ler.nextInt();
		}
		for(j=0; j<20; j++) {
			if(numero[j]%2==0) {
				par = par+1;
			}
		}
		System.out.printf("Quantos número pares? %d", par);
	
		ler.close();
	}
	public static void calculo() {
		int numero[], i, soma=0;
		
		numero = new int[5];
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<5; i++) {
			System.out.printf("Número %d:", i+1);
			numero[i] = ler.nextInt();
			if(numero[i]>0) {
				soma = soma + numero[i];
			}else if(numero[i]<0) {
				break;
			}
		}
		
		System.out.printf("Soma = %d", soma);
		
		ler.close();
	}
}
