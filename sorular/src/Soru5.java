                                               //bavul sorusu
public class Soru5 {                                        
	public static void main(String[] args) {
		int deterjan=1,kitap=5,dondurma=2,adet,paha,adet2;
		double cikolata=0.75,sabun=0.25;
		int bavulkg=20,deterjankg=5,kitapkg=3,dondurmakg=1;
		double cikolatakg=1.25,sabunkg=0.25;
/*bavul     20 kg aliyor
 deterjan     5kg  =  1 tl   (kg 0,2 lira)
 sabun     0,25kg  = 0,25 tl (kg 1 lira)
 dondurma     1kg  =  2 tl   (kg 2 lira)
 kitap        3kg  =  5 tl   (kg 5/3 lira)
 cikolata  1,25kg  = 0,75 tl (kg 0,6 lira)
 pahalilik sirasi;            deterjan<cikolata<sabun<kitap<dondurma     
		 */
			adet=bavulkg/dondurmakg;
		    paha=adet*dondurma;
		    System.out.println(adet+" kg dondurma ile "+paha+" tl degerinde dolu bavul.");
		    
		    adet=bavulkg/kitapkg;
		    paha=adet*kitap;
		    adet2=(bavulkg-adet*kitapkg)/dondurmakg;
		    paha=adet2*dondurma+paha;
		    System.out.println(adet+" kitap ve "+adet2+" kg dondurma ile "+paha+" tl degerinde dolu bavul.");
		    
		    adet=bavulkg/kitapkg;
		    paha=adet*kitap;
		    adet2=(int) ((bavulkg-adet*kitapkg)/sabunkg);
		    paha=(int) (adet2*sabun+paha);
		    System.out.println(adet+" kitap ve "+adet2+" sabun ile "+paha+" tl degerinde dolu bavul.");

		    adet=bavulkg/kitapkg;
		    paha=adet*kitap;
		    adet2=(int) ((bavulkg-adet*kitapkg)/cikolatakg);
		    paha=(int) (adet2*cikolata+paha);
		    System.out.println(adet+" kitap ve "+adet2+" cikolata ile "+paha+" tl degerinde dolu bavul.");
		    
		    adet=(int) (bavulkg/sabunkg);
		    paha=(int) (adet*sabun);
		    System.out.println(adet+" sabun ile "+paha+" tl degerinde dolu bavul.");
		    
		    adet=(int) (bavulkg/cikolatakg);
		    paha=(int) (adet*cikolata);
		    System.out.println(adet+" cikolata ile "+paha+" tl degerinde dolu bavul.");
		    
		    adet=bavulkg/deterjankg;
		    paha=adet*deterjan;
		    System.out.println(adet+" deterjan ile "+paha+" tl degerinde dolu bavul.");
	}
}








