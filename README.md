# Java Sequence Guesser

This Java application helps you identify integer sequences using The On-Line Encyclopedia of Integer Sequences® (OEIS®). You provide five numbers, and the program fetches information from OEIS to guess the corresponding sequence.

## Prerequisites

- Java Development Kit (JDK) installed
- Internet connection for accessing OEIS

## How to Use

1. Compile the Java file:

   ```bash
   javac App.java
   ```

2. Run the compiled program:

   ```bash
   java App
   ```

3. Enter five integers when prompted.

4. The program will connect to OEIS, retrieve information, and display the guessed sequence along with a title.

## Code Overview

The program uses the [Jsoup](https://jsoup.org/) library for web scraping to fetch information from the OEIS website.
