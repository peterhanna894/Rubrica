package org.generation.italy;

import java.util.Scanner;

public class RubricaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int DIMENSIONE_RUBRICA = 5;
		
		String[]nomi=new String[DIMENSIONE_RUBRICA];
		String[]numeri= new String[DIMENSIONE_RUBRICA];
		
		int i;
		boolean trovato;
		String daCercare, risposta;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<nomi.length;i++) {
			System.out.println("Inserisci il nome in posizione "+ i);
			nomi[i]=sc.nextLine();
			
			System.out.println("Inserisci il numero in posizione " +i);
			numeri[i]=sc.nextLine();
		}
		
		do {
			System.out.print("Quale nome/numero vuoi cercare? ");
			daCercare=sc.nextLine();
			trovato=false;
			for (i=0;i<nomi.length;i++)
				if (nomi[i].equalsIgnoreCase(daCercare) || numeri[i].equals(daCercare)) {
					trovato=true;
					System.out.println("Nome: " + nomi[i] + "   Numero: " + numeri[i]);
				}
			if (!trovato)		//trovato==false
				System.out.println("Nome/numero non trovato!");
			System.out.print("Vuoi cercare un altro nome (s/n)? ");
			risposta=sc.nextLine();
		} while (risposta.equalsIgnoreCase("s"));

	}

}
