package com.blz.basic;

public class Gamblingsimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stake = 100;
		int bet = 1;
		
		System.out.println("Welcome to gambling simulator");
		
		double Betting = Math.floor(Math.random()*100)%2;
		if (Betting == bet)
		{
			stake++;
			System.out.println("Gambler is winning $1");
			System.out.println("stake" +stake);
		}
		else
		{
			stake--;
			System.out.println("Gambler is loosing");
			System.out.println("stake" +stake);
	     }

}

}