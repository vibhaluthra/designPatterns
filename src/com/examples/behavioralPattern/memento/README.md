# Memento Pattern
Memento pattern is used to restore state of an object to a previous state. It is also known as snapshot pattern.

A memento is is like a restore point during the life cycle on the object, which the client application can use to restore the object state to its state. Conceptually, it is very much like we create restore points for operating systems and use to restore the system if something breaks or system crashes.

## When to use memento design pattern
Memento pattern shall be be used in any application in which object’s state is continuously changing and the user of the application may decide to rollback or undo the changes changes at any point.

##Real world example of memento pattern
* In code editors, we can revert or apply any code change with simple commands to undo and redo.
* In calculator applications, we can revisit all the calculations in memory with simple button press.
* In programming, memento can be used to create checkpoints during database transactions. If any operation fails, we just rollback everything to last known stable database state.

Design participants
The memento pattern has three participants.

## Design participant
1. Originator – is the object that knows how to create and save it’s state for future. It provides methods createMemento() and restore(memento).*Article is the orginator*.
2. Caretaker – performs an operation on the Originator while having the possibility to rollback. It keeps track of multiple mementos. Caretaker class refers to the Originator class for saving (createMemento()) and restoring (restore(memento)) originator’s internal state.*Main is the Caretaker.*
3. Memento – the lock box that is written and read by the Originator, and shepherded by the Caretaker. In principle, a memento must be in immutable object so that no one can change it’s state once created.*ArtcleMemento is the memento. It is a final class and also its variables are also final. It is necessary to create a constructor for all the final variables so that they can have a default value*.

# FAQ
* The biggest advantage is that you can always discard the unwanted changes and restore it to an intended or stable state.
* Although one of the challenges is that a high number of mementos require more storage. At the same time, they put additional burdens on a caretaker.


