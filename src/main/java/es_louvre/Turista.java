package es_louvre;

public class Turista extends Thread {
    private Museo m;

    public Turista(String nome, Museo m)
    {
        super(nome);
        this.m = m;
    }


    public void run(){
        try{
            int t=m.entra();
            Thread.sleep(t);
            m.esci();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
