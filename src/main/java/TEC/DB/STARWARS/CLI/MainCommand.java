package TEC.DB.STARWARS.CLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;


@Command(
    name = "StarWars",
    subcommands = {
        PeopleCommand.class,
        PlanetCommand.class,
        HelpCommand.class },
    description = "Get StarWars information about people and planets by an ID")
public class MainCommand implements Runnable {

    @Override
    public void run() {}
}
