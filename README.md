<h1 align="center">
  SLOT
 </h1>

![Slot](https://user-images.githubusercontent.com/6312342/170311333-cc499e49-d6ae-441f-8fc9-b997a683968c.png)

# Table of contents
- [Overview](#overview)
- [What does the program use?](#what-does-the-program-use)
- [Get Started](#get-started)
- [How to play?](#how-to-play)
- [How could I win?](#how-could-i-win)
- [Results](#results)
- [Contributing](#contributing)

# Overview
The project consists of the development of an application where the user can experience a casino together with the intensity of emotions that this entails.
Being the final project of this subject, the use of knowledge acquired in the last months. 

When logging in, the program indicates if the username and password entered match the data stored in the database. If the data is correct, the program gives access to the main menu of the game, displaying a welcome message with the relevant data of the account, such as the balance and available credits. The user could play, add money, make credit-money conversion, see list of prizes or simply close the active session. If the access data is not correct, the user could try again.

When playing the game, the user can choose between pulling the lever or exiting the game. If you choose pull the lever, you will be asked how much you want to bet, because the prize, if you win it, will be based on the initial bet. The bet will be deducted from your balance immediately and the game will start.

The prize will depend on the random result of the reels when they finish rolling and, if it is the case, the prize is added to the user's account. If the user does not win nothing, the program will continue asking if you want to bet more or if you want to quit.

# What does the program use?

<h3 align="center">Object Oriented Programming on Java</h3>

- Inherence
- Polymorphism
- Abstraction
- Constructors
- Try-Catch
- Design Pattern (Prototype)
- Interfaces
- Try-catch
- Access methods
- Package
- Files

# Get started

<h3>Clone the respository</h3>

Using git
```git
git clone git@github.com:EdwinSanFI/Project-Slot.git
```

<h3> Compile and Run the project </h3>

* To compile the project
```java
javac Slot/Slot.java
```
* To run the project
```java
java Slot.Slot
```

[Play](#how-to-play) and Enjoy the project! :D


# How to play?

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174519390-8265d103-6ca9-4e9b-b79d-1187ce29761f.png" alt="First menu" width="400px">
</p>

<ul>
  <ol>The first step is to enter the game with your account (username and password), If you don't have an account you can [Create](#how-to-create-an-account) one.</ol>
  <p align="center">
    <img src="https://user-images.githubusercontent.com/6312342/174520439-611c1569-53ac-4fd7-b427-f6cef2d9bf70.png" alt="Second menu" width="250px">
  </p>
  <ol>The program will display a welcome message showing the amount of dollars and credit you have.</ol>
  <ol>If you have enough money, you can play by entering option #1, otherwise you will have to deposit money into your account and a second menu with the new options available.</ol>
  <p align="center">
    <img src="https://user-images.githubusercontent.com/6312342/174520439-611c1569-53ac-4fd7-b427-f6cef2d9bf70.png" alt="Play" width="250px">
  </p>
  <p align="center">
    <img src="https://user-images.githubusercontent.com/6312342/174520841-83cc033a-189c-4ef6-a93e-01a83e4ba51a.png" alt="Play" width="250px">
  </p>
</ul>

# How to create an account?

* You must enter option 1 in the console. 
* The program will ask you for the username and password twice, once to save it and once to confirm the password.
* You should see a message that the account was created successfully, if this is not the case, you entered the passwords wrong and you must re-enter the passwords

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174520136-672c0183-0454-408b-9a54-045a2c0d1772.png" alt="Combinations" width="250px">
</p>

The minimum balance to enter the account is 20 dollars and the maximum is 1,000,000 dollars.

Only accept bets of 5, 7, 10, 20, 50 dollars

# How could I win?
The ways to win is by having the items in the next 5 prize lines.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/173405073-cb46149c-2b38-4371-9989-2af5f15b8af6.png" alt="Awards" height="300px" style="cursor: none">
</p>

But there is the possibility that prize lines are mixed and thus have a higher reward, for example:
- Get the first line with 4 items and the last line with 3 objects
- Get the V line with 3 items and /\ line with 4 objects
- Get the V line with 4 items and the last line with 4 objects
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/173405252-50dd5e99-2ca4-4743-bc56-7aa0b15119e7.png" alt="Combinations" width="800px">
</p>

# Prize Table

This is the prize table when you bet 5 dollars. The higher your bet, the higher your prize.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174515288-9874a248-5b9c-4fac-af6d-97723256ca43.png" alt="Betting Table" height="500px">
</p>

# Probability

Probability to get a item.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174515340-31c9ac34-df0a-47da-bf13-397932a566d5.png" alt="Probability to get an object" height="500px">
</p>

# Results

<ul>
  <li> When you get 3 items on one line, they are painted on color red</li>
  <li>When you get 4 items on one line, they are painted on color yellow</li>
  <li>When you get 5 items on one line, they are painted on color blue</li>
  <li>When you get 3+ items on the line /\, they are painted on color purple</li>
  <li>When you get 3+ items on the line V, they are painted on color green</li>
</ul>
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174515450-908dfedb-010b-4bd4-bdc4-c8c79db41046.png" alt="Betting Table" height="500px">
</p>

To know what the prize is according to the bet, we use a rule of 3:
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174504124-a2497869-316d-4478-9200-ffbd009a389e.png" alt="Rule of three" height="500px">
</p>

* Example 1:
  * When you have 3 watermelons, you could get 160 credits when your bet 5 dollars.
* Example 2:
  * When you have 3 watermelons, you could get 160 credits but if your bet was of 50 dollars you will get 1,600 credits.
* Example 3:
  * When you have 3 watermelons, you could get 160 credits but if your bet was of 15 dollars you will get 7,500 credits.
* Example 4:
  * When you have 4 diamonds and 5 cherrys, you could get 6,500 credits but if your bet was of 30 dollars you will get 39,000 credits.

You can check the list of awards [here](#prize-table)

# Contributing
Contributions are very welcome!
