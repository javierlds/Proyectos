package modelo;

// clase herencia UDEMY
public abstract class Persona {

    //protected: permite ser accedido por los hijos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private String email;
    private String direccion;
    private String numeroTelefono;

    public Persona(String nombre, String email){  // varios constructores me permiten crear los objetos de diferente forma
        this.nombre = nombre;
        this.email = email;
    }
    public Persona(){

    }

    public Persona(String nombre, String apellido, int edad, char genero, String email, String direccion, String numeroTelefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad   = edad;
        this.genero = genero;
        this.email = email;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdadd(int edad){
        this.edad = edad;
    }

    public char getGenero(){
        return this.genero;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getNumeroTelefon(){
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        if(numeroTelefono.length()> 8){
            System.out.println("El numero telefonico debe ser maximo de 8 digitos.");
        }else if(numeroTelefono.length() == 8){
            this.numeroTelefono = numeroTelefono;
        }
    }

    @Override
    public String toString(){
        return "\nNOMBRE: " + this.nombre +
                "\nAPELLIDO: " + this.apellido  +
                "\nEDAD: " + this.edad +
                "\nGENERO: " + this.genero +
                "\nEMAIL: " + this.email +
                "\nDIRECCION: " + this.direccion +
                "\nPHONE NUMBER: "  + this.numeroTelefono;
    }

    public abstract void mostrarDatosPersona(); //metodo abstracto que se debe implementar obligatoriamente en las clases hijas
}