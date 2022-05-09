package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Arraylistprogram5 
{

	public static void main(String[] args) 
	{
		//Generic: with the help of generic we can force collection to store similar type of data
				List<Integer> l2=new ArrayList<Integer>();
				l2.add(12);
				l2.add(10);
				l2.add(2);
				l2.add(15);
				l2.add(18);

				System.out.println("Size: "+l2.size());
				System.out.println("Elements of collection: "+l2);
				Collections.sort(l2);
				System.out.println("After sorting Elements of collection: "+l2);
				Collections.reverse(l2);
				System.out.println("Reversing sorted Elements of collection: "+l2);
				System.out.println("*********************************");
				List<Integer> l1=new ArrayList<Integer>();
                l1.add(20);
                l1.add(80);
                l1.add(60);
                l1.add(50);
                l1.add(40);
                System.out.println("Size:" + l1.size());
                System.out.println("Element of collection:" + l1);
                Collections.sort(l1);
                System.out.println("After sorting element of collection:" + l1);
                Collections.reverse(l1);
                System.out.println("Reversing sorted elements of collection:" + l1);
                l1.addAll(l2);
                System.out.println("After addall of element:" + l1);
                
	}

}
