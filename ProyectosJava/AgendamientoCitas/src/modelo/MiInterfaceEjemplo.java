package modelo;

public interface MiInterfaceEjemplo {
    default void metodoDefecto(){  // metodo no abstracto porque tiene implementacion
        System.out.println();
    }

    private void metodoPrivado(final String string){ // solo esta disponible en esta clase
        System.out.println(string);
    }
    void metodoNormal(); // si es obligatorio implementarlo
}
