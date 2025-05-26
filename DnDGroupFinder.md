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

### 1.4 References
List any other documents or Web addresses to which this SRS refers. These may include user interface style guides, contracts, standards, system requirements specifications, use case documents, or a vision and scope document. Provide enough information so that the reader could access a copy of each reference, including title, author, version number, date, and source or location.

### 1.5 Document Overview
Describe what the rest of the document contains and how it is organized.

## 2. Product Overview
This section should describe the general factors that affect the product and its requirements. This section does not state specific requirements. Instead, it provides a background for those requirements, which are defined in detail in Section 3, and makes them easier to understand.

### 2.1 Product Functions
Summarize the major functions the product must perform or must let the user perform. Details will be provided in Section 3, so only a high level summary (such as a bullet list) is needed here. Organize the functions to make them understandable to any reader of the SRS. A picture of the major groups of related requirements and how they relate, such as a top level data flow diagram or object class diagram, is often effective.

### 2.2 Product Constraints
This subsection should provide a general description of any other items that will limit the developer’s options. These may include:  

* Interfaces to users, other applications or hardware.  
* Quality of service constraints.  
* Standards compliance.  
* Constraints around design or implementation.
  
### 2.3 User Characteristics
Identify the various user classes that you anticipate will use this product. User classes may be differentiated based on frequency of use, subset of product functions used, technical expertise, security or privilege levels, educational level, or experience. Describe the pertinent characteristics of each user class. Certain requirements may pertain only to certain user classes. Distinguish the most important user classes for this product from those who are less important to satisfy.

### 2.4 Assumptions and Dependencies
List any assumed factors (as opposed to known facts) that could affect the requirements stated in the SRS. These could include third-party or commercial components that you plan to use, issues around the development or operating environment, or constraints. The project could be affected if these assumptions are incorrect, are not shared, or change. Also identify any dependencies the project has on external factors, such as software components that you intend to reuse from another project, unless they are already documented elsewhere (for example, in the vision and scope document or the project plan).

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
