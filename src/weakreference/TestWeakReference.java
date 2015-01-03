package weakreference;

import java.lang.ref.WeakReference;

/**
 *
 */
public class TestWeakReference {

    public static void main(String[] args) {
        final boolean OpenStrongRef = false;// you can change the variable 'true' to test strong reference.

        Car car = new Car(22000, "silver");
        WeakReference<Car> weakCar = new WeakReference<Car>(car);
        
        int i=0;
        
        while(true){
            
            if(OpenStrongRef) {
                System.out.println("here is the strong reference 'car' "+car);//use the strong reference in the while loop
            }
            
            if(weakCar.get()!=null){
                i++;
                System.out.println("Object is alive for "+i+" loops - "+weakCar);
            }else{
                System.out.println("Object has been collected.");
                break;
            }
        }
    }

}

/*
Object is alive for 28008 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28009 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28010 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28011 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28012 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28013 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28014 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28015 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28016 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28017 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28018 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28019 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28020 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28021 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28022 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28023 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28024 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28025 loops - java.lang.ref.WeakReference@44cae5b8
Object is alive for 28026 loops - java.lang.ref.WeakReference@44cae5b8
Object has been collected.

*/