class Main {
  public static void main(String[] args) {
    Matrice m = new Matrice("TPSIT");
    
    Vigenere v = new Vigenere(0,12,0,12,m);
    
     Thread t = new Thread(v);
        t.start();
      

        m.stampa(); 
  }
}