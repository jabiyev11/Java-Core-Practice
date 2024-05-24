# Javid Jabiyev 19615 CRN: 20420

## week03

### My commit "Changed folder structure" was to fix the problem with renamed file paths, all codes remained same and added before deadline

## week04

### Point class from week03 has been added toString() method to override, so that PointsArray class in week04 can be executed without hashcodes

### Segment class from week03 has been added toString() method to override, so that SegmentsArray class in week04 can be executed without hashcodes

### For task 18, all classes from week03 were added toString method using StringBuilder

## week05

### Point class has been modified due to 10th task in week05 to override toString and equals methods there

## Task1 

### In the first exercise we have class X, which is superclass, class Y, which is subclass that extends class X. Also, We have class Main, which contains main method and is the entry point of our program. So, our program starts in main method, and there an instance of Y is created. When we create it, it triggers the chain of executions such that it goes to constructor Y in subclass and sees that it extended from the superclass X. So, first it executes constructor in the superclass and then comes back to subclass and makes execution there.
## Output: 
### In constructor X.
### In constructor Y.

## Task2

### In this task, we have class A, which is the superclass, class B, which is subclass that extends class A. Also, we have class Main2, which contains main method and is the entry point of our program. When the Main2 is run, it loads class B and since B extends class A it first goes to superclass A. There its static block initialization block executes and then returns back to class B and executes static block there. It is important to note that static blocks are executed one time regardless of the time new Object is created. After static block execution, instance blocks are executed next with constructors following them, cause an instance of B is created in main method. So, again it goes to superclass first and executes instance blocks and constructors and then comes back to subclass and does the same here. It is important to note that they are dependent on the number of the instances created in the main method. If two instances of B would be created, this cycle will be repeated(excluding the execution of static blocks).

## Output: 
### In static init block of A
### In static init block of B
### In instance init block of A
### In constructor A.
### In instance init block of B
### In constructor B.

## Task3

### Here, we have Child class as a subclass, Parent class as a superclass and OverrideDemo as an etnry point of our program. So, first an instance of Child is created and then called two times with the same name for constructor but with different parametr numbers. In the first call, it has one parametr so it goes from Child to Parent class and executes that part. Second call of calcValue method has two parametrs that is why it does not compatible with superclass, but only subclass. That is why in the second call, it just executes the calcValue method in the Child class

## Output: 
### Super
### 10
### Subclass
### 30


## Task4

### In this task, we have superclass A and subclass GeneralType, which extends A. When the program loads, it first executes static blocks and starts from superclass "AS", then goes back to subclass and executes static block there "GTS". Then, we see that in GeneralType constructor, it calls super keyword with one parametr. So that is why during execution, it will print the constructor with one parametr in superclass. But before that, of course, it executes instance block "A", and then constructor with one parametr "5 AC". After that goes back to subclass and executes instance block "GT" and at the end constructor "GTC".

## Output: 

### AS
### GTS
### A 
### 5 AC
### GT
### GTC


## Task5

### In this task, we will explain types of inheritence. Single: In this type of an inheritence, there are one superclass and one subclass, which inherits from superclass. For example, Animal as a superclass and Wolf as a subclass. Multi-level: Here, subclass also has its own subsubclass, simply adding one more layer in inheritence. As an example: Animal as a superclass, Wolf as a subclass, Labrador Wolf as a subsubclass. Hierarchical: One superclass has more than one subclass. For example: Animal as a superclass, and two subclasses Dog and Horse. Multiple: In this type of an inheritence one subclass inherits from two superclasses. There might occur logical contradictions, if two superclasses have the same method with different statements inside of it. Subclass might have a problem with deciding which one to inherit. That is why Java does not allow multiple inheritence via classes, but it is achieved via interfaces.    Hybrid: It is similar to Multiple inheritence, additionally two superclasses inherit from one supersuperclass. This type of an inheritence also does not work via classes, but could be achieved via interfaces. 


## Task6 

### In this task, we have ClassA as a superclass and ClassB as a subclass. We will see which methods in ClassB override or hide methods from superclass. MethodOne: this one is not overriding, rather an invalid attemp to hide an instance method with static method. This will result in compile-time error. MethodTwo: Here both method are instance methods that is why subclass method will override the one in superclass. MethodThree: It will also be like the one in MethodOne since it is not properly defined. MethodFour: Here, both are static methods and there will be Hiding. 

### MethodOne: Compile-Time error
### MethodTwo: Override
### MethodThree: Compile-Time error
### MethodFour: Hiding


## week06  

### First 3 tasks were the same as the ones inside week05, that is why instructors said to ignore them. Just to note that Segment class were overriden as it wasn't asked in week05 tasks

### In task 7, Rectangle and Square classes from week05 are subject to change as asked in the task.

### Clone method was overriden in Rectangle class from week05. 

### Task 4

### a/ The clone method in Object class has protected visibility and allows only classes
### from the same package or any subclasses to access it, but not other arbitrary codes.
### This type of visibility ensures that only certain classes can directly invoke 
### clone() method, securing the misuse.

### b/ Keeping clone() method protected provides several beenfits, which include 
### Encapsulation: we can control how an object is cloned, ensuring that internal state are properly maintained during cloning. Inheritance: Subclasses can choose whether to expose cloning functionality to the outside world by overriding clone() and making it public, protected, or package-private as needed. This allows for flexibility in designing the cloning behavior of objects. Security: Limiting access to the clone() method prevents unintended or malicious cloning of objects by unauthorized code.

### When we need to make it public?
### We would use public instead of protected when you want to allow any code with access to an object instance to be able to clone it, regardless of its package or inheritance relationship. This might be necessary in certain cases where widespread access to cloning functionality is required across different parts of an application or library. However, in many cases, it's preferable to keep cloning restricted to controlled scenarios, hence the use of protected or even more restrictive access levels.

## week07 

### Invoice task the 3rd one is done and handled within week03 folder and invoice subfolder and InvoiceTest class 

### Account class for 4th task in week07 is inside Customer file, where I have two classes: Customer and Account


### Task 2 - Factorial //d compiler does not impose us to handle it, because this is exception unchecked, which occures in run time.

  
## week08

### In task 4, for maintaining order we use LinkedHashSet and for ascending alphabetical order we use TreeSet

### In Stack task, I did part from previous week also since it was bonus last time, I pushed it separately, and then implemented LinkedList


## week09

### In PriorityQueue exercise, availableTime and timeSpent will not be the same but their sum will be 50, since we increment timeSpent and decrement availableTime

## week11 

### In first task, Finnaly Demo, the provided code had problems with compilation, since in catch block we wanted to catch the exception, which is not tested within try block. That is why I removed catch block. Inside finally block we also thrown exception, for safety I put this exception within try-catch block. After that, our source code compiled successfully, and within testFinnaly method we have catch inside finally block. That block will be executed with message: Exception in finally block: null.

### Streams Demo task - Differences, read() method reads one byte at a time and return it as an integer (0 - 255), whereas read(byte[]) method reads a chunk of bytes into a array and return the number of bytes read. Generally, read(byte[]) method is more efficient than calling read() method every single time for large amount of data. 

### For task 3, we will use classes from java.io package, which offers I/O operations. Type of file will not affect our class selection because all of them treated as sequence of bytes.

### Original.txt and Duplicate.txt files are part generated as part of Duplicate Files task number 3.

### For task 4, difference between read() and read(char[]) is the same as the one explained above for task 3

### For task 6, I added catch block that ensures all objects are read from file, this catch block checks EOFException indicating the end of file.