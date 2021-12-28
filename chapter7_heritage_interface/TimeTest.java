class TimeTest{
    public static void main(String[] argv){
        Time t = new Time(12, 35, 30);
        System.out.println(t);

        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}

class Time{
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public int getSecond(){return second;}

    public int setHour(int hour){
        if(hour > 0 || hour < 25){
            this.hour = hour;
            return 1;
        }
        else{
            return 0;
        }
    }

    public int setMinute(int minute){
        if(minute >= 0 || minute <= 60){
            this.minute = minute;
            return 1;
        }
        else{
            return 0;
        }
    }

    public int setSecond(int second){
        if(second >= 0 || second <= 60){
            this.second = second;
            return 1;
        }
        else{
            return 0;
        }
    }

    public String toString(){
        return "hour : " + hour + " minute : " + minute + " second : " + second;
    }
}