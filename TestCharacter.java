import java.util.ArrayList; 

public class TestCharacter 
{ 
public static void main(String [] args)
{ 
ArrayList <Character> numAL; 
numAL=new ArrayList <Character> (); 

numAL.add('a'); 
numAL.add('b'); 
numAL.add('c'); 

System.out.println("Print a character at position 1:" +numAL.get(1)); 
System.out.println("Before Deletion:\n" + numAL); 

for(int i=0; i<numAL.size();i++){ 
if(numAL.get(i)=='a'){ 
numAL.remove(i); 
i--; 
} 
} 
System.out.println("After Deletion :\n" + numAL); 
} } 
