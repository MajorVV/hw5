package com.company;

public class Main {

    public static void main(String[] args) {
        boss boss = new boss( "Boss",1200,"Magical", 140);
        System.out.println(boss.getBossName() + " " + boss.getBossHealthy() + " "
                + boss.getTypeProtection() + " " + boss.getBossAttack());
        
    }
}
