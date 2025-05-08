# Bank Account

This is a simple Java project developed in VScode with the goal of practicing object-oriented concepts such as inheritance, abstraction, and package organization.

## Project Structure

src/
── interfaces/
  ── Entity.java
  ── CorporateEntity.java
    ── Individual.java
── services/
    ── EntityService.java
── BankAccount.java

## Features

- Create a corporate entity (CNPJ)
- Create an individual entity (CPF)
- Display information on the console
- Organized into packages: `interfaces` for entities and `services` for logic

## Technologies

- Java (JDK 17+ recommended)
- VScode (with Java extensions)
- Terminal (or prompt) for compilation and execution

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/igovargas/Bank-Account.git
cd Bank-Account
```

2. Complie the files:
 
```bash
javac -d bin src/**/*.java
```

3. Run the program:

```bash
java -cp bin BankAccount
```

## .gitignore

The project uses .gitignore to prevent versioning of the build folder (/bin) and .class files.

## Objective

This project is being developed for educational purposes, as part of practical progress in object-oriented Java programming.
