package commandpattern.objects;

/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:09:39 p. m.
 */
public class Bocina extends Dispositivo {

    public Bocina() {
        encendido = false;
        volumen = 0;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Se encendió la bocina");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Se apagó la bocina");
    }

    @Override
    public void subirVolumen() {
        if (volumen < 100) {
            volumen += 1;
            System.out.println("Se subió el volumen de la televisión a: " + volumen);
        } else {
            System.out.println("No se puede subir más el volumen de la bocina");
        }
    }

    @Override
    public void bajarVolumen() {
        if (volumen > 0) {
            volumen-= 1;
            System.out.println("Se bajó el volumen de la bocina a: " + volumen);
        } else {
            System.out.println("No se puede bajar más el volumen de la bocina");
        }
    }
}
