public class AufgabeB {
    public static void main(String[] args) {

        String countryCode = args[0];
        String bsc = args[1];
        String ban = args[2];

        CountryCode cc = new CountryCode(countryCode);
        Revisionnumber rn = new Revisionnumber(ban, bsc);
        String stringRN = Iban.calcIBAN(cc.calcCC, rn.calcRN);
        String iban = Iban.concatIban(cc.twoLetterCode , stringRN ,rn.bsc ,rn.calcBAN);

        Iban.printIban(iban);
    }
}