package commandpattern;

import commandpattern.objects.*;
import commandpattern.commands.*;

/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:10:00 p. m.
 */
public class Cliente {

    public static void main(String[] args) {

        Bocina bocina = new Bocina();
        Television television = new Television(7);
        ControlRemoto controlRemoto = new ControlRemoto();

        EncenderCommand encenderCommandParaTV = new EncenderCommand(television);
        ApagarCommand apagarCommandParaTV = new ApagarCommand(television);
        EncenderCommand encenderCommandParaBocina = new EncenderCommand(bocina);
        ApagarCommand apagarCommandParaBocina = new ApagarCommand(bocina);
        SubirVolumenCommand subirVolumenCommandParaTV = new SubirVolumenCommand(television);
        BajarVolumenCommand bajarVolumenCommandParaTV = new BajarVolumenCommand(television);
        SubirVolumenCommand subirVolumenCommandParaBocina = new SubirVolumenCommand(bocina);
        BajarVolumenCommand bajarVolumenCommandParaBocina = new BajarVolumenCommand(bocina);
        CambiarCanalCommand cambiarCanalCommand = new CambiarCanalCommand(television);
        RegresarCanalCommand regresarCanalCommand = new RegresarCanalCommand(television);

        controlRemoto.setCommand(0, encenderCommandParaTV);
        controlRemoto.setCommand(1, apagarCommandParaTV);
        controlRemoto.setCommand(2, encenderCommandParaBocina);
        controlRemoto.setCommand(3, apagarCommandParaBocina);
        controlRemoto.setCommand(4, subirVolumenCommandParaTV);
        controlRemoto.setCommand(5, bajarVolumenCommandParaTV);
        controlRemoto.setCommand(6, subirVolumenCommandParaBocina);
        controlRemoto.setCommand(7, bajarVolumenCommandParaBocina);
        controlRemoto.setCommand(8, cambiarCanalCommand);
        controlRemoto.setCommand(9, regresarCanalCommand);

        controlRemoto.presionBotonEncenderTelevision();
        controlRemoto.presionBotonEncenderBocina();
        controlRemoto.presionBotonCambiarCanal();
        controlRemoto.presionBotonCambiarCanal();
        controlRemoto.presionBotonCambiarCanal();
        controlRemoto.presionBotonDeshacer();

    }
}
