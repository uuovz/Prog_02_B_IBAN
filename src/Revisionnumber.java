public class Revisionnumber {
    public String ban; //Bank account Number
    public String bsc; //Bank sorting code
    public String calcBAN; //calculated Bank account Number
    public String calcRN; //calculated Revision Number

    public Revisionnumber(String ban, String bsc){
        this.ban = ban;
        this.bsc = bsc;
        this.calcBAN = convertBan(ban);
        this.calcRN = calcRVN(calcBAN, bsc);
    }

    String convertBan(String ban) { //return ban with 10 numbers.
        int length = ban.length();
        int diff = 10 - length;

        for (int i = diff - 1; i >= 0; i--) {
            ban = "0" + ban;
        }
        return ban;
    }

    String calcRVN(String calcBAN, String bsc){
        String output = bsc + calcBAN;
        return output;
    }
}
