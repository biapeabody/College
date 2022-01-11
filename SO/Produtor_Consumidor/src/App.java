public class App {    
  public static void main(String[] args) throws Exception {
    Buffer b = new Buffer();
    
    new Produtor(b).start();
    new Consumidor(b).start();
    new Consumidor(b).start();
    new Consumidor(b).start();
    new Consumidor(b).start();
    new Consumidor(b).start();
    new Consumidor(b).start();
  }
}
