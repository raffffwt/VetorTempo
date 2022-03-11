package Controller;

public class VetorTempo extends Thread {
	
	public VetorTempo(int[] vet, int num) {
		this.valorPI = num;
		this.vetor = vet;
	}
	int valorPI;
	int[] vetor;
	
	@Override
	public void run() {
		if(valorPI % 2 == 0) {
			double tempoInicial = System.nanoTime();
			for(int i = 0; i < vetor.length; i++) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Par: " + tempoTotal);
		} else {
			double tempoInicial = System.nanoTime();
			
			for(int i: vetor) {
			}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Impar: " + tempoTotal);
		}
		
	}
}
