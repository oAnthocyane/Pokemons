package s367292.Lab2.Moves;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL, 0, 85);

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.confuse();
        Effect e = new Effect().turns(-1).stat(Stat.ATTACK, 2);
        p.addEffect(e);

    }
    @Override
    protected String describe(){
        return "confuse and attack";
    }



}
