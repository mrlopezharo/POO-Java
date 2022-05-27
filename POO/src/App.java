public class App {
    public static void main(String[] args) throws Exception {
        
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();


        // attack
        squirtle.atacarMordisco();
        squirtle.atacarBurjuja();

        charmander.atacarLanzaLlamas();
        charmander.atacarMordisco();

        bulbasaur.atacarPlacaje();
        bulbasaur.atacarDrenaje();

        pikachu.atacarImpactrueno();
        pikachu.atacarPlacaje();

    }
}
