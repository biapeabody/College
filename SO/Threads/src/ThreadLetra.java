import java.util.ArrayList;

public class ThreadLetra extends Thread{
	private ArrayList<Character> data;
	
	public ThreadLetra(ArrayList<Character> data) {
		this.data = data;
	}
	
	public void run() {
		for (int i = 0; i < data.size(); i++) {
			try {
				if(!Character.isDigit(data.get(i))&&!Character.isDigit(data.get(i+1))&&!Character.isDigit(data.get(i+2))) {
					System.out.println("SEQ LETRA ENCONTADA: " + data.get(i) +" "+ data.get(i+1) +" "+ data.get(i+2));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
