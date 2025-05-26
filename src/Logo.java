public class Logo {
    private String key;
    private String name;
    private String transactionType;

    public String getKey() {
        return key;
    }

    public Logo setKey(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return name;
    }

    public Logo setName(String name) {
        this.name = name;
        return this;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Logo setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    @Override
    public String toString() {
        return "Logo{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}