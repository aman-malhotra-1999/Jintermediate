import java.util.*;
class A8
{
public static void main(String args[])
{
String stuff[]= {"babies","watermelon","melons","fudge"};
LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

thelist.add("pumpkin");
thelist.addFirst("firstthing");

//convert back to an array 
stuff = thelist.toArray(new String [thelist.size()]);
for(String x: stuff)
System.out.printf("%s ", x);
}
}














