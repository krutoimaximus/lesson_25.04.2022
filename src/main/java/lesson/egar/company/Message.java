package lesson.egar.company;

import java.util.Date;

public class Message {
    private String content;
    String imagePath;
    Date sentDate;
    int readCount;

    public Message(String content, String imagePath, Date sentDate) {
        this.content = content;
        this.imagePath = imagePath;
        this.sentDate = sentDate;
    }

    void print() {
        System.out.println(content);
    }

    void loadImage() throws InterruptedException {
        System.out.println("Идет процесс загрузки по пути  "
                + imagePath);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Картинка загружена");
    }

    void printSentDate() {
        System.out.println(sentDate);
    }

    int getReadCount() {
        return readCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
