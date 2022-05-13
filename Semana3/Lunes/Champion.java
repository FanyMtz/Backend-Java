package Semana3.Lunes;

//clase
public class Champion {
    private int id;
    private String name, role, difficulty, description;

    //se crea un constructor parametrisado,
    //el cual ayuda a que si se quiere crear un objeto tipo champion se puede pasar todos los datos
    public Champion(int id, String name, String role, String difficulty, String description)
    {
        this.id= id;
        this.name=name;
        this.role=role;
        this.difficulty = difficulty;
        this.description=description;
    }

    //getters
    public int getId(){ return id; }
    public String getName(){ return name; }
    public String getRole(){ return role; }
    public String getDifficulty(){ return difficulty; }
    public String getDescription(){ return description; }

    //modelacion de objetos
    //setters
    public boolean setId(int id){
        //verificar que el id no venga vacio
        //esto sirve para no tener campos vacios
        if(id>0){
            this.id=id;
            return true;
        }else
        return false;
    }


    public boolean setName(String name)
    {
        if(!name.isEmpty()){
            this.name=name;
            return true;
        }else
        return false;
    }

    public boolean setRole(String role)
    {
        //si no esta vacio
        if(!role.isEmpty()){
            this.role=role;
            return true;
        }else
        return false;
    }

    public boolean setDifficulty(String difficulty)
    {
        if(!difficulty.isEmpty()){
            this.description=difficulty;
            return true;
        }else
        return false;
    }

    public boolean setDescription(String description)
    {
        if(!description.isEmpty()){
            this.description=description;
            return true;
        }else
        return false;
    }

    public String showMessage(){
        return
                "id: "+ id+
                        "name: "+name+
                        "role: "+role+
                        "difficulty: "+difficulty+
                        "\ndescription: "+description+"\n";
    }
}
