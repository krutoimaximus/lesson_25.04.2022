package lesson.egar.company;

import java.util.Date;

public class PersonalMessage extends Message {
    public PersonalMessage(String content, String imagePath, Date sentDate) {
        super(content, imagePath, sentDate);
    }

    @Override
    void print() {
       System.out.println("Это личные сообщения, " + "не для чата " + getContent());
    }
}
