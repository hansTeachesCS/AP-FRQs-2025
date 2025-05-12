public int dogWalkShift(int startHour, int endHour) {
    int moneyEarned = 0;

    for (int hour = startHour; hour <= endHour; hour++) {
        int dogs = walkDogs(hour);
        
        // earn $5 per dog walked
        moneyEarned += dogs * 5;

        // earn a $3 bonus?
        if (dogs == maxDogs || (hour >= 9 && hour <= 17)) {
            moneyEarned += 3;
        }
    }

    return moneyEarned;
}
