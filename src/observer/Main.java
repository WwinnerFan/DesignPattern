package observer;

import observer.implement.FirstObserver;
import observer.implement.SecondObserver;
import observer.implement.WeChat;

public class Main {

    public static void main(String[] args) {
        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();
        WeChat weChat = new WeChat();
        weChat.registerObserver(firstObserver);
        weChat.registerObserver(secondObserver);
        weChat.setUpdateInt(10);
        weChat.notifyObserver();
    }
}
