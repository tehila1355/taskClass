import javax.print.attribute.standard.PrinterName;
import java.util.Arrays;

public class Main {



    public Element[] sortedArray(char[] s1, char[] s2) {
        int counter = 0;
        int counter2 = 0;
        char[] consolidationOfArrays = new char[s1.length + s2.length];
        for (int i = 0; i < consolidationOfArrays.length; i++) {
            if (i < s1.length){
                consolidationOfArrays[i] = s1[i];
            }else {
                consolidationOfArrays[i] = s2[counter];
                counter++;
            }
        }
        Element[] s1ElementArray = newArray(s1);
        Element[] s2ElementArray = newArray(s2);
        Element[] finalElementArray = new Element[s1ElementArray.length + s2ElementArray.length];
        for (int i = 0; i < s1ElementArray.length; i++) {
            for (int j = 0; j < s2ElementArray.length; j++) {
                if (s1ElementArray[i].getLetter() == s2ElementArray[j].getLetter()){
                    finalElementArray[counter2] = new Element(s1ElementArray[i].getLetter(),s1ElementArray[i].getAmount() + s2ElementArray[j].getAmount());
                    counter2++;
                    System.out.println(finalElementArray[counter2 - 1]);
                }
            }
        }
        Element[] A = new Element[4];

        return A;
    }

    public Element[] newArray(char[] charsToElement) {
        int counter = 0;
        int amoust = 0;
        Element[] elementArray = new Element[charsToElement.length];
        for (int i = 0; i < charsToElement.length; i++) {
            if (isNewChar(charsToElement, i)) {
                amoust = amount(charsToElement[i], charsToElement);
                elementArray[counter] = new Element(charsToElement[i],amoust );
                counter++;
            }
        }
        return elementArray;
    }

    private int amount(char c1, char[] chars) {
        int amount = 0;
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == c1) {
                amount++;
            }
        }
        return amount;
    }

    private boolean isNewChar(char[] chars, int index) {
        boolean isNew = true;
        for (int i = 0; i < index; i++) {
            if (chars[i] == chars[index]) {
                isNew = false;
            }
        }
        return isNew;
    }


    public static void main(String[] args) {
        Main main = new Main();
        char[] a1 = {'a','a','b','a'};
        char[] a2 = {'a','d','e','e'};
        main.sortedArray(a1,a2);
    }


}