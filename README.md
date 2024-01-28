<a name="readme-top"></a>

# 🔗 oops-in-java

### 🏛️ [Four Pillars of OOPs](#four-pillars-of-oops) :

- 📖 [Abstraction](#Abstraction)
- 🔗 [Encapsulation](#Encapsulation)
- 👩🏻‍👧🏻‍👦🏻 [Inheritance](#Inheritance)
- 🧑🏾‍🤝‍🧑🏾 [Polymorphism](#Polymorphism)

## 📖Abstraction

In Java, abstraction is a concept that involves hiding the complex implementation details of an object and exposing only the essential features or functionalities to the outside world.

We can achieve abstraction in java by either using `interface` or `abstract` classes.

  - `Abstract classes` 
    - declared using the `abstract` keyword.
    - classes `extends` abstract class.
    - contains both abstract and concrete methods.
    - subclasses must implement abstract methods.

    ```java
    abstract class Shape {
        // Abstract method
        abstract void draw();

        // Concrete method
        void display() {
            System.out.println("This is a shape.");
        }
    }

    class Circle extends Shape {
        // Implementation of the abstract method
        @Override
        void draw() {
            System.out.println("Drawing a circle.");
        }
    }

    ```

  - `Interface`
    - An interface is a collection of abstract methods. It does not contain any implementation.
    - declared using `interface` keyword.
    - classes `implements` an interface.
    - Classes can implement one or more interfaces, providing a way to achieve `multiple inheritances` in Java.

    ```java
    interface Shape {
        // Abstract method
        void draw();

        // Abstract method (implicitly public and abstract)
        double calculateArea();
    }

    class Circle implements Shape {
        // Implementation of the draw method
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }

        // Implementation of the calculateArea method
        @Override
        public double calculateArea() {
            // Implementation for calculating circle area
            return 0.0;
        }
    }
    ```
<p align="right"><a href="#readme-top">⬆ Back to Top</a></p>


## 🔗Encapsulation

Encapsulation is a concept of `data binding` and `data hiding` into a single unit called class.

**data binding** means putting data members & member functions of an object into a single place called class.
**data hiding** is achieved through encapsulation by using the access specifiers. 

    Java has four access specifiers, which are as follows.
        - public
        - private
        - protected
        - default

#### 🖊️Important points
- encapsulation provides ultimate control over its data members & member functions.
- `getters` and `setters`, we can achieve abstraction, which is hiding implementation details so that no one can use the fields directly in other classes or modules.
- Encapsulation hides sensitive information and implementation details, providing controlled access to data and ensuring security and privacy.

<p align="right"><a href="#readme-top">⬆ Back to Top</a></p>

## 👩🏻‍👧🏻‍👦🏻Inheritance

In simple term inheritance means what ever belongs to your parents automatically belongs to you as well.
In OOPs Inheritance means every child class that extends from its parent class has access to its parent class methods and data members except the private members.

    Java does not support multiple inheritance, but we can achieve so by using interfaces. 
#### 🖊️Important points

- `super` keyword is used to refer (superclass) parent class object. 
- It is used to call superclass methods, and to access the superclass constructor.
- Superclass constructors are not inherited by subclass.
- In the subclass constructor, call to superclass constructor is mandatory in this case, and it should be the first statement in the subclass constructor.

<p align="right"><a href="#readme-top">⬆ Back to Top</a></p>

## 🧑🏾‍🤝‍🧑🏾Polymorphism

<p align="right"><a href="#readme-top">⬆ Back to Top</a></p>

