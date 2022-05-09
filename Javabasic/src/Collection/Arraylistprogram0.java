package Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;


public class Arraylistprogram0
{

	public static void main(String[] args) 
	{
	ArrayList list1= new ArrayList();	
	list1.add("Mango");
    list1.add(1234);
    list1.add("Banana");
    list1.add("A");
    list1.add(25.25);
    list1.add("true");
    list1.add(new Arraylistprogram0());
    //Printing the arraylist object
    System.out.println("Size of list:" + list1.size());
    System.out.println("Element of list:" + list1);
    System.out.println("Traversing list through for loop:");
    for (int i=0; i<list1.size(); i++)
    {
    	System.out.println(list1.get(i));
    	System.out.println("Traversing list through for loop:");
    	// Traversing list through for-each loop
    	for(Object fruit : list1);
    	{
    		 System.out.println(list1); 
    	}   	
    }
      // accessing the element
	System.out.println("returning element:" + list1.get(3));// it will return the 2nd element, because index starts
	                                               // from 2
	// changing/update existing object
	list1.set(1, "Abhishek");
	System.out.println("size of list1:" + list1.size());
	System.out.println("Element of list:" + list1);
	System.out.println("reterining element:" + list1.get(1));
	// Sorting the list
			Collections.sort(list1);//by default it sort the passed collection element in assending order and store it in the same collection
			System.out.println("size of list: " + list1.size());
			System.out.println("Elements of list: " + list1);

			System.out.println("Traversing list through forEach() method:");
			// The forEach() method is a new feature, introduced in Java 8.
			list1.forEach(a -> { // Here, we are using lambda expression
				System.out.println(a);
			});
		
			System.out.println("Traversing list through Iterator interface:");
			Iterator itr = list1.iterator();
			/**
			 * List element: [Banana, Dates, Grapes, Mango]
			 * Iterator is a Interface in collection, which is used to iterate collection elements
			 * Iterator interface has following method to iterate collection elements
			 * 1. hasNext() ---> boolean --> true next element is present, false no next element
			 * 2. next() ---> Object --> it will return next element from collection
			 * 3. remove() --> void --> element deletion
			 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
			 */
//			System.out.println(itr.hasNext());
//			System.out.println(itr.next());//Banana
//			System.out.println(itr.next());//Dates
//			System.out.println(itr.next());//Grapes
//			System.out.println(itr.next());//Mango
//			System.out.println(itr.next());//NoSuchElementException exception
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println(itr.hasNext());//
	}

}
