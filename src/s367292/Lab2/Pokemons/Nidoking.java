package s367292.Lab2.Pokemons;

import ru.ifmo.se.pokemon.Type;
import s367292.Lab2.Moves.Flamethrower;

public class Nidoking extends Nidorino {
    public Nidoking(String name, int level){
        super(name, level);
        this.addType(Type.GROUND);
        this.setStats(81,102,77,85,75,85);
        this.addMove(new Flamethrower());
    }
}
