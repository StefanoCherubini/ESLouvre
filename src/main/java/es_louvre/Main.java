package es_louvre;

public class Main {
    public static void main(String[] args) {
        Museo mus = new Museo();
        String[] nomi = {"Franco","Marco","Anna","Stefano","Francesco","Genoveffa", "Maria"};

        for(int i=0; i<nomi.length; i++)
        {
            Turista t = new Turista(nomi[i],mus);
            t.start();
        }
    }
}