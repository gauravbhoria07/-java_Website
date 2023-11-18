public class EnumToString {
    public enum ExampleEnum {
        VALUE1, VALUE2, VALUE3
    }

    public static void main(String[] args) {
        ExampleEnum exampleEnum = ExampleEnum.VALUE2;
        String enumString = exampleEnum.toString();

        System.out.println("Enum as String: " + enumString);
    }
}
