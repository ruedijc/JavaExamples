/**
 * Created by jruedin on 5/27/2016.
 */

/*
Text and inspiration from https://codingarchitect.wordpress.com/2006/09/27/four-tenets-of-oop/
....

The following are the core tenets of OOP.


        Abstraction
        Encapsulation
        Inheritance
        Polymorphism

        Let us see each of these in detail

        Abstraction: Abstraction is the concept which enables you to model an otherwise complex real life entity in a
        simpler way that our limited brains can understand. Abstraction is core to modeling sofware systems. It means
        to concentrate on the necessary things and highlight the ones which are crucial to solving the problem at hand,
        without worrying about the details which are not relevant to the problem hand.

        What does that mean?
        Assume you have to model Prakash, Sendhil and Manu for a payroll processing system. Prakash, Sendhil and Manu
        can be modeled as objects. These can be classified under the Employee class. This Employee class is an
        abstraction representing the real world entities Prakash, Manu and Sendhil in the context of a Payroll
        processing system. Their basic pay, joining date, bonus pay, incentive, hours worked or each of the months will
        be attributes of the Employee class.

        But what about the other details about Prakash, Sendhil and Manu like what languages they know, what frameworks
        they have worked on, what is their experience level in each of these skills etc. These completely irrelevent
        with respect to the Payroll system. But these might be completely relevant in a Skill management system.

        Abstraction also in modeling context could mean leaving out / hiding the implementation details in the early
        stages of the model lifecycle or in the high level arhcitecture of the system so that one can get the big
        picture. But we are just hiding these implementation details, these have to be there in some other view of the
        model. This is especially crucial if dont want to throw the model away after understanding the system. This
        makes sense if you want to do model driven development.

        As a non software example, consider the braking system of your car. As a driver of the car you just need to
        know that pressing the brake pedal, applies the brake and stops your vehicle. That’s the details you should
        know about the brake to use it. On the other hand a mechanic needs to work with the braking system at a
        different level of abstraction. He needs to know how it works. Is it a disk brake, or is it a drum brake.
        How do the hydraulics work etc. In other words he works at a different level of abstraction.

        Encapsulation: Encapsulation is what the name says, grouping together data and the operations on the data into
        a single capsule. As capsule protects its content inside, an object will protect the data which it manipulates.
        So to an object purist all data will private and he’ll provide operations which can manipulate the data. This
        ensures that the object is used in the way it was intended and to and ensures that the client cannot corrupt
        its internal state. This also ensures that the object developer can vary the internal implementation details
        without the client being affected by it. Encapsulation allows the client to be insulated from the internals
        of an object.

        As an example consider the multicast delegate class in .NET. A multicast delegate maintains a list of (single)
        delegates to be invoked in the delegate chain. This list is an internal data structure which is private. U can
        manipulate the list of delegates maintained in the multicast delegate object using the method provided by .NET,
        "Combine". Since this data structure (its actually a linked list) is private to the multicast delegate object,
        the .NET framework developers can change this to a sorted list tomorrow if needed. But none of the clients
        have to be changed because they do not rely on the internals of the object.

        Property procedures are also considered as violation of encapsulation in a pure OO sense. It is because they
        externalize the state of an application. But such a view is probably too puristic, use your judgement to decide.
        For examples your DTOs(Data Transfer Objects) have only property procedures. But its ok to have them, even if
        they violate encapsulation in true sense.

        Inheritance: This is probably the most popular tenet. This is probably the most abused one too. Inheritance is
        the concept by which you generalize in the base class and specialize in the derived class. Inheritance models
        an ‘is a’ / ‘kind of’ relationship. For example a FileStream is a stream, MemoryStream is a stream,
        NetworkStream is a stream and so on. How can we generalize in the base class and specialize in the derived
        class? Welcome to the next tenet polymorphism.

        Polymorphism: Polymorphism means one name, many forms. So how does it help us?

        Let us consider the same example given in the inheritance example. Let us say that you are writing a
        serialization component. It can either write the ouput to MemoryStream or NetworkStream or FileStream.
        If there is no inheritance you’ll end up writing this Serialization component for all the three cases.
        That’ll by quite some duplication. Since you have a base class Stream, you can use the base class variable
        to open, write data and close the stream after the serialization. Your method can take a prameter of type
        Base class Stream. If you call Open or Write or Close it is dispatched to the actual dervied type passed to
        the serialize method. The class to dispatch is not decided at compile time based on the variable type (The
        call has to be dispatched to the Stream class then). Instead the method to which the call is dispatched is
        decided based on what is the type of the instance passed to the method at runtime. The same open call is
        dispatched to the NetworkStream if the Stream parameter holds a NetworkStream instance or a FileStream if
        the Stream parameter holds a FileStream instance.

        Polymorphism provides an opportunity tremendous amount of reuse and extensibility. How does it help in
        extensibility? Assume you add an EncryptedStream tomorrow you still need not change the Serialize methods as
        long as your EncryptedStream class inherits from the Stream class. Thus polymorphism allows your code to work
        with classes that you do not know at the time of writing your piece of code. This is what which provides
        extensibility.

        What we discussed is runtime polymorphism. Method overloading / operator overloading is an example of Compile
        time polymorphism where the dispatch to the method is decided at compile time. Another classification is
        interface based polymorphic dispatch versus inheritance based polymorphic dispatch.

        It is absolutely essential for any OO developer to understand all these four concepts and apply them. But in
        reality it is not the case. Out of the 100 odd guys who I would have interviewed so far only 2 or 3 were able
        to explain all of these four tenets thoroughly. So when Manu is saying that Programming as a profession has
        not matured in India, He is probably right.

*/


public class Polymorphism1 {

    public static void main(String[] args) {

        //interface-based polymorphism
        // e.g. Android: class MyActivity extends Activity implements GPSListener

        //inheritance-based polymorphism
        //e.g Android: class MyActivity extends Activity

        //method overloading
        //e.g. println(12) , println("Hello"), println(1234.123123);

    }

}
