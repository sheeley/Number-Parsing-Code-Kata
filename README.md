# Number Parsing Code Kata
## Introduction
In ```dataA.out.txt```, ```dataB.out.txt``` and ```dataC.out.txt```, we have 1000 numbers stored in grids 10 digits across x 100 digits high. We want to take this poorly-stored data, parse it, and create MD5 hashes from the data.   

There is existing code in ```Parser.java```. It only handles the format of ```dataA.out.txt```, and perhaps has some issues? Give it a shot.

## Objective
- Fix Bugs in Parser.java
- Handle all three data formats
- Clean up code 
    - How can we make it more readable & maintainable?
    - What best practices should we be following?
- Add comments
- Add unit tests


## Running Code 
```
javac Parser.java
java Parser ./dataA.out.txt
java Parser ./dataB.out.txt
java Parser ./dataC.out.txt
```

## Checking Results
When successful, this is what your output should look like.
```
> java Parser ./dataA.out.txt
c7314d51cd4fe9fd121f2637046a7aec
> java Parser ./dataB.out.txt
6ddee1826f1985ee7bc5edb54cd92db6
> java Parser ./dataC.out.txt
be321d011436058644e212ba4ac6cba4
```

## Bonus Round
Handle a third format, used in ```bigData.trendy.txt```. It's larger than the other files. How fast can you parse it?
