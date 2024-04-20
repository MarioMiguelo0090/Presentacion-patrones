package commandpattern.commands;

import commandpattern.objects.Dispositivo;

/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:09:52 p. m.
 */
public class BajarVolumenCommand implements Command {

	public Dispositivo dispositivo;

	public BajarVolumenCommand(Dispositivo dispositivo){
            this.dispositivo = dispositivo;
	}

        @Override
	public void execute(){
            dispositivo.subirVolumen();
	}
        
        @Override
        public void undo() {
            dispositivo.bajarVolumen();
        }
}