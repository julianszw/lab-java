# lab-java

A Java study path in chapters, from the basics to advanced topics. Hands-on code, exercises and demos.

Read in order, like the chapters of a book: from the simplest to the most complex.

| Chapter | Contents |
|---|---|
| [`01-fundamentals`](01-fundamentals/) | Language basics: core concepts, loops, arrays, strings |
| [`02-oop`](02-oop/) | Class design: immutability and, later on, inheritance, polymorphism, SOLID |
| [`03-algorithms`](03-algorithms/) | Searching and sorting |
| [`04-design-patterns`](04-design-patterns/) | Design patterns (Observer, …) |
| [`05-concurrency`](05-concurrency/) | Threads, `Runnable` and `java.util.concurrent` |

More chapters will be added as the study path grows.

## Related

- [`effective-java-kata`](https://github.com/julianszw/effective-java-kata): a separate repo with *Effective Java* items, examples and tests.

## Build

Requires JDK 21 and Maven. From the repo root:

```bash
mvn compile
```

Each chapter is a Maven module and can also be built on its own from its folder.
