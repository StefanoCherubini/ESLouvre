package es_louvre;

public class Museo {
    private int ingresso = 5;

   public synchronized int entra(){
        String nome = Thread.currentThread().getName();
        try{
            while(ingresso < 1){
                 System.out.println("Museo pieno");
                wait();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        ingresso--;
        int t = 1000 + (int) (Math.random() * 5000);
        System.out.println(nome + " visita la Gioconda per " + t + " secondi");        
        return t;
    }
   
   public synchronized void esci(){
        String nome = Thread.currentThread().getName();    
        System.out.println(nome + " è uscito dal museo");        
        ingresso++;
        notifyAll();
    }
}
