package week2;

/**
 * Generate 100 random characters and 100 single digits.
 *
 * @author John Phillips
 */
public class C6N38 {

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(getRandomUpperCaseLetter());
            }
            System.out.println("");
        }
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(getRandomDigitCharacter());
            }
            System.out.println("");
        }
    }
}

/*
UOIGFZLQBH
WNXSAEIUEV
IWNZHLUKYF
VLXUPEEGHZ
TYNVNLZCGX
TNYBSWLJZM
MGWUNNHQDK
AUTPGNCTWY
FZNNIANDDG
CLLIKOLPZY
5739446227
5969011931
6256765167
5044107194
6037866232
4251982042
3583696360
0034107979
3330627790
1209366959
*/