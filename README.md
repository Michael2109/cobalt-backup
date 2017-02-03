# Cobalt

Cobalt is an object oriented and functional language that runs on the JVM.

The target is to create a language that is highly scalable, readable and thread safe. Also to combine object oriented and functional aspects to make the language very powerful with few lines. 

Currently the project is at the initial stages but is built on a very strong structure that should allow for the flexibility to move in any direction we please.  
If you are interested then please get in contact!   

#Main Features
*Thread Safe - Automatic Synchronization  
*Simplistic Asynchronous Programming  
*High readability  
*Object oriented and functional  

##Project Contributions
To contribute to the Cobalt project, please send us a pull request from your fork of this repository!  
Make sure to have a quick read through the wiki pages to get an idea of where everything is heading. 
As the project is in the alpha stages please get in contact to discuss any larger changes and/or features you think would be interesting to include. 

#Features   
###Variable Types
```
val b:byte = 1           // 8 bit   
val s:short = 2          // 16 bit  
val i:int = 3            // 32 bit  
val l:long = 4           // 64 bit  
val f:float = 5.0f       // 32 bit  
val d:double = 6.0       // 64 bit  
val c:char = 'g'        
val ss:String = "Example"  
val obj:ClassName = new ClassName()  
```
###Modifiers   
```
private              // Can only be accessed within the class
protected            // Can be accessed by a child class
public               // Can be accessed outside the package
```
###Operators
```
a + b                // Addition   
a - b                // Subtraction
a * b                // Multiplication
a / b                // Division
a % b                // Modulus
a += b               // Increment by value. 
```
###If Statements
```
if (condition):
    doSomething
else:
    doSomethingElse
    
// inline
if (condition) doSomething
```
###While Loop
```
while (condition):
   doSomething
   
// inline
while (condition) doSomething
```
###For Loop (Including index)
```
for(element <- elements index i):
   doSomething(i)
   
// inline
for(element <- elements index i) doSomething(i)
```
###For Loop (Map example)
```
for(element <- map):
    print(element.key + " " + element.value)
```
###For Each
```
list.forEach:
    doSomething
    
// inline
list.forEach doSomething
``` 
###Do While
```
do:
   // do something
   while(condition)
```
###Continue (Discuss whether required)
Skip the current iteration
```
continue
```
###Break (Discuss whether required)
Break out of a loop
```
break
```
### Constructor
The constructor is anything within the class but outside of other methods. Otherwise constructors can be overloaded.   
Constructors can have default values.
```
class MyClass:
    
    a, b:int
    
    // Constructor
    public MyClass() : this(42)
        print("Constructor")
    
    // Overloading a constructor
    public MyClass(a:int = 5, b:int = 10):
        this.a = a  //a = 42
        this.b = b  // b = 10
```
###Method definition
Methods can have default values.
```
methodName(x : int = 5) <- void:
    doSomething
```
###Method calls
Methods with no parameters don't require parenthesis
```
methodName       // No Parameters
methodName(5)    // int parameter
```
###Partial Application
```
// undefined syntax
```
###Closures
```
val factor = 5
val multiplier = (i:int) = i * factor
```
```
power()<-int: 
  var i:int = 0
  return 
    next: function(): 
      var result:int = Math.pow(i, 2)
      i++
      return result
    
var gen = power();
print(gen.next()) // 0
print(gen.next()) // 1
```
###Fat arrows
```
var names = ["James", "Andrew", "John"]
print(names.map((name) => name + ' Smith'))[0]) // James Smith
```

###Methods to convert strings to other types
Often strings represent other types such as integers or doubles. To convert these in Java you have to use "Integer.parseInt(str);" to convert from a string to an integer. Instead these methods should be parse of the language and the compiler should deal with it. 
```
"10".toInt  
"true".toBoolean  
"20.5".toDouble  
"05/15/2017".toDate  
```
###Switch
In Java a switch statement case can only contain one condition for each case. Instead multiple conditions could be allowed.
```
switch(value):
    case value.method == 1 and value.otherMethod == 5:
      // do something
    case value.method == 2:
      // do something
    default:
      print("Default Called") 
```
###Arrays
```
val example = {1,2,3,4,5}
print(example[2])           // Outputs 3
```

###Asynchronous Multithreading
```
async:
    // do something
    complete:
        // Code called on completion
```

###Strings    
To make the code more readable and require less typing variables could be included inside the string and the compiler do all of the work.    
```
var x : int = 5
var y : int = 10
var s : String = "x = $x and y = $y"
```
If outputting a method return
```
var obj : Example = new Example
var s : String = "Hello ${obj.getWorld}"
```

###If Statements
If statement comparisons could be reduced down to much smaller sizes. This would make it less to type and much easier to read.   
*Before*   
```
if(x < 10 && x > 0):
   doSomething
```
*After*
```
if(0 < x < 10):
    doSomething
```

###Open type System       
When using Java I had to write programs that would return JSON to be decoded by PHP APIs. This would mean that external libraries would have to be used such as GSON etc. With GSON you would have to create a class structure that represents the JSON file you are reading in. This would take time and isn't very tidy if there are multiple nested lists.   
Instead an Open Type System could be used. This would allow for JSON (and other formats) to be treated as objects. The elements can be converted into variables and then be referenced which would be highly readable and would save generating unneeded classes. 

####Example xml (JSON to use the same concept)
*xml file -> Book.xml*   
```xml
<?xml version="1.0"?>
<catalog>
   <book id="bk101">
      <author>Gambardella, Matthew</author>
      <title>XML Developer's Guide</title>
      <genre>Computer</genre>
      <price>44.95</price>
      <publish_date>2000-10-01</publish_date>
      <description>An in-depth look at creating applications 
      with XML.</description>
   </book>
   <book id="bk102">
      <author>Ralls, Kim</author>
      <title>Midnight Rain</title>
      <genre>Fantasy</genre>
      <price>5.95</price>
      <publish_date>2000-12-16</publish_date>
      <description>A former architect battles corporate zombies, 
      an evil sorceress, and her own childhood to become queen 
      of the world.</description>
      </book>
</catalog>
```
*Cobalt file*
```
var xml = new Book() // Define an xml object
print(xml.catalog.book[0].author) // output "Gambardella, Matthew"
```

##Desired Syntax  
##Code Example
```
package asm
import compiler.block.ifs.IfBlock

class MyCode(x : int, y : int):    

   // Constructor Calls    
   print("Hello World!")    
   var z : int = 2    
   x += 5    
   
   // Method definition    
   method(x : int)<-void:        
      while (x < 20):            
          x += 1        
   if (x < 10):            
      print("Something else")
   var test : ExampleClass = new ExampleClass()        
   test.methodCall()        
   
   // Main method (Will contain "static" keyword    
   main()<-void:        
      val z :int = 10        
      val zy:int = 15        
      var myCodeTest:MyCode = new MyCode(z, zy)        
      val x:int = 0        
      myCodeTest.method(x)
```


##Opening the project
#####IntelliJ
File->New->Project from version control->GitHub  
Git Repository URL (The project repository URL)  
Parent Directory (Where you would like to store the project)  
Click OK  
Select Gradle on the right panel.   
Press the refresh all Gradle projects button.  

##Running the application. 
As program arguments you need the input file and the output file location. Remove the file extension like so.   
The input file needs to be a .mlg file.  
The output file generated should be placed in "build/classes/main/asm/fileName".
```
"compiled\MyCode" "src\main\java\asm\MyCode"
```
Run the "Runtime.java" file to execute the application. (Currently converting Runtime.java to Runtime.scala)

##Debugging
Open the generated class file to decompile the code and check the code was generated correctly. 

##Code Example - Compilable
```
package asm

import compiler.block.ifs.IfBlock

class MyCode(int x, int y):

    // Constructor Calls
    print("Hello World!")
    int z = 2
    x += 5

    // Method definition
    void method(int x):
        while (x < 20):
            x += 1
        if (x < 10):
            print("Something else")
           
        ExampleClass test = new ExampleClass()
        test.methodCall()
    
    // Main method (Will contain "static" keyword
    void main():
        int z = 10
        int zy = 15
        MyCode myCodeTest = new MyCode(z, zy)
        int x = 0
        myCodeTest.method(x)
```
