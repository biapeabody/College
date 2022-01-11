public class Produtor extends Thread{
  Buffer dados;
  
  public Produtor(Buffer b){ this.dados = b; }
  
  public void run(){
    try{
      while(true){
        Thread.sleep(300);
        this.dados.produzir(1);
        System.out.println("[PRODUTOR] Novo dado");
      }
    }
    catch(Exception e) { }
  }
}
