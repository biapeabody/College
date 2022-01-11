import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Turma extends Thread{
	private String nome;
	private int tempo_de_visita;
	private Parque parques;
	CyclicBarrier b;

	public Turma(String nome, int tempo_de_visita, Parque parques, CyclicBarrier b) {
		this.nome = nome;
		this.tempo_de_visita = tempo_de_visita;
		this.parques = parques;
		this.b = b;
	}

	public void run() {
		while(true) {
			this.visitar(this.parques);
		}
	}

	void visitar(Parque parque) {
		try {
			System.out.println(this.nome + " chegando no " + parque.nome);
			sleep(this.tempo_de_visita);
			System.out.println(this.nome + " Terminou a visita");
			b.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
