import java.util.ArrayList;

public class Buffer {
  private ArrayList<Integer> dadosInternos;
  int tamanho = 10;
  
  public Buffer(){ this.dadosInternos = new ArrayList<Integer>(); }
  
  public void produzir(int i){
    synchronized(this.dadosInternos){
      if (this.dadosInternos.size() == tamanho) {
        try {
          System.out.println("Estou indo a mimir");
          this.dadosInternos.wait();
        } 
        catch (InterruptedException e) { e.printStackTrace(); }
      }else{
        this.dadosInternos.add(i);
        this.dadosInternos.notifyAll();
      }
    }
  }
  
  public int consumir(){
    int v = -1;
    synchronized(this.dadosInternos) {
      if(this.dadosInternos.size() == 0){
        
        try{
          System.out.println("Estou indo a mimir");
          this.dadosInternos.wait();
          System.out.println("Acorda besta!");
        }catch(InterruptedException e) { }
      }else{
        v = this.dadosInternos.remove(0);
        this.dadosInternos.notify();
      }
    }
    return v;
  }
}
