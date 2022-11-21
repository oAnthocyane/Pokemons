package s367292.Lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock(){
        super(Type.POISON, 65, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        double final_damage = damage;
        if(def.getCondition() == Status.POISON) final_damage *= 2;
        def.setMod(Stat.HP, (int) Math.round(final_damage));
    }
}
