package s367292.Lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(-1).stat(Stat.SPEED, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){ return "reduce the speed of the opponent by 1"; }

}
