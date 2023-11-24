package Test5;

public interface Q12 {
    sealed class MyClass permits  MySecondClass {};
    non-sealed class MySecondClass extends MyClass{};
}

