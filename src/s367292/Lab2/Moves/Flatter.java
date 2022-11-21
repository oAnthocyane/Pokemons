package s367292.Lab2.Moves;

import ru.ifmo.se.pokemon.*;


public class Flatter extends StatusMove {
    public Flatter(){
        super(Type.DARK, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
        Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "paralyze the enemy and increase his special attack by 1";
    }
}
