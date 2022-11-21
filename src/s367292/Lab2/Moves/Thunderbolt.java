package s367292.Lab2.Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.1) Effect.paralyze(p);
    }
    @Override
    protected String describe(){
        return "attack and paralyze target";
    }
}
