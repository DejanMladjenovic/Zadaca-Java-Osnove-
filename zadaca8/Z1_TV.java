package zadaca8;

import java.util.Scanner;

/**
 * Naziv klase: Z1_TV
 * 
 * Opis klase: Klasa definise upravljacku konzolu za TV
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z1_TV {
	/*
	 * Napraviti klasu TV tako da se izmjena kanala 
	 * i jaèine zvuka može uraditi samo kada je televizor ukljuèen.
	 */
	
	//Osobine
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	//Konstruktori
	public Z1_TV(){
	}
	
	//Metode
	public void turnOn(){
		on = true;
	}
	
	public void turnOf() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if(on && newChannel >= 1 && newChannel <= 120)
			channel = newChannel;
	}
	
	public void setVolume(int newVolumeLevel) {
		if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}
	
	public void channelUp() {
		if(on)
			if(channel == 120)
				channel = 1;
			else
				channel++;
	}
	
	public void channelDown() {
		if(on)
			if(channel == 1)
				channel = 120;
			else
				channel--;
	}
	
	public void volumeUp() {
		if(on && volumeLevel < 7)
			volumeLevel++;
	}
	
	public void volumeDown() {
		if(on && volumeLevel > 1)
			volumeLevel--;
	}
	
	public void stampajPodatke() {
		if(on){
			System.out.println("Kanal je " + channel);
			System.out.println("Glasnoca je " + volumeLevel);
		}
	}
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		
		//Scanner unos = new Scanner(System.in);
		
		Z1_TV tv1 = new Z1_TV();
		
		tv1.turnOn();;
		tv1.setChannel(145);
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.stampajPodatke();
		
	}

}
