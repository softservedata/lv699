package hw08.wrapper;

public class MainWrapper {
    public static void main(String[] args) {
        Wrapper<Integer> integerWrapper = new Wrapper<>();
        Wrapper<String> stringWrapper = new Wrapper<>();
        Wrapper<Boolean> booleanWrapper = new Wrapper<>();

//        Wrapper<Integer> integerWrapper = new Wrapper<>(25);
//        Wrapper<String> stringWrapper = new Wrapper<>("abc");
//        Wrapper<Boolean> booleanWrapper = new Wrapper<>(false);

        integerWrapper.setValue(25);
        stringWrapper.setValue("abc");
        booleanWrapper.setValue(false);

        System.out.printf("%s\n%s\n%s",
                integerWrapper.getValue(),
                stringWrapper.getValue(),
                booleanWrapper.getValue()
        );
    }
}
