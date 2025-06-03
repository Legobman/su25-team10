# D&D Group Finder - Software Design 

Version 1  
Prepared by Matthew Berwick & Arodi Kapuadi\
D&D Group Finder\
June 1, 2025

Table of Contents
=================
* [Revision History](#revision-history)
* 1 [Product Overview](#1-product-overview)
* 2 [Use Cases](#2-use-cases)
  * 2.1 [Use Case Model](#21-use-case-model)
  * 2.2 [Use Case Descriptions](#22-use-case-descriptions)
    * 2.2.1 [Actor: Teacher](#221-actor-game-master)
    * 2.2.2 [Actor: Student](#222-actor-player) 
* 3 [UML Class Diagram](#3-uml-class-diagram)
* 4 [Database Schema](#4-database-schema)

## Revision History
| Name | Date    | Reason For Changes  | Version   |
| ---- | ------- | ------------------- | --------- |
|  Al  | 5/27    | Initial Design      |    1      |
| Matt | 6/1     | Provder use-cases   | 1.1       |
| Arodi| 6/3     | Player Use cases    |   1.2     |

## 1. Product Overview
The D&D Group Finder is a web-based application designed to connect Dungeons and Dragons Game Masters with interested players. The product aims to simplify the process of finding, joining, and managing D&D games through ha centralized platform. By providing a user-friendly interface and features tailored to both GMs and Players, the application supports the growing need for virtual and local tabletop game.

## 2. Use Cases
### 2.1 Use Case Model
![Use Case Model](https://github.com/Legobman/su25-team10/blob/main/object-oriented-design/use-case-model.jpg)

### 2.2 Use Case Descriptions

#### 2.2.1 Actor: Game Master
##### 2.2.1.1 Sign Up
A Game master can sign up to create their profile with their name, email, password. Emails must be unique.
##### 2.2.1.2 Log In
A Game master shall be able to sign in using their registred email and password. After logging in, the Game master shall be directed their homepage where they see an overview of their game groups and reviews.
##### 2.2.1.3 Update Profile
A Game master shall be to modify their profile by going to their profile page. They can change their email and password.
##### 2.2.1.4 Create Game Group
A Game master shall be able to create a new game group. They would provide the location, day of the week, start/end times, number of player slots, and description. The game group will be created to be associated with only this game master.
##### 2.2.1.5 Edit Game Group
A Game master shall be able to reenter the information about the game group in order to change any details that are different.
##### 2.2.1.6 Delete Game Group
A Game master shall be able to delete one of their game groups, this should also delete any attached player membership ojects that are attached to the game group.
##### 2.2.1.7 Respond to Reviews
A Game master shall be able to see and react to the reviews about them left by players.

#### 2.2.2 Actor: Player
##### 2.2.2.1 Sign Up
A player can sign up to create their profile with their name, email, password, and bio. Emails must be unique.
##### 2.2.2.2 Log In
A gamemaster shall be able to assign in using their registred email and password. After logging in, the player shall be directed their homepage where they see an overview of their games and groups.
##### 2.2.2.3 Browse Gamegroups
A player shall be able to view available gamegroups. They can do this from the home page or using a search function. They can also filter gamegroups by discription, location. They will also be able to select one gamegroup and view more details.
##### 2.2.1.4 Join Up for Game Groups
Upon selecting a gamegroup, a player shall be able to join up for the gamegroup usin a one-click action. This gamegroup will then appear on their dashboard, and they will be able to play in the game group.
##### 2.2.1.5 Leave Gamegroup
A player may drop/leave a gamegroup from the page.
###### 2.2.1.6 Update Profile
A player will be able to update theri profile by going to their profile page. They can change email and password.
###### 2.2.1.7 Leave a Review
A player will be able to leave a  review about their experience. 

## 3. UML Class Diagram
![UML Class Diagram](https://github.com/Legobman/su25-team10/blob/main/object-oriented-design/class-diagram.png)
## 4. Database Schema
![UML Class Diagram](https://github.com/Legobman/su25-team10/blob/main/object-oriented-design/database-schema.png)
