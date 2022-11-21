package s367292.Lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(-1).stat(Stat.EVASION, 1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){ return "increase his stealth by 1"; }


}
