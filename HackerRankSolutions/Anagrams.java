import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        boolean status = false;
        if (a.length() >= 1 && b.length() >= 1 && a.length() <= 50 && b.length() <= 50) {
            if (a.length() == b.length()) {
                char a2[] = a.toCharArray();
                char b2[] = b.toCharArray();
                int alen, blen;
                alen = blen = a.length();

                for (int i = 0; i < a2.length; i++) {
                    for (int j = 0; j < b2.length; j++) {
                        if (String.valueOf(a2[i]).equalsIgnoreCase(String.valueOf(b2[j])) && a2[i] != '0'
                                && b2[j] != '0') {
                            a2[i] = '0';
                            b2[j] = '0';
                            alen--;
                            blen--;
                            break;
                        }
                    }
                }
                // System.out.println(alen+" "+blen);
                if (alen == 0 && blen == 0) {
                    status = true;
                    return status;
                } else {
                    status = false;
                    return status;
                }
            } else {
                status = false;
                return status;
            }
        }

        return status;
    }

int check_anagram(char a[], char b[])
{
int first[26] = {0}, second[26] = {0}, c=0;

// Calculating frequency of characters of first string

while (a[c] != '\0')
{
first[a[c]-'a']++;
c++;
}

c = 0;

while (b[c] != '\0')
{
second[b[c]-'a']++;
c++;
}

// Comparing frequency of characters

for (c = 0; c < 26; c++)
{
if (first[c] != second[c])
return 0;
}

return 1;
}

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
