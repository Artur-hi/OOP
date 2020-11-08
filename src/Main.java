public class Main {
    public static void main(String[] args) {
        Tariff  everywhere_online = new Tariff();

        everywhere_online.id = "https:kazan.tele2.ru/tariff/everywhere-online";
        everywhere_online.name = "Везде онлайн";
        everywhere_online.numberMimutes = 500;
        everywhere_online.bonusCommunications = "unlimited";
        everywhere_online.price = 500;
        everywhere_online.buyUrl = "https:kazan.tele2.ru/shop/together?pageParams=quantity%3D4%26tariff%3Dmy-online_discount";
        everywhere_online.numberGigabytes = 40;
        everywhere_online.bonusApplications = "unlimited";
        everywhere_online.imageUrl = "https:kazan.tele2.ru/api/media/asset?mediaId=m220001";
        everywhere_online.tuneUrl = "https:kazan.tele2.ru/nastroy-tariff_sliders";
    }

}
