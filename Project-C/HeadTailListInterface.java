/**
 * An interface for the ADT list.
 * This list begins with position 0.
 * Entries can only be removed or added to either the beginning or end of the
 * list.
 * Entries can be accessed from any position.
 *
 * @author Michael Vincent Rayo
 * @version 1.0
 * @since 2019-02-15
 */

public interface HeadTailListInterface<T>
{
    /**
     * Adds a new entry to the beginning of this list. Entries currently in
     * the list are shifted down. The size of this list is increased by 1.
     *
     * @param newEntry The object to be added as a new entry.
     *
     * @throws ClassCastException if the class of the new entry
     * prevents it from being added to this list.
     *
     * @throws IllegalArgumentException - if some property of the new entry
     * prevents it from being added to this list.
     */
    public void addFront(T newEntry);

    /**
     * Adds a new entry to the end of this list. Entries currently in this
     * list are unaffected. The size of this list is increased by 1.
     *
     * @param newEntry The object to be added as a new entry.
     *
     * @throws ClassCastException if the class of the new entry prevents it
     * from being added to this list.
     *
     * @throws IllegalArgumentException if some property of the new entry
     * prevents it from being added to this list.
     */
    public void addBack(T newEntry);

    /**
     * Removes the entry from the beginning of this list. Other
     * entries' indices are shifted up. The size of this list is
     * decreased by 1.
     *
     * @return The reference to the entry that was removed or null if this
     * list is empty
     */
    public T removeFront();

    /**
     * Removes the entry from the end of this list. Other entries
     * currently in this list are unaffected. The size of this list is
     * decreased by 1.
     *
     * @return The reference to the entry that was removed or null if this list
     * is empty.
     */
    public T removeBack();

    /**
     * Retrieves the entry at a given position in this list.
     * @param position an integer indicative of the position of the entry.
     *
     * @return The reference to the retrieved entry based on the given position.
     * Cannot be null.
     *
     * @throws IndexOutOfBoundsException if position is negative or greater
     * than the length of this list.
     */
    public T getEntry(int position);

    /**
     * Displays all of the entries in this list, in the order in which they
     * occur in this list.
     */
    public void display();

    /**
     * Searches for a specific entry in this list.
     *
     * @param entry The object to be searched for.
     *
     * @return The position of the entry that was found or -1 if the entry is
     * not found.
     */
    //@throws ClassCastException if the type of the specified element is
    //     * incompatible with this list
    public int contains(T entry);

    /** Detects whether this list is empty.
     *
     * @return True if this list contains no elements, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Detects the number of elements in this list.
     *
     * @return The integer number of entries currently in this list.
     */
    public int size();

    /**
     * Removes all entries in this list.
     */
    public void clear();
}

