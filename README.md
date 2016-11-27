# Missing Letters
Utility for determining if there are any letters missing in a provided sentence, that are required for making it a pangram.

Maven-based Java project with unit tests.

## Assumptions
* Sentences that contain no English letters, and are a mix of non US ASCII and non-alphabetic characters, are treated as valid input.
* Input's string length is assumed to not exceed the maximum integer type value of 2^31-1 or around 2GB.

## How to run
install: `mvn clean install`

run application: `mvn exec:java`

run tests: `mvn test`

or import as a Maven project in IntelliJ IDEA.