public class Comic {
    public static void main(String[] args) throws InterruptedException{
        TestComic();
    }
    //metodo static
    private static void TestComic() throws InterruptedException{
        //objeto
        Screen screen = new Screen();
        escenas es = new escenas(
                13,
                1,
                "The Simpsons Guy",
                "la familia Griffin se queda en la casa de la familia Simpson después de que el auto de la ex familia es robado a las afueras de Springfield."
        );

        //hilo
        Runnable escena = new Runnable() {
            @Override
            public void run() {
                try {
                    //llama a la imagen
                    es.scene1(screen);
                    //se espera 5 min para hacer el cambio
                    Thread.sleep(1500);
                    es.scene2(screen);
                    Thread.sleep(2500);
                    es.scene3(screen);
                    Thread.sleep(2500);
                    es.scene4(screen);
                    Thread.sleep(2500);
                    es.scene5(screen);
                    Thread.sleep(2500);
                    es.scene6(screen);
                    Thread.sleep(2500);
                    es.scene7(screen);
                    Thread.sleep(2500);
                    es.scene8(screen);
                    Thread.sleep(2500);
                    es.scene9(screen);
                    Thread.sleep(2500);
                    es.scene10(screen);
                    Thread.sleep(2500);
                    es.scene11(screen);
                    Thread.sleep(2500);
                    es.scene12(screen);
                    Thread.sleep(2500);
                    es.scene13(screen);
                    Thread.sleep(2500);
                    es.scene14(screen);
                    Thread.sleep(2500);
                    es.scene15(screen);
                    Thread.sleep(2500);
                    es.scene16(screen);
                    Thread.sleep(2500);
                    es.scene17(screen);
                    Thread.sleep(2500);
                    es.scene18(screen);
                    Thread.sleep(2500);
                    es.scene19(screen);
                    Thread.sleep(2500);
                    es.scene20(screen);
                    Thread.sleep(2500);
                    es.scene21(screen);
                    Thread.sleep(2500);
                    es.scene22(screen);
                    Thread.sleep(2500);
                    es.scene23(screen);
                    Thread.sleep(2500);
                    es.scene24(screen);
                    Thread.sleep(2500);
                    es.scene25(screen);
                    Thread.sleep(2500);
                    es.scene26(screen);
                    Thread.sleep(2500);
                    es.scene27(screen);
                    Thread.sleep(2500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        //manda llamar las escenas
        Thread escenasSimpson = new Thread(escena);
        escenasSimpson.start();
    }
}
