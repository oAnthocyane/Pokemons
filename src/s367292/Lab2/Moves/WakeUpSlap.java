package s367292.Lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap(){
        super(Type.FIGHTING, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        double final_damage = damage;
        if(def.getCondition() == Status.SLEEP){
            final_damage *= 2;
            def.setCondition(new Effect().condition(Status.NORMAL));
        }
        def.setMod(Stat.HP, (int) Math.round(final_damage));

    }
}
