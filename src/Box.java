public class Box {
    private volatile static Semaforo SEMAFORO = new Semaforo();

    public static void cambioGomme(Monoposto monoposto) {
        try{
            System.out.println("Il pilota " + monoposto.nomePilota + " della scuderia " + monoposto.scuderia + " è in attesa per il cambio gomme");
            SEMAFORO.lock();
            System.out.println("Il pilota " + monoposto.nomePilota + " della scuderia " + monoposto.scuderia + " entra in box per il cambio gomme");
            int randomTime = (int) (Math.random() * (5000 - 1000)) + 1000;
            Thread.sleep(randomTime);
            System.out.println("Il pilota " + monoposto.nomePilota + " della scuderia " + monoposto.scuderia + " esce dal box");
            SEMAFORO.release();
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Errore nella sincronizzazione del cambio gomme");
        }
    }
    
}
