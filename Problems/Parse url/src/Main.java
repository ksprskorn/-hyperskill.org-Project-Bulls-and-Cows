import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String[] urlSplit = url.split("[?]");
        url = urlSplit[1];
        urlSplit = url.split("[&]");
        String[] urlParameter = new String[urlSplit.length];
        String[] urlValue = new String[urlSplit.length];
        for (int i = 0; i < urlSplit.length; i++) {
            urlParameter[i] = urlSplit[i].substring(0, urlSplit[i].indexOf("="));
            urlValue[i] = urlSplit[i].indexOf("=") + 1 == urlSplit[i].length()
                    ? "not found"
                    : urlSplit[i].substring(urlSplit[i].indexOf("=") + 1, urlSplit[i].length());
        }
        int passPosition = 0;
        boolean isPassword = false;
        for (int p = 0; p < urlParameter.length; p++) {
            if (urlParameter[p].equals("pass")) {
                passPosition = p;
                isPassword = true;
            }
        }

        for (int e = 0; e < urlParameter.length; e++) {
            System.out.println(urlParameter[e] + " : " + urlValue[e]);
        }
        if (isPassword == true) {
            System.out.println("password : " + urlValue[passPosition]);
        }
    }
}