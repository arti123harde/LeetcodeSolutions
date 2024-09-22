package org.solutions.leetcode.linkedList.medium;

/**
 * @author Arti Harde
 */
public class DesignBrowserHistory {

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.forward(1));
        browserHistory.visit("linkedin.com");
        System.out.println(browserHistory.forward(2));
        System.out.println(browserHistory.back(2));
        System.out.println(browserHistory.back(7));
    }

    private static class BrowserHistory{

        private DLNode firstNode;
        private DLNode current;

        public BrowserHistory(String homepage) {
            firstNode = new DLNode(homepage);
            current = firstNode;
        }

        public void visit(String url) {
            DLNode dlNode = new DLNode(url);
            current.next = dlNode;
            dlNode.prev = current;
            current = dlNode;
        }

        public String back(int steps) {
            while (steps > 0 && current.prev != null) {
                current = current.prev;
                steps--;
            }
            return current.url;
        }

        public String forward(int steps) {
            while (steps > 0 && current.next != null) {
                current = current.next;
                steps--;
            }
            return current.url;
        }

        private static class DLNode{

            private DLNode next;
            private DLNode prev;
            private String url;

            public DLNode(String url) {
                this.url = url;
            }

            public DLNode getNext() {
                return next;
            }

            public void setNext(DLNode next) {
                this.next = next;
            }

            public DLNode getPrev() {
                return prev;
            }

            public void setPrev(DLNode prev) {
                this.prev = prev;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}