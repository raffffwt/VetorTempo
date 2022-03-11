package View;

import java.util.Random;

import Controller.VetorTempo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int[] vetor = new int[1000];
		
		for(int i: vetor) {
			vetor[i] = rnd.nextInt(1, 100);
		}
		
		for (int j = 0; j < 2; j++) {
			VetorTempo vetT = new VetorTempo(vetor, j);
			
			vetT.start();
		}
	}

}
