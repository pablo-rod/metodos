public class user {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        smartTv.aumentarDeCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirVolume ();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}