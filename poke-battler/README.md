# Pokemon Battler Game

This sprint was designed by [Northcoders](https://northcoders.com/) for the Software Development Bootcamp.

---


## Pokemon Properties
A Pokemon will need to have the following properties:

- name: the name its given
- hitPoints: the amount of health the Pokemon has, represented as a number
- attackDamage: the amount of damage a Pokemon can inflict (should be a number)
- move: This is the move the Pokemon does when battling, this should default to "tackle"

## Methods
`takeDamage`

- Will take a number and reduce its health by the number given

`useMove`

- Will return the Pokemon's attackDamage.
- Should also console log something like "PokemonX used PokemonX's move".

`hasFainted`

- When a Pokemon's health is reduced to zero they faint.
- `hasFainted` will return a boolean based on whether the Pokemon has fainted.

## Extend Pokemon -> Fire, Water, Grass, Normal

### Props
`type`

- A string of their type ("fire","water","grass", or "normal").

### Methods
`isEffectiveAgainst`

- This will take a Pokemon as an argument and return a boolean describing whether the current Pokemon is effective against the given Pokemon.

`isWeakTo`
- This will take a Pokemon as an argument and return a boolean describing whether the current Pokemon is weak to the given Pokemon.

Below is a list of the types and their respective strengths and weaknesses. You should use this to inform the behaviour of the methods described above for each class. Note: You will need to implement the type property for each derived class for the above methods to work as expected.

- `fire` pokemon are strong against grass, and weak against water.
- `grass` pokemon are strong against water, and weak against fire.
- `water` pokemon are strong against fire and weak against grass.
- `normal` pokemon are neither strong nor weak against any other types.

## Species

4 classes each extending from the relevant class -> Charmander, Squirtle, Bulbasaur, Rattata

- `Charmander` should be a `FirePokemon` and have its move be "ember".
- `Squirtle` should be a `WaterPokemon` and have its move be "water gun".
- `Bulbasaur` should be a `GrassPokemon` and have its move be "vine whip".
- `Rattata` should be a `NormalPokemon`.

## Pokeball

Pokeballs are the containers for Pokemon. They are used in the game to catch Pokemon and to release the Pokemon for battle.

Pokeball behaviours include:

- being able to store a Pokemon.
- throw it to catch a Pokemon.
- throw it to release it for battle.
- check which Pokemon is in the pokeball.

### Methods

`throw`
- Takes a Pokemon object as an argument. If the pokeball is empty it will capture the passed Pokemon.
- If it isn't empty ,the user should not be allowed to capture a pokemon with it!
- The throw method should also console log something like ("you caught pokemonX's name") when a Pokemon has been caught.
- Additionally, the method can be invoked with no argument.
- In this case the method should return the stored Pokemon. The throw method should console log something like ("GO pokemonX's name!!") in this scenario.
- If the ball is empty then the user should be informed accordingly.

`isEmpty`
- Should return a boolean representing whether or not a Pokemon is stored inside

`contains`
- Should return the name of the Pokemon that is stored or
- If the pokeball is empty is should return "empty ...".

## Trainer

- A Trainer should have a belt property which can store up to 6 Pokeballs. The datatype of the belt is up to you to decide.

### Methods

`catch`

- Takes a Pokemon as an argument.
- It should use one of its empty Pokeball's `throw` method to catch the Pokemon.
- Should do something if you don't have any empty Pokeballs, what and how is up to you.

`getPokemon`
- Takes the name of a Pokemon.
- Will search for the the Pokemon with that name in the belt.
- Use the Pokeball's throw to return that specific Pokemon.

## Battle

Finally, you will need a way to battle the Pokemon. The battle should take two trainers and the names of the Pokemon they wish to battle.

### Methods 

`fight`

- This should take the Pokemon whose turn it is,
- Attack the defending Pokemon (deducting attacker's attack damage from the defender's hit points)
- End their turn
- Should take each Pokemon's strengths and weaknesses into account
- If a defender is strong against the attacking type, the attacking type's damage should be multiplied by 0.75.
- If a defender is weak against the attacking type, the attacking type's damage should be multiplied by 1.25.
- Each attack should be followed by an attack message
- The message will vary depending on the defender's weakness/strength.
- If the defending Pokemon faints (depletes all hit points), the attacker wins.

This is quite a complex method, and you may want to break up some of its behaviour into additional methods so you can make it tidier. You may also want to create additional properties, if you think these will be helpful.

