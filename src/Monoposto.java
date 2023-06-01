public class Monoposto extends Thread {
    public String nomePilota;
    public String scuderia;

    public Monoposto(String nomePilota, String scuderia) {
        this.nomePilota = nomePilota;
        this.scuderia = scuderia;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            int randomTime = (int) (Math.random() * (4000 - 1000)) + 1000;
            try{
                sleep(randomTime);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            //Se i è multiplo di 3
            if(i != 0 && i % 3 == 0){
                Box.cambioGomme(this);
            }
            System.out.println("Giro " + (i + 1) + " del pilota " + nomePilota + " della scuderia " + scuderia);
        }
        System.out.println("Il pilota " + nomePilota + " della scuderia " + scuderia + " ha terminato la gara");
    }
    
}
