package LymabdaExperission;

public class MyEvent {
    public static void main(String[] args) {
        MyEventConsumer consumer = new MyEventConsumer() {
            @Override
            public void consume(Object event) {
                System.out.println(event.toString() + "consumed");
            }
        };

        MyEventConsumer myEventConsumer = new MyEventConsumer() {
            private int eventCount=0;
            @Override
            public void consume(Object event) {
                System.out.println(event.toString() + " consumed " + this.eventCount++ +" times. ");
            }
        };
    }



}
