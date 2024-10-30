
public class Main {

    public static int addTotal(int itemCost) {

        int total = 0;
        total += itemCost;
        return total;

    }

    public static void newString(String word) {

        String newStr = "";
        for (int x = 0; x < word.length(); x += 2) {

            newStr += word.substring(x);

        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String asdf = "A" + "." + (int)(Math.random()*(Math.pow(10,3+1)-Math.pow(10,3))+Math.pow(10,3));
        System.out.println(asdf);
    }
}




