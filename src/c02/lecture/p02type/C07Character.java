package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {

        //char (character)
        //2byte == 16bits
        //0~65535
        //unicode
        char a = 99;
        char b = 120;
        char c = 65535;
//        char d = 65536;
//        char e = -1;
        char f = 4314;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("f = " + f);

        char h = 0x2042;

        char i = 'c';
        System.out.println("h = " + h);

        char k = 0xac00;
        char l = '가';
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        int o = 0x1f607;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

        int j = 0x1f3a4;

        char[] emoji2 = Character.toChars(j);
        String emojis2 = new String(emoji2);
        System.out.println("emojis2 = " + emojis2);
    }
}
