package s367292.Lab2.Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import s367292.Lab2.Moves.Venoshock;
import s367292.Lab2.Moves.Thunderbolt;

public class NidoranM extends Pokemon {
    public NidoranM(String name, int level){
        super(name, level);
        this.setType(Type.POISON);
        this.setStats(46,57,40,40,40,50);
        this.setMove(new Thunderbolt(), new Venoshock());
    }
}
