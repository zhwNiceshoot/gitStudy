package com.qa.data;

/**
 * Created by zhangwei on 2019/4/2
 **/

public class Users {

    private String name;
    private String job;

    public Users(){
        super();
    }

    public Users(String name,String job){
        super();
        this.name = name;
        this.job = job;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


}
