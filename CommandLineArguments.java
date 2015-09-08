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
                
                
            } else if (paramArrayOfString[0].equals("max")) {
		    
		
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

    
}