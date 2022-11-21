package s367292.Lab2.Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import s367292.Lab2.Moves.DazzlingGleam;
import s367292.Lab2.Moves.ShadowClaw;
import s367292.Lab2.Moves.Swagger;
import s367292.Lab2.Moves.WakeUpSlap;

public class Meloetta extends Pokemon{
    public Meloetta(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.PSYCHIC);
        this.setStats(100, 77, 77, 128, 128, 90);
        this.setMove(new Swagger(), new DazzlingGleam(), new WakeUpSlap(), new ShadowClaw());
    }
}
