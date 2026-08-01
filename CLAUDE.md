# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this repository is

A personal learning sandbox for modern Java language features (Java 8 through 25). It is **not** an application — there is no shared runtime, no framework, and no dependency injection. Each file is a self-contained example with its own `public static void main`, demonstrating one concept, usually contrasting the pre-Java-8 form against the modern form in the same `main` (see `lamdas/ComparatorLambdaExample.java` and `imperativevsdeclarative/ImperativeVsDeclarativeExample2.java`).

Maven 3.9.8 + Temurin JDK 25 (`.idea/misc.xml` pins language level `JDK_25`).

## Commands

```bash
# Build / test (from repo root)
mvn compile
mvn test
mvn test -Dtest=AppTest            # single test class

# Run one example — preferred, no build needed (JDK single-file source launcher)
java src/main/java/com/modernjava/lamdas/RunnableLambdaExample.java

# Run one example from compiled classes
mvn -q compile && java -cp target/classes com.modernjava.lambdas.RunnableLambdaExample
```

The single-file launcher compiles against the running JDK (25), so it works for language features the Maven build currently rejects — see below.

## Build state

`mvn compile` and `mvn test` are **green**. The pom follows the `java-project-standards` skill: a
single flat `<packaging>jar</packaging>` pom acting as both parent and jar,
`<maven.compiler.release>25</maven.compiler.release>`, JUnit 5 via the `junit-bom`, and Lombok
wired through `annotationProcessorPaths` (required on JDK 23+, where javac no longer discovers
processors from the compile classpath).

Do **not** add a `<modules>` list unless a real module directory exists alongside it — a module
entry pointing at a missing directory fails the build before any source is read.

Since every example has its own `main`, examples are still normally exercised via the single-file
launcher rather than the Maven build.

## Layout conventions

- Package = topic. `com.modernjava.<topic>` — `lamdas` (sic, spelled without the `b`), `functionalinterfaces`, `imperativevsdeclarative`. New topics get a new package under `com.modernjava`; keep the existing naming rather than "correcting" it, since class references and the IDE project follow it.
- `com.modernjava.data` is the shared fixture package: `Student` (record) and `StudentDataBase` (static list supplier) are intended to feed the functional-interface and stream examples. Both are currently empty stubs — flesh them out here rather than duplicating sample data inside individual examples.
- Class naming: `<Concept>Example.java`, or `<Concept>Example<N>.java` when a concept spans several files.
- `App.java` is the Maven archetype's Hello World placeholder; `AppTest` is the matching JUnit **3.8.1** (`extends TestCase`, `testXxx` methods, no annotations) placeholder. Neither is meaningful. Introducing real tests means upgrading the JUnit dependency in `pom.xml` first.
