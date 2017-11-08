/**
 * 
 * @author Justin Minsk
 * @version [2/1/2017]
 * with date it will tell you the zodiac sign 
 * and a fact about the sign
 * also will display a random date and give the same information
 * 
 * set up 2 scanners 
 * ask for day born as a number
 * user entered int day
 * ask for month born as a number
 * user entered int month
 * if month is 1 and day >= 20
 * aquarius and fact urn
 * else if month is 2 and day is <19
 * aquarius and fact urn
 * else if month is 2 and day is >=19
 * pisces and fact fish
 * else if month is 3 and day is < 21
 * pisces and fact fish
 * else if month is 3 and day is >= 21
 * aries fact ram
 * else if month = 4 day <20
 * aries fact ram
 * else if month = 4 day >=20
 * taurus bull
 * else if month = 5 day < 21
 * taurus bull
 * else if month =5 day >= 21
 * gemini faces
 * else if month = 6 day < 21
 * ""
 * else if month  = 6 day >= 21
 * cancer crab
 * else if month = 7 day < 23
 * ""
 * else if month = 7 day >= 23
 * leo lion
 * else if month = 8 day <23
 * ""
 * else if month = 8 day >= 23
 * virgo woman
 * else if month = 9 day < 23
 * ""
 * else if month = 10 day >= 23
 * libra scale
 * else if month = 10 day < 23
 * ""
 * else if month = 10 day >= 23
 * scorpio scorpian 
 * else if month = 11 day < 22
 * ""
 * else if month = 11 day >= 22
 * sagittarius bow
 * else if month =12 day < 22
 * ""
 * else if month = 12 day >= 22
 * capricorn goat
 * else if month = 1 day < 20
 * ""
 * month = (int)(Math.random()*(12-1)+1)
 * day = (int)(Math.random()*(28-1)+1)
 * redo above for name and fact
 * 
 * * */
import java.util.Scanner;

public class ZodiacSigns {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	System.out.println("What is the month you are born as a number?");
	int month = scan.nextInt();
	System.out.println("What is the day you where born as a number?");
	int day = scan.nextInt();
	if (month==1 && day >=20){
		System.out.println(month+"/"+day+" is an aquarius and is represented by an urn.");
	}
	if (month==2 && day <19){
		System.out.println(month+"/"+day+" is an aquarius and is represented by an urn.");
	}
	if (month==2 && day >=19){
		System.out.println(month+"/"+day+" is a pisces and is represented by a fish.");
	}
	if (month==3 && day <21){
		System.out.println(month+"/"+day+" is a pisces and is represented by a fish.");
	}
	if (month==3 && day >=21){
		System.out.println(month+"/"+day+" is a aries and is represented by a ram.");
	}
	if (month==4 && day <20){
		System.out.println(month+"/"+day+" is a aries and is represented by a ram.");
	}
	if (month==4 && day >=20){
		System.out.println(month+"/"+day+" is a taurus and is represented by a bull.");
	}
	if (month==5 && day <21){
		System.out.println(month+"/"+day+" is a taurus and is represented by a bull.");
	}
	if (month==5 && day >=21){
		System.out.println(month+"/"+day+" is a gemini and is represented by two faces.");
	}
	if (month==6 && day <21){
		System.out.println(month+"/"+day+" is a gemini and is represented by two faces.");
	}
	if (month==6 && day >=21){
		System.out.println(month+"/"+day+" is a cancer and is represented by a crab.");
	}
	if (month==7 && day <23){
		System.out.println(month+"/"+day+" is a cancer and is represented by a crab.");
	}
	if (month==7 && day >=23){
		System.out.println(month+"/"+day+" is a leo and is represented by a lion.");
	}
	if (month==8 && day <23){
		System.out.println(month+"/"+day+" is a leo and is represented by a lion.");
	}
	if (month==8 && day >=23){
		System.out.println(month+"/"+day+" is a virgo and is represented by a woman.");
	}
	if (month==9 && day <23){
		System.out.println(month+"/"+day+" is a virgo and is represented by a woman.");
	}
	if (month==9 && day >=23){
		System.out.println(month+"/"+day+" is a libra and is represented by scales.");
	}
	if (month==10 && day <23){
		System.out.println(month+"/"+day+" is a libra and is represented by scales.");
	}
	if (month==10 && day >=23){
		System.out.println(month+"/"+day+" is a scorpio and is represented by a scorpian.");
	}
	if (month==11 && day <22){
		System.out.println(month+"/"+day+" is a scorpio and is represented by a scorpian.");
	}
	if (month==11 && day >=22){
		System.out.println(month+"/"+day+" is a sagittatius and is represented by a bow and arrow.");
	}
	if (month==12 && day <22){
		System.out.println(month+"/"+day+" is a sagittatius and is represented by a bow and arrow.");
	}
	if (month==12 && day >=22){
		System.out.println(month+"/"+day+" is a capricorn and is represented by a goat.");
	}
	if (month==1 && day <20){
		System.out.println(month+"/"+day+" is a capricorn and is represented by a goat.");
	}
	System.out.println("also");
	month = (int)(Math.random()*(12-1)+1);
	day = (int)(Math.random()*(28-1)+1);
	if (month==1 && day >=20){
		System.out.println(month+"/"+day+" is an aquarius and is represented by an urn.");
	}
	if (month==2 && day <19){
		System.out.println(month+"/"+day+" is an aquarius and is represented by an urn.");
	}
	if (month==2 && day >=19){
		System.out.println(month+"/"+day+" is a pisces and is represented by a fish.");
	}
	if (month==3 && day <21){
		System.out.println(month+"/"+day+" is a pisces and is represented by a fish.");
	}
	if (month==3 && day >=21){
		System.out.println(month+"/"+day+" is a aries and is represented by a ram.");
	}
	if (month==4 && day <20){
		System.out.println(month+"/"+day+" is a aries and is represented by a ram.");
	}
	if (month==4 && day >=20){
		System.out.println(month+"/"+day+" is a taurus and is represented by a bull.");
	}
	if (month==5 && day <21){
		System.out.println(month+"/"+day+" is a taurus and is represented by a bull.");
	}
	if (month==5 && day >=21){
		System.out.println(month+"/"+day+" is a gemini and is represented by two faces.");
	}
	if (month==6 && day <21){
		System.out.println(month+"/"+day+" is a gemini and is represented by two faces.");
	}
	if (month==6 && day >=21){
		System.out.println(month+"/"+day+" is a cancer and is represented by a crab.");
	}
	if (month==7 && day <23){
		System.out.println(month+"/"+day+" is a cancer and is represented by a crab.");
	}
	if (month==7 && day >=23){
		System.out.println(month+"/"+day+" is a leo and is represented by a lion.");
	}
	if (month==8 && day <23){
		System.out.println(month+"/"+day+" is a leo and is represented by a lion.");
	}
	if (month==8 && day >=23){
		System.out.println(month+"/"+day+" is a virgo and is represented by a woman.");
	}
	if (month==9 && day <23){
		System.out.println(month+"/"+day+" is a virgo and is represented by a woman.");
	}
	if (month==9 && day >=23){
		System.out.println(month+"/"+day+" is a libra and is represented by scales.");
	}
	if (month==10 && day <23){
		System.out.println(month+"/"+day+" is a libra and is represented by scales.");
	}
	if (month==10 && day >=23){
		System.out.println(month+"/"+day+" is a scorpio and is represented by a scorpian.");
	}
	if (month==11 && day <22){
		System.out.println(month+"/"+day+" is a scorpio and is represented by a scorpian.");
	}
	if (month==11 && day >=22){
		System.out.println(month+"/"+day+" is a sagittatius and is represented by a bow and arrow.");
	}
	if (month==12 && day <22){
		System.out.println(month+"/"+day+" is a sagittatius and is represented by a bow and arrow.");
	}
	if (month==12 && day >=22){
		System.out.println(month+"/"+day+" is a capricorn and is represented by a goat.");
	}
	if (month==1 && day <20){
		System.out.println(month+"/"+day+" is a capricorn and is represented by a goat.");
	}
}
}
