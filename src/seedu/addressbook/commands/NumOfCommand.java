package seedu.addressbook.commands;

/*
 * Provides the number of commands used in the current session excluding itself.
         */
public class NumOfCommand extends Command {
    public static final String COMMAND_WORD = "num";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Displays number of commands used in the current session.\n"
            + "Example: " + COMMAND_WORD;

    public NumOfCommand(){}

    @Override
    public CommandResult execute() {
        return new CommandResult("Number of Commands used: " + Command.getNumCommands() + "\n");
    }
}
