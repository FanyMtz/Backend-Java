public class Game {
    public static void main(String[] args) throws InterruptedException{
        TestAshe();
    }
    //meto static
    private static void TestAshe() throws InterruptedException{
        //objeto
        Screen screen = new Screen();
        //se crea el objeto
        Ashe ashe = new Ashe(
                01,
                "Ashe",
                "Marksman",
                "Moderate",
                "Ashe commands the most populous horde in the north."
        );
        //muestra el cuadro de dialogo
        //s.setVisible(true);
        //s.out(ashe.showMessage(),"Helvetica",28,Colors.BlueHorizon);

        //SE ARMA LA VENTANA PRINCIPAL
        //EN DONDE SE MUESTREN LOS ATAQUES
        //ashe.frostShot(screen);
        //hilos para que aprezca 3 segundos despues
        //Thread.sleep(3000);
        //ashe.hawShot(screen);

        Runnable attack = new Runnable() {
            @Override
            // se encarga de correr las acciones
            public void run() {
                try{
                //se le pide al hilo que ejecute
                ashe.frostShot(screen);
                //se espera 3 segundos
                    Thread.sleep(300);

                ashe.hawShot(screen);
                    Thread.sleep(300);

                ashe.volley(screen);
                    Thread.sleep(300);

                ashe.rangerFocus(screen);
                    Thread.sleep(300);

                    ashe.crystalArrow(screen);
                    Thread.sleep(300);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //manda a llamar los atackes de ashe. esto se pone en caso de tener mas campiones
        Thread attackAshe = new Thread(attack);
        attackAshe.start();
    }
}
