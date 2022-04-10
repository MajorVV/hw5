package com.company;

public class boss {
    private String bossName = "Altron";
    private int bossHealthy;
    private String typeProtection;
    private int bossAttack;

    public boss(String bossName, int bossHealthy, String typeProtection, int bossAttack) {
        this.bossName = bossName;
        this.bossHealthy = bossHealthy;
        this.typeProtection = typeProtection;
        this.bossAttack = bossAttack;
    }
        public void setBossName (String bossName){
            this.bossName = bossName;
        }
        public void setBossHealthy ( int bossHealthy){
            this.bossHealthy = bossHealthy;
        }
        public void setTypeProtection (String typeProtection){
            this.typeProtection = typeProtection;
        }
        public void setBossAttack ( int bossAttack){
            this.bossAttack = bossAttack;
        }


        public String getBossName () {
            return bossName;
        }
        public int getBossHealthy () {
            return bossHealthy;
        }
        public String getTypeProtection () {
            return typeProtection;
        }
        public int getBossAttack () {
            return bossAttack;
        }
    }

