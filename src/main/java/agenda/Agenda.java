package agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */

    private List<Event> events = new ArrayList<>();

    public void addEvent(Event e) {
        // TODO : implémenter cette méthode
        events.add(e);
        //throw new UnsupportedOperationException("Pas encore implémenté");
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return a list of events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        // TODO : implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
            List<Event> eventsInDay = new ArrayList<>();
            for (Event e : events) {
                if (e.isInDay(day)) {
                    eventsInDay.add(e);
                }
            }
            return eventsInDay;
        }
}



