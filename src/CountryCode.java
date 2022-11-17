public class CountryCode {
    public String twoLetterCode;
    public String calcCC;
    final String latinAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public CountryCode(String twoLetterCode){
        this.twoLetterCode = twoLetterCode;
        this.calcCC = convertNumber(twoLetterCode);
    }

    public String convertNumber(String twoLetterCode) { //
        String first = twoLetterCode.substring(0,1);
        String second = twoLetterCode.substring(1,2);

        int firstIndex = getAlphabetIndex(first);
        int secondIndex = getAlphabetIndex(second);

        firstIndex = firstIndex + 9;
        secondIndex = secondIndex + 9;

        String firstString = Integer.toString(firstIndex);
        String secondString = Integer.toString(secondIndex);

        String calcCCNum = firstString + secondString + "00";

        return calcCCNum;
    }

    private int getAlphabetIndex(String character){ //return int with index of String in Latain Alphabet
        int index = latinAlphabet.indexOf(character);
        return index + 1;
    }

}
