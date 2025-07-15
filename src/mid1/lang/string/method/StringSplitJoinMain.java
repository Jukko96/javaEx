package mid1.lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        //split
        String[] splitStr = str.split(", ");
        for (String string: splitStr){
            System.out.println("split value : "+ string);
        }
        //join
        String joinString = "";
        for (String string: splitStr){
            joinString += string + "-";
        }
        System.out.println("joinString: "+ joinString);
        String realJoinString = String.join("-",splitStr);
        System.out.println("realJoinString: " + realJoinString);

    }
}
