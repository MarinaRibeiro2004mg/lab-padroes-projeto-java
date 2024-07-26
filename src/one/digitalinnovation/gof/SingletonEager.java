package one.digitalinnovation.gof;

/**
 * Singleton "Apressado"
 * 
 */
public class SingletonEager {

    private static SingletonEager instancia; // realiza a instancia direto

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {

        return instancia;
    }
}
