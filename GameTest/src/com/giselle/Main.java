package com.giselle;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

public class Main {

	public static void main(String[] args) {
		Player giselle = new Player("Giselle", 10, 15);
		System.out.println(giselle.toString());
		saveObject(giselle);
		
		giselle.setHitPoints(8);
		System.out.println(giselle);
		giselle.setWeapon("Stormbringer");
		saveObject(giselle);
		//loadObject(giselle);
		System.out.println(giselle);
		
		ISaveable werewolf = new Monster("Werewolf", 20, 40);
		System.out.println("Strength = " + ((Monster)werewolf).getStrength());
		saveObject(werewolf);
	}
	
	public static ArrayList<String> readValues(){
		ArrayList<String> values = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n" +
				"1 to enter a string\n" +
				"0 to quit");
		
		while(!quit){
			System.out.println("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				quit = true;
				break;
				
			case 1:
				System.out.println("Enter a string: ");
				String stringInput = scanner.nextLine();
				values.add(index, stringInput);
				index++;
				break;

			}
		}
		return values;
	}
	
	public static void saveObject(ISaveable objectToSave){
		for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
		}
	}
	
	public static void loadObject(ISaveable objectToLoad){
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}

}
