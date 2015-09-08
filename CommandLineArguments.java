/**
 *
 * @author Simon
 */
public class CommandLineArguments {
	
    /**
	* This is the starting point of the program
	* @param paramArrayOfString is an array of command line arguments
	* @throws ArrayIndexOutOfBoundsException if invalid index is encountered
	*/
    public static void main(String[] paramArrayOfString)
            throws ArrayIndexOutOfBoundsException {

        CommandLineArguments localCommandLineArguments = new CommandLineArguments();
        int i = 0; // index of paramArrayOfString
        int j = Integer.MIN_VALUE; // maximum number among the given number of ints

        try {
            if (paramArrayOfString[0].equals("table")) {
                i = Integer.parseInt(paramArrayOfString[1]);
                localCommandLineArguments.generateMultiplicationTable(i);
            } else if (paramArrayOfString[0].equals("fact")) {
                 i = Integer.parseInt(paramArrayOfString[1]);
                 System.out.println(i + " factorial using recursive method is: " + localCommandLineArguments.generateFactorialRecursively(i));
                 System.out.println(i + " factorial using for loop is: " + localCommandLineArguments.generateFactorialForLoop(i));
            } else if (paramArrayOfString[0].equals("max")) {
		 for (String str : paramArrayOfString) {
                    if (!str.equals("max")) {
                        if (Integer.parseInt(str) > j) {
                            j = Integer.parseInt(str);
                        }
                    }
                }
                System.out.println("The maximum number is: " + j);
            }
        } catch (Exception e) {
		localCommandLineArguments.showUserHelp();
        }
    }

   /**
	* This is to generate a multiplication table for a given number
	* @param paramInt is of type int
	*/
    public void generateMultiplicationTable(int paramInt) {
        System.out.println("**********************************");
        System.out.println("**\t   " + paramInt + " Times Table\t**");
        System.out.println("**********************************");
        System.out.print("");
        for (int i = 1; i <= 10; i++) {
            System.out.print("**\t" + paramInt + " X " + i + " = " + paramInt * i);
            String str = (int) Math.log10(paramInt * i) + 1 >= 2 ? "\t\t**\n" : "\t\t**\n";
            System.out.print(str);
        }
        System.out.println("**********************************");
    }
    
    /**
	* This is to generate the factorial of a given number using a recursive approach
	* @param paramInt is of type int
	* @return the factorial of a given number
	*/
    public int generateFactorialRecursively(int paramInt) {
        if (paramInt == 0) {
            return 1;
        }
        return paramInt * generateFactorialRecursively(paramInt - 1);
    }

    /**
	* This is to generate the factorial of a given number using a for loop
	* @param paramInt is of type int
	* @return the factorial of a given number
	*/
    public int generateFactorialForLoop(int paramInt) {
        int i = 1;
        for (int j = paramInt; j > 1; j--) {
            i *= j;
        }
        return i;
    }
    
     /**
	* This is to get the maximum number among some given numbers
	* @param paramVarArgs are ints
	* @return the maximum among some given numbers
	*/
    public int getMax(int... paramVarArgs) {
        int i = Integer.MIN_VALUE;
        for (int m : paramVarArgs) {
            if (m > i) {
                i = m;
            }
        }
        return i;
    }
    
  /**
    * This is to display a user guide in case no command line arguments are provided by the user
    */
    public void showUserHelp() {
	System.out.println("Hey buddy!!! you did not provide any arguments at command line");
        System.out.println("You might want to try one of the following commands:");
        System.out.println("'java CommandLineArguments table <int>'");
        System.out.println("'java CommandLineArguments fact <int>'");
        System.out.println("'java CommandLineArguments max <ints separated by spaces>'");
    }

    
}