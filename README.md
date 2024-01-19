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

**[⬆ Back to Top](#four-pillars-of-oops)**

## 🔗Encapsulation

Encapsulation is a concept of `data binding` and `data hiding` into a single unit called class.

**data binding** means 

**[⬆ Back to Top](#four-pillars-of-oops)**

## 👩🏻‍👧🏻‍👦🏻Inheritance

**[⬆ Back to Top](#four-pillars-of-oops)**

## 🧑🏾‍🤝‍🧑🏾Polymorphism

**[⬆ Back to Top](#four-pillars-of-oops)**

