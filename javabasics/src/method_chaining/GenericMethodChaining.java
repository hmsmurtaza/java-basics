package method_chaining;

import java.util.function.Function;

class GenericBuilder<T> {
    private T value;

    public GenericBuilder(T initialValue) {
        this.value = initialValue;
    }

    public GenericBuilder<T> setValue(T newValue) {
        this.value = newValue;
        return this;
    }

    public GenericBuilder<T> doSomethingWith(Function<T, T> operation) {
        this.value = operation.apply(this.value);
        return this;
    }

    public T build() {
        return value;
    }
}

public class GenericMethodChaining {
    public static void main(String[] args) {

    }
}
