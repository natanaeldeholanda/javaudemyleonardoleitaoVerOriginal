package api;

public class ExplorandoStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        sb.append("!");
        System.out.println(sb);

        //StringBuilder é mutável
        sb.reverse();
        System.out.println(sb.toString());
        System.out.println(sb.substring(0,3));
        System.out.println(sb.toString());

    }
}
