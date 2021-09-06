package TEC.DB.STARWARS;

import picocli.CommandLine;
import TEC.DB.STARWARS.CLI.MainCommand;


public class App 
{
    public static void main( String[] args )
    {
        CommandLine cmd = new CommandLine(new MainCommand());
        cmd.setExecutionStrategy(new CommandLine.RunAll());
        cmd.execute(args);

        if (args.length == 0) {cmd.usage(System.out);}
    }
}
