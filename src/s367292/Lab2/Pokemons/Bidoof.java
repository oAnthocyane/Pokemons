package s367292.Lab2.Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import s367292.Lab2.Moves.Amnesia;
import s367292.Lab2.Moves.DoubleTeam;
import s367292.Lab2.Moves.Thunderbolt;

public class Bidoof extends Pokemon {
    public Bidoof(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(59, 45, 40, 35, 40, 31);
        this.setMove(new Thunderbolt(), new Amnesia(), new DoubleTeam());
    }

}
