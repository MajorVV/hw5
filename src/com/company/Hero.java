package com.company;

public class Hero {

    private String heroName;
    private int heroHealth;
    private String heroAbility;
    private int heroAttack;

    public Hero(){
        System.out.println(this);
    }

    public Hero(String heroName, int heroHealth, String heroAbility, int heroAttack){
        this.heroName = heroName;
        this.heroHealth = heroHealth;
        this.heroAbility = heroAbility;
        this.heroAttack = heroAttack;
    }

    public Hero(int heroHealth, int heroAttack){
        this.heroHealth = heroHealth;
        this.heroAttack = heroAttack;
    }
    public String getHeroName(){
        return this.heroName;
    }

    public int getHeroHealth(){
        return this.heroHealth;
    }

    public String getHeroAbility(){
        return this.heroAbility;
    }

    public int getHeroAttack(){
        return this.heroAttack;
    }

}
