import Semana3.Lunes.Champion;

//se extiende el comportamiento que se crea con champion
//implementa las acciones que realiza
public class Ashe extends Champion implements AsheActionCallback {

    //se crea el constructor que coincide con super

    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);

    }

    //HISTORIA que si se quita el s.cls te lo muestra por separado

    //ATAQUES CON LOS QUE CUENTA ASHE
    @Override
    public void frostShot(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        //trae el gif
        s.showImage("frost.gif");
        //dimensiones
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void hawShot(Screen s) {
        //limpia la pantalla
        s.cls();
        //se agrega sobre la misma venta la imagen
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        //trae el gif
        s.showImage("hawksot.gif");
        //dimensiones
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void rangerFocus(Screen s) {
//limpia la pantalla
        s.cls();
        //se agrega sobre la misma venta la imagen
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        //trae el gif
        s.showImage("rangerFocus.gif");
        //dimensiones
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void volley(Screen s) {
//limpia la pantalla
        s.cls();
        //se agrega sobre la misma venta la imagen
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        //trae el gif
        s.showImage("volley.gif");
        //dimensiones
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void crystalArrow(Screen s) {
        //limpia la pantalla
        s.cls();
        //se agrega sobre la misma venta la imagen
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        //trae el gif
        s.showImage("cristalarrow.gif");
        //dimensiones
        s.setBounds(200,100,1100,900);
    }
}
