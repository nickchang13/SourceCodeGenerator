public class OnMySourceCodeGENERATOR {
	public static void OnMySourceCodeGENERATOR (String P) {
		String s =
"public class POnMySourceCode {\n"+
"	public static void main (String[] args) {\n"+
"		String s = new String(s1);\n"+
"		nums(s);\n"+
"		P(s + \"\\n\" + nums(s) + \"}\");\n"+
"	}\n"+
"	public static String nums(String s){\n"+
"		char[] c = s.toCharArray();\n"+
"		String a = \"static char[] s1 = {\\n\" + (int)c[0];\n"+
"		for(int i = 1; i < c.length; i++) {\n"+
"			a += \", \" + (int)c[i];\n"+
"		}\n"+
"		a += \"};\\n\";\n"+
"		return a;\n"+
"	}\n"+
P;


		nums(s);
	}
	public static void nums(String s){
		System.out.println(s);
		char[] c = s.toCharArray();
		System.out.print("static char[] s1 = {\n" + (int)c[0]);
		for(int i = 1; i < c.length; i++) {
			System.out.print(", " + (int)c[i]);
		}
		System.out.print("};\n");
		System.out.print("}");
	} 
}		
