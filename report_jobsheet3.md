|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020023|
| Nama |  Dewi Chalissa Rania |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/ichaxpro/Algoritma-dan-Struktur-Data.git) |

# Labs #1 Programming Fundamentals Review

## 3.1 Create, Insert and Display Array of Object
### 3.1.2 Verification Experiment Result
The solution is implemented in rectangle.java, and arrayOfObject.java. Below is screenshot of the result.

![Screenshot](../Jobsheet_3/img/Experiment1_jobsheet3.png)

### 3.1.3 Question
*Brief explanaton:* 
1.  No, it does'nt have to have attribute and method. But we have to understand why we need one, Attribute and method is used to storing data and manipulating data. So if the class does'nt have that, it woul be not very pratical or useful for most application. 
2. No, the class rectangle dont have contructor. But in java, when the program does not have a constructor, the compiler will provide default contructor automatically. So, when we instantiate the object like the code below, it will run with o problem.
![Screenshot](../Jobsheet_3/img/question2_jobsheet3.png)
3. We declaring Array of Object with Rectangle[] as a className, rectangleArray as a arrayName, and Rectangle[3] as a array length.
4. The first line is we instantiate the object first, and then we accessing attribute of array of object. The format to access the element of array by using index, followed by dot (.) and attribute name or method name of the object.
5. Because it easier that way, it easy to look and will be more structured if someday we heva to make improvement in the specific class.

## 3.2 Input data into Array of Objects using Loops
### 3.2.1 Verification Experiment Result
The solution is implemented in studentMain08.java, and below is screenshot of the result.

![Screenshot](../Jobsheet_3/img/experiment2_jobsheet3.png)

### 3.2.2 Question
*Brief explanaton:* 
1. Yes, we can implemented 2D Array on Array of Object
2. For example, if you have a "Student" class with attributes "name" and "grade":
   - Declaration of 2D Array of Objects:
     You can create a 2D array named "studentArray" consisting of "Student" objects.
   - Initializing Objects in the 2D Array:
     You can make the array with "Student" objects and assign values to each attribute.
   -  Example:
      Suppose you have a 2D array with a size of 2x2 to store information about 4 students.
      First row: 2 "Student" objects with names "Alice" and "Bob," and grades "80" and "85."
      Second row: 2 "Student" objects with names "Clara" and "David," and grades "90" and "95."
3. Because we dont instantiate the squareArray[5] first, so that's why when we run it, it will be error.
4. ![Screenshot](../Jobsheet_3/img/question4_experiment2.png)
5. Yes, by assigning an object to several array elements, we can duplicate the instantiation process in an array of object. But by doing that the multiple references will point to the same object in memory.

## 3.3 Mathematical operation in array of object’s attribute
### 3.3.1 Verification Experiment Result
The solution is implemented in Blocks.java and arrayofBlocks java. Below is screenshot of the result.

![Screenshot](../Jobsheet_3/img/experiment3_jobsheet3.png)

### 3.3.2 Question
*Brief explanaton:* 
1. Yes, we can. A class can have multiple constructors with different parameters. The Java compiler determines which constructor to call based on the number and type of arguments passed during object creation.
2. For the question number 2, 3, 4, and 5 you can se in the triangle.java and triangleMain.java. Here's is the screenshoot of  the result
![Screenshot](../Jobsheet_3/img/question4_experiment3.png)

## 3.4 Assignments
### 3.4.1 Verification Experiment Result
The solution is implemented in lecturer08.java, lecturerData08.java, and lecturerDemo08.java. Here's the screenshot of the result.

![Screenshot](../Jobsheet_3/img/assignment(1).png)
![Screenshot](../Jobsheet_3/img/assignment(2).png)
![Screenshot](../Jobsheet_3/img/assignment(3).png)

This code defines **three classes**:  

1. **`lecturerDemo08`** (main class)  
   -  Acts as the main method.
   -  Handles user input and menu selection.
   - Stores and manages an array of lecturer08 objects.
   - Calls functions for data input, display, and processing.

2. **`lecturerData08`** (method)  
   - contains method that will be executed in main method
   - Methods include:
      - showAllLecturerData(): Displays all lecturer data in a table format.
      - countLecturerByGender(): Counts lecturers based on gender.
      - averageLecturerAgeByGender(): Calculates the average age of male and female lecturers.
      - showOldestLecturerInfo(): Finds and displays the oldest lecturer.
      - showYoungestLecturerInfo(): Finds and displays the youngest lecturer.
3. **`lecturer08`** (attribute)
   - Represents a lecturer with attributes:
      - id (String) → Unique lecturer identifier.
      - name (String) → Lecturer’s name.
      - gender (boolean) → true for male, false for female.
      - age (int) → Lecturer’s age.
   - Contains a constructor to initialize lecturer objects.


