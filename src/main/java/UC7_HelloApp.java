public class UC7_HelloApp {
    public static void main(String[] args) {
        String name="World";

        if(args.length>0){
            name=String.join(", ",args);
        }
        System.out.println("Hello, "+name+"!");
    }
}