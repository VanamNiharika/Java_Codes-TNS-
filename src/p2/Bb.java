// Java program to illustrate
// protected modifier
package p2;

// importing all classes in package p1
import p1.*; 

// Class Bb is subclass of Aa
class Bb extends Aa {
    public static void main(String args[])
    {
        Bb obj = new Bb();
        obj.display();
    }
}