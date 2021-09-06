package TEC.DB.STARWARS.CLI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import TEC.DB.STARWARS.ApplicationContext;


@Command(name = "planet", description = "Get information about a planet")
public class PlanetCommand implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(PeopleCommand.class);

    private static ApplicationContext app_context = ApplicationContext.init();

    @Parameters(paramLabel = "<Planet ID>", description = "ID of planet to be resolved")
    private String planetID;

    @Override
    public void run() {
        var starWarsReport = app_context.getStarWarsReport();
        var report = starWarsReport.getByPlanet(planetID);
        System.out.println(report);
    }
}