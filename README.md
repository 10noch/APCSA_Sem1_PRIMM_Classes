# PRIMM: Classes

## PRIMM
PRIMM is a Computer Science instructional strategy that is driven around inquiry-based exploration. You start off by looking at existing code and investigating what it does to modifying the code to extend its functionality to idependently creating something new using what you learned.

At first, I will ask you to hold to the PRIMM process. We won't use the strategy for every new concept, and as we move along, you will be able to move more quickly through it.

Use this document as a place to document your answers to the questions. You won't turn this document in, but
it can help supplement your notes.

## Predict
**Without running the program**, predict what its behavior is.

1. What will the program output when it is run?
    >  Asks user for side lengths of square.

2. What do you think the words `public` and `private` mean?
    > Private means it would be localized to the single file, while public allows it to be mentioned and used in other fils.

3. How are the files `ShapeDriver.java` and `Square.java` related? 
    > ShapeDriver gets the inout, while Square works on calculating and possibly later on outputting the values.

4. There is no method definition for `Square()`. Do you think the code will compile? 
    > Yes since it is a class and does not require a definition. 

5. Why do the methods/functions `getSide()` and `setSide()` exist? 
    > They help return the value of the side inputed and the set side sets the variable

## Run
Run the program. 
1. What is the output?
    > It printed out Side: 1.00

2. Did your prediction agree with the output? Explain where it may have differed.
    > Not exactly, I had the general idea of the square generation, but it doesn't take any input from the user

## Investigate
In this section, your instructor will alternate between explaining topics and tackling a `TODO` in the Modify section.
Make sure you take careful notes on the major topics.

## Modify
Starting with the `Square.java` file, resolve each of the `TODO` items. 
Once you have resolved a `TODO`, make sure to remove the text `TODO` so it doesn't 
appear on the list.

When it comes time to creating your own Unfied Markup Language visual for your custom class,
your instructor will provide you with a Google Drawing template.

## Make
Implement a brand new shape of your choice. It should store the major data for that shape and make
setter and getter method available along with a constructor that is appropriate.
Ensure you instantiate the class in the driver's `main()` method and print out the data attributes.
