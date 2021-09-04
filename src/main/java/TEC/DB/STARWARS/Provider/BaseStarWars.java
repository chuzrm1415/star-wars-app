package TEC.DB.STARWARS.Provider;

import TEC.DB.STARWARS.StarWarsObj.StarWarsReport;


public abstract class BaseStarWars<T> implements IStarWarsProvider {

    protected abstract StarWarsReport fromProviderReport(T providerReport);
}