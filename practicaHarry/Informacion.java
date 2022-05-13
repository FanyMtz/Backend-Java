package Semana3.practicaHarry;

public class Informacion {

    public static void main(String[] args) {
        //metodo que manda llamar a def
        defH();
        defHe();
        defM();
        defNe();
        defR();
    }

    //metodo para definirle los datos al set y mostrarlos
    public static void defH(){
        //inicializacion del objeto
        Personajes harry = new Personajes();
        //se define
        harry.setNombre("Harry Potter");
        harry.setGenero("Masculino");
        harry.setCasa("Gryffindor");
        harry.setBoggart("Dementor");
        harry.setPatronus("Ciervo");

        String msg = "Informacion sobre el mago";
        msg += "\nNombre: "+harry.getNombre();
        msg += "\nGenero: "+harry.getGenero();
        msg += "\nCasa: "+harry.getCasa();
        msg += "\nBoggart: "+harry.getBoggart();
        msg += "\nPatronus: "+harry.getPatronus();
        msg += "\n";
        System.out.print(msg);
    }

    public static void defHe(){
        //inicializacion del objeto
        Personajes herm = new Personajes();
        //se define
        herm.setNombre("Hermione Granger");
        herm.setGenero("Femenino");
        herm.setCasa("Gryffindor");
        herm.setBoggart("fracaso en general");
        herm.setPatronus("Nutria");

        String msg = "\nInformacion sobre la maga";
        msg += "\nNombre: "+herm.getNombre();
        msg += "\nGenero: "+herm.getGenero();
        msg += "\nCasa: "+herm.getCasa();
        msg += "\nBoggart: "+herm.getBoggart();
        msg += "\nPatronus: "+herm.getPatronus();
        msg += "\n";
        System.out.print(msg);
    }

    public static void defM(){
        //inicializacion del objeto
        Personajes mol = new Personajes();
        //se define
        mol.setNombre("Molly Weasley");
        mol.setGenero("Femenino");
        mol.setCasa("Gryffindor");
        mol.setBoggart("El cuerpo de sus seres queridos muertos.");
        mol.setPatronus("Zorro polar");

        String msg = "\nInformacion sobre la maga";
        msg += "\nNombre: "+mol.getNombre();
        msg += "\nGenero: "+mol.getGenero();
        msg += "\nCasa: "+mol.getCasa();
        msg += "\nBoggart: "+mol.getBoggart();
        msg += "\nPatronus: "+mol.getPatronus();
        msg += "\n";
        System.out.print(msg);
    }

    public static void defNe(){
        //inicializacion del objeto
        Personajes nev = new Personajes();
        //se define
        nev.setNombre("Neville Longbottom");
        nev.setGenero("Masculino");
        nev.setCasa("Gryffindor");
        nev.setBoggart("Severus Snape.");
        nev.setPatronus("No corpóreo");

        String msg = "\nInformacion sobre la maga";
        msg += "\nNombre: "+nev.getNombre();
        msg += "\nGenero: "+nev.getGenero();
        msg += "\nCasa: "+nev.getCasa();
        msg += "\nBoggart: "+nev.getBoggart();
        msg += "\nPatronus: "+nev.getPatronus();
        msg += "\n";
        System.out.print(msg);
    }

    public static void defR(){
        //inicializacion del objeto
        Personajes ron = new Personajes();
        //se define
        ron.setNombre("Ronald Weasley");
        ron.setGenero("Masculino");
        ron.setCasa("Gryffindor");
        ron.setBoggart("Araña Gigante");
        ron.setPatronus("terrier");

        String msg = "\nInformacion sobre la maga";
        msg += "\nNombre: "+ron.getNombre();
        msg += "\nGenero: "+ron.getGenero();
        msg += "\nCasa: "+ron.getCasa();
        msg += "\nBoggart: "+ron.getBoggart();
        msg += "\nPatronus: "+ron.getPatronus();
        msg += "\n";
        System.out.print(msg);
    }
}
