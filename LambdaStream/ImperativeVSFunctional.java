package LambdaStream; /**
 * This Java documentation explains the difference between Imperative and Functional Programming styles.
 * It includes examples demonstrating both approaches using Java 8+ features like Streams and Lambdas.
 */

import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates the differences between Imperative and Functional programming styles in Java.
 *
 * <h2>Imperative Programming</h2>
 * <p>
 * Imperative programming focuses on explicitly defining the sequence of steps to achieve a goal.
 * It provides clear instructions for every operation and relies on loops, variables, and conditional statements.
 * </p>
 * <ul>
 *   <li>Explicit instructions for every step.</li>
 *   <li>Uses loops, variables, and conditional statements (for, if, etc.).</li>
 *   <li>More prone to errors (e.g., incorrect loop conditions).</li>
 *   You are the head chef giving step-by-step, low-level instructions to assistants (e.g., beat eggs, mix batter, set oven temperature).
 * </ul>
 */
public class ImperativeVSFunctional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = 0;

        // Imperative approach - explicit loops and conditions
        for (int num : numbers) {
            if (num % 2 == 0) { // Filtering even numbers
                sum += num * num; // Squaring and summing
            }
        }

        System.out.println("Sum of squares of even numbers: " + sum);
    }
}

/**
 * Demonstrates the Functional Style of programming using Streams and Lambda expressions.
 * <h2>Functional Programming</h2>
 * <p>
 * Functional programming uses declarative constructs like Streams and Lambdas to express logic in a more concise and safe manner.
 * </p>
 * <ul>
 *   <li>Focuses on "what to do" rather than "how to do it."</li>
 *   <li>Uses higher-order functions like map(), filter(), reduce().</li>
 *   <li>Reduces chances of errors and makes code more readable.</li>
 *   You are the recipe author giving high-level outcome-based instructions to expert bakers (e.g., “Make a vanilla cake with cream butter”).
 * </ul>
 */
class FunctionalStyle {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Functional approach - using Streams and Lambdas
        int sum = numbers.stream()
                .filter(num -> num % 2 == 0)  // Filter even numbers
                .mapToInt(num -> num * num)   // Square each even number
                .sum();                       // Sum the squares

        System.out.println("Sum of squares of even numbers: " + sum);
    }

    /**
     * Key Differences between Imperative and Functional Programming:
     * <p>
     * 1. Imperative Style:
     * - Focuses on "How to do it" with explicit step-by-step instructions.
     * - Uses loops, conditionals, and variables.
     * - More error-prone and verbose.
     * - Harder to maintain and read.
     * <p>
     * 2. Functional Style:
     * - Focuses on "What to do" with declarative high-level instructions.
     * - Uses Streams, Lambdas, and method references.
     * - Less error-prone, concise, and readable.
     * - Easier to maintain and scale.
     * <p>
     * When to Use:
     * - Imperative: When you need fine-grained control over execution.
     * - Functional: When working with collections, data transformation, and parallel execution.
     */

    static void difference() {
    }
}
