/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		System.out.println("THIS IS MY ASCII ART!!!!");
		// Add code here
		lineend();
		lineend();
		line1();
		line2();
		line3();
		line4();
		line5();
		line6();
		line7_11();
		line7_11();
		line7_11();
		line7_11();
		line7_11();
		line12();
		line13();
		line14();
		line15();
		line16();
		line17();
		line18();
		line19();
		line20();
		line21();
		line22();
		//line23();
		line24();
		line25();
		line26();
		line27();
		line28();
		line29_30();
		line29_30();
		line29_30();
	}
	
	public static void linebeginning() {
		System.out.print("	");
	}
	
	public static void lineend() {
		System.out.println("");
	}
	public static void lineadd() {
		System.out.print("      ");
	}
	public static void line1() {
		linebeginning();
		lineadd();
		System.out.print("    ,eeCCCCHHHHCCee.");
		lineend();
	}
	public static void line2() {
		linebeginning();
		lineadd();
		System.out.print(",eHHHHCCCCHHHHHHCCCCCHHH,");
		lineend();
	}
	public static void line3() {
		System.out.print("     ");
		lineadd();
		System.out.print(",CCHHHHHCCCCCHHHHHHCCCCCHHHHCe.");
		lineend();
	}
	public static void line4() {
		System.out.print("   ");
		lineadd();
		System.out.print(",CCCHHHHHCCCCCCHHHHHHCCCCCHHHHHCCC,");
		lineend();
	}
	public static void line5() {
		System.out.print("  ");
		lineadd();
		System.out.print(",CCCHHHHHHCCCCCHHHHHHHCCCCCCHHHHHCCCC,");
		lineend();
	}
	public static void line6() {
		System.out.print(" ");
		lineadd();
		System.out.print("HCCCCHHHHHCCCCCCHHHHHHHCCCCCCCHHHHHCCCCH");
		lineend();
	}
	public static void line7_11() {
		lineadd();
		System.out.print("HHCCCCHHHHHCCCCCCHHHHHHHCCCCCCCHHHHHCCCCHH");
		lineend();
	}
	public static void line12() {
		lineadd();
		System.out.print("VHCCCCHHHHHCCCCCCHHHHHHHCCCCCCCHHHHHCCCCH'");
		lineend();
	}
	public static void line13() {
		lineadd();
		System.out.print(" VHCCCHHHHHCCCCCCHHHHHHHCCCCCCCHHHHCCCCH'");
		lineend();
	}
	public static void line14() {
		lineadd();
		System.out.print("  VHCCCHHHHHCCCCCHHHHHHHCCCCCCHHHHCCCCC'");
		lineend();
	}
	public static void line15() {
		lineadd();
		System.out.print("   VCCCCHHHHHCCCCHHHHHHHCCCCCHHHHCCCCC'");
		lineend();
	}
	public static void line16() {
		lineadd();
		System.out.print("    VCCCCHHHHCCCCCHHHHHCCCCCHHHHHCCCC'");
		lineend();
	}
	public static void line17() { //special character
		lineadd();
		System.out.print("     “CCCCHHHHCCCCHHHHHCCCCCHHHCCCC\"");
		lineend();
	}
	public static void line18() {
		lineadd();
		System.out.print("       \"CCCHHHCCCCHHHHHCCCCHHHHCC'");
		lineend();
	}
	public static void line19() {
		linebeginning();
		lineadd();
		System.out.print("`CCHHHCCCCHHHHHCCCCHHHCC\"");
		lineend();
	}
	public static void line20() {
		linebeginning();
		lineadd();		
		System.out.print("  \"CHHCCCCHHHCCCCHHHC\"");
		lineend();	
	}
	public static void line21() {
		linebeginning();
		lineadd();
		System.out.print("    `HCCCCHHHCCCHHC'");
		lineend();
	}
	public static void line22() {
		linebeginning();
		lineadd();
		System.out.print("      HCCCHHCCCHC'");
		lineend();
	}
	public static void line23() {
		linebeginning();
		lineadd();
		System.out.print("       HCCHCCHHC'");
		lineend();
	}
	public static void line24() {
		linebeginning();
		linebeginning();
		//lineadd();
		System.out.print("     888888888");
		lineend();
	}
	public static void line25() {
		linebeginning();
		linebeginning();
		//lineadd();
		System.out.print("     \"8888888\"");
		lineend();
	}
	public static void line26() {
		linebeginning();
		linebeginning();
		lineadd();
		System.out.print("\\/   \\/");
		lineend();
	}
	public static void line27() {
		linebeginning();
		linebeginning();
		lineadd();
		System.out.print("|-888-|");
		lineend();
	}
	public static void line28() {
		linebeginning();
		linebeginning();
		lineadd();
		System.out.print("|     |");
		lineend();	
	}
	public static void line29_30() {
		linebeginning();
		linebeginning();
		lineadd();
		System.out.print("HCCCCCH");
		lineend();	
	} 
}