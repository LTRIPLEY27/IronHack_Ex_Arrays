public class ThreadApp implements Runnable {
    private Avion avion = new Avion();

   /* @Override
    public void run() {
        //hilos llamando a la cantidad de asientos a reservar por cada cliente
        gestionAsientos(7);
        if(avion.getAsientosLibres() <= 0)
            System.out.println("agotadas");
    }*/

    @Override
    public void run(){
        System.out.println("Seients Lliures: " + avion.getAsientosLibres());

        //Objeto con synchronized
        synchronized(avion){
            gestionAsientos(6);
            if (avion.getAsientosLibres() <= 0)
                System.out.println("No hay asientos libres");
        }
    }
// Método que gestiona y vrifica disponibilidad de asientos indicando la espera de cada hilo
    public synchronized void gestionAsientos(int num) { //ADICIÓN DEL 'SYNCHRONIZED' PARA APLICAR EL SEMÁFORO
        System.out.println(Thread.currentThread().getName() + " Tiene la clave de la cadena");

        //VERIFICACIÓN DE LA CANTIDAD DE ASIENTOS PARA BLOQUEAR LA ZONA CRÍTICA
        if(avion.getAsientosLibres() >= num){
            System.out.println(Thread.currentThread().getName() + " Realizas la reserva de " + num + " lugares");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            avion.reservaAsientos(num);

            System.out.println(Thread.currentThread().getName() + " Reservas completadas" + avion.getAsientosLibres() + " Las plazas libre son : " + avion.getAsientosLibres());
        } else {
            System.out.println("No hi ha places suficients pel client." +
                    Thread.currentThread().getName()+" Les places lliures són "+ avion.getAsientosLibres());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){
        ThreadApp obj = new ThreadApp();

        //hilos del principal
        Thread Fil_1 = new Thread(obj);
        Thread Fil_2 = new Thread(obj);
        Fil_1.setName("Client 1");
        Fil_2.setName("Client 2");

        Fil_1.start();
        Fil_2.start();

    }
// CLASE DENTRO DE OTRA CLASE
    class Avion {
        private int asientosLibres = 10;

        public int getAsientosLibres(){
            return asientosLibres;
        }

        //verificación de asientos
        public boolean getAsientosLibres(int num) {
            boolean respuesta;
            return respuesta = num <= asientosLibres ? true : false;
        }

        public void reservaAsientos(int num) {
            asientosLibres = asientosLibres - num;
        }
    }
}
