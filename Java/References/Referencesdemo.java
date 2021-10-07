package Java.References;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class Gfg
{
    //code
    public void x()
    {
        System.out.println("GeeksforGeeks");
    }
}

// An alternative to using a WeakReference
// is to have another class implement an interface. This is done in the Listener/Observer Pattern.
// https://stackoverflow.com/questions/3243215/how-to-use-weakreference-in-java-and-android-development

public class Referencesdemo {
    public static void main(String[] args){

        // Strong reference
        // Not eligible for garbage collection
        Gfg gfg = new Gfg();

        // Weak reference
        // eligible for garbage collection
        // --------WILL BE REMOVED IF JVM NEEDS MEMORY--------
        WeakReference<Gfg> gfgWeakReference = new WeakReference<Gfg>(gfg);

        //Now, Gfg-type object to which 'g' was pointing earlier
        //is available for garbage collection.
        //But, it will be garbage collected only when JVM needs memory.
        gfg = null;

        // You can retrieve back the object which
        // has been weakly referenced.
        // It successfully calls the method.
        gfg = gfgWeakReference.get();

        gfg.x();

        // Creating Soft Reference to Gfg-type object to which 'g'
        // is also pointing.
        // ---------WILL BE REMOVED ONLY IF JVM IS OUT OF MEMORY--------
        SoftReference<Gfg> softref = new SoftReference<Gfg>(gfg);

        // Now, Gfg-type object to which 'g' was pointing
        // earlier is available for garbage collection.
        gfg = null;

        // You can retrieve back the object which
        // has been weakly referenced.
        // It successfully calls the method.
        gfg = softref.get();

        gfg.x();

        //Creating reference queue
        ReferenceQueue<Gfg> refQueue = new ReferenceQueue<Gfg>();

        //Creating Phantom Reference to Gfg-type object to which 'g'
        //is also pointing.
        //  -------- before removing them from the memory, JVM puts them in a queue called ‘reference queue’ --------
        PhantomReference<Gfg> phantomRef = null;

        phantomRef = new PhantomReference<Gfg>(gfg,refQueue);

        //Now, Gfg-type object to which 'g' was pointing
        //earlier is available for garbage collection.
        //But, this object is kept in 'refQueue' before
        //removing it from the memory.
        gfg = null;

        //It always returns null.
        gfg = phantomRef.get();

        //It shows NullPointerException.
        gfg.x();

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        // Called when garbage collection remove a reference
    }
}
