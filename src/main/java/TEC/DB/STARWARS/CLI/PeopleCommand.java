package TEC.DB.STARWARS.CLI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import TEC.DB.STARWARS.ApplicationContext;


@Command(name = "people", description = "Get information about a people")
public class PeopleCommand implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(PeopleCommand.class);

    private static ApplicationContext app_context = ApplicationContext.init();

    @Parameters(paramLabel = "<People ID>", description = "ID of people to be resolved")
    private String peopleID;

    @Override
    public void run() {
        var starWarsReport = app_context.getStarWarsReport();
        var report = starWarsReport.getByPeople(peopleID);
        System.out.println(report);
    }
}