package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        skipTheFifthSymbol();
        printTheThirdNumber();


    }

    static void skipTheFifthSymbol() {


        String text = "გამარჯობა";

        for (int i = 0; i < text.length(); i++) {
            if (i == 5)
                continue;
            System.out.println(i + " პოზიციაზე არის : " + text.charAt(i));
        }

    }

    static void printTheThirdNumber() {


        int i = 0;

        while (i <= 10) {

            if (i % 3 == 0)
                System.out.println(i);
            i++;
        }
    }
}




