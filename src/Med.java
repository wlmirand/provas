public class Med {

    static class LiveData {
        private Observer mObserver;
        public void onCreate() { mObserver = getObserver(); }
        public void update() { mObserver.onUpdate(); }
        public void setObserver(Observer observer) { this.mObserver = observer; }
        public Observer getObserver() {
            return new Observer(); }
    }

    static class Observer {
        private static int mCount = 0;
        public void onUpdate() {
            System.out.println("Updating " + ++mCount);
        }
    }


    static class MediatorData extends LiveData {
        public void setObserver(Observer observer) { System.out.println("Cannot Update"); }
        public Observer getObserver() {
            return new CustomObserver(); }

        static class CustomObserver extends Observer {
            private int mCount = 10;
            public void onUpdate() {
                super.onUpdate();
                System.out.println("Updating " + ++mCount);
            }
        }
    }
}
