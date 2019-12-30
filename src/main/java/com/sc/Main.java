package com.sc;

import org.apache.catalina.startup.Tomcat;

public class Main {

    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        tomcat.addWebapp("/app1", "D:\\data");
        try{
            tomcat.start();
            tomcat.getServer().await();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
