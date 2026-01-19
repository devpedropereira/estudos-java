package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	//oi

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+ i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int numeroDeFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numeroDeFuncionarios));
			}
		}
		
		System.out.println("TAXES PAID:");
		for (Contribuintes contribuintes : list) {
			System.out.println(String.format(contribuintes.getName() +": $ %.2f", contribuintes.imposto()));
		}
		
		double imp = 0.0;
		
		for (Contribuintes contribuintes : list) {
			imp = imp + contribuintes.imposto();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", imp);
		

		sc.close();
	}

}
