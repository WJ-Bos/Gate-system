# Resident Entry Code System

Welcome to the **Resident Entry Code System**! This system allows residents to generate unique entry codes for users, which are then sent directly to the recipient's phone. These codes serve two primary functions: enabling entry and exit to a designated location. Built using **Spring Boot** and **Java**, this system streamlines access control by providing secure, easily-managed, and time-efficient entry and exit codes for authorized users.

## Features

- **Generate Entry Codes**: Residents can generate a unique entry code for a user.
- **SMS Notifications**: The entry code is sent via SMS to the recipient's phone number.
- **Dual Functionality**: Each code has two uses:
    - **Entry**: Grants access for a designated user.
    - **Exit**: Used to exit or leave the premises.
- **Secure Code Handling**: Ensures that codes are valid and not misused.
- **User Authentication**: Sign In and Sign Up functionality for residents to manage the system.

## Tech Stack

- **Backend**: Spring Boot
- **Programming Language**: Java
- **Database**: PostgreSQL 
- **SMS API**: Text Local Api
- **Password Encryption**: bcrypt for secure password storage

## Installation

To get this project up and running locally:

### 1. Clone the repository:

```bash
git clone https://github.com/WJ-Bos/Gate-system.git
```