package org.example;

public class main1 {
    public static void main(String[] args) {
        printTheThirdNumber();

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
