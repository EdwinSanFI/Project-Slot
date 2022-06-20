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
  <img src="https://user-images.githubusercontent.com/6312342/174519390-8265d103-6ca9-4e9b-b79d-1187ce29761f.png" alt="First menu">
</p>


1. The first step is to enter the game with your account (username and password), If you don't have an account you can [Create](#how-to-create-an-account) one.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174520439-611c1569-53ac-4fd7-b427-f6cef2d9bf70.png" alt="Logged succesful">
</p>

2. The program will display a welcome message showing the amount of dollars and credit you have.
  
3. If you have enough money, you can play by entering option #1, otherwise you will have to [deposit money](#how-to-deposit-money) into your account and a second menu with the new options available.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174521953-8802538f-40fb-4903-8ce4-6fc1c6fd8167.png" alt="Second menu">
</p>

4. After choosing option 1, the program will ask you if you want to enter the letter P to pull the lever or E to exit the play option.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174522534-7b1cde9d-cac9-4e88-a7af-8a3807fa6983.png" alt="Play menu">
</p>

5. When you enter the letter **P**, it will ask you to enter the bet (only accepts bets of 5, 7, 10, 15, 20, 30, 50 or 100 dollars) and after enter the bet, the result of the roulette will be printed. 

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174522695-6f560377-2e73-42eb-b0e4-74cc6c68647b.png" alt="Roulette">
</p>

  You can review [here](#how-could-i-win) the ways you can win.
  
  You can review [here](#prize-table) the explanation of the results.
  
  You can review [here](#winning-examples) some examples when you win.

  You can review [here](#prize-table) the prize table.

6. The program will repeat the previous menu until the money runs out or you decide to leave (by entering the letter **E**).

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174524762-36908b1e-8da6-49fb-84ed-e696670561c1.png" alt="Roulette">
</p>


7. After leave, the second menu will appear. In the menu:

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174662437-ead73b02-7db6-4cf3-97b5-914acfb77478.png" alt="Roulette">
</p>

* If you choose option 2 you can modify the account to:
  * [Deposit Dollars](#how-to-deposit-money)
  * Change [dollars to credits](#change-dollars-to-credits)
  * Change [credits to dollars](#change-credits-to-dollars)
  * [Withdraw dollars](#how-to-withdraw-dollars)
  * Save and exit

* If you choose option 3 you can check the [prize table](#prize-table)
* If you choose option 4, the program will finish.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174681646-b7ef92b5-d74e-456c-815c-e10e7eb2d2c7.png" alt="Roulette">
</p>


## How to create an account?

* You must enter option 1 in the console. 
* The program will ask you for the username and password twice, once to save it and once to confirm the password.
* You should see a message that the account was created successfully, if this is not the case, you entered the passwords wrong and you must re-enter the passwords

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174520136-672c0183-0454-408b-9a54-045a2c0d1772.png" alt="Combinations">
</p>

* Then, you need to log in to your account. As the account is new you do not have money available, therefore you must [deposit money](#how-to-deposit-money).

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174658901-2909d120-7273-46db-8f0d-a697ddc227c5.png" alt="Combinations">
</p>

## How to deposit money? 

* Choose the option 2- **Modify Account**
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174659287-7e17d94c-1da6-4051-9905-a81ffeee7a05.png" alt="Combinations">
</p>

* Choose the option 1- **Deposit dollars**
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174660384-3ff6ce80-1a0d-4e0d-b3b2-0e440c8d0f68.png" alt="Combinations">
</p>

* Enter the amount, the minimum balance to enter the account is 20 dollars and the maximum is 1,000,000 dollars.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174660530-7e560fe9-51d1-4e3a-981c-3b631ff486c5.png" alt="Combinations">
</p>

* If you enter an amount outside the range, it will display an error message.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174660665-b4a7ba41-9b5c-4f64-a685-83dafae232e9.png" alt="Combinations">
</p> 

## Change dollars to credits

* The program will print the amount of dollars available to convert to credits. With this, you can decide the quantity.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174682299-ce64113e-b105-45b2-b4da-788724b801e2.png" alt="Combinations">
</p> 

* But if you decide to exchange more dollars than you have available, the program will print an error message.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174682300-5218fff4-761f-4781-87b4-e63d436c12e7.png" alt="Combinations">
</p> 

## Change credits to dollars

* The program will print the amount of credits available to convert to dollars. With this, you can decide the quantity.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174682294-5cba59de-7b58-4376-933b-9ee4b96e9d8c.png" alt="Combinations">
</p>

* But if you decide to exchange more credits than you have available, the program will print an error message.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174682296-95a6368f-4e08-4cec-b3ce-33b8d9ebd3c2.png" alt="Combinations">
</p>

## Withdraw dollars

* The program will print the amount of dollars available to withdraw. With this, you can decide the quantity.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174682282-e2c46b86-0ed0-45d1-ab00-23edca683fe7.png" alt="Combinations">
</p>

* But if you decide to withdraw more dollars than you have available, the program will print an error message.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174682285-d21c374c-7c41-4013-b2a0-6395bb36072d.png" alt="Combinations">
</p>

## Winning examples
<div align="center">
  
  ### Example 1
  <img src="https://user-images.githubusercontent.com/6312342/174523686-fc4429e4-723b-45be-a249-27e236da8df8.png" alt="Example 1 winning">
  
  
  ### Example 2
  <img src="https://user-images.githubusercontent.com/6312342/174524259-b1615947-b36f-421b-a19f-4ad90afd5b0f.png" alt="Example 2 winning">
  
  
  ### Example 3
  <img src="https://user-images.githubusercontent.com/6312342/174523697-889bdb08-a3a4-47b3-9a89-583249afa144.png" alt="Example 3 winning">
  
  
  ### Example 4
  <img src="https://user-images.githubusercontent.com/6312342/174523698-2eef0f42-09ae-4de0-8fa5-dc68994b5af7.png" alt="Example 4 winning">
  
  
  ### Example 5
  <img src="https://user-images.githubusercontent.com/6312342/174524257-87f3c0cb-ff80-4285-81cb-347e74c6c90a.png" alt="Example 5 winning">
  
  
  ### Example 6
  <img src="https://user-images.githubusercontent.com/6312342/174523702-b31b8a58-32f7-4f75-8ced-8afcb924cee6.png" alt="Example 6 winning">
  
  
  ### Example 7
  <img src="https://user-images.githubusercontent.com/6312342/174523703-6bd4f8f0-37b2-43cd-8454-b2bfb9b11d5e.png" alt="Example 7 winning">
</div>

## How could I win?
The ways to win is by having the items in the next 5 prize lines.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/173405073-cb46149c-2b38-4371-9989-2af5f15b8af6.png" alt="Prizes" height="300px">
</p>

But there is the possibility that prize lines are mixed and thus have a higher reward, for example:
- Get the first line with 4 items and the last line with 3 objects
- Get the V line with 3 items and /\ line with 4 objects
- Get the V line with 4 items and the last line with 4 objects
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/173405252-50dd5e99-2ca4-4743-bc56-7aa0b15119e7.png" alt="Combinations" width="800px">
</p>

## Prize Table

This is the prize table when you bet 5 dollars. The higher your bet, the higher your prize.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174515288-9874a248-5b9c-4fac-af6d-97723256ca43.png" alt="Prize list" height="500px">
</p>

In addition, within the program you can review the prize list.

1. After entering your account, you must choose option 3- **Check prize list**

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174661416-87fbe448-bef7-4fe8-ac37-b3796d963395.png" alt="Prize List in the program">
</p>

2. The prize list will be printed.

<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174661637-1280c151-44ff-405b-8952-9f8046bc1fb7.png" alt="Prize List in the program">
</p>

## Probability

Probability to get a item.
<p align="center">
  <img src="https://user-images.githubusercontent.com/6312342/174515340-31c9ac34-df0a-47da-bf13-397932a566d5.png" alt="Probability to get an object" height="500px">
</p>

## Results

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

## Contributing
Contributions are very welcome!
