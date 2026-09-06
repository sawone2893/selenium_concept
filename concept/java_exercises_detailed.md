# Java Practice Exercises — Detailed Problem Statements

Each exercise includes a full problem statement, input/output format, example, and constraints/notes — like a mini coding-challenge spec.

---

## 1. Variables, Data Types & Operators

### 1.1 Temperature Converter
**Problem:** Write a program that converts a temperature from Celsius to Fahrenheit and Kelvin.
**Formula:** `F = C * 9/5 + 32`, `K = C + 273.15`
**Input:** A single `double` value representing degrees Celsius (e.g., `37.0`).
**Output:** Print both converted values, each rounded to 2 decimal places.
**Example:**
```
Input: 37.0
Output: Fahrenheit: 98.60, Kelvin: 310.15
```
**Constraints:** Handle negative temperatures correctly (e.g., below absolute zero should print a warning instead of a result).

### 1.2 Swap Without a Temporary Variable
**Problem:** Given two integer variables `a` and `b`, swap their values without declaring a third variable.
**Input:** Two integers, e.g., `a = 5, b = 10`.
**Output:** Print the values after swapping.
**Example:**
```
Before: a=5, b=10
After:  a=10, b=5
```
**Constraints:** Solve it two ways — using arithmetic (`+`/`-`) and using the XOR (`^`) bitwise operator. Note what happens if both approaches are attempted with very large numbers close to `Integer.MAX_VALUE` (overflow risk with arithmetic approach).

### 1.3 Type Casting Explorer
**Problem:** Declare a `double` value `9.999`. Cast it to `int`, `long`, and `float`, and print each result along with its data type.
**Output format:**
```
Original double: 9.999
As int: 9
As long: 9
As float: 9.999
```
**Task:** In a comment, explain *why* casting to `int`/`long` truncates rather than rounds, and what would happen if the double value were larger than `Integer.MAX_VALUE`.

### 1.4 Bitwise Operator Playground
**Problem:** Given two integers `a = 12` and `b = 25`, compute and print the results of: AND (`&`), OR (`|`), XOR (`^`), NOT (`~a`), left shift (`a << 2`), and right shift (`b >> 2`).
**Output:** Print each operation's binary representation alongside the decimal result, e.g. using `Integer.toBinaryString()`.
**Example:**
```
a & b = 8   (binary: 1000)
a | b = 29  (binary: 11101)
```
**Constraints:** Also test with one negative number and explain how `~` and `>>` behave with sign bits, and how `>>>` (unsigned right shift) differs.

### 1.5 BMI Calculator with Category
**Problem:** Write a program that calculates Body Mass Index and classifies it.
**Formula:** `BMI = weight(kg) / (height(m))²`
**Input:** `height` (double, meters) and `weight` (double, kg).
**Output:** The BMI rounded to 1 decimal place, and a category string:
- BMI < 18.5 → "Underweight"
- 18.5 ≤ BMI < 25 → "Normal"
- 25 ≤ BMI < 30 → "Overweight"
- BMI ≥ 30 → "Obese"

**Example:**
```
Input: height=1.75, weight=70
Output: BMI = 22.9, Category = Normal
```
**Constraints:** Validate that height and weight are positive; if not, print an error message instead of computing.

### 1.6 (Bonus) Integer Overflow Demonstration
**Problem:** Write a program that adds `1` to `Integer.MAX_VALUE` and prints the result. Then repeat with `Long.MAX_VALUE`.
**Task:** In comments, explain the two's-complement wraparound behavior and why Java does not throw an exception on overflow by default (contrast with `Math.addExact()`, which does).

---

## 2. Control Flow (if-else, switch, loops)

### 2.1 FizzBuzz
**Problem:** Print numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number. For multiples of 5, print "Buzz". For multiples of both 3 and 5, print "FizzBuzz".
**Example output (partial):**
```
1
2
Fizz
4
Buzz
...
FizzBuzz
```
**Constraints:** Solve using `if-else`, then again using the ternary operator or a switch expression, to compare readability.

### 2.2 Grade Calculator
**Problem:** Given a numeric score (0–100), determine the letter grade using these bands:
- 90–100 → A
- 80–89 → B
- 70–79 → C
- 60–69 → D
- Below 60 → F

**Input:** An integer score.
**Output:** The corresponding letter grade, or an error message if the score is outside 0–100.
**Example:**
```
Input: 85
Output: Grade: B
```
**Constraints:** Implement using a `switch` statement on `score / 10` (integer division), handling the 100 edge case correctly.

### 2.3 Prime Number Checker
**Problem:** Write a method `isPrime(int n)` that returns `true` if `n` is a prime number, `false` otherwise. Then use it to print all primes between 1 and 100.
**Input:** An integer `n ≥ 0`.
**Output:** `true`/`false` for the single check; a list of primes for the range task.
**Example:**
```
isPrime(17) → true
isPrime(18) → false
```
**Constraints:** Optimize the check to loop only up to `√n` instead of `n`, and explain why that's sufficient.

### 2.4 Star & Pyramid Patterns
**Problem:** Using nested loops, print the following two patterns for a given size `n = 5`:
**Pattern A (right triangle):**
```
*
**
***
****
*****
```
**Pattern B (pyramid, centered):**
```
    *
   ***
  *****
 *******
*********
```
**Input:** An integer `n` (number of rows).
**Constraints:** Pattern B requires calculating leading spaces (`n - row`) and stars (`2*row - 1`) per row — work out the formula before coding.

### 2.5 Number Guessing Game
**Problem:** The program generates a random number between 1 and 100 (inclusive). The user repeatedly guesses; after each guess, the program responds "Too high", "Too low", or "Correct!" and, once correct, reports how many attempts were used.
**Input:** A sequence of integer guesses (simulate via a loop reading from `Scanner`, or hardcode a list of guesses for testing).
**Output:** Feedback per guess, and a final summary.
**Example:**
```
Guess: 50 → Too high
Guess: 25 → Too low
Guess: 37 → Correct! You won in 3 tries.
```
**Constraints:** Limit to a maximum of 7 attempts; if exceeded, reveal the number and end the game.

### 2.6 (Bonus) Collatz Sequence
**Problem:** For a starting positive integer `n`, repeatedly apply: if `n` is even, `n = n/2`; if odd, `n = 3n + 1`. Stop when `n` reaches 1. Print the full sequence and the number of steps taken.
**Example:**
```
Input: 6
Sequence: 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
Steps: 8
```
**Constraints:** Test with `n = 27` (a famously long sequence, 111 steps) to verify your loop handles larger sequences correctly.

---

## 3. Arrays & Strings

### 3.1 Array Statistics
**Problem:** Given an array of integers, compute and print the minimum, maximum, sum, and average (as a double).
**Input:** `int[] arr = {4, 8, 15, 16, 23, 42}`
**Output:**
```
Min: 4, Max: 42, Sum: 108, Average: 18.00
```
**Constraints:** Handle an empty array gracefully (print a message rather than throwing an exception).

### 3.2 Reverse an Array In-Place
**Problem:** Reverse the elements of an integer array without creating a second array (swap in place using two pointers).
**Input:** `int[] arr = {1, 2, 3, 4, 5}`
**Output:** `{5, 4, 3, 2, 1}`
**Constraints:** Achieve O(n) time and O(1) extra space. Handle arrays of length 0 and 1 correctly.

### 3.3 Palindrome Checker
**Problem:** Write a method `isPalindrome(String s)` that returns `true` if `s` reads the same forwards and backwards, ignoring case, spaces, and punctuation.
**Input:** `"A man, a plan, a canal: Panama"`
**Output:** `true`
**Example:**
```
isPalindrome("racecar") → true
isPalindrome("hello") → false
```
**Constraints:** Do not use `StringBuilder.reverse()` — implement the comparison manually using two pointers for practice.

### 3.4 Word Frequency Counter
**Problem:** Given a sentence, count how many times each word appears (case-insensitive), and print the results sorted by frequency (descending).
**Input:** `"the quick brown fox jumps over the lazy dog the fox runs"`
**Output:**
```
the: 3
fox: 2
quick: 1
brown: 1
...
```
**Constraints:** Strip punctuation before counting. Use a `HashMap<String, Integer>` for counting and a sorted structure (e.g., a list of entries sorted by value) for output.

### 3.5 Two-Sum Problem
**Problem:** Given an array of integers `nums` and a target integer `target`, return the indices of the two numbers that add up to `target`. Assume exactly one solution exists, and you may not use the same element twice.
**Input:** `nums = {2, 7, 11, 15}, target = 9`
**Output:** `[0, 1]` (since `nums[0] + nums[1] == 9`)
**Constraints:** Solve first with a brute-force O(n²) nested loop, then optimize to O(n) using a `HashMap` to store seen values and their indices.

### 3.6 (Bonus) Matrix Transpose
**Problem:** Given an `m x n` 2D array, produce its transpose (an `n x m` array where `result[j][i] = original[i][j]`).
**Input:**
```
1 2 3
4 5 6
```
**Output:**
```
1 4
2 5
3 6
```
**Constraints:** Handle non-square matrices correctly (this is the common mistake — don't assume `m == n`).

### 3.7 (Bonus) Anagram Checker
**Problem:** Write a method `isAnagram(String a, String b)` that returns `true` if the two strings are anagrams of each other (same letters, same frequency, ignoring case and spaces).
**Example:**
```
isAnagram("listen", "silent") → true
isAnagram("hello", "world") → false
```
**Constraints:** Solve using character-frequency counting (an `int[26]` array works for lowercase letters) rather than sorting, for O(n) time.

---

## 4. Methods & Recursion

### 4.1 Factorial: Iterative vs Recursive
**Problem:** Implement `factorial(int n)` two ways: an iterative loop version and a recursive version. Both should return `n!` (n factorial).
**Input:** `n = 5`
**Output:** `120`
**Constraints:** Handle `n = 0` (factorial of 0 is 1) and negative input (throw `IllegalArgumentException`). Note the recursion's base case and stack depth limits for large `n` (try `n = 10000` recursively and observe what happens).

### 4.2 Fibonacci with Memoization
**Problem:** Write a recursive method to compute the `n`th Fibonacci number. First implement it naively, time it for `n = 40`, then optimize using memoization (a `HashMap` or array cache) and re-time it.
**Input:** `n = 10`
**Output:** `55` (0-indexed: 0,1,1,2,3,5,8,13,21,34,55)
**Constraints:** Document the time-complexity difference: naive is O(2^n), memoized is O(n).

### 4.3 Method Overloading Practice
**Problem:** Write an `add` method with the following overloads: `add(int, int)`, `add(double, double)`, `add(int, int, int)`, and `add(String, String)` (concatenation). Call each and print results.
**Constraints:** Demonstrate a case where ambiguous overload resolution could occur (e.g., passing a `long` when both `int` and `double` overloads exist) and explain how Java resolves it.

### 4.4 Variable Arguments (Varargs)
**Problem:** Write a method `sum(int... numbers)` that returns the sum of any number of integer arguments, including zero arguments.
**Input:** `sum(1, 2, 3, 4)` and `sum()`
**Output:** `10` and `0` respectively.
**Constraints:** Also write `printAll(String label, Object... items)` that prints a label followed by each item, demonstrating varargs combined with a regular parameter.

### 4.5 Recursive Binary Search
**Problem:** Given a **sorted** array and a target value, implement binary search recursively, returning the index of the target or `-1` if not found.
**Input:** `arr = {1, 3, 5, 7, 9, 11}, target = 7`
**Output:** `3`
**Constraints:** Track the number of recursive calls made and print it, to observe the O(log n) behavior. Test with a target not present in the array.

### 4.6 (Bonus) Tower of Hanoi
**Problem:** Solve the Tower of Hanoi puzzle for `n` disks: move all disks from rod A to rod C, using rod B as auxiliary, following the rules (only one disk moved at a time, never place a larger disk on a smaller one). Print each move.
**Input:** `n = 3`
**Output (partial):**
```
Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
...
```
**Constraints:** Also print the total number of moves and verify it equals `2^n - 1`.

---

## 5. OOP: Classes & Objects

### 5.1 Basic Class Design — Book
**Problem:** Design a `Book` class with private fields `title` (String), `author` (String), and `price` (double). Include a constructor that sets all three, getters and setters for each, and an overridden `toString()` that prints them nicely.
**Example usage:**
```java
Book b = new Book("1984", "George Orwell", 15.99);
System.out.println(b);
// Output: "1984" by George Orwell - $15.99
```
**Constraints:** The setter for `price` should reject negative values (throw `IllegalArgumentException`).

### 5.2 Static vs Instance Members — Object Counter
**Problem:** Create a `Counter` class with a `static int count` field that increments every time a new `Counter` object is instantiated. Add a static method `getCount()` returning the current total.
**Example:**
```java
new Counter(); new Counter(); new Counter();
Counter.getCount(); // returns 3
```
**Constraints:** Explain in a comment why `count` must be `static` rather than an instance field to achieve this behavior.

### 5.3 Encapsulation — Bank Account
**Problem:** Design a `BankAccount` class with a private `double balance`. Provide `deposit(double amount)` and `withdraw(double amount)` methods.
- `deposit` should reject negative or zero amounts.
- `withdraw` should reject amounts greater than the current balance, and negative/zero amounts.
Both should throw `IllegalArgumentException` with a descriptive message on invalid input.
**Example:**
```java
BankAccount acc = new BankAccount(100);
acc.deposit(50);   // balance: 150
acc.withdraw(200); // throws IllegalArgumentException: Insufficient funds
```
**Constraints:** There should be no public setter for `balance` — it should only change via `deposit`/`withdraw`.

### 5.4 Constructor Overloading & Chaining
**Problem:** Extend the `Book` class with three constructors: a no-arg constructor (defaults: "Unknown Title", "Unknown Author", 0.0), a two-arg constructor (title, author — price defaults to 0.0), and the full three-arg constructor. Use `this(...)` to chain them so logic isn't duplicated.
**Constraints:** Verify each constructor path produces a correctly initialized object by printing all three variants.

### 5.5 Composition — Car and Engine
**Problem:** Design an `Engine` class with fields `horsepower` (int) and `fuelType` (String), and a method `start()` that prints a message. Design a `Car` class that **has-a** `Engine` (composition, not inheritance) as a field, plus its own fields `make`/`model`. `Car` should have a `startCar()` method that delegates to `engine.start()`.
**Constraints:** Explain in a comment why composition ("has-a") is more appropriate here than inheritance ("is-a") — a Car is not a type of Engine.

### 5.6 (Bonus) equals() and hashCode() — Point Class
**Problem:** Create a `Point` class with `int x, y`. Override `equals()` so two points are equal if their x and y match, and override `hashCode()` consistently. Demonstrate correctness by adding several `Point` objects (including duplicates) to a `HashSet` and confirming duplicates are rejected.
**Constraints:** Follow the equals/hashCode contract: if `a.equals(b)` then `a.hashCode() == b.hashCode()` must hold. Use `Objects.equals()` and `Objects.hash()` to implement cleanly.

---

## 6. Inheritance & Polymorphism

### 6.1 Basic Inheritance — Animal Hierarchy
**Problem:** Create a base class `Animal` with a field `name` and a method `makeSound()` that prints a generic message. Create subclasses `Dog` and `Cat` that override `makeSound()` with their own sound.
**Example:**
```java
Animal a = new Dog("Rex");
a.makeSound(); // "Rex says: Woof!"
```
**Constraints:** `Animal`'s constructor should accept `name`; subclasses must call `super(name)`.

### 6.2 Overriding vs Overloading — Side-by-Side Demo
**Problem:** In one small program, demonstrate method **overriding** (subclass changes parent's behavior, resolved at runtime) and method **overloading** (same name, different parameter lists, resolved at compile time). Use the `Animal`/`Dog` classes for overriding, and add multiple `describe()` methods with different signatures for overloading.
**Constraints:** Add code comments explaining which mechanism is "static/compile-time" binding and which is "dynamic/runtime" binding.

### 6.3 The `super` Keyword
**Problem:** Extend `Animal` → `Dog` such that `Dog`'s constructor calls `super(name)`, and `Dog.makeSound()` first calls `super.makeSound()` (printing the generic message) and then prints the dog-specific sound.
**Example output:**
```
Rex makes a sound.
Rex says: Woof!
```
**Constraints:** Show what compiler error occurs if you attempt to call `super()` after other statements in a constructor (it must be the first statement).

### 6.4 Polymorphic Array Processing
**Problem:** Create an `Animal[]` array containing a mix of `Dog`, `Cat`, and possibly other subclasses. Loop through the array calling `makeSound()` on each element via the `Animal` reference type, observing that the correct overridden method runs for each (runtime/dynamic polymorphism).
**Input:** An array of 5 mixed animal objects.
**Output:** Each animal's specific sound, printed in order.
**Constraints:** Add a new subclass `Bird` after writing the loop, and confirm the same loop code works without modification — this demonstrates the Open/Closed Principle.

### 6.5 Abstract Classes — Shape Hierarchy
**Problem:** Create an abstract class `Shape` with an abstract method `double area()` and a concrete method `printArea()` that calls `area()` and prints the result formatted to 2 decimals. Implement `Circle` (radius) and `Rectangle` (width, height) subclasses.
**Example:**
```java
Shape c = new Circle(5);
c.printArea(); // Area: 78.54
```
**Constraints:** Confirm that attempting `new Shape()` directly causes a compile error, and explain why abstract classes cannot be instantiated.

### 6.6 (Bonus) instanceof & Safe Downcasting
**Problem:** Given an `Animal` reference that might actually be a `Dog`, `Cat`, or `Bird` at runtime, write a method that checks the actual type using `instanceof` (or pattern-matching `instanceof` in modern Java) and calls a subclass-specific method not present in `Animal` (e.g., `Dog.fetch()`).
**Constraints:** Handle the case where the object is none of the known subclasses without throwing a `ClassCastException`.

---

## 7. Interfaces & Abstraction

### 7.1 Basic Interface — Payable
**Problem:** Define an interface `Payable` with a method `double calculatePay()`. Implement it in `Employee` (fixed monthly salary) and `Freelancer` (hourly rate × hours worked).
**Example:**
```java
Payable e = new Employee(5000);
Payable f = new Freelancer(50, 20);
e.calculatePay(); // 5000.0
f.calculatePay(); // 1000.0
```
**Constraints:** Write a method `printPaySlip(Payable p)` that works for *any* `Payable` implementation, demonstrating interface-based polymorphism.

### 7.2 Multiple Interface Implementation — Duck
**Problem:** Define two interfaces, `Flyable` (method `fly()`) and `Swimmable` (method `swim()`). Create a `Duck` class implementing both. Create another class `Fish` implementing only `Swimmable`.
**Constraints:** Write a method that accepts a `Flyable` and calls `fly()` — confirm it accepts `Duck` but rejects `Fish` at compile time.

### 7.3 Default & Static Interface Methods
**Problem:** Add a `default` method `describe()` to `Payable` that prints a generic description using `calculatePay()` internally (no override needed in implementers). Add a `static` utility method `Payable.compare(Payable a, Payable b)` that returns which one pays more.
**Constraints:** Override `describe()` in one implementing class to show that default methods *can* be overridden if needed.

### 7.4 Functional Interfaces & Lambdas
**Problem:** Define your own `@FunctionalInterface` called `Calculator` with a single abstract method `int operate(int a, int b)`. Implement three different operations (add, subtract, multiply) using lambda expressions assigned to `Calculator` variables, and invoke each.
**Example:**
```java
Calculator add = (a, b) -> a + b;
add.operate(3, 4); // 7
```
**Constraints:** Confirm the compiler rejects adding a second abstract method to a `@FunctionalInterface`-annotated interface.

### 7.5 Interface vs Abstract Class — Vehicle Comparison
**Problem:** Model a small vehicle system (`Car`, `Motorcycle`) twice: once using an abstract class `Vehicle` with a mix of implemented and abstract methods, and once using an interface `Vehicle` with only method signatures (plus default methods where appropriate).
**Task:** Write a short comparison (as comments or a separate text block) covering: can they hold state? Can a class extend/implement more than one? When would you choose each?

### 7.6 (Bonus) Comparable & Comparator — Student Sorting
**Problem:** Create a `Student` class with `name` and `gpa`. Make it implement `Comparable<Student>` so the natural ordering is by GPA ascending. Separately, create a `Comparator<Student>` that sorts by name alphabetically.
**Example:**
```java
Collections.sort(students); // sorts by GPA (natural order)
students.sort(nameComparator); // sorts by name
```
**Constraints:** Sort the same list both ways in one program and print both results to confirm they differ.

---

## 8. Exception Handling

### 8.1 Try-Catch Basics — Safe Division
**Problem:** Write a method `safeDivide(int a, int b)` that returns `a / b`, catching `ArithmeticException` if `b` is 0, printing a friendly message, and returning `0` in that case instead of crashing.
**Example:**
```
safeDivide(10, 2) → 5
safeDivide(10, 0) → prints "Cannot divide by zero", returns 0
```

### 8.2 Multiple Catch Blocks
**Problem:** Write a method that parses a `String[]` of numbers and an index, accessing `array[index]` and calling `Integer.parseInt()` on it. Catch `ArrayIndexOutOfBoundsException` and `NumberFormatException` in **separate** catch blocks with distinct messages.
**Example:**
```
parse({"1","2","abc"}, 2) → "Invalid number format: abc"
parse({"1","2"}, 5)       → "Index 5 is out of bounds"
```
**Constraints:** Add a final `catch (Exception e)` as a fallback and explain why it must come last.

### 8.3 Custom Checked Exception — Insufficient Funds
**Problem:** Create a custom checked exception class `InsufficientFundsException extends Exception` with a constructor accepting a message. Modify a `BankAccount.withdraw(double amount)` method to `throw` this exception (not just print an error) when the withdrawal exceeds the balance. Callers must handle it with try-catch or declare it with `throws`.
**Example:**
```java
try {
    account.withdraw(500);
} catch (InsufficientFundsException e) {
    System.out.println("Transaction failed: " + e.getMessage());
}
```
**Constraints:** Explain the difference between this checked exception and an unchecked one like `IllegalArgumentException`, and when you'd choose each.

### 8.4 finally & try-with-resources
**Problem:** First, write code that opens a resource (simulate with a class implementing `AutoCloseable` that prints "Resource closed" in `close()`), and demonstrate that a `finally` block always runs, even when an exception is thrown inside the `try`. Then rewrite the same logic using **try-with-resources** and show the resource still closes automatically without an explicit `finally`.
**Constraints:** Force an exception partway through and confirm the resource is still closed in both versions.

### 8.5 Exception Chaining
**Problem:** Write a method that catches a low-level `SQLException`-style (or any built-in) exception and rethrows it wrapped inside a custom `ServiceException`, preserving the original exception as the "cause" (via the constructor `super(message, cause)`).
**Constraints:** Print the full stack trace of the rethrown exception and confirm the original exception appears as "Caused by:" in the output.

### 8.6 (Bonus) Input Validation Pipeline
**Problem:** Build a `UserValidator` with a method `validate(String username, String email)` that throws different custom exceptions for different failures: `EmptyFieldException` (blank input), `TooLongException` (username > 20 chars), and `InvalidEmailException` (missing "@"). Each should extend a common `ValidationException` base class.
**Constraints:** Write a caller that catches the base `ValidationException` type once and uses `instanceof` (or multi-catch) to react differently per specific type.

---

## 9. Collections Framework

### 9.1 ArrayList Fundamentals
**Problem:** Create an `ArrayList<String>` of fruit names. Add 5 items, remove one by value and one by index, sort alphabetically, and search for an item using `contains()` and `indexOf()`.
**Constraints:** After sorting, insert a new item at a specific index using `add(index, element)` and print the final list.

### 9.2 Set Deduplication — HashSet & TreeSet
**Problem:** Given a `List<Integer>` with duplicate values, use a `HashSet` to get only unique values (order not guaranteed), then use a `TreeSet` to get unique values in sorted order.
**Input:** `{5, 3, 8, 3, 1, 5, 9, 1}`
**Output:**
```
HashSet result (unique, unordered): [1, 3, 5, 8, 9] (order may vary)
TreeSet result (unique, sorted):    [1, 3, 5, 8, 9]
```

### 9.3 HashMap Phonebook
**Problem:** Build a simple phonebook using `HashMap<String, String>` (name → phone number). Implement `addContact`, `lookupContact` (return "Not found" if absent), `removeContact`, and `listAllContacts` (print all entries).
**Constraints:** Handle the case of adding a contact with a name that already exists — decide and document whether it overwrites or is rejected.

### 9.4 Safe Iteration & Removal
**Problem:** Given a `List<Integer>`, remove all even numbers **while iterating** over the list. First attempt it with a for-each loop and `list.remove()` to observe the `ConcurrentModificationException`, then fix it using an `Iterator`'s `remove()` method (or `removeIf()`).
**Constraints:** Explain in a comment exactly why the naive for-each approach fails.

### 9.5 Multi-Field Custom Sorting
**Problem:** Given a `List<Employee>` (fields: `name`, `department`, `salary`), sort it primarily by `department` (alphabetically) and secondarily by `salary` (descending) within each department, using `Comparator.comparing().thenComparing()`.
**Example (before → after):**
```
Before: [Bob-Sales-50000, Amy-Eng-90000, Cid-Sales-70000]
After:  [Amy-Eng-90000, Cid-Sales-70000, Bob-Sales-50000]
```

### 9.6 (Bonus) ArrayList vs LinkedList Benchmark
**Problem:** Insert 100,000 elements at index 0 (the front) of both an `ArrayList` and a `LinkedList`, timing each with `System.nanoTime()`. Print both durations.
**Task:** Explain the result in terms of the underlying data structure (contiguous array vs. doubly-linked nodes).

### 9.7 (Bonus) Deque as Stack and Queue
**Problem:** Using a single `ArrayDeque<Integer>`, demonstrate stack behavior (`push`/`pop`, LIFO) in one code block, and queue behavior (`offer`/`poll`, FIFO) in another, printing the removal order for each to confirm the difference.

---

## 10. Generics

### 10.1 Generic Box Class
**Problem:** Create a generic class `Box<T>` with a private field `T content`, a constructor, `set(T item)`, and `get()` returning `T`. Instantiate it with `Box<String>`, `Box<Integer>`, and a custom class.
**Constraints:** Confirm that attempting `box.set(someIncompatibleType)` fails at **compile time**, demonstrating type safety over using `Object`.

### 10.2 Generic Method — Find Maximum
**Problem:** Write a generic method `<T> T findMax(T[] array, Comparator<T> comparator)` that returns the largest element according to the given comparator. Test it with an `Integer[]` (natural order) and a `String[]` (by length, using a custom comparator).
**Example:**
```java
findMax(new Integer[]{3,7,2}, Comparator.naturalOrder()); // 7
findMax(new String[]{"a","bbb","cc"}, Comparator.comparingInt(String::length)); // "bbb"
```

### 10.3 Bounded Type Parameters — Sum of Numbers
**Problem:** Write a generic method `<T extends Number> double sumAll(List<T> list)` that sums a list of any numeric type (Integer, Double, etc.) by calling `.doubleValue()` on each element.
**Constraints:** Confirm the compiler rejects calling `sumAll()` with a `List<String>`.

### 10.4 Wildcards — extends vs super
**Problem:** Write two methods: `printNumbers(List<? extends Number> list)` that reads and prints any list of numbers or subtypes, and `addIntegers(List<? super Integer> list)` that adds a few integers into a list of Integer or any supertype.
**Task:** Explain (in comments) why `? extends` is used for reading (producer) and `? super` for writing (consumer) — the PECS principle.

### 10.5 Generic Pair Class
**Problem:** Create a generic class `Pair<K, V>` with fields `key` (K) and `value` (V), a constructor, `getKey()`, `getValue()`, and a `toString()`. Write a method `Pair<String, Integer> findOldestPerson(Map<String, Integer> people)` that returns the name and age of the oldest person using this class to return two values at once.
**Example:**
```java
findOldestPerson({"Alice":30, "Bob":45}) → Pair("Bob", 45)
```

### 10.6 (Bonus) Generic Stack Implementation
**Problem:** Implement your own generic `Stack<T>` class backed by an `ArrayList<T>` internally, with methods `push(T item)`, `pop()` (throws an exception if empty), `peek()`, `isEmpty()`, and `size()`.
**Constraints:** Do not use `java.util.Stack` — build the logic yourself, and write a small test demonstrating LIFO order with at least 3 pushes and pops.

---

## 11. Lambda Expressions & Streams

### 11.1 Lambdas Replacing Anonymous Classes
**Problem:** Take a `Runnable` implemented as an anonymous inner class printing "Running", and a `Comparator<String>` implemented anonymously to sort by length — rewrite both using lambda expressions.
**Constraints:** Confirm both versions behave identically when run/used.

### 11.2 Stream Filter & Map
**Problem:** Given `List<Integer> nums = {1,2,3,4,5,6,7,8,9,10}`, use a stream pipeline to filter only even numbers, square each remaining value, and collect the results into a new `List<Integer>`.
**Expected output:** `[4, 16, 36, 64, 100]`
**Constraints:** Solve it as a single chained stream statement (`.filter().map().collect()`), not with a loop.

### 11.3 Grouping & Aggregating with Collectors
**Problem:** Given `List<Employee>` (fields `name`, `department`, `salary`), use `Collectors.groupingBy()` to produce a `Map<String, List<Employee>>` grouped by department, and separately a `Map<String, Double>` of average salary per department using `Collectors.averagingDouble()`.
**Example output (partial):**
```
{Engineering=[Amy, Ravi], Sales=[Bob, Cid]}
{Engineering=85000.0, Sales=60000.0}
```

### 11.4 Method References Refactor
**Problem:** Take a stream pipeline written entirely with lambdas (e.g., `.map(s -> s.toUpperCase())`, `.forEach(s -> System.out.println(s))`) and refactor each lambda into an equivalent method reference (`String::toUpperCase`, `System.out::println`).
**Constraints:** Include at least one example each of a static method reference, an instance method reference on a particular object, and a constructor reference (`ClassName::new`).

### 11.5 Optional — Avoiding Null Checks
**Problem:** Write a method `Optional<String> findUserById(Map<Integer, String> users, int id)` that returns an `Optional` wrapping the username if found, or `Optional.empty()` otherwise. Call it and handle both cases using `.isPresent()`/`.get()`, then again using `.ifPresentOrElse()`, then again using `.orElse("Guest")`.
**Constraints:** Explain why returning `Optional<String>` is preferable to returning `null` directly from an API design standpoint.

### 11.6 (Bonus) Reduce — Custom Aggregation
**Problem:** Using `Stream.reduce()`, compute the factorial of a number from a range (`IntStream.rangeClosed(1, n)`), and separately concatenate a `List<String>` into a single comma-separated string — both without using a traditional loop.
**Example:**
```
factorial via reduce(5) → 120
concatenate(["a","b","c"]) → "a,b,c"
```

### 11.7 (Bonus) Sequential vs Parallel Streams
**Problem:** Create a `List<Integer>` with 10 million elements. Sum them using `.stream()` and again using `.parallelStream()`, timing each with `System.nanoTime()`.
**Task:** Report the timing difference and explain in comments when parallel streams help vs. when their overhead makes them slower (e.g., small lists, I/O-bound operations).

---

## 12. Multithreading & Concurrency

### 12.1 Thread Creation — Two Ways
**Problem:** Create a thread by extending `Thread` (override `run()`) that prints numbers 1–5, and a separate thread by implementing `Runnable` that prints letters A–E. Start both and observe the interleaved output across multiple runs.
**Constraints:** Call `.join()` on both threads before printing "Done" to guarantee both finish first.

### 12.2 Race Condition & Synchronization
**Problem:** Create a shared `Counter` class with an `increment()` method that does `count++`. Launch 100 threads, each calling `increment()` 1000 times. Print the final count — it should be 100,000 but likely won't be, due to the race condition. Fix it by marking `increment()` `synchronized` (or using a `synchronized` block around `count++`), and confirm the count is now correct every run.

### 12.3 ExecutorService & Thread Pools
**Problem:** Use `Executors.newFixedThreadPool(4)` to submit 10 tasks (each simply prints its task number and sleeps briefly). Properly `shutdown()` the executor and use `awaitTermination()` to wait for completion before printing "All tasks done".
**Constraints:** Explain why creating a raw `Thread` per task doesn't scale well compared to using a pool.

### 12.4 Producer-Consumer with BlockingQueue
**Problem:** Implement a producer thread that generates integers 1–20 and puts them into a `BlockingQueue<Integer>` (e.g., `ArrayBlockingQueue`), and a consumer thread that takes and prints them. Ensure the consumer doesn't finish before all items are produced.
**Constraints:** Use a sentinel value (e.g., `-1`) to signal the consumer to stop, or use a fixed count both threads know in advance.

### 12.5 CompletableFuture Chaining
**Problem:** Simulate fetching a user ID asynchronously with `CompletableFuture.supplyAsync()`, then chain `.thenApply()` to convert the ID into a username, then `.thenAccept()` to print a greeting — all without blocking the main thread until the final `.join()`.
**Example:**
```
supplyAsync(fetchUserId) → thenApply(idToName) → thenAccept(name -> print "Hello, " + name)
```

### 12.6 (Bonus) Deadlock Demonstration & Fix
**Problem:** Create two lock objects `lockA` and `lockB`. Have Thread 1 acquire `lockA` then try to acquire `lockB`; have Thread 2 acquire `lockB` then try to acquire `lockA` — causing a deadlock. Run it and observe the hang. Then fix it by having both threads always acquire locks in the same order.

### 12.7 (Bonus) AtomicInteger vs synchronized
**Problem:** Rewrite the race-condition counter from 12.2 using `java.util.concurrent.atomic.AtomicInteger` instead of `synchronized`, using `incrementAndGet()`. Compare code simplicity and (optionally) performance under heavy contention.

---

## 13. File I/O & Serialization

### 13.1 Basic Text File Read/Write
**Problem:** Write a `List<String>` of lines to a file called `notes.txt` using `BufferedWriter`, then read it back line by line using `BufferedReader` and print each line with its line number.
**Constraints:** Use try-with-resources for both the writer and reader.

### 13.2 NIO File Operations
**Problem:** Using `java.nio.file.Files`, write a list of strings to a file with `Files.write()`, then read all lines back at once with `Files.readAllLines()`. Also check if the file exists with `Files.exists()` before attempting to read.

### 13.3 Simple CSV Parser
**Problem:** Given a CSV file with a header row (`name,age,city`) and several data rows, parse it into a `List<Map<String,String>>`, where each map represents one row (column name → value).
**Example input file:**
```
name,age,city
Alice,30,NYC
Bob,25,LA
```
**Expected result:** `[{name=Alice, age=30, city=NYC}, {name=Bob, age=25, city=LA}]`
**Constraints:** Handle a trailing empty line in the file gracefully (don't produce a phantom empty row).

### 13.4 Object Serialization
**Problem:** Make a `Person` class (with `name`, `age`) implement `Serializable`. Write a `Person` object to a file using `ObjectOutputStream`, then read it back using `ObjectInputStream` into a new variable, and confirm the deserialized object's fields match the original.
**Constraints:** Add a `transient` field (e.g., `password`) and confirm it comes back as `null`/default after deserialization, explaining why.

### 13.5 Recursive Directory Traversal
**Problem:** Given a directory path, recursively list every file within it (including subdirectories), printing each file's relative path and size in bytes. Use `File.listFiles()` or `Files.walk()`.
**Constraints:** Handle the case where the given path doesn't exist or isn't a directory, printing a clear error instead of crashing.

### 13.6 (Bonus) Properties File Reader
**Problem:** Create a simple config file `app.properties` with contents like:
```
app.name=MyApp
app.version=1.0
debug=true
```
Read it using `java.util.Properties` into a `Map`-like structure, and retrieve individual values by key with a sensible default if a key is missing.

---

## 14. Design Patterns

### 14.1 Singleton Pattern — Thread-Safe Logger
**Problem:** Implement a `Logger` class that can only ever have one instance, accessible via `Logger.getInstance()`. Make it thread-safe so that concurrent calls from multiple threads never create two instances (use either synchronized lazy initialization, double-checked locking, or an eagerly-initialized static field — implement at least one and explain the tradeoff).

### 14.2 Builder Pattern — Configurable Pizza
**Problem:** Design a `Pizza` class with many optional fields (`size`, `cheese`, `pepperoni`, `mushrooms`, `extraSauce` — a mix of required and optional). Instead of a constructor with many parameters, implement a `Pizza.Builder` inner class allowing chained calls like:
```java
Pizza p = new Pizza.Builder("Large")
                .addCheese()
                .addPepperoni()
                .build();
```
**Constraints:** `size` should be required (passed to the Builder's constructor); everything else should be optional with sensible defaults.

### 14.3 Observer Pattern — Event Notification
**Problem:** Create a `Publisher` (or `Subject`) class that maintains a list of `Subscriber` objects (interface with an `update(String event)` method). When the publisher's `notifyAll(String event)` is called, every registered subscriber's `update()` should fire. Implement at least two different `Subscriber` types (e.g., `EmailSubscriber`, `SmsSubscriber`) with different behavior in `update()`.

### 14.4 Factory Pattern — Shape Factory
**Problem:** Create a `ShapeFactory` class with a static method `createShape(String type)` that returns a `Circle`, `Square`, or `Triangle` object (all implementing a common `Shape` interface) based on the input string. Throw an `IllegalArgumentException` for unrecognized types.
**Example:**
```java
Shape s = ShapeFactory.createShape("circle");
s.draw(); // "Drawing a circle"
```

### 14.5 Strategy Pattern — Payment Methods
**Problem:** Define a `PaymentStrategy` interface with `pay(double amount)`. Implement `CreditCardPayment` and `PayPalPayment`. Create a `ShoppingCart` class that accepts a `PaymentStrategy` (via constructor or setter) and calls `strategy.pay(total)` at checkout — allowing the payment method to be swapped at runtime without changing `ShoppingCart`'s code.

### 14.6 (Bonus) Decorator Pattern — Coffee Order
**Problem:** Create a `Coffee` interface with `cost()` and `description()`. Implement a base `SimpleCoffee`. Then create decorators `MilkDecorator` and `SugarDecorator` that each wrap a `Coffee` object, adding to the cost and appending to the description.
**Example:**
```java
Coffee order = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
order.description(); // "Simple Coffee, Milk, Sugar"
order.cost(); // base + milk + sugar
```

---

## 15. JVM Internals & Modern Java Features

### 15.1 Immutable Class Design
**Problem:** Design a fully immutable `ImmutablePoint` class: all fields `private final`, no setters, values set only via constructor, and if any field is a mutable object (e.g., a `List` or `Date`), use defensive copying in both the constructor and any getter to prevent external mutation.
**Constraints:** Write a test that tries to mutate the object after construction (e.g., by modifying a list passed into the constructor) and confirm the internal state is unaffected.

### 15.2 Reflection Basics
**Problem:** Given any class (e.g., your `Book` class from earlier), use `Class.forName()` (or `.getClass()`) plus `getDeclaredFields()` and `getDeclaredMethods()` to print all field names/types and method names at runtime — without hardcoding them. Then use reflection to invoke a specific method dynamically by name.

### 15.3 Custom Annotation — @Loggable
**Problem:** Define a custom annotation `@Loggable` (retention `RUNTIME`) that can be applied to methods. Write a small "processor" using reflection that scans a class's methods, and for any annotated with `@Loggable`, prints a message before invoking it (e.g., using a dynamic proxy or simply calling it manually within a wrapper for the exercise).

### 15.4 Stack vs Heap & Garbage Collection
**Problem:** Write a short program creating both primitive local variables (stack) and objects (heap). In comments, trace through which values live where, and explain — using a specific code example — when an object becomes eligible for garbage collection (e.g., after its last reference goes out of scope or is set to `null`).

### 15.5 Enum with Per-Constant Behavior
**Problem:** Create `enum Operation { ADD, SUBTRACT, MULTIPLY, DIVIDE }` where **each constant overrides** an abstract method `apply(int a, int b)` with its own logic (this uses enum constant-specific class bodies).
**Example:**
```java
Operation.ADD.apply(3, 4); // 7
Operation.MULTIPLY.apply(3, 4); // 12
```
**Constraints:** Handle `DIVIDE` by zero by throwing a clear exception from within that constant's implementation.

### 15.6 (Bonus) Records — Modernizing Immutable Classes
**Problem:** Rewrite your `ImmutablePoint` class (15.1) as a Java `record Point(int x, int y)`. Compare the line count and confirm records automatically provide `equals()`, `hashCode()`, and `toString()`.
**Constraints:** Note one limitation of records: they can't have additional mutable fields, and all components are implicitly `final`.

### 15.7 (Bonus) Sealed Classes & Pattern Matching
**Problem:** Using Java 17+, model `sealed interface Shape permits Circle, Square, Triangle`. Write a method that computes area using a `switch` expression over the sealed type with pattern matching, and confirm the compiler enforces exhaustiveness (i.e., forgetting a case is a compile error, not a runtime surprise).

---

## Notes on Using This Set

- Each exercise has explicit **input/output expectations** — use them to write quick self-checks (`assert` statements or simple print comparisons) as you go.
- Exercises marked **(Bonus)** are more advanced within their section — attempt them after the core 5 feel comfortable.
- Ask for a reference solution, a code review, or a walkthrough of the reasoning for any specific exercise number (e.g., "solve 9.4" or "review my solution to 6.5").
