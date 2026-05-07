# Multithreading in Java

This program demonstrates how to run multiple tasks concurrently using the `Thread` class.

### Key Concepts:
- **Extending Thread Class**: One of the two ways to create a thread (the other being `Runnable`).
- **run() method**: Contains the logic that the thread will execute.
- **start() method**: Used to begin execution; it internal calls the `run()` method.
- **sleep()**: Pauses the current thread for a specified duration to simulate workload.

### How to Run:
1. Compile: `javac ThreadDemo.java`
2. Run: `java ThreadDemo`
