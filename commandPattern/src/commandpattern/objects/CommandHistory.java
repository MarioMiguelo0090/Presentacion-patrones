package commandpattern.objects;

import commandpattern.commands.Command;
import java.util.Stack;
/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:10:00 p. m.
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();
    
    public CommandHistory() {
        
    }
    
    public void push(Command command) {
        history.push(command);
    }
    
    public Command pop() {
        return history.pop();
    }
    
    public boolean isEmpty() {
        return history.isEmpty();
    }
}
