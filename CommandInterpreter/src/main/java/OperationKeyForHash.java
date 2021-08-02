import java.util.Objects;

public class OperationKeyForHash {
    private final String operation;
    private final String type1;
    private final String type2;

    public OperationKeyForHash(String operation, String type1, String type2) {
        this.operation = operation;
        this.type1 = type1;
        this.type2 = type2;
    }

    public String getOperation() {
        return operation;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationKeyForHash that = (OperationKeyForHash) o;
        return operation.equals(that.operation) && type1.equals(that.type1) && type2.equals(that.type2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, type1, type2);
    }
}
