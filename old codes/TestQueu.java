import java.util.*;
public class TestStack
{
publuc static void main(String args[])
{
Deque<String> stack =new ArrayDeque<>();
Stack.add("one");
Stack.add("two");
Stack.add("three");
int size =Stack.size()-1;
while (size>=0)
{
System.out.println(Stack.pop());
size--;
}}
}