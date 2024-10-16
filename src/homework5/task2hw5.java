package homework5;

import java.util.Deque;
import java.util.LinkedList;

public class task2hw5 {
    static class BrowserHistory {
        private Deque<String> history = new LinkedList<>();
        public void visitSite(String site) {
            history.addFirst(site);
        }
        public String back(int steps) {
            if (steps >= history.size()) {
                return null;
            }
            return history.stream().skip(steps).findFirst().orElse(null);
        }
        public Deque<String> getHistory() {
            return history;
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            BrowserHistory browserHistory = new BrowserHistory();
            browserHistory.visitSite("google.com");
            browserHistory.visitSite("stackoverflow.com");
            browserHistory.visitSite("github.com");
            System.out.println(browserHistory.back(1));
            System.out.println(browserHistory.getHistory());
        }
    }

}
