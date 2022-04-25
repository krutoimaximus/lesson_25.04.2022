package lesson.egar.company;

import java.util.Date;

public class Main {
    public static void main(String[] args)  {
        Message message1 = new PersonalMessage("Hello world", "./resources", new Date());
        Message message2 = new GroupMessage("Hello world", "./resources", new Date());

        message1.print();
        message2.print();


    }
}
