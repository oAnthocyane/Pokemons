package s367292.Lab2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
import s367292.Lab2.Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon[] allies = {
                new Meloetta("Natasha", 1),
                new Nidoking("Stas", 1),
                new Bidoof("Vladimir", 41)
        };

        Pokemon[] foes = {
                new Bibarel("Innokentiy", 48),
                new Nidorino("Oleg", 57),
                new NidoranM("Semen", 1)

        };
        for(int i = 0; i < 3; i++){
            b.addAlly(allies[i]);
            b.addFoe(foes[i]);
        }
        b.go();
    }

}
