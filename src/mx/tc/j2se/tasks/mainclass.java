package mx.tc.j2se.tasks;

public class mainclass {
    public static void main(String[] args) {

        Task t=new Task("Morning run",1,20,7);
        System.out.println(t.getStartTime());
        t.setActive(false); //setting the active state to false
        System.out.println(t.isActive());
        Task t2=new Task("Morning run",5);
        System.out.println(t2.getStartTime());
        System.out.println(t2.getEndTime());
        System.out.println(t2.isActive()); //
        System.out.println(t2.getRepeatInterval());//indicates not repeated task
        t2.setTime(3,8,1);// changes the unrepeated t2 task to repeated task
        System.out.println(t2.getRepeatInterval());// checks whether repeated or not
        t2.setTime(5);// changes the repeated to unrepeated
        System.out.println(t2.getRepeatInterval());// checks whether repeated or not (0-not repeated)
        System.out.println(t.nextTimeAfter(1)); //gives the nexttime using the current time

    }
}
