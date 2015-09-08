/**
 *
 * @author Simon
 */
public class CommandLineArguments {

    public static void main(String[] paramArrayOfString)
            throws ArrayIndexOutOfBoundsException {

        CommandLineArguments localCommandLineArguments = new CommandLineArguments();
        int i = 0;
        int j = Integer.MIN_VALUE;

        try {
            if (paramArrayOfString[0].equals("table")) {
                i = Integer.parseInt(paramArrayOfString[1]);
                localCommandLineArguments.generateMultiplicationTable(i);
            } else if (paramArrayOfString[0].equals("fact")) {
                 i = Integer.parseInt(paramArrayOfString[1]);
                 System.out.println(i + " factorial using recursive method is: " + localCommandLineArguments.generateFactorialRecursively(i));
                 System.out.println(i + " factorial using for loop is: " + localCommandLineArguments.generateFactorialForLoop(i));
            } else if (paramArrayOfString[0].equals("max")) {
		 for (String str2 : paramArrayOfString) {
                    if (!str2.equals("max")) {
                        if (Integer.parseInt(str2) > j) {
                            j = Integer.parseInt(str2);
                        }
                    }
                }
                System.out.println("The maximum number is: " + j);
            }
        } catch (Exception e) {
	 
        }
    }

   
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
    
    public int generateFactorialRecursively(int paramInt) {
        if (paramInt == 0) {
            return 1;
        }
        return paramInt * generateFactorialRecursively(paramInt - 1);
    }

    public int generateFactorialForLoop(int paramInt) {
        int i = 1;
        for (int j = paramInt; j > 1; j--) {
            i *= j;
        }
        return i;
    }
    
    public int getMax(int... paramVarArgs) {
        int i = Integer.MIN_VALUE;
        for (int m : paramVarArgs) {
            if (m > i) {
                i = m;
            }
        }
        return i;
    }

    
}