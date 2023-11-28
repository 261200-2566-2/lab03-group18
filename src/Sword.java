public class Sword {
    public double Sword_damage,SWRS_decrease,Base_damage;
    public int Sword_level;

    private void getstatusSW(){
        Sword_damage = Base_damage*(1+0.1*Sword_level);
        SWRS_decrease = 0.1+0.04*Sword_level;
    }
    public void statusSword(){
        getstatusSW();
        System.out.print("Level : "+Sword_level+"\n");
        System.out.print("Damage : "+Sword_damage+"\n");
        System.out.print("Sword run speed decrease : "+SWRS_decrease+"\n");
    }

    public void Sword_level_up(){
        Sword_level++;
        getstatusSW();
    }

}
