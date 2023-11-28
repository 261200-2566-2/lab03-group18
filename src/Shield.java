
public class Shield {
    public double Shield_defense,SHRS_decrease,Base_defense;
    public int Shield_level;

    private void getstatusSH(){
        Shield_defense = Base_defense*(1+0.1*Shield_level);
        SHRS_decrease = 0.1+0.08*Shield_level;
    }
    public void statusShield(){
        getstatusSH();
        System.out.print("Level : "+Shield_level+"\n");
        System.out.print("Defense : "+Shield_defense+"\n");
        System.out.print("Shield run speed decrease : "+SHRS_decrease+"\n");
    }

    public void Shield_level_up(){
        Shield_level++;
        getstatusSH();
    }


}
