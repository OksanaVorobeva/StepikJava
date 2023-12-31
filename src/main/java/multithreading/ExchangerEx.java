package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNICI);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);
        new BestFriend("Ваня", friend1Action, exchanger);
        new BestFriend("Петя", friend2Action, exchanger);
    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA

}

class BestFriend extends Thread {
    private String name;
    private List<Action> meActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> meActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.meActions = meActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.KAMEN && friendsAction == Action.NOJNICI)
                || (myAction == Action.NOJNICI && friendsAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)) {
            System.out.println(name + " WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : meActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
