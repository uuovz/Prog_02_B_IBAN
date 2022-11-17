import java.math.BigInteger;

public class Iban {

    static final BigInteger moduloVal = new BigInteger("97");
    static final BigInteger subVal = new BigInteger("98");
    public static String calcIBAN(String calcCC, String calcRN){
        String addedString = calcRN + calcCC;
        BigInteger bigInt = new BigInteger(addedString);
        BigInteger restInt = bigInt.mod(moduloVal);
        BigInteger subInt = subVal.subtract(restInt);

        String stringRN = subInt.toString();
        if(subInt.intValue() < 10){
            stringRN = "0" + stringRN;
        }

        return stringRN;
    }

    public static String concatIban(String twoLetterCode, String stringRN, String bsc, String calcBAN){
        String iban = twoLetterCode + stringRN + bsc + calcBAN;
        return iban;
    }


    public static void printIban(String iban){

        String outputA = iban.substring(0,4);
        String outputB = iban.substring(4,8);
        String outputC = iban.substring(8,12);
        String outputD = iban.substring(12,16);
        String outputE = iban.substring(16,20);
        String outputF = iban.substring(20,22);
        String space = " ";
        String output = outputA + space + outputB + space + outputC + space + outputD + space + outputE + space + outputF;
        System.out.println(output);
    }

}
