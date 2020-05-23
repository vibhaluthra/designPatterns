# Observer pattern
The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

In observer pattern, there are many observers (subscriber objects) that are observing a particular subject (publisher object). Observers register themselves to a subject to get a notification when there is a change made inside that subject.

## When to use observer design pattern
When you have a design a system where multiple entities are interested in any possible update to some particular second entity object, we can use the observer pattern.

## Real world example of observer pattern
A real world example of observer pattern can be any social media platform such as Facebook or twitter. When a person updates his status – all his followers gets the notification.
A follower can follow or unfollow another person at any point of time. Once unfollowed, person will not get the notifications from subject in future.

