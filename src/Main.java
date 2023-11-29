public class Main {
    public static void main(String[] args) {

        Sword Sw1 = new Sword();
        Sw1.Base_damage = 3;
        Sw1.Sword_level = 5;
        System.out.print("Sword : Sw1"+"\n");
        Sw1.Sword_level_up();
        Sw1.statusSword();

        System.out.print("---------------------------"+"\n");

        Sword Sw2 = new Sword();
        Sw2.Base_damage = 4;
        Sw2.Sword_level = 1;
        System.out.print("Sword : Sw2"+"\n");
        Sw2.statusSword();

        System.out.print("---------------------------"+"\n");

        Shield Sh1;
        Sh1 = new Shield();
        Sh1.Base_defense = 5;
        Sh1.Shield_level = 7;
        System.out.print("Shield : Sh1"+"\n");
        Sh1.statusShield();

        System.out.print("---------------------------"+"\n");

        Shield Sh2;
        Sh2 = new Shield();
        Sh2.Base_defense = 8;
        Sh2.Shield_level = 2;
        System.out.print("Shield : Sh1"+"\n");
        Sh2.Shield_level_up();
        Sh2.statusShield();

        System.out.print("---------------------------"+"\n");

        Character TRex;
        TRex = new Character();
        TRex.Charlevel = 12;
        TRex.base_runspeed = 3;
        System.out.print("Character : TRex"+"\n");
        System.out.print("Equipment Left : Sw2"+"\n");
        System.out.print("Equipment Right : Sw1"+"\n");
        TRex.Runspeed= TRex.max_runspeed - (TRex.base_runspeed* Sw2.SWRS_decrease) - (TRex.base_runspeed* Sw1.SWRS_decrease);
        TRex.getstatusCharacter();
        TRex.hp = TRex.maxHp;
        TRex.mana = TRex.maxMana;
        TRex.atk = Sw1.Sword_damage+ Sw2.SWRS_decrease;
        TRex.GetLevelUp();
        TRex.attacked(3);
        TRex.StatusCharacter();

        System.out.print("---------------------------"+"\n");

        Character SUCHA;
        SUCHA = new Character();
        SUCHA.Charlevel = 12;
        SUCHA.base_runspeed = 30;
        System.out.print("Character : SUCHA"+"\n");
        System.out.print("Equipment Left : Sh2"+"\n");
        System.out.print("Equipment Right : Sw1"+"\n");
        SUCHA.Runspeed= SUCHA.max_runspeed - (SUCHA.base_runspeed* Sh2.SHRS_decrease) - (SUCHA.base_runspeed* Sw1.SWRS_decrease);
        SUCHA.getstatusCharacter();
        SUCHA.hp= SUCHA.maxHp;
        SUCHA.mana= SUCHA.maxMana;
        SUCHA.atk = Sw1.Sword_damage;
        SUCHA.def = Sh2.Shield_defense;

        SUCHA.StatusCharacter();

        System.out.print("---------------------------"+"\n");
        }


    }
