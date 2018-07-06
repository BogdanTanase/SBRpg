package classes;

public class BaseClass {
    //body
    protected String name;
    protected float xp;
    protected float hp;  //hit points
    protected float mp;  //mana points
    protected float armor;
    protected Boolean alive;

    //weapon
    //protected Weapon weapon;


    //dmg
    protected float physicalDmg;
    protected float magicalDmg;

    protected BaseClass(){
        this.name = "Gigel";
        this.hp = 0;
        this.mp = 0;
        this.armor = 0;
        this.alive = true;
        this.physicalDmg = 0;
        this.magicalDmg = 0;
        this.xp =0;
    }

    protected BaseClass(String name, float hp, float mp, float armor,float physicalDmg, float magicalDmg ){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.armor = armor;
        this.alive = true;
        this.physicalDmg = physicalDmg;
        this.magicalDmg = magicalDmg;
        this.xp=0;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected float getHp() {
        return hp;
    }

    protected void setHp(float hp) {
        this.hp = hp;
    }

    protected float getMp() {
        return mp;
    }

    protected void setMp(float mp) {
        this.mp = mp;
    }

    protected float getArmor() {
        return armor;
    }

    protected void setArmor(float armor) {
        this.armor = armor;
    }

    protected Boolean getAlive() {
        return alive;
    }

    protected void setAlive(Boolean alive) {
        this.alive = alive;
    }

    protected float getPhysicalDmg() {
        return physicalDmg;
    }

    protected void setPhysicalDmg(float physicalDmg) {
        this.physicalDmg = physicalDmg;
    }

    protected float getMagicalDmg() {
        return magicalDmg;
    }

    protected void setMagicalDmg(float magicalDmg) {
        this.magicalDmg = magicalDmg;
    }

    //general abbilities: teleport to starting point and flash to a direction

    //keybinding
}
