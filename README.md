# Terminal based **Tic Tac Toe Game**

It is a simple implementation of Tic Tac Toe Game using Java for terminal based users. Supports two different users and
punishes user for invalid input 😢

## Installation

```bash
git clone https://github.com/ujjwalgarg100204/Tic-Tac-Toe-Game.git
```

## Dependency

[JDK](https://www.oracle.com/java/technologies/downloads/)

## Usage

```bash
# compile
javac src/DriverClass.java src/TicTacToe.java -d out/

# run
java -classpath out/ DriverClass
```

## Playing

Just enter player names and enter the cell coordinates when prompted.

### Correct way of entering coordinate

Coordinates can only put in the form of x,y without spaces.
> If you don't give input in the form specified, game won't give you second chance

##### Cell Mappings

| Cell Coordinate |             Output              |
|:---------------:|:-------------------------------:|
|       1,1       | ![1,1](readme_assets/(1,1).png) |
|       1,2       | ![1,2](readme_assets/(1,2).png) |
|       1,3       | ![1,3](readme_assets/(1,3).png) |
|       2,1       | ![2,1](readme_assets/(2,1).png) |
|       2,2       | ![2,2](readme_assets/(2,2).png) |
|       2,3       | ![2,3](readme_assets/(2,3).png) |
|       3,1       | ![3,1](readme_assets/(3,1).png) |
|       3,2       | ![3,2](readme_assets/(3,2).png) |
|       3,3       | ![3,3](readme_assets/(3,3).png) |

[![asciicast](https://asciinema.org/a/513209.svg?autoplay=1&loop=1&theme=monokai&speed=2)](https://asciinema.org/a/513209?autoplay=1&loop=1&theme=monokai&speed=2)

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](LICENSE.txt)