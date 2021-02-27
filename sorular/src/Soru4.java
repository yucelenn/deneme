
public class Soru4 {       //define avcilari sorusu.(hocam soru hatali olabilir;surekli kalanin 1/7si gidiyor toplam paranin hepsi bolusulmuyor.)
	
	public static void main(String[] args) {
		
		int toplam=36,birinci,ikinci,ucuncu;
		birinci=1+(toplam-1)/7;
		toplam=toplam-birinci;
		ikinci=2+(toplam-2)/7;
		toplam=toplam-ikinci;
		ucuncu=3+(toplam-3)/7;
System.out.println("36 milyarlik defineden; birinci: "+birinci+" milyar, ikinci: "+ikinci+" milyar, ucuncu: "+ucuncu+" milyar para alir.");
        toplam=45;
        birinci=1+(toplam-1)/7;
        ikinci=2+(toplam-2-birinci)/7;
        ucuncu=3+(toplam-birinci-ikinci-3)/7;
System.out.println("45 milyarlik defineden; birinci: "+birinci+" milyar, ikinci: "+ikinci+" milyar, ucuncu: "+ucuncu+" milyar para alir.");
	}
}
	
	