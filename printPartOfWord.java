public class printPartOfWord {
 public static void main(String[] args) {
    if(args.length !=3) {
        System.out.println("Usage: java printPartOfWord str start length");
    }
    String str = args[0];
    int start = Integer.parseInt(args[1]);
    int length = Integer.parseInt(args[2]);
    System.out.println("Input: " +str+ " start: " +start+ " length: " +length);
    String output = substring(str, start, length);
    System.out.println("Output: " +output);


}
private static String substring(String str, int start, int length) {
    return str.substring(start, start+length);

}
}