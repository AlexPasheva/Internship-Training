package Converter.common;
/**
 * <code>Pair</code> is a parameterized immutable structure of two elements with
 * specified types.<br>
 *
 * This class is typically used as a substitute for multiple return values (due
 * to their lack in Java)
 *
 * @author ttonchev
 */
public final class Pair<FirstType, SecondType> {
    private FirstType firstElement;
    private SecondType secondElement;

    public Pair(FirstType firstElement, SecondType secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    /**
     * @return the firstElement
     */
    public FirstType getFirstElement() {
        return firstElement;
    }

    /**
     * @return the secondElement
     */
    public SecondType getSecondElement() {
        return secondElement;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstElement == null) ? 0 : firstElement.hashCode());
        result = prime * result + ((secondElement == null) ? 0 : secondElement.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair other = (Pair) obj;
        if (firstElement == null) {
            if (other.firstElement != null) {
                return false;
            }
        } else if (!firstElement.equals(other.firstElement)) {
            return false;
        }
        if (secondElement == null) {
            if (other.secondElement != null) {
                return false;
            }
        } else if (!secondElement.equals(other.secondElement)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pair [firstElement=" + firstElement + ", secondElement=" + secondElement + "]";
    }

}
