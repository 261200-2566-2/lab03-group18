public class Character {
    public int Charlevel;
    public double maxHp, maxMana, hp,mana,atk,def ,base_runspeed,max_runspeed,Runspeed;


    public void getstatusCharacter(){
        maxHp = 100+10*Charlevel;
        maxMana = 50+2*Charlevel;
        max_runspeed = base_runspeed*(0.1+0.03*Charlevel) ;
        if (Runspeed<=0)Runspeed=0;

    }
    public void StatusCharacter(){
        getstatusCharacter();
        System.out.print("Level : "+Charlevel+"\n");
        System.out.print("MaxHP : "+maxHp+"\n");
        System.out.print("MaxMana : "+maxMana+"\n");
        System.out.print("MaxRunSpeed : "+max_runspeed+"\n");
        System.out.print("Hp : "+hp+"\n");
        System.out.print("Mana : "+mana+"\n");
        System.out.print("atk : "+atk+"\n");
        System.out.print("def : "+def+"\n");
        System.out.print("RunSpeed : "+Runspeed+"\n");
    }
    public void GetLevelUp(){
        Charlevel++ ;
        getstatusCharacter();
        hp = maxHp;
    }

    public void attacked(double x){
        if (hp-x>=0) hp = hp - x;
        else hp = 0;
    }





}
