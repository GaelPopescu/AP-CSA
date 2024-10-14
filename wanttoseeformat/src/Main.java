public class Main {

    public static int addTotal(int itemCost) {

        int total = 0;
        total += itemCost;
        return total;

    }

    public static void newString(String word) {

        String newStr = "";
        for (int x = 0; x < word.length(); x+=2) {

            newStr += word.substring(x);

        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        double nusm = 10/4;
        System.out.println(nusm);


        String line = "Programming is my favorite!";
        System.out.println(line.length());

        int x = 6;
        int y = 2;
        double z = 3.0;
        System.out.println(5 + x / y * z - 1);

        String msg = "Today is a great day for programming!";

        String newMsg = msg.substring(msg.indexOf('g'));

        System.out.println(newMsg);

        String msg1 = "Java a great part of my day!";

        int num = msg1.indexOf("Great");
        System.out.println(num);
        int result = 80;
        String grade ="";
        if (result >= 90) grade = "A";
        if (result >= 80) grade = "B";
        if (result >= 70) grade = "C";
        if (result >= 60) grade = "D";
        else grade = "E";

        System.out.println(grade);

        String greet1 = "Good Morning!";

        String greet2 = "Good Afternoon!";


        if (greet1.compareTo(greet2) > 0)
            result = 1;
        else if (greet1.compareTo(greet2) < 0)
            result = - 1;
        else
        result = 0;
        System.out.println(result);

        String word1 = "hello";
        String word2 = "world";
        String word3 = "hello";
        System.out.println(!word1.equals(word2) && word1.equals(word3));


        int total = addTotal(5);
        total = addTotal(-3);
        System.out.println(total);

        newString("coding");

        for (int j = 0; j < 21; j++)
        {
            if (j % 5 == 2)
                System.out.print(j + " ");

        }
        System.out.print("\n");
        for (int dj = 0; dj < 25; dj++) {
            if (dj % 3 == 0)
                System.out.print(dj + " ");
        }
        System.out.print("\n");


        int dk = 0;
        while (dk <=24) {
            if (dk % 3 == 0)
                System.out.print(dk + " ");
            dk++;
        }
        System.out.print("\n");

        int count = 20;
        while(count >= 5)
        {
            count /= 2;
        }
        System.out.println(count);

        for (int in = 4; in <= 5; in++)
        {
            for (int out = 1; out <= 4; out++)
            {
                System.out.print("Hello World ");
            }
        }
        System.out.print("\n");

        for (int m = 0; m < 6; m+=3)
        {
            int n = 1;
            while(n < 6)
            {
                if (n%2==1)
                    n+=2;
                n++;
                System.out.print(n + " ");
            }
        }
        System.out.print("\n");


    }    }




