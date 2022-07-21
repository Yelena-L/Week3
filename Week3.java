package week3;
public class Week3 {
public static class week3 {
static int[] numbers = {3,9,23,64,2,8,28,93};
String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};

public static void main (String[] args){
	week3 w3 = new week3();
	w3.codingStep1a();
	w3.codingStep1b();
	w3.codingStep1c();
	w3.codingStep2a();
	w3.codingStep2b();
	String s = w3.task7("Mama", 5);
	System.out.println("First+Last is: "+s);
	s = w3.firstAndLast("Joe","Biden");
	System.out.println("First+Last is " + s);
	boolean isMoreThan100 = w3.checkForSum100(numbers);
	String yn =isMoreThan100? "Yes" : "No";
	int sum =0;
	for(int i=0; i< numbers.length; i++) {
		sum += numbers[i];
	}
	System.out.println("Sum of numbers[] ("+((Integer)sum).toString() +")>100?"+(isMoreThan100? "Yes":"No"));
	
	double[] dbls1 = {1.1,2.2,3.3};
	double[] dbls2 = {11.1,12.2,13.3};
	double avg = w3.doubleArrayAverage(dbls1);
	System.out.println("Double[] average: " + ((Double)avg).toString());
	boolean firstrGreaterThanSecond = w3.compareDoubleArrays(dbls1,dbls2);
	System.out.println("dbls1 > dbls2? " + (firstrGreaterThanSecond?"Yes" : "No"));
}
//Extending int[] array by adding a specified value
public int[] extendIntArray(int[] intArray, int value) {
	int oldSize = intArray.length;
	int[] newArray = new int[oldSize + 1];
	for(int i = 0; i < oldSize; i++) {
		newArray[i] = intArray[i];
	}
	newArray[oldSize] = value;
	return newArray;
						
}
public int averageIntArray(int[] intArray)
{
int sum = 0;
for(int i = 0; i < intArray.length; i++) {
sum += intArray[i];
}
return sum / intArray.length;
}

// Calculate difference of last minus first elements of int-array
public  int LastMinusFirstInt(int[] nums)
{
return numbers[nums.length - 1] - nums[0];
}

public void codingStep1a() {
// a. Programmatically subtract the value of the first element in the array
// from the value in the last element of the array (i.e. do not use ages[7]
// in your code). Print the result to the console.
int dif = LastMinusFirstInt(numbers);
System.out.println("Last-First = " + ((Integer)dif).toString());  
}

public void codingStep1b() {
// b. Add a new age to your array and repeat the step above to ensure it is dynamic
// (works for arrays of different lengths)
numbers = extendIntArray(numbers, 99);
int dif = LastMinusFirstInt(numbers);
System.out.println("Extended Last-First = " + ((Integer)dif).toString());  
}

public void codingStep1c() {
// c. Use a loop to iterate through the array and calculate the average age.
// Print the result to the console
int avg = averageIntArray(numbers);
System.out.println("Average age = " + ((Integer)avg).toString());  
}

public void codingStep2a() {
// a. Use a loop to iterate through the array and calculate the average
// number of letters per name.
// Print the result to the console
int sum = 0;
for(int i = 0; i < names.length; i++) {
sum += names[i].length();
}
System.out.println("Sum of letters in  " + ((Integer)names.length).toString() +
" names is " + ((Integer)sum).toString() + "; Average is " +
((Integer)(sum / names.length)).toString());  
}

public void codingStep2b() {
// b. Use a loop to iterate through the array again and concatenate
//all the names together, separated by spaces,
// and print the result to the console
String all = "";;
for(int i = 0; i < names.length; i++) {
all += names[i] + " ";
}
System.out.println("All names:\n" +   all);  
}

public void task5() {
int[] nameLengths = new int[names.length];
for(int i = 0; i < names.length; i++) {
nameLengths[i] = names[i].length();
};
}

public void task6() {
int[] nameLengths = new int[names.length];
for(int i = 0; i < names.length; i++) {
nameLengths[i] = names[i].length();
};
int sum = 0;
for(int i = 0; i < nameLengths.length; i++) {
sum += nameLengths[i];
}
System.out.println("Sum of nameLengths[] = " + ((Integer)sum).toString());  
}

public String task7(String word, int n) {
String s = "";
for(int i = 0; i < n; i++)
s += word;
return s;
}

public String firstAndLast(String first, String last) {
return first + " " + last;
}

public boolean checkForSum100(int[] numbers) {
int sum = 0;
for(int i = 0; i < names.length; i++) {
sum += numbers[i];
}
return (sum > 100);
}

public double doubleArrayAverage(double[] dbls) {
double sum = 0;
for(int i = 0; i <dbls.length; i++) {
sum += dbls[i];
}
return sum / dbls.length;
}

public boolean compareDoubleArrays(double[] dbls1, double[] dbls2) {
double avg1 = doubleArrayAverage(dbls1);
double avg2 = doubleArrayAverage(dbls2);
return (avg1 > avg2);
}

public boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
{
return isHotOutside & moneyInPocket >= 10.50;
}


}


}

