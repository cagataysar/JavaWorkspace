import org.w3c.dom.html.HTMLAreaElement;

public class MainClass {

    public static void main(String[] args) {
        //returnWithIf("Numan karaaslan");
        //returnWithSwitch("Drazen Petrovic");
        returnWithArray("NUMAN");
    }

    private static void returnWithArray(String name) {
        char[] charArray = new char[] {'A', 'E', 'I','İ', 'O', 'Ö','U', 'Ü'};     // 'a','e', 'ı', 'i','o', 'ö', 'u','ü'
        String[] strArray = new String[] {"A", "E", "I","İ", "O", "Ö","U", "Ü"};
        String[] numbers = new String[] {"1", "2", "3","4", "5", "6","7", "8"};

        //int[] numbers = new int[] {1,2,3,4,5,6,7,8};

        int i = 0;
        String newStr = null;
        /*while (name.contains(strArray[i])) {
            newStr = name.replace(strArray[i], numbers[i]);
            i++;
        }*/
        /*if ((name.equals(strArray[i])) {
            newStr = name.replace(strArray[i], numbers[i]);
            i++;
        }
        for (i = 0; i < name.length(); i++) {
            if () {
                newStr = name.replace(strArray[i], numbers[i]);
            }
        }*/
        System.out.println(newStr);
    }

    private static void returnWithSwitch(String name) {
        for (int i = 0; i < name.length(); i++) {
            char k = name.charAt(i);
            switch (k) {
                case 'A': case 'a':
                    System.out.print("1");
                    break;
                case 'E': case 'e':
                    System.out.print("2");
                    break;
                case 'I': case 'ı':
                    System.out.print("3");
                    break;
                case 'İ': case 'i':
                    System.out.print("4");
                    break;
                case 'O': case 'o':
                    System.out.print("5");
                    break;
                case 'Ö': case 'ö':
                    System.out.print("6");
                    break;
                case 'U': case 'u':
                    System.out.print("7");
                    break;
                case 'Ü': case 'ü':
                    System.out.print("8");
                    break;
                default:
                    System.out.print(k);
                    break;
            }
        }


    }

    private static void returnWithIf(String name) {
        for (int i = 0; i < name.length(); i++) {
            char k = name.charAt(i);
            if (k == 'A' || k == 'a'){
                System.out.print("1");
            } else if (k == 'E' || k == 'e') {
                System.out.print("2");
            }
            else if (k == 'I' || k == 'ı') {
                System.out.print("3");
            }
            else if (k == 'İ' || k == 'i') {
                System.out.print("4");
            }
            else if (k == 'O' || k == 'o') {
                System.out.print("5");
            }
            else if (k == 'Ö' || k == 'ö') {
                System.out.print("6");
            }
            else if (k == 'U' || k == 'u') {
                System.out.print("7");
            }
            else if (k == 'Ü' || k == 'ü') {
                System.out.print("8");
            }
            else{
                System.out.print(k);
            }
        }
    }
    
}

