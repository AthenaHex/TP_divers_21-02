package com.m2i.BirdLanguage.services;

import org.springframework.stereotype.Service;





@Service
public class MultiService {
	
	public static boolean isReversable(char l) {	//renvoie vrai ou faux si la lettre ets inversable
		String reversableLetters = "aebpdmwnu2569"; //la liste des caractères inversables
		return reversableLetters.indexOf(l) != -1;
	}
	
	//System.out.println(CodeReverse("haha, je suis une petite giraffe"));
	public String CodeReverse(String inputString) { //inverse les lettres inversables d'une chaine de caractères en entré
		String inputString2 = inputString.toLowerCase();	//on met la phrase en minuscule
		String outputString = ""; //chaine de caractère à rendre
		for(int i=0; i<inputString2.length() ; i++) {
			char letter = inputString2.charAt(i);
			if (isReversable(letter)){ //on vérifie si le caractère est inversable
				switch(letter) {	 //si oui, on cherche quel est son inverse et on l'ajoute
					case 'a':						outputString += 'e';						break;
					case 'e':						outputString += 'a';						break;
					case 'b':						outputString += 'p';						break;
					case 'p':						outputString += 'd';						break;
					case 'd':						outputString += 'q';						break;
					case 'q':						outputString += 'd';						break;
					case 'm':						outputString += 'w';						break;
					case 'w':						outputString += 'm';						break;
					case 'n':						outputString += 'u';						break;
					case 'u':						outputString += 'n';						break;
					case '2':						outputString += '5';						break;
					case '5':						outputString += '2';						break;
					case '6':						outputString += '9';						break;
					case '9':						outputString += '6';						break;
				}
			}else {
				outputString += letter;
			}
		}
		return outputString;
	}
	
	
	public String RWXCounter(String inputString) {
		String outputString = "";							 //chaine de caractère à rendre
		String inputString2 = inputString.toLowerCase();	 //on met le code en minuscule
		int count = 0;
		for(int i=1; i<4 ; i++) {
			char letter = inputString2.charAt(i);
			switch(letter) {
				case 'r':						count+=4;						break;
				case 'w':						count+=2;						break;
				case 'x':						count+=1;						break;
				default:						count+=0;
			}	
		}
		outputString += Integer.toString(count);
		count = 0;
		for(int i=4; i<7 ; i++) {
			char letter = inputString2.charAt(i);
			switch(letter) {
				case 'r':						count+=4;						break;
				case 'w':						count+=2;						break;
				case 'x':						count+=1;						break;
				default:						count+=0;
			}		
				}
		outputString += Integer.toString(count);
		count = 0;
		for(int i=7; i<10 ; i++) {
			char letter = inputString2.charAt(i);
			switch(letter) {
				case 'r':						count+=4;						break;
				case 'w':						count+=2;						break;
				case 'x':						count+=1;						break;
				default:						count+=0;
			}	
		}
		outputString += Integer.toString(count);
		return outputString;
	}
	
	
	
	
	public String duel1Vs1(int hp1, int hp2, int dgt1, int dgt2) {
		String alive = ""; //le joueur gagnant sera prioritairement le joueur 1 car il tape en premier
		int maxTurn = 0;
		while(hp1>0 && hp2>0) {
			maxTurn++;
			hp1 -= dgt2;
			hp2 -= dgt1;
		}
		if(hp1>0) {			alive += "1";		}
		else {				alive += "2";		}
		String outputString = "Le vainqueur est le joueur" + alive + "et le duel mettra " + maxTurn + " a se terminer.";
		return outputString;
	}
	
	
	
	
	
	
	
	
	
	
	public static boolean isVowel(char c) {	//renvoie vrai ou faux si la lettre est une voyelle
		String vowels = "aeiouAEIOU";
		return vowels.indexOf(c) != -1;
	}
	
	
	
	public String BirdLanguageTranslatation(String inputString) {
		String outputString = ""; //chaine de caractère à rendre
		for(int i=0 ; i<inputString.length() ; i++) {
			char letter = inputString.charAt(i);
			if(isVowel(letter)) {
				outputString += letter;
				outputString += "p";
				outputString += Character.toLowerCase(letter);
			}else {
				outputString += letter;
			}
		}
		return outputString;
	}
	
	
	
	public String nucleoCounter(String nucleotide) {
		int numberOfA = 0;		int numberOfT = 0;	//chaque base du nucléotide a son compteur
		int numberOfC = 0;		int numberOfG = 0;
		for(int i = 0; i<nucleotide.length() ;i++) {
			char base = nucleotide.charAt(i);
			switch(Character.toLowerCase(base)) {
				case 'a':						numberOfA++;						break;
				case 't':						numberOfT++;						break;
				case 'c':						numberOfC++;						break;
				case 'g':						numberOfG++;						break;
			}
		}
		String outputString = numberOfA+" "+numberOfT+" "+numberOfC+" "+numberOfG;
		return outputString;
	}
	
	
	public Double areaOfEquilateralTriangle(int inputSide) {
		double side = Double.valueOf(inputSide);
		double area = Math.sqrt(3) * Math.pow(side, 2) * 1/4; //formule
		return area;
	}
	
	

	
	
	public static void main(String[] args) {
		System.out.println();
    }
}
