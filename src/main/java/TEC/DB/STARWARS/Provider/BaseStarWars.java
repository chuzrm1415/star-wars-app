package TEC.DB.STARWARS.Provider;

import TEC.DB.STARWARS.StarWarsObj.*;


public abstract class BaseStarWars<T> implements IStarWarsProvider {

    protected abstract People fromProviderReport(T providerPeopleReport);
    protected abstract Planet dfromProviderReport(T providerPeopleReport);
}