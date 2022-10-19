package mx.tc.j2se.tasks;

public class Task {
    String title;
    boolean status;
    int time;
    int start;
    int end;
    int interval;
    boolean repeated;
    Task (String title, int time)
    {
      this.title=title;
      this.time=time;
      this.repeated=false;
      this.status=true;
    }
    Task (String title, int start, int end, int interval1)
    {
        this.title=title;
        this.start=start;
        this.end=end;
        this.interval=interval1;
        this.repeated=true;
        this.status=true;
    }
    String getTitle()
    {
        return this.title;
    }
    void setTitle (String title)
    {
        this.title=title;
    }
    boolean isActive()
    {
        return this.status;
    }
    void setActive(boolean active)
    {
        this.status = active;
    }
    int getTime()
    {
        if(!isRepeated())
        {
            return this.time;
        }
       return 0;
    }
    void setTime(int time)
    {
        this.time=time;
        if(isRepeated())
        {
            repeated=false;
        }
    }
    int getStartTime()
    {
        if(!repeated) {
            return this.time;
        }
        else {
            return this.start;
        }

    }
    int getEndTime()
    {
        if(!repeated) {
            return this.time;
        }
        else {
            return this.end;
        }
    }
    int getRepeatInterval()
    {
        if(!isRepeated())
        {
            return 0;
        }
        return interval;
    }
    void setTime(int start, int end, int interval)
    {
        if(!isRepeated())
        {
            repeated=true;
        }
        this.start=start;
        this.end=end;
        this.interval=interval;
    }
    boolean isRepeated()
    {
        return repeated;
    }
    int nextTimeAfter (int current)
    {
        if(current!=end)
        {
            int next=current+this.interval;
            if(next<=end) {
                return next;
            }
            else {
                return -1;
            }
        }
        else {
            return -1;
        }
    }
}
