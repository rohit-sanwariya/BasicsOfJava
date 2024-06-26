# Java String.format() Placeholders

In Java's `String.format()` method, there are various placeholders (also called format specifiers) for different data types. Here is a list of commonly used placeholders:

## Common Placeholders

- **String**:
    - `%s`: String

- **Character**:
    - `%c`: Character

- **Integer**:
    - `%d`: Decimal integer
    - `%o`: Octal integer
    - `%x`: Hexadecimal integer (lowercase)
    - `%X`: Hexadecimal integer (uppercase)

- **Floating-point numbers**:
    - `%f`: Decimal floating-point
    - `%e`: Scientific notation (lowercase)
    - `%E`: Scientific notation (uppercase)
    - `%g`: Uses `%f` or `%e`, whichever is shorter
    - `%G`: Uses `%f` or `%E`, whichever is shorter

- **Boolean**:
    - `%b`: Boolean

- **Hash Code**:
    - `%h`: Hash code of the argument

## Other Commonly Used Flags

- **Width and Precision**:
    - `%[width].[precision]`: Specifies the width and precision for formatting. For example, `%8.2f` will format a floating-point number with a minimum width of 8 characters and 2 decimal places.

- **Argument Index**:
    - `%[index]$[specifier]`: Specifies the position of the argument. For example, `%2$s` will use the second argument as a string.

- **Flags**:
    - `-`: Left-justify within the given field width
    - `+`: Include a plus sign for positive numbers
    - `0`: Pad with zeros
    - `,`: Use locale-specific grouping separators (e.g., thousands separator)
    - `(`: Enclose negative numbers in parentheses

## Examples

Here are examples of how to use these placeholders:

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = 'A';
        int num = 123;
        double dbl = 456.789;
        boolean bool = true;

        // String
        System.out.println(String.format("String: %s", str));

        // Character
        System.out.println(String.format("Character: %c", ch));

        // Integer
        System.out.println(String.format("Decimal Integer: %d", num));
        System.out.println(String.format("Octal Integer: %o", num));
        System.out.println(String.format("Hexadecimal Integer: %x", num));

        // Floating-point number
        System.out.println(String.format("Floating-point: %f", dbl));
        System.out.println(String.format("Scientific notation: %e", dbl));
        System.out.println(String.format("Shorter of %%f or %%e: %g", dbl));

        // Boolean
        System.out.println(String.format("Boolean: %b", bool));

        // Hash code
        System.out.println(String.format("Hash code: %h", str));

        // Width and Precision
        System.out.println(String.format("Width and Precision: %8.2f", dbl));

        // Argument Index
        System.out.println(String.format("Argument Index: %2$s %1$d", num, str));

        // Flags
        System.out.println(String.format("Left-justify: %-10d", num));
        System.out.println(String.format("Include plus sign: %+d", num));
        System.out.println(String.format("Pad with zeros: %010d", num));
        System.out.println(String.format("Grouping separators: %,d", num * 1000));
        System.out.println(String.format("Negative in parentheses: %(d", -num));
    }
}
