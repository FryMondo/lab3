# Lab3 Repository
## How to launch project
### Clone the repository:
```
git clone https://github.com/FryMondo/lab3.git
```
### Running project
If you use IDE, open project and run ***Main.java***
### Running project via console
Move to the directory
```
lab3/src
```
Run next commands
```
javac *.java
java Main
```
## Project Structure
### Main.java
- Executes the main code of the program.
- Creates an array of Clothing objects.
- Performs value validation for each Clothing object.
- Sorts objects by two fields, with one field sorted in ascending order and the other in descending order.
- Searches for an identical object in the array.
### Clothing.java
- Defines the Clothing class with five fields: type, brand, size, price, rating.
- Contains getters for accessing object fields.
- Implements the equals method for comparing objects and the hashCode method.
- The toString method formats the output information about the object in a readable format
### Sorting.java
- Implements a method for sorting the Clothing array.
- Uses the passed comparator to sort objects by the specified fields.
### Find.java
- Contains a method to find an identical object in the Clothing array.
- Uses the contains method based on the equals method to find an object with the same field values.
### ValidateValues.java
- A class for validating values ​​of Clothing objects.
- Checks that string fields are not empty, contain only spaces, and are not null.
- Checks that price is a positive number and rating is in the range 1 to 5.
- Throws IllegalArgumentException in case of incorrect values.
### ValidateFields.java
- Contains a method to create comparators that sort Clothing objects by two fields.
- Checks the correctness of the specified fields for sorting and their order (the first field must precede the second).
- Sorts by the first field in ascending order and by the second field in descending order.
