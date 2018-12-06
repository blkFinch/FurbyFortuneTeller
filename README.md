Furby Fortune Teller

Furby Fortune Teller is an interactive application--provide Furby with a few personal details and Furby will generate a custom fortune. 

Furby returns random strings from individual text files. The Fortune.class contains the algorithm. The program looks for a series of .txt files in the source folder, creates an ArrayList of the lines from each file and then shuffles the lines to generate a random string. Method 'private String RandomFortune' sets the order of the strings returned (subjects, verbs, times). We feel the algorithm is excellent! 

Examples of APIE:

ABSTRACTION:

POLYMORPHISM: The eventHandler interface methods called the AnimateFurby.class are overridden at runtime.

INHERITANCE: FortureWindow.class extends Stage. FurbyCool.class and FurbyIdle.class both extend Pane. Each subclass inherits public and protected methods from its superclass.

ENCAPSULATION: Fortune.class contains a private method (RandomLine) that generates a random string from individual text files. FortuneWindow.class calls the output of RandomLine, but the logic of the RandomLine method is encapsulated in the Fortune.class.

Authors: 
Galen Hutchison
Kelse Lighthizer

