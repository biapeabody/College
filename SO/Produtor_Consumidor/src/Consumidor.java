public class Consumidor extends Thread{
  Buffer dados;
  
  public Consumidor (Buffer b){ this.dados = b; }
  
  public void run(){
    try{
      while(true){
        Thread.sleep(10000);
        int value = this.dados.consumir();
        System.out.println("Consumidor: " + value);       
      }
    }
    catch(Exception e) { }
  }
}