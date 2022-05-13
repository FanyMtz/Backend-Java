public class Capitulo {

    private int capitulo, episodio;
    private String nombre, descripcion;

    //se crea el constrctor parametrisado
    //el cual ayuda a llenar los datos del capitulo desde otra ventana
    public Capitulo(int capitulo, int episodio, String nombre, String descripcion) {
        this.capitulo = capitulo;
        this.episodio = episodio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //getters
    public int getCapitulo() {
        return capitulo;
    }

    public int getEpisodio() {
        return episodio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //modelacion de los objetos
    //setters
    public boolean setCapitulo(int capitulo) {
        //verificar que no venga el campo vacio
        if (capitulo > 0) {
            this.capitulo = capitulo;
            return true;
        } else {
            return false;
        }
    }

    public boolean setEpisodio(int episodio) {
        //verificar que no venga el campo vacio
        if (episodio > 0) {
            this.episodio = episodio;
            return true;
        } else {
            return false;
        }
    }

    public boolean setNombre(String nombre) {
        //verificar que no venga el campo vacio
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;

        }else{
            return false;
        }
    }
        public boolean setDescripcion(String descripcion)
        {
            //verificar que no venga el campo vacio
            if (!descripcion.isEmpty()) {
                this.descripcion = descripcion;
                return true;
            } else {
                return false;
            }
        }

        //muestra el mensaje
    public String showMessage() {
        return
                "Capitulo: " + capitulo + "\n" +
                        "Episodio: " + episodio + "\n" +
                        "Nombre: " + nombre + "\n" +
                        "Descripción: "+descripcion+"\n";
    }
}
