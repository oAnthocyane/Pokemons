package s367292.Lab2.Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1) Effect.burn(p);
    }

    @Override
    protected String describe(){
        return "attacks and sets the enemy on fire";
    }

}
