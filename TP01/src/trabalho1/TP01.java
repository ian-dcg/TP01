package trabalho1;

import java.util.Scanner;

public class TP01 {
	
	//Aluno: Ian da Costa Gama
	//Matrícula: 19/0125829

	static int mes, ano;
	
	static double [] jan2011 = new double [31];
	static double [] fev2011 = new double [28];
	static double [] mar2011 = new double [31];
	static double [] abr2011 = new double [30];
	static double [] mai2011 = new double [31];
	static double [] jun2011 = new double [30];
	static double [] jul2011 = new double [31];
	static double [] ago2011 = new double [31];
	static double [] set2011 = new double [30];
	static double [] out2011 = new double [31];
	static double [] nov2011 = new double [30];
	static double [] dez2011 = new double [31];
	
	static double [] jan2012 = new double [31];
	static double [] fev2012 = new double [29];
	static double [] mar2012 = new double [31];
	static double [] abr2012 = new double [30];
	static double [] mai2012 = new double [31];
	static double [] jun2012 = new double [30];
	static double [] jul2012 = new double [31];
	static double [] ago2012 = new double [31];
	static double [] set2012 = new double [30];
	static double [] out2012 = new double [31];
	static double [] nov2012 = new double [30];
	static double [] dez2012 = new double [31];
	
	static double [] jan2013 = new double [31];
	static double [] fev2013 = new double [28];
	static double [] mar2013 = new double [31];
	static double [] abr2013 = new double [30];
	static double [] mai2013 = new double [31];
	static double [] jun2013 = new double [30];
	static double [] jul2013 = new double [31];
	static double [] ago2013 = new double [31];
	static double [] set2013 = new double [30];
	static double [] out2013 = new double [31];
	static double [] nov2013 = new double [30];
	static double [] dez2013 = new double [31];
	
	static double [] jan2014 = new double [31];
	static double [] fev2014 = new double [28];
	static double [] mar2014 = new double [31];
	static double [] abr2014 = new double [30];
	static double [] mai2014 = new double [31];
	static double [] jun2014 = new double [30];
	static double [] jul2014 = new double [31];
	static double [] ago2014 = new double [31];
	static double [] set2014 = new double [30];
	static double [] out2014 = new double [31];
	static double [] nov2014 = new double [30];
	static double [] dez2014 = new double [31];
	
	static double [] jan2015 = new double [31];
	static double [] fev2015 = new double [28];
	static double [] mar2015 = new double [31];
	static double [] abr2015 = new double [30];
	static double [] mai2015 = new double [31];
	static double [] jun2015 = new double [30];
	static double [] jul2015 = new double [31];
	static double [] ago2015 = new double [31];
	static double [] set2015 = new double [30];
	static double [] out2015 = new double [31];
	static double [] nov2015 = new double [30];
	static double [] dez2015 = new double [31];
	
	static double [] jan2016 = new double [31];
	static double [] fev2016 = new double [29];
	static double [] mar2016 = new double [31];
	static double [] abr2016 = new double [30];
	static double [] mai2016 = new double [31];
	static double [] jun2016 = new double [30];
	static double [] jul2016 = new double [31];
	static double [] ago2016 = new double [31];
	static double [] set2016 = new double [30];
	static double [] out2016 = new double [31];
	static double [] nov2016 = new double [30];
	static double [] dez2016 = new double [31];

	static double [] jan2017 = new double [31];
	static double [] fev2017 = new double [28];
	static double [] mar2017 = new double [31];
	static double [] abr2017 = new double [30];
	static double [] mai2017 = new double [31];
	static double [] jun2017 = new double [30];
	static double [] jul2017 = new double [31];
	static double [] ago2017 = new double [31];
	static double [] set2017 = new double [30];
	static double [] out2017 = new double [31];
	static double [] nov2017 = new double [30];
	static double [] dez2017 = new double [31];
	
	static double [] jan2018 = new double [31];
	static double [] fev2018 = new double [28];
	static double [] mar2018 = new double [31];
	static double [] abr2018 = new double [30];
	static double [] mai2018 = new double [31];
	static double [] jun2018 = new double [30];
	static double [] jul2018 = new double [31];
	static double [] ago2018 = new double [31];
	static double [] set2018 = new double [30];
	static double [] out2018 = new double [31];
	static double [] nov2018 = new double [30];
	static double [] dez2018 = new double [31];
	
	static double [] jan2019 = new double [31];
	static double [] fev2019 = new double [28];
	static double [] mar2019 = new double [31];
	static double [] abr2019 = new double [30];
	static double [] mai2019 = new double [31];
	static double [] jun2019 = new double [30];
	static double [] jul2019 = new double [31];
	static double [] ago2019 = new double [31];
	static double [] set2019 = new double [30];
	static double [] out2019 = new double [31];
	static double [] nov2019 = new double [30];
	static double [] dez2019 = new double [31];
	
	static double [] jan2020 = new double [31];
	static double [] fev2020 = new double [29];
	static double [] mar2020 = new double [31];
	static double [] abr2020 = new double [30];
	static double [] mai2020 = new double [31];
	static double [] jun2020 = new double [30];
	static double [] jul2020 = new double [31];
	static double [] ago2020 = new double [31];
	static double [] set2020 = new double [30];
	static double [] out2020 = new double [31];
	static double [] nov2020 = new double [30];
	static double [] dez2020 = new double [31];
	
	static double [] selectedMonth;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Dados aleatórios para o mês de Janeiro de 2020
		
		jan2020[0] = 15;	jan2020[11] = 32;	jan2020[22] = 29;
		jan2020[1] = 26;	jan2020[12] = 40;	jan2020[23] = 42;
		jan2020[2] = 12;	jan2020[13] = 35;	jan2020[24] = 12;
		jan2020[3] = 30;	jan2020[14] = 15;	jan2020[25] = 10;
		jan2020[4] = 7; 	jan2020[15] = 21;	jan2020[26] = 17;
		jan2020[5] = 18;	jan2020[16] = 27;	jan2020[27] = 19;
		jan2020[6] = 38;	jan2020[17] = 20;	jan2020[28] = 26;
		jan2020[7] = 10;	jan2020[18] = 16;	jan2020[29] = 23;
		jan2020[8] = 19;	jan2020[19] = 13;	jan2020[30] = 38;
		jan2020[9] = 29;	jan2020[20] = 25;	
		jan2020[10] = 28;	jan2020[21] = 14;
		
	
		int navegaMenu;
		double media=0, max=0, min=0;
		
		//MENU
		
		do {
			System.out.println("1- Entrada das temperaturas");
			System.out.println("2- Cálculo da temperatura média");
			System.out.println("3- Cálculo da temperatura mínima");
			System.out.println("4- Cálculo da temperatura máxima");
			System.out.println("5- Relatório meteorológico");
			
					
			navegaMenu = input.nextInt();
			switch(navegaMenu) {
				case 1: entradasMesAno();
						selecionaMes();
						entradaDias();
						break;
						
				case 2: entradasMesAno();
						selecionaMes();
						media = calculaMedia();
						break;
				case 3: entradasMesAno();
						selecionaMes();
						min = calculaTempMin();
						break;
				case 4: entradasMesAno();
						selecionaMes();
						max = calculaTempMax();
						break;
				case 5: entradasMesAno();
						selecionaMes();
						relatorio(media, max, min);
			}
					
		} while (navegaMenu != 6);
		
		
	}
	
	public static void entradasMesAno() {
		do { //Valida Mês
			System.out.println("Informe o mês: (número) ");
			mes = input.nextInt();
			if (mes < 1 || mes > 12) {
				System.out.println("Mês inválido. Digite um valor de 1 à 12.");
			}
		} while (mes < 1 || mes > 12);
		
		do { // Valida Ano
			System.out.println("Informe o ano: ");
			ano = input.nextInt();
			if (ano < 2011 || ano > 2020) {
				System.out.println("Ano inválido. Digite um ano entre 2011 e 2020");
			}
		} while (ano < 2011 || ano > 2020);
	}
	
	public static void selecionaMes() {
		if (mes == 1 && ano == 2011) 
			selectedMonth = jan2011;
		if (mes == 2 && ano == 2011)
			selectedMonth = fev2011;
		if (mes == 3 && ano == 2011)
			selectedMonth = mar2011;
		if (mes == 4 && ano == 2011)
			selectedMonth = abr2011;
		if (mes == 5 && ano == 2011)
			selectedMonth = mai2011;
		if (mes == 6 && ano == 2011)
			selectedMonth = jun2011;
		if (mes == 7 && ano == 2011)
			selectedMonth = jul2011;
		if (mes == 8 && ano == 2011)
			selectedMonth = ago2011;
		if (mes == 9 && ano == 2011)
			selectedMonth = set2011;
		if (mes == 10 && ano == 2011)
			selectedMonth = out2011;
		if (mes == 11 && ano == 2011)
			selectedMonth = nov2011;
		if (mes == 12 && ano == 2011)
			selectedMonth = dez2011;
		
		if (mes == 1 && ano == 2012) 
			selectedMonth = jan2012;
		if (mes == 2 && ano == 2012)
			selectedMonth = fev2012;
		if (mes == 3 && ano == 2012)
			selectedMonth = mar2012;
		if (mes == 4 && ano == 2012)
			selectedMonth = abr2012;
		if (mes == 5 && ano == 2012)
			selectedMonth = mai2012;
		if (mes == 6 && ano == 2012)
			selectedMonth = jun2012;
		if (mes == 7 && ano == 2012)
			selectedMonth = jul2012;
		if (mes == 8 && ano == 2012)
			selectedMonth = ago2012;
		if (mes == 9 && ano == 2012)
			selectedMonth = set2012;
		if (mes == 10 && ano == 2012)
			selectedMonth = out2012;
		if (mes == 11 && ano == 2012)
			selectedMonth = nov2012;
		if (mes == 12 && ano == 2012)
			selectedMonth = dez2012;
		
		if (mes == 1 && ano == 2013) 
			selectedMonth = jan2013;
		if (mes == 2 && ano == 2013)
			selectedMonth = fev2013;
		if (mes == 3 && ano == 2013)
			selectedMonth = mar2013;
		if (mes == 4 && ano == 2013)
			selectedMonth = abr2013;
		if (mes == 5 && ano == 2013)
			selectedMonth = mai2013;
		if (mes == 6 && ano == 2013)
			selectedMonth = jun2013;
		if (mes == 7 && ano == 2013)
			selectedMonth = jul2013;
		if (mes == 8 && ano == 2013)
			selectedMonth = ago2013;
		if (mes == 9 && ano == 2013)
			selectedMonth = set2013;
		if (mes == 10 && ano == 2013)
			selectedMonth = out2013;
		if (mes == 11 && ano == 2013)
			selectedMonth = nov2013;
		if (mes == 12 && ano == 2013)
			selectedMonth = dez2013;
		
		if (mes == 1 && ano == 2014) 
			selectedMonth = jan2014;
		if (mes == 2 && ano == 2014)
			selectedMonth = fev2014;
		if (mes == 3 && ano == 2014)
			selectedMonth = mar2014;
		if (mes == 4 && ano == 2014)
			selectedMonth = abr2014;
		if (mes == 5 && ano == 2014)
			selectedMonth = mai2014;
		if (mes == 6 && ano == 2014)
			selectedMonth = jun2014;
		if (mes == 7 && ano == 2014)
			selectedMonth = jul2014;
		if (mes == 8 && ano == 2014)
			selectedMonth = ago2014;
		if (mes == 9 && ano == 2014)
			selectedMonth = set2014;
		if (mes == 10 && ano == 2014)
			selectedMonth = out2014;
		if (mes == 11 && ano == 2014)
			selectedMonth = nov2014;
		if (mes == 12 && ano == 2014)
			selectedMonth = dez2014;
		
		if (mes == 1 && ano == 2015) 
			selectedMonth = jan2015;
		if (mes == 2 && ano == 2015)
			selectedMonth = fev2015;
		if (mes == 3 && ano == 2015)
			selectedMonth = mar2015;
		if (mes == 4 && ano == 2015)
			selectedMonth = abr2015;
		if (mes == 5 && ano == 2015)
			selectedMonth = mai2015;
		if (mes == 6 && ano == 2015)
			selectedMonth = jun2015;
		if (mes == 7 && ano == 2015)
			selectedMonth = jul2015;
		if (mes == 8 && ano == 2015)
			selectedMonth = ago2015;
		if (mes == 9 && ano == 2015)
			selectedMonth = set2015;
		if (mes == 10 && ano == 2015)
			selectedMonth = out2015;
		if (mes == 11 && ano == 2015)
			selectedMonth = nov2015;
		if (mes == 12 && ano == 2015)
			selectedMonth = dez2015;
		
		if (mes == 1 && ano == 2016) 
			selectedMonth = jan2016;
		if (mes == 2 && ano == 2016)
			selectedMonth = fev2016;
		if (mes == 3 && ano == 2016)
			selectedMonth = mar2016;
		if (mes == 4 && ano == 2016)
			selectedMonth = abr2016;
		if (mes == 5 && ano == 2016)
			selectedMonth = mai2016;
		if (mes == 6 && ano == 2016)
			selectedMonth = jun2016;
		if (mes == 7 && ano == 2016)
			selectedMonth = jul2016;
		if (mes == 8 && ano == 2016)
			selectedMonth = ago2016;
		if (mes == 9 && ano == 2016)
			selectedMonth = set2016;
		if (mes == 10 && ano == 2016)
			selectedMonth = out2016;
		if (mes == 11 && ano == 2016)
			selectedMonth = nov2016;
		if (mes == 12 && ano == 2016)
			selectedMonth = dez2016;
		
		if (mes == 1 && ano == 2017) 
			selectedMonth = jan2017;
		if (mes == 2 && ano == 2017)
			selectedMonth = fev2017;
		if (mes == 3 && ano == 2017)
			selectedMonth = mar2017;
		if (mes == 4 && ano == 2017)
			selectedMonth = abr2017;
		if (mes == 5 && ano == 2017)
			selectedMonth = mai2017;
		if (mes == 6 && ano == 2017)
			selectedMonth = jun2017;
		if (mes == 7 && ano == 2017)
			selectedMonth = jul2017;
		if (mes == 8 && ano == 2017)
			selectedMonth = ago2017;
		if (mes == 9 && ano == 2017)
			selectedMonth = set2017;
		if (mes == 10 && ano == 2017)
			selectedMonth = out2017;
		if (mes == 11 && ano == 2017)
			selectedMonth = nov2017;
		if (mes == 12 && ano == 2017)
			selectedMonth = dez2017;
		
		if (mes == 1 && ano == 2018) 
			selectedMonth = jan2018;
		if (mes == 2 && ano == 2018)
			selectedMonth = fev2018;
		if (mes == 3 && ano == 2018)
			selectedMonth = mar2018;
		if (mes == 4 && ano == 2018)
			selectedMonth = abr2018;
		if (mes == 5 && ano == 2018)
			selectedMonth = mai2018;
		if (mes == 6 && ano == 2018)
			selectedMonth = jun2018;
		if (mes == 7 && ano == 2018)
			selectedMonth = jul2018;
		if (mes == 8 && ano == 2018)
			selectedMonth = ago2018;
		if (mes == 9 && ano == 2018)
			selectedMonth = set2018;
		if (mes == 10 && ano == 2018)
			selectedMonth = out2018;
		if (mes == 11 && ano == 2018)
			selectedMonth = nov2018;
		if (mes == 12 && ano == 2018)
			selectedMonth = dez2018;
		
		if (mes == 1 && ano == 2019) 
			selectedMonth = jan2019;
		if (mes == 2 && ano == 2019)
			selectedMonth = fev2019;
		if (mes == 3 && ano == 2019)
			selectedMonth = mar2019;
		if (mes == 4 && ano == 2019)
			selectedMonth = abr2019;
		if (mes == 5 && ano == 2019)
			selectedMonth = mai2019;
		if (mes == 6 && ano == 2019)
			selectedMonth = jun2019;
		if (mes == 7 && ano == 2019)
			selectedMonth = jul2019;
		if (mes == 8 && ano == 2019)
			selectedMonth = ago2019;
		if (mes == 9 && ano == 2019)
			selectedMonth = set2019;
		if (mes == 10 && ano == 2019)
			selectedMonth = out2019;
		if (mes == 11 && ano == 2019)
			selectedMonth = nov2019;
		if (mes == 12 && ano == 2019)
			selectedMonth = dez2019;
		
		if (mes == 1 && ano == 2020) 
			selectedMonth = jan2020;
		if (mes == 2 && ano == 2020)
			selectedMonth = fev2020;
		if (mes == 3 && ano == 2020)
			selectedMonth = mar2020;
		if (mes == 4 && ano == 2020)
			selectedMonth = abr2020;
		if (mes == 5 && ano == 2020)
			selectedMonth = mai2020;
		if (mes == 6 && ano == 2020)
			selectedMonth = jun2020;
		if (mes == 7 && ano == 2020)
			selectedMonth = jul2020;
		if (mes == 8 && ano == 2020)
			selectedMonth = ago2020;
		if (mes == 9 && ano == 2020)
			selectedMonth = set2020;
		if (mes == 10 && ano == 2020)
			selectedMonth = out2020;
		if (mes == 11 && ano == 2020)
			selectedMonth = nov2020;
		if (mes == 12 && ano == 2020)
			selectedMonth = dez2020;
	}
	
	public static void entradaDias() {
			for (int i = 0; i < selectedMonth.length ; i++) {
				System.out.println("Informe a temperatura do " + (i+1) + "° dia:");
				selectedMonth[i] = input.nextDouble();
			}
	}
	
	public static double calculaMedia() {
		double total = 0;
		double media;
		
		
		for (int i = 0; i < selectedMonth.length ; i++) {
			total += selectedMonth[i];
		}
		media = total / selectedMonth.length;
		System.out.println("A média de temperatura da data " + mes +  "/" + ano + " foi " + media + "°C\n");
		return media;
		
	}
	
	
	public static double calculaTempMin() {
		double menor;
		menor = selectedMonth[0];
		for (int i = 0; i < selectedMonth.length ; i++) {
			if(menor > selectedMonth[i]) {
				menor = selectedMonth[i];
			}
		}
		System.out.println("A menor temperatura da data " + mes +  "/" + ano + " foi de " + menor + "°C\n");
		return menor;
	}
	
	public static double calculaTempMax() {
		double maior;
		maior = selectedMonth[0];
		for (int i = 0; i < selectedMonth.length ; i++) {
			if(maior < selectedMonth[i]) {
				maior = selectedMonth[i];
			}
		}
		System.out.println("A maior temperatura da data " + mes +  "/" + ano + " foi de " + maior + "°C\n");
		return maior;
	}
	
	public static void relatorio(double media, double max, double min) {
		System.out.println("RELATÓRIO METEOROLÓGICO\n");
		for (int i = 0; i < selectedMonth.length ; i++) {
			System.out.println("Temperatura média do " + (i+1) + "° dia: " + selectedMonth[i] + "°C");
		}
		System.out.print("\n");
		System.out.println("A média de temperatura da data " + mes +  "/" + ano + " foi " + media + "°C\n");
		System.out.println("A menor temperatura da data " + mes +  "/" + ano + " foi de " + min + "°C\n");
		System.out.println("A maior temperatura da data " + mes +  "/" + ano + " foi de " + max + "°C\n");
		System.out.println("---------------------------------------------------------------");
		System.out.print("\n");
		
	}

}
