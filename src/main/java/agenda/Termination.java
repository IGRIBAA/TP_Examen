package agenda;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Termination {


    private final LocalDate start;
    private final ChronoUnit frequency;
    private LocalDate terminationDateInclusive;
    private long numberOfOccurrences;
    public LocalDate terminationDateInclusive() {
        // TODO : implémenter cette méthode
        return terminationDateInclusive;
    }


    public long numberOfOccurrences() {
        // TODO : implémenter cette méthode
        return numberOfOccurrences;
    }
    /**
     * Constructs a fixed termination event ending at a given date
     * @param start the start time of this event
     * @param frequency one of :
     * <UL>
     * <LI>ChronoUnit.DAYS for daily repetitions</LI>
     * <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
     * <LI>ChronoUnit.MONTHS for monthly repetitions</LI>
     * </UL>
     * @param terminationInclusive the date when this event ends
     * @see ChronoUnit#between(Temporal, Temporal)
     */
    public Termination(LocalDate start, ChronoUnit frequency, LocalDate terminationInclusive) {
        // TODO : implémenter cette méthode
        this.start = start;
        this.frequency = frequency;
        this.terminationDateInclusive = terminationInclusive;
        this.numberOfOccurrences = ChronoUnit.DAYS.between(start, terminationInclusive) / frequency.getDuration().toDays();
    }
    /**
     * Constructs a fixed termination event ending after a number of iterations
     * @param start the start time of this event
     * @param frequency one of :
     * <UL>
     * <LI>ChronoUnit.DAYS for daily repetitions</LI>
     * <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
     * <LI>ChronoUnit.MONTHS for monthly repetitions</LI>
     * </UL>
     * @param numberOfOccurrences the number of occurrences of this repetitive event
     */
    public Termination(LocalDate start, ChronoUnit frequency, long numberOfOccurrences) {
        // TODO : implémenter cette méthode
        this.start = start;
        this.frequency = frequency;
        this.numberOfOccurrences = numberOfOccurrences;
        this.terminationDateInclusive = start.plus(numberOfOccurrences - 1, frequency);
    }




}
