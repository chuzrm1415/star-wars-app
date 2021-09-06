package TEC.DB.STARWARS.Provider;

import TEC.DB.STARWARS.StarWarsObj.*;
import java.util.Optional;


public abstract class BaseStarWars<T> implements IStarWarsProvider {

    protected abstract People peopleProvideReport(T peoplePR);
    protected abstract Planet planetProvideReport(T planetPR);
}