# Java_RMI_remote_object_creation
Implementation of a Factory of remote objects of type PrintService.

The new operator cannot be used to create remote objects with respect to the node on which new is executed. It is necessary to use a pattern. The Factory pattern can help because it allows us to shift the problem of creation to methods. Since Java RMI allows you to invoke a method remotely, if the creation of an object is done with such a method it can be done remotely. Implement a Factory of remote objects of type PrintService.
The class diagram of the Factory pattern is shown below.
