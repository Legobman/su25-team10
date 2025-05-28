# Software Requirements Specification
## For DnD Group Finder

Version 0.1  
Prepared by Matthew Berwick & Arodi Kapuadi  
Group 10  
May 24, 2025

Table of Contents
=================
* [Revision History](#revision-history)
* 1 [Introduction](#1-introduction)
  * 1.1 [Document Purpose](#11-document-purpose)
  * 1.2 [Product Scope](#12-product-scope)
  * 1.3 [Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
  * 1.4 [References](#14-references)
  * 1.5 [Document Overview](#15-document-overview)
* 2 [Product Overview](#2-product-overview)
  * 2.1 [Product Functions](#21-product-functions)
  * 2.2 [Product Constraints](#22-product-constraints)
  * 2.3 [User Characteristics](#23-user-characteristics)
  * 2.4 [Assumptions and Dependencies](#24-assumptions-and-dependencies)
* 3 [Requirements](#3-requirements)
  * 3.1 [Functional Requirements](#31-functional-requirements)
    * 3.1.1 [User Interfaces](#311-user-interfaces)
    * 3.1.2 [Hardware Interfaces](#312-hardware-interfaces)
    * 3.1.3 [Software Interfaces](#313-software-interfaces)
  * 3.2 [Non-Functional Requirements](#32-non-functional-requirements)
    * 3.2.1 [Performance](#321-performance)
    * 3.2.2 [Security](#322-security)
    * 3.2.3 [Reliability](#323-reliability)
    * 3.2.4 [Availability](#324-availability)
    * 3.2.5 [Compliance](#325-compliance)
    * 3.2.6 [Cost](#326-cost)
    * 3.2.7 [Deadline](#327-deadline)

## Revision History
| Name | Date    | Reason For Changes  | Version   |
| ---- | ------- | ------------------- | --------- |
| Matt | 5/24    | Initial SRS         | 1.0       |
| Matt | 5/25    | Finished Section 3  | 1.1       |
|   Arodi   |    5/26     |         Section 1 in progress            |     1.2      |
|   Arodi   |    5/26     |         Section 2 in progress            |     1.3      |
|   Arodi   |    5/27     |         Finished Section 1&2             |     1.4      |

## 1. Introduction

### 1.1 Document Purpose
The purpose of this Software Requirements Document is to describe a player's view and a game master's view requirements for the D&D Group Finder application.
Player-Centered requirements describe the application from the player's view. These requirements include a description of different activities and levels of access based on user. 
Game master-centered requirements describe the application from the game master's view. These requirements include description of different responsibilities and levels of access specific to managing campaigns, creating events, moderating players, and setting game preferences. They outline the tools and controls needed to effectively organize and oversee gameplay sessions within the D&D Group Finder application.

### 1.2 Product Scope
The product specified in this Software Requirements Specification (SRS) is the D&D Group Finder, Version 1.0. This application is designed to aid Game Masters (GMs) and players within the Dungeons and Dragons (D&D) community. The system provides a simple online board game where Game Masters can post available campaigns, and Players can browse and join these games based on their interests and availablity. 

The main  objective of the D&D Group finder is to streamline the process of finding and organizing D&D games, reducing the effort and time that is typically require to coordinate sessions. This software aims to build a more connected and accessible commutiy for D&D lovers.

Key goals:
- Giving Players a user friendly way to search for and join matches.
- Providing GMs the toolbox to manage and advertise game sessions.
- Simplifying the match making process between GMs and Players.

### 1.3 Definitions, Acronyms and Abbreviations                                                                                           
Java - A programming language originally developed by James Gosling at Sun Microsystems. We will be using this language to build Class Connect.

Postgresql - Open-source relational database management system.

SpringBoot - An open-source Java-based framework used to create a micro Service. This will be used to create and run our application.

Spring MVC - Model-View-Controller. This is the architectural pattern that will be used to implement our system.

Spring Web - Will be used to build our web application by using Spring MVC. This is one of the dependencies of our system.

API - Application Programming Interface. This will be used to interface the backend and the fronted of our application.

HTML - Hypertext Markup Language. This is the code that will be used to structure and design the web application and its content.

CSS - Cascading Style Sheets. Will be used to add styles and appearance to the web app.

JavaScript - An object-oriented computer programming language commonly used to create interactive effects within web browsers.Will be used in conjuction with HTML and CSS to make the web app.

VS Code - An integrated development environment (IDE) for Java. This is where our system will be created. 

### 1.4 References
https://docs.spring.io

### 1.5 Document Overview
This document outlines the software requirements for the D&D Group Finder application.

Section 2 provides a general overview of the product, including its purpose, functions, constraints, user characteristics, and assumptions.

Section 3 contains detailed functional and non-functional requirements that define how the system will behave. 

## 2. Product Overview
The D&D Group Finder is a web-based application designed to connect Dungeons and Dragons Game Masters with interested players. The product aims to simplify the process of finding, joining, and managing D&D games through ha centralized platform. By providing a user-friendly interface and features tailored to both GMs and Players, the application supports the growing need for virtual and local tabletop game.

The system is intended to address common issues in the D&D community, such as difficutly finding consistent groups, organizing session times, and matching players with similar play styles or preferences. GMs can create posts with game details, while Players can search, filter, and join games based on availability and interests. 

### 2.1 Product Functions
The D&D Group Finder application will support the following major functions:

User Registration:
 - Allow users to sign up and log in securely as either a Game Master or Player.

Game Posting and Management (Game Master):
 - Enable Game Masters to create, edit, and delete game listings.
 - Include fields such as campaign name, schedule, player requirements, and session format (online/in-person).

Game Browsing and Joining (Player):
 - Allow Players to browse available games.
 - Provide filtering by category, schedule, game type, and location.
 - Enable players to joing a game or express interest.

User profiles:
 - Allow both Players and GMs to edit their profiles, including experience level, preferences, and availability.

Messaging or Contact System:
 - Provides a way for Players and GMs to communicate after a match is made.

Administrative Tools:
 - Provibe basic tools to manage inappropiate content, remove inaactive games, and moderate user behavior.

### 2.2 Product Constraints

User Interface Constraints:
 - The application will be accessed via a web browser; therefore it must be responsive and compatible with major browsers (Chrome, Firefox, Edge).
 - The frontend will be made using HTML, CSS, and JavaScript.

Application and Database Interface:
 - Backend Services will be implemented using Java and Spring Boot.

Quality of Service Constraints:
 - The system should respond to user actions within 2 seconds.
 - The system should handle at least 100 concurrent users without performance degradation.

Standards Complience:
 - Code should follow standard Java coding conventions and web accessibility best practices.
 - Security best practices must be followed.


  
### 2.3 User Characteristics
The D&D Group Finder will be used by two primary user classes: Game Masters (GMs) and Players. Each group interacts with the application in different ways, based on their roles, and priviledges, and needs.

1. Game Master (GMs)
   -  Role: Organize and host D&D campaigns.
   -  Frequency of Use: Moderate to frequent.
   -  Key Functions used: Game creation, editing, player management, and communication tools.
   -  Technical Expertise: Basic computer and web skills.
   -  Priviledges: Standard user access, primarily focused on searching and joining games.
   -  Importance: High - they form the community that engages with the listings.
   
2. Players
   - Role: Search for and join D&D campaigns.
   - Frequency of Use: Frequent (especially during game-finding periods).
   - Key Functions used: Account creation, game browsing, joining requests, profile setup.
   - Technical Expertise: Basic computer and web usage skills.
   - Privilages: Standard user access, primarily focused on searching and joining games.
   - Importance: High - they form the community that engages with the listings. 

### 2.4 Assumptions and Dependencies
- Users will have access to a stable internet connection and a modern web browser.
- The application will be hosted on a server or cloud platform that supports Java.
- All  third party libraries (e.g., Spring Booth, and basic frontend technologies.
- The development tema is familiar with Java, Spring Boot, and basic frontend Technologies.
- Future scalability depends on the availability of server resources and proper deployment setup.

If any of these assumptions change, it may imapct development time, design decisions, or funtionality.

## 3. Requirements

### 3.1 Functional Requirements 
- FR0: The system will allow users to create accounts as either a player or a game master. 
  - The username for each account should be unique.
- FR1: Users will be able to modify their own profiles at any time.
- FR2: The system shall allow game masters to create a new game groups by providing details including description, location, time frame, and number of player slots.
- FR3: game masters will have be allowed to kick players from their game groups.
- FR4: game masters will be able to edit or delete their game groups.
- FR5: game masters will be able to view the game groups that specific players are in.
- FR6: game masters will be able to respond to their ratings.

#### 3.1.1 User interfaces
Web pages using HTML, CSS, and Java.

#### 3.1.2 Hardware interfaces
Devices that have web browser capabilities.

#### 3.1.3 Software interfaces
- Java jdk 21
- Neon PostgreSQL
- SpringBoot 3.5

### 3.2 Non Functional Requirements 

#### 3.2.1 Performance
- NFR0: A novice user will be able to add and manage game groups in less than 10 minutes.
- NFR1: An expert user will be able to add and manage game groups in less than 3 minutes.

#### 3.2.2 Security
- NFR2: The system will only allow users with an account into it, using usernames and passworeds.

#### 3.2.3 Reliability
- NFR3: Every webpage link will be functional, no 404 errors.

#### 3.2.4 Availability
- NFR4: The system will be online 24/7. Any needed updates or maintenance will be scheduled when the system is less busy then usual.

#### 3.2.5 Compliance
- NFR5: The game groups in the game group board will contain all information Players need to know.

#### 3.2.6 Cost
- NFR6: This product should cost zero dollars to produce. 

#### 3.2.7 Deadline
- NFR7: The final product will be delievered June 18th.
