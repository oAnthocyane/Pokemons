package s367292.Lab2.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;


public class Amnesia extends StatusMove {
    public Amnesia(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_DEFENSE, 2);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "increase its special defense by 2";
    }
}
