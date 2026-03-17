public class UC6_HelloApp {

    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        String result = nameBuilder.toString();

        if (result.length() > 0) {
            result = result.substring(0, result.length() - 2);
        }

        System.out.println("Hello, " + result + "!");
    }
}