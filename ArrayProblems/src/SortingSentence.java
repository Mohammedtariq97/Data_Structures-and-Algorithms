
public static String sortSentence(String s) {
        String[] str = null;
        str = s.split(" ");
        int len = str.length;
        String[] str2 = new String[len];
        for(int i=0;i<str.length;i++){
            String st = str[i];
            char c = st.charAt(st.length() -1);
            int a = Character.getNumericValue(c);
            String formattedString = str[i].replaceAll("[^a-zA-Z]","");
            str2[a-1] = formattedString;
        }
        String s1 = Arrays.toString(str2);
        String s2 = s1.replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","");
        return s2;
}


