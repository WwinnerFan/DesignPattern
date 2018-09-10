package observer.implement;

import observer.interfaces.Observable;
import observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeChat implements Observable {

    private List<Observer>observerList = null;
    private String updateMessage = null;
    private int updateInt;

    public WeChat() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observerList.isEmpty()) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observerList)
            observer.update(updateInt);
    }

    public void setUpdateMessage(String updateMessage) {
        this.updateMessage = updateMessage;
    }

    public void setUpdateInt(int n) {
        this.updateInt = n;
    }
}
