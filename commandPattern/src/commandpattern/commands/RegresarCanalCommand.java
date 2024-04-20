package commandpattern.commands;

import commandpattern.objects.Television;

/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:09:56 p. m.
 */
public class RegresarCanalCommand implements Command {

	public Television television;

	public RegresarCanalCommand(Television television) {
            this.television = television;
	}

        @Override
	public void execute() {
            television.regresarCanal();
	}
        
        @Override
        public void undo() {
            television.cambiarCanal();
        }
}