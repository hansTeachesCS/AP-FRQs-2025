// PART A
public int walkDogs(int hour) {

    // find out from DogWalkCompany how many dogs at hour
    int numDogs = company.numAvailableDogs(hour);

    // if walker can walk more dogs than available
    if (maxDogs > numDogs) {
        company.updateDogs(hour, numDogs);
        return numDogs;
    } 
    // if there are more (or equal) dogs than the walker can handle
    company.updateDogs(hour, maxDogs);
    return maxDogs;
}
