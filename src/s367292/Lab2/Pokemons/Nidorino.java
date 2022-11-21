package s367292.Lab2.Pokemons;


import s367292.Lab2.Moves.Flatter;

public class Nidorino extends NidoranM {
    public Nidorino(String name, int level){
        super(name, level);

        this.setStats(61,72,57,55,55,65);
        this.addMove(new Flatter());
    }
}
