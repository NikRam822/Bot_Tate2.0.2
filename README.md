# Bot_Tate2.0.2

Bot_Tate2.0.2 is a game implemented as a Telegram bot. The bot thinks of a number, and the user's task is to guess it within a limited number of attempts. The fewer attempts the user takes, the more points they earn. The project collects data and stores it in a database.

## Technologies Used

### Backend
- **Java 15**
- **Maven** (for building and managing the project)
- **SLF4J with Log4j** (for logging)
- **Telegram Bots API** (for interacting with Telegram)
- **SQLite** (for database storage)
- **ORMLite** (for ORM and database interaction)

## Installation and Running

### Prerequisites
- Ensure you have Java 15 and Maven installed.

### Steps
1. Clone the repository:
```
   git clone https://github.com/NikRam822/Bot_Tate2.0.2.git
```
2.Navigate to the project directory:
```
cd Bot_Tate2.0.2
```
3. Build the project using Maven:
```
mvn clean install
```
4. Run the project:
```
mvn exec:java -Dexec.mainClass="org.example.Main"
```

## Project Structure

- `src/main/java/org/example` - Main backend code.
  - `Bot.java` - Main bot logic and interaction with Telegram API.
  - `GameService.java` - Business logic for the game.
  - `DatabaseService.java` - Database interaction using ORMLite.
  - `User.java` - User model with fields:
    - `chatId` - Unique identifier.
    - `bank` - User's bank.
    - `gameCode` - Game code to control the user's state in the game.
    - `targetNumber` - Number thought by the bot.
    - `tote` - User's bet.
    - `steps` - Number of attempts to guess the number.

## Usage

After starting the bot, users can interact with it on Telegram. The bot will think of a number, and users will have to guess it within a limited number of attempts. The bot will provide feedback on the guesses, and users will earn points based on their performance.
