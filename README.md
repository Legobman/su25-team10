## Title
> D&D Group Finder

## Team Members
> Matthew Berwick
> Arodi Kapuadi

## Description 
> D&D Group Finder is a simple board that will allow Game Masters and Players find each other. Game Masters will be able to post their available games and Players will be able to join these games

## App Functions
1. Customer (Players):
    1. Create/modify customer profile - register as a player.
    2. View available services - browse game groups.
    3. Subscribe to available services - join available game groups.
    4. Write reviews for subscribed services - rate the game groups.
2. Provider (Game Masters):
    1. Create/modify/remove provider profile - register as a game master.
    2. Create services - create game groups.
    3. View customer statistics - see what groups a player is in.
    4. Reply to reviews - comment to ratings.
3. SysAdmin (Admin):
    1. Manage user access - ban Players and Game Masters.
    2. Moderate services - remove game groups.
    3. Moderate reviews - use ratings to push good Game Masters.
    4. View usage statistics - view the list of Players and Game Masters.

## How to Run
- Get the project
- clone
    ```
    git clone https://github.com/Legobman/su25-team10.git
    ```
- OR download zip.
- Open the project in VS Code.
- This project is built to run with jdk 21.
- [Dependencies](https://github.com/Legobman/su25-team10/blob/88bb712899067431aad32d380f6bc84ab1197c8b/backend-api/pom.xml#32) to JPA, Postgres, and Freemarker, in addition to the usual. JPA handles the persistence, Postgres is the database to be used, FreeMarker generates HTML templates.
- [`/src/main/resources/application.properties`](https://github.com/Legobman/su25-team10/blob/88bb712899067431aad32d380f6bc84ab1197c8b/backend-api/src/main/resources/application.properties) file  is the configuration for the app.
- You MUST have the database up and running before running the project!
    - Login to your neon.tech account.
    - Locate your database project.
    - On the project dashboard, click on "Connect" and select Java.
    - Copy the connection string provided.
    - Paste it as a value for the property `spring.datasource.url`. No quotation marks.
- Build and run the main class. You should see a new table created in the Neon database.