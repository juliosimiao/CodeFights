String properNounCorrection(String noun) {
    StringBuilder stringBuilder = new StringBuilder(noun.toLowerCase());
    char firstLetter = noun.charAt(0);
    firstLetter = Character.toUpperCase(firstLetter);
    stringBuilder.setCharAt(0,firstLetter);
    return stringBuilder.toString();
}