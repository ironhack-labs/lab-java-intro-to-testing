![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Intro to testing

## Introduction

We have just learned how to importance of good test coverage and the role of TDD (Test Driven Development) so let's practice a bit more.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

1. Employing TDD, create a method that takes in an integer _n_ and returns an array of all odd integers from 1 to _n_.
   - _Write your tests first!_
2. Java has certain words that are considered "Java Keywords". Keywords are reserved and cannot be used as variable names. Employing TDD, create a method that takes in a String and returns `true` if the String contains any Java Keywords.

   - For example, `break` is a Java keyword. The String `"Don't break my heart"` should return *true*. The String `"I love to breakdance"` should return *false*.
   - _You will need to use Google to find a list of all Java Keywords_.
3. Create an abstract class named `Player` to represent a player in a video game. Define the following properties: health, strength and lives.
   - Create getters and setters for each property.
   - Add a constructor method to initialize the properties with the passed values.
   - Add a method `decrementLive()` that decrements the lives by 1 and restores the health to its original value. If lives are less than or equal to 0, print "This character is dead".
   - Add a method `attack(Player playerToAttack)` that decrements the health of the player passed as an argument by the strength of the current player.
   - Add a method `checkHealth()` that checks if the current player's health is less than or equal to 0, if yes, calls `decrementLive()` method.
4. Create three subclasses of Player - `Warrior`, `Elf` and `Wizard`.
   - `Warrior` class should have an additional property force and a method `convertToElf()` that returns an instance of Elf class with the properties of the current warrior.
   - `Elf` class should have an additional property `speed`.
   - `Wizard` class should have an additional property `spell` and a method `convertToElf()` that returns an instance of Elf class with the properties of the current wizard.
5. Add all the needed tests.

<br>

## FAQs

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am stuck and don't know how to solve the problem or where to start. What should I do?</summary>

  <br>

  If you are stuck in your code and don't know how to solve the problem or where to start, you should take a step back and try to form a clear, straight forward question about the specific issue you are facing. The process you will go through while trying to define this question, will help you narrow down the problem and come up with potential solutions.

  For example, are you facing a problem because you don't understand the concept or are you receiving an error message that you don't know how to fix? It is usually helpful to try to state the problem as clearly as possible, including any error messages you are receiving. This can help you communicate the issue to others and potentially get help from classmates or online resources.

  Once you have a clear understanding of the problem, you should be able to start working toward the solution.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I create a Maven project in IntelliJ?</summary>

  <br>

  To create a Maven project in IntelliJ, you can follow these steps:

  1. Open IntelliJ IDEA and click the "Create New Project" button.
  2. In the "New Project" dialog, select "Maven" as the build system.
  3. Specify the name of the project.
  4. In the "Project Location" section, specify a location where you want to save your project.
  5. Select the "Create Git repository" checkbox in order to initialize the git repository upon creation of the project.
  6. Click the "Create" button to create the Maven project.

  <br>

  

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the purpose of "Arrays.copyOfRange()" in Java and how do we use it?</summary>

  <br> <!-- ✅ -->

  The `Arrays.copyOfRange()` method in Java is used to create a new array that is a copy of a specified range of an existing array. This method is part of the `java.util.Arrays` class and is used to copy elements from one array to another, starting from a specified starting index and ending at a specified ending index.

  Here is an example of how to use the `Arrays.copyOfRange()` method in Java:

  ```java
  import java.util.Arrays;

  public class Main {
      public static void main(String[] args) {
          int[] originalArray = {1, 2, 3, 4, 5};
          int[] copiedArray = Arrays.copyOfRange(originalArray, 1, 4);

          System.out.println("Original Array: " + Arrays.toString(originalArray));
          System.out.println("Copied Array: " + Arrays.toString(copiedArray));
      }
  }
  ```

  In this example, the `originalArray` is an array of integers and the `copyOfRange()` method is used to create a new array `copiedArray` that is a copy of the original array, starting from index 1 (inclusive) and ending at index 4 (exclusive). The output of the program will be:

  ```bash
  Original Array: [1, 2, 3, 4, 5]
  Copied Array: [2, 3, 4]
  ```

  The `copyOfRange()` method can be useful in cases where you want to create a new array based on a portion of an existing array, or to create a copy of an array for safety purposes. It is important to note that the `copyOfRange()` method only works with arrays and not with other types of collections.

  <br>

    

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the Red, Green, Refactor process in Java development and how can it be used?</summary>

  <br> <!-- ✅ -->

  The Red, Green, Refactor process is a technique used in Test-Driven Development (TDD) for writing software in Java. It involves the following steps:

  TDD can be used in Java by following these steps:

  1. Red: Write a test case for a specific functionality, without writing the actual code to implement that functionality.
  2. Green: Write the code that implements the functionality and make sure it passes the test case.
  3. Refactor: Improve the code, making it more efficient and readable, while still ensuring that it passes the test case.

  The Red, Green, Refactor process helps developers to write cleaner, more robust code by focusing on writing tests first and then writing the code that implements that functionality. This helps to catch errors early on in the development process, reducing the overall time and effort required to complete a project.

  Here is an example of the Red, Green, Refactor process in Java using JUnit:

  ```java
  import org.junit.Assert;
  import org.junit.Test;

  public class CalculatorTest {
      @Test
      public void testAddition() {
          Calculator calculator = new Calculator();
          int result = calculator.add(3, 4);
          Assert.assertEquals(7, result);
      }
  }
  ```

  In this example, a test case for the `add()` method of the `Calculator` class is written using JUnit. The test case calls the `add()` method with the parameters `3` and `4` and uses the `assertEquals()` method to check that the result is equal to `7`.

  To make the test pass, the code to implement the `add()` method can be written:

  ```java
  public class Calculator {
      public int add(int a, int b) {
          return a + b;
      }
  }
  ```

  With the implementation of the `add()` method, the test case should pass when run again. To improve the code, it can be refactored to make it more efficient and readable:

  ```java
  public class Calculator {
      public int add(int a, int b) {
          return a + b;
      }
  }
  ```

  This process can be repeated for each piece of functionality in the project, ensuring that the code meets the requirements and is free of errors. The Red, Green, Refactor process is an iterative process that helps to improve the quality of the code over time, making it more robust and easier to maintain.

  <br>

    

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is "Math.random()" in Java and how can it be used?</summary>

  <br> <!-- ✅ -->

  `Math.random()` is a method in the `java.lang.Math` class that returns a pseudorandom double value between 0.0 and 1.0. This method can be used to generate random numbers for various purposes, such as for simulations, games, or other applications that require randomness.

  Here's an example of how `Math.random()` can be used in a Java program:

  ```java
  public class Main {
    public static void main(String[] args) {
      double randomNumber = Math.random();
      System.out.println("Random number between 0.0 and 1.0: " + randomNumber);
    }
  }
  ```

  In this example, a random number between 0.0 and 1.0 is generated and printed to the console. To generate a random integer between two values, the random number can be scaled and rounded:

  ```java
  public class Main {
    public static void main(String[] args) {
      int min = 1;
      int max = 10;
      int randomInt = min + (int)(Math.random() * ((max - min) + 1));
      System.out.println("Random integer between " + min + " and " + max + ": " + randomInt);
    }
  }
  ```

  In this example, a random integer between 1 and 10 is generated and printed to the console. Note that `Math.random()` is a pseudorandom number generator and is not suitable for cryptographic purposes, as it is predictable if the seed is known. For cryptographic purposes, a secure random number generator should be used instead.

  <br>

    

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How can I test the standard output in JUnit for a Java program?</summary>

  <br> <!-- ✅ -->

  To test the standard output in JUnit for a Java program, you can use the `ByteArrayOutputStream` class and the `System.setOut()` method. The `ByteArrayOutputStream` class allows you to capture the standard output in a buffer, while the `System.setOut()` method redirects the standard output to the buffer.

  Here's an example of how you can test the standard output in JUnit:

  ```java
  import static org.junit.Assert.assertEquals;
  import java.io.ByteArrayOutputStream;
  import java.io.PrintStream;
  import org.junit.Before;
  import org.junit.Test;

  public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
      System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testStandardOutput() {
      Main.main(null);
      assertEquals("Hello World!", outContent.toString());
    }
  }
  ```

  In this example, the `ByteArrayOutputStream` class is used to capture the standard output and the `System.setOut()` method is used to redirect the standard output to the buffer. The `@Before` annotation is used to set up the original standard output stream. The `testStandardOutput()` method invokes the `Main.main()` method and then asserts that the standard output is equal to "Hello World!".

  <br>

    

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am unable to push changes to my repository. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are unable to push changes to your repository, here are a few steps that you can follow:

  1. Check your internet connection: Ensure that your internet connection is stable and working.
  1. Verify your repository URL: Make sure that you are using the correct repository URL to push your changes.
  2. Check Git credentials: Ensure that your Git credentials are up-to-date and correct. You can check your credentials using the following command:

  ```bash
  git config --list
  ```

  4. Update your local repository: Before pushing changes, make sure that your local repository is up-to-date with the remote repository. You can update your local repository using the following command:

  ```bash
  git fetch origin
  ```

  5. Check for conflicts: If there are any conflicts between your local repository and the remote repository, resolve them before pushing changes.
  6. Push changes: Once you have resolved any conflicts and updated your local repository, you can try pushing changes again using the following command:

  ```bash
  git push origin <branch_name>
  ```

</details>
