class Instrument {
    String name = "Instrument";
    public void play() {
        System.out.println("Playing the " + name);
    }
    public void tune() {
        System.out.println("Tunning the " + name);
    }
}

class Guitar extends Instrument {
    public Guitar() {
        
    }
    public Guitar(String form) {
        System.out.println(form + " is the smallest form of Guitar");
    }
    public void play() {
        System.out.println("Strumming the guitar");
    }
    public void tune(String tuning) {
        System.out.println("Tuning the guitar to " + tuning);
    }
}

class Piano extends Instrument {
    Piano(String form) {
        
        System.out.println(form +" is also known as pocket Piano");
    }
    public void tune(String tuning) {
        System.out.println("Tuning the piano to " + tuning);
    }
}

class MusicStore {
    public static void main(String[] args) {
        Instrument instrumental = new Instrument();
        instrumental.play();
        instrumental.tune();

        Guitar ukelele = new Guitar("Ukelele");
        ukelele.play();
        ukelele.tune("Drop D");

        Piano kalimba = new Piano("Kalimba");
        kalimba.tune("key 440");
    }
}