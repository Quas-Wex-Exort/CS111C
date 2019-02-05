/**
 * An interface for the ADT list.
 *
 * @author Michael Vincent Rayo
 * @version Created February 5, 2019
 */

public interface HeadTailListInterface<T>
{
    /**
     * Adds a new entry to the beginning of this list.
     * Entries currently in the list shall shift up to the next higher index.
     * The size of this list is increased by 1.
     * @param newEntry The object to be added as a new entry.
     * @throws ClassCastException if the class of the new entry
     * prevents it from being added to this list.
     * @throws IllegalArgumentException - if some property of the new entry
     * prevents it from being added to this list.
     */
    public void addFront(T newEntry);

    /**
     * Adds a new entry to the end of this list.
     * Entries currently in this list are unaffected.
     * The size of this list is increased by 1.
     * @param newEntry The object to be added as a new entry.
     * @throws ClassCastException if the class of the new entry prevents it
     * from being added to this list.
     * @throws IllegalArgumentException if some property of the new entry
     * prevents it from being added to this list.
     */
    public void addBack(T newEntry);

    /**
     * Deletes and returns the entry from the beginning of this list.
     * Other entries' indexes are shifted up by 1.
     * The size of this list is decreased by 1.
     * @return Either the object that has been deleted or null, if this list
     * is empty.
     */
    public T removeFront();

    /**
     * Deletes and returns the entry from the end of this list.
     * Other entries currently in this list are unaffected.
     * The size of this list is decreased by 1.
     * @return Either the object that has been deleted or null, if this list
     * is empty.
     */
    public T removeBack();

    /**
     * Displays all of the entries in this list.
     */
    public void display();

    /**
     * Searches for a specific entry in this list.
     * @param entry The object to be searched for.
     * @return The integer number of the position the entry appears in the
     * list or null, if no such entry exists.
     * @throws ClassCastException if the type of the specified element is
     * incompatible with this list
     * @throws NullPointerException if the specified element is null and this
     * list does not permit null elements.
     */
    public int contains(T entry);

    /** Detects whether this list is empty.
     * @return True if this list contains no elements, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Detects the number of elements in this list.
     * @return The integer number of entries currently in this list.
     */
    public int size();

    /**
     * Removes all entries from this list.
     */
    public void clear();
}

