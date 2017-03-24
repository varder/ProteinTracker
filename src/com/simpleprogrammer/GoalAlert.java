package com.simpleprogrammer;


public class GoalAlert {
    private int id;
    private String messege;

    public GoalAlert(String message){
        super();
        this.messege = message;
    }

    public GoalAlert(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }



}
