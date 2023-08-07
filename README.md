# design-patterns-java

## Overview

A simple console application that manages a set of data utilising multiple design patterns. Originally written in C# as a college assignment. I decided to remake it as a way to practise coding in Java.

## Utilized design patterns

### Adapter

Application stores information about animals, employees and rooms at the animal shelter. Data can be stored in two different formats. There is an adapter that allows to access the secondary format with primary format's interface. 

### Iterator

Data can be stored in three different types of collections - doubly linked list, vector (similar to C++'s std::vector) and binary tree. Forward and reverse iterators can be used with all three types of collections.

### Command

User can issue requests via console (add/remove/modify data, list specific employees/ animals/ rooms). Within the program the requests are represented as command objects, which allows for displaying dialogue, cancelling operations and handling incorrect commands.

### Abstract Factory

When add request is issued the user can specify the format in which data will be stored. Then abstract factories are used to create objects in the specified format.

## Installation

Java Development Kit is required to run the application. After cloning the repository all Java classes can be found in the src/ folder. The project can be opened in Visual Studio Code and the program can be launched by running App.java. 