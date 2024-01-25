import java.util.ArrayList;

public class Channel implements Subject {

    private ArrayList<Observer> observers;
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        this.channelName = channelName;
        this.status = status;
        observers = new ArrayList<Observer>();
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.status);
        }
    }

}
