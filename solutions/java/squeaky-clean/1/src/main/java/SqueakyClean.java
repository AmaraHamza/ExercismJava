class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean isKebabCase = false;
        char[] chars = identifier.toCharArray();
        for (char c : chars){
            if (Character.isWhitespace(c)) {
            	c = '_';
            	builder.append(c);
            	continue;
            }  
            if (isKebabCase) {
            	c = Character.toUpperCase(c);
            	builder.append(c);
            	isKebabCase = false;
            	continue;
            }   
            if (c == '-') {
                isKebabCase = true;
                continue;
            }
            switch(c) {
                case '4' : c = 'a';
                    break;
                case '3' : c = 'e';
                    break;
                case '0' : c = 'o';
                    break;
                case '1' : c = 'l';
                    break;
                case '7' : c = 't';
                    break;
            }
            if (!Character.isLetter(c))
                continue;
            builder.append(c);
        }
        return builder.toString();
    }
}
