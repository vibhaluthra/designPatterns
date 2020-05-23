# Singleton pattern
Singleton pattern is a design solution where an application wants to have one and only one instance of any class, in all possible scenarios without any exceptional condition. 

## Description
This patterns gives one time to initialize an object.After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. So whatever modifications we do to any variable inside the class through any instance, it affects the variable of the single instance created and is visible if we access that variable through any variable of that class type defined.
To design a singleton class:

* Make constructor as private.
* Write a static method that has return type object of this singleton class.

On the first invocation, the above method will check if the instance is already created using the instance variable. If there is no instance i.e. the instance is null, it will create an instance and will return its reference. If the instance is already created, it will simply return the reference of the instance. This mechanism is called **Lazy Initialization**.

## How to make it thread safe
Suppose there are two threads T1 and T2. Both come to create the instance and check if “instance==null”. Now both threads have identified instance variable as null thus they both assume they must create an instance. They sequentially go into a synchronized block and create the instances. In the end, we have two instances in our application.

This  can be solved using double-checked locking. This principle tells us to recheck the instance variable again in a synchronized block.

