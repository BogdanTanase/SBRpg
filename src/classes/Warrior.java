package classes;

public class Warrior extends BaseClass {
    public Warrior(String name) {//to add weapon
        super(name,20,0,5,2,0);
    }
    public void Roar(){
        super.physicalDmg+=2;
        super.hp-=2;
    }

    //recive dmg depending of area and fow

    //recive dmg from npc

    //send dmg depending on area and fow

    //send dmg depending on area and weapon to npc



}
