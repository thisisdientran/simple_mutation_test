import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 class Mutations {    

    private Mutations() {
    }

    public static void find(){
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
            int totalStringInput = Integer.parseInt(reader.readLine());
            for (int i = 0; i < totalStringInput; i++) {
                String lineOne = reader.readLine();
                String lineTwo = reader.readLine();

                if(lineOne.length() != lineTwo.length()) {
                    StringBuilder lineTwoExtend = new StringBuilder(lineOne.length());
                    for (int k = 0; k < lineOne.length(); k++) {
                        if (k < lineTwo.length()) {
                            lineTwoExtend.append(lineTwo.charAt(k));
                        } else {
                            lineTwoExtend.append(' ');
                        }
                    }
                    lineTwo = lineTwoExtend.toString();
                }

                StringBuilder resultString = new StringBuilder(lineOne.length());
                
                for (int j = 0; j < lineOne.length(); j++) {
                    if (lineOne.charAt(j) == lineTwo.charAt(j)) {
                        resultString.append(".");
                    } else {
                        resultString.append("*");
                    }
                }
                System.out.println(lineOne);
                System.out.println(lineTwo);
                System.out.println(resultString);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
