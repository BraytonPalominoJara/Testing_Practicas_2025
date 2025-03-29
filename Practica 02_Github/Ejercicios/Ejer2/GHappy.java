public boolean gHappy(String str) {
    assert str != null;
    if (str.isEmpty()) return true;
    
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'g') {
            boolean leftHappy = (i > 0 && str.charAt(i - 1) == 'g');
            boolean rightHappy = (i < str.length() - 1 && str.charAt(i + 1) == 'g');
            if (!leftHappy && !rightHappy) {
                return false;
            }
        }
    }
    return true;
}
