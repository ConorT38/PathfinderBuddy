@@ -0,0 +1,269 @@
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pathfinderapplication1;
import java.io.Serializable;

/**
 *
 * @author Conor
 */

public class PathFinder implements Serializable{
String name;
    String race;
    String Class1;
    String eyecolour;
    String sex;
    int count;
    double gold;
    int age;
    float height;
    double strength;
    double charisma;
    double wisdom;
    double intellect;
    double constitution;
    double dexterity;
    int fortitude;
    int reflex;
    double armourclass;
    int baseAttack;
    int will;
    int hitpoints;
    int cmb;
    int cmd;
    int HitDie;

    
    public PathFinder() {
     name= new String();
     race= new String();
     Class1 = new String();
     eyecolour = new String();
     sex = new String();
     age =0;
     height=0;
     strength=Math.floor((Math.random()*18)+3);
     charisma=Math.floor((Math.random()*18)+3);
     wisdom=Math.floor((Math.random()*18)+3);
     intellect=Math.floor((Math.random()*18)+3);
     constitution=Math.floor((Math.random()*18)+3);
     dexterity=Math.floor((Math.random()*18)+3);
     armourclass = (dexterity/4)+10.0;
     hitpoints = 0;
     cmb = 0;
     cmd = 0;
     gold =charisma*10.0;
    switch (Class1) {
        case "Barbarian":
            baseAttack = 1;
            will = 0;
            fortitude = 2;
            reflex = 0;
            HitDie = 12;
            break;
        case "Bard":
            baseAttack = 0;
            will = 2;
            fortitude = 0;
            reflex = 2;
            HitDie = 8;
            break;
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getClass1() {
        return Class1;
    }

    public void setClass1(String Class1) {
        this.Class1 = Class1;
    }

    public String getEyecolour() {
        return eyecolour;
    }

    public void setEyecolour(String eyecolour) {
        this.eyecolour = eyecolour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public double getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public double getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public double getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public double getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getReflex() {
        return reflex;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    public double getArmourclass() {
        return armourclass;
    }

    public void setArmourclass(int armourclass) {
        this.armourclass = armourclass;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getCmb() {
        return cmb;
    }

    public void setCmb(int cmb) {
        this.cmb = cmb;
    }

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    
}
     public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
 
    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }  
    public int getHitDie() {
        return HitDie;
    }

    public void setHitDie(int HitDie) {
        this.HitDie = HitDie;
    }
}
