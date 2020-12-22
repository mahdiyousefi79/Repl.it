package TV;

public class TV {

    private int channel = 1, volumeLevel = 1;

    private boolean on = false;
    private String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {   //
        return channel;
    }        //

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {      //
        return volumeLevel;
    }

    public void setVolume(int volume) {
        this.volumeLevel = volume;
    }

    public String getBrand() {
        return brand;
    }    //

    public void setBrand(String brand) {
        this.brand = brand;
    }  //

    public void setOn() {
        this.on = on;
    }

    public void channelUp() {
        if (channel >= 1 && channel <= 120) {
            channel += 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }


    public void channelDown() {
        if (channel >= 1 && channel <= 120) {
            channel -= 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }




      public void turnOn(){
        if (on){
            System.out.println("TV is already ON");
        }
 }

    public void turnOff(){
        if (!on){
            System.out.println("TV is already OFF");
        }
    }

    public void volumeUp (){

        if ((volumeLevel>=1 && volumeLevel<=7) && on){

            volumeLevel += 1;
        }
    }

    public void volumeDown (){

        if ((volumeLevel>=1 && volumeLevel<=7) && on){

            volumeLevel -= 1;
        }
    }


}







/*
 Write a custom class TV that has 4 instance variables: int channel=1, int volumeLevel=1, boolean on = false, String brand = "undefined".
    1- Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor".

2- Also, create one more constructor that defines instance variable brand, and displays message:"Creating TV object using 1 arg - constructor".

3- Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.

4- Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.

5-Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.

6-Create isOn(), turnOn() and turnOff() methods for "on" instance variable. If tv is already on, no need to turn it on again,
display message: "TV is already ON". If tv is already off, then no need to turn it off again, display message: "TV is already OFF".


*** Value of a variable channel cannot be negative or zero, and cannot be higher than 120. If user will try to set invalid channel,
display message: "ERROR: TV is either OFF or invalid Channel".


*** Volume can be only in the range between 1 and 7. You may change volume only if TV is on. Otherwise,
display message: "ERROR: TV is either OFF or invalid Volume level". Create isOn() method that will check tv status.
 */