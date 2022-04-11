
package main;


public class main {

    
    public static void main(String[] args) {
        Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 80);
        Pokemon outroPokemon = new Pokemon("Squirtle", "Agua", 35);
        
        Batalha batalha1 = new Batalha();
               
        System.out.println("Seu Pokémon: ");
        meuPokemon.imprimiPokemon();
        System.out.println("Pokémon Inimigo: ");
        outroPokemon.imprimiPokemon();
        
        batalha1.meuPokemon(meuPokemon.getNome(),meuPokemon.getVida());
        batalha1.outroPokemon(outroPokemon.getNome(),outroPokemon.getVida());
        
        batalha1.startBattle();               
    }
    
}
