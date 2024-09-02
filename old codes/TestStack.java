import java.util.*;
public class TestStack
{
public Static void main(String args[])
{
Deque<String> stack =new ArrayDeque<>();
Stack.push("one");
Stack.push("two");
Stack.push("three");
int size =Stack.size()-1;
while (size>=0)
{
System.out.println(Stack.pop());
size--;
}}
}