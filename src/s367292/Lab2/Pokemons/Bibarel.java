package s367292.Lab2.Pokemons;


import ru.ifmo.se.pokemon.Type;
import s367292.Lab2.Moves.Bulldoze;

public class Bibarel extends Bidoof {
    public Bibarel(String name, int level){
        super(name, level);
        this.addType(Type.WATER);
        this.setStats(79, 85, 60, 55, 60, 71);
        this.addMove(new Bulldoze());
    }
}
