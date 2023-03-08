package CopyObjectValue;

import java.util.Scanner;

class School {
    int rollNum;
    String name;

    School(int i, String n) {
        rollNum = i;
        name = n;
    }

    School(School e) {
        rollNum = e.rollNum;
        name = e.name;
    }

    void display() {
        System.out.println(rollNum + " " + name);
    }

    public static void main(String[] args) {


        Scanner read_details = new Scanner(System.in);

        //reading input
        int rollNumber = read_details.nextInt();
        read_details.nextLine();
        String name = read_details.nextLine();

        //Copying the value using refrence
        School e1 = new School(rollNumber, name);
        School e2 = new School(e1);
        e1.display();
        e2.display();
    }
}  